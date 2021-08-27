package com.dsprograms;
import java.util.Scanner;

public class PalindromeCheckerRunner {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PalindromeChecker myPalindromeChecker = new PalindromeChecker<>();
		
		System.out.println("Enter String to check palindrome or not: ");
		String checks = sc.nextLine();
		
		for(int i=0;i<checks.length();i++) {
			myPalindromeChecker.addRear(new MyNode(checks.charAt(i)));
		}
		
		myPalindromeChecker.printList();
		String check = myPalindromeChecker.removeFront();
		
		if (checks.equals(check)){
			System.out.println("String is Palindrome");
		}
		else{
			System.out.println("String is not Palindrome");
		}
	}
}
