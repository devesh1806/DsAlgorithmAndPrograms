package com.dsprograms;
import java.util.Scanner;

public class UnorderedListRunner {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		UnorderedList myUnorderedList = new UnorderedList<>();
		String sentence = "My name is Devesh Bhangale. I am an Employee of Morningstar.";
		String[] words = sentence.toLowerCase().split(" ");
		for ( String word : words) {
			myUnorderedList.add(new MyNode(word));
		}
		myUnorderedList.printList();
		System.out.println("Enter element to delete from list: ");
		String element = sc.nextLine();
		myUnorderedList.delete(element.toLowerCase());
		myUnorderedList.printList();
	}
}
