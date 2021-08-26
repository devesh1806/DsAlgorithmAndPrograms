package com.dsprograms;
import java.util.Scanner;

public class OrderedListRunner { 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		OrderedList myOrderedList = new OrderedList();
		
		Integer[] numbers = new Integer[] {10,50,60,23,89,12,45,67,21,45};
		for(Integer number : numbers) {
			myOrderedList.add(new MyNode(number));
		}
		myOrderedList.printOrderedList();
		System.out.println("Enter element you want to delete: ");
		Integer element = sc.nextInt();
		myOrderedList.pop(element);
		myOrderedList.printOrderedList();
	}
}
