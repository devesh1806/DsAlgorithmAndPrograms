package com.dsprograms;
import java.util.Scanner;

public class HashingFunctionNumberRunner {
	public static void main(String[] args) {
		
		Integer[] numbers = new Integer[] {77,44,55,26,93,17,31,20,54};
		
		HashingFunctionNumber<Integer> myHashingFunctionNumber = new HashingFunctionNumber<>();
		for( Integer number : numbers) {
			myHashingFunctionNumber.add(number);
		}
		System.out.println(myHashingFunctionNumber);
	}
}
