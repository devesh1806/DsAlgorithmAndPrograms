package com.dsprograms;
import java.util.Scanner;

public class SimpleBalancedParanthesisRunner {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SimpleBalancedParanthesis mySimpleBalancedParanthesis = new SimpleBalancedParanthesis<>();
		
		String expression= "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		for (int i=0;i<expression.length();i++) {
			char elem = expression.charAt(i);
			if ( elem == '(' ){
				MyNode newAdd = new MyNode(elem);
				mySimpleBalancedParanthesis.push(newAdd);
			}
			else if ( elem == ')' ) {
				mySimpleBalancedParanthesis.pop();
			}
		}
		
		if (mySimpleBalancedParanthesis.isEmpty()) {
			System.out.println("Arithmetic Expression is balanced.");
		}
		else {
			System.out.println("Arithmetic Expression is not balanced as it has " + mySimpleBalancedParanthesis.size() + " elements.");
		}
	}
}
