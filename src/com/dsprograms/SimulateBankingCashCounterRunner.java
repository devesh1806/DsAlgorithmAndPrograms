package com.dsprograms;
import java.util.Scanner;

public class SimulateBankingCashCounterRunner {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SimulateBankingCashCounter mySimulateBankingCashCounter = new SimulateBankingCashCounter<>();
	
		Integer cashBalance = 10000000;
		while(true) {
			System.out.println("Enter name of person: ");
			String name = sc.nextLine();
			
			//replace method used because white space comes due to input
			mySimulateBankingCashCounter.enQueue(new MyNode(name.replace(" ", "")));
			System.out.println("Enter 1.Add people to queue 2.exit");
			if (sc.nextInt() == 2) break;
		}
		
		mySimulateBankingCashCounter.deQueue(cashBalance);
		
	}
}
