package com.dsprograms;
import java.util.Scanner;

public class SimulateBankingCashCounter <E> {
	private INode head;
	private INode tail;
	
	public SimulateBankingCashCounter() {
		
		this.head = null;
		this.tail = null;
	}
	
	public void append(INode myNode) {
		if (this.head == null) {
			this.head = myNode;
		}
		if (this.tail == null) {
			this.tail = myNode;
		}
		else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}
	
	public void enQueue(INode myNode) {
		append(myNode);
	}
	
	public void deQueue(Integer cashBalance) {
		Integer cash = 0;
		while(head != null) {
			System.out.println("People in the queue are: ");
			printList();
			cash = cashBalanceAvail(cashBalance); 
			if (cashBalance != cash) {
				cashBalance = cash;
				delete();
			};
		}
	}
	
	public void delete() {
		INode temp = head.getNext();
		head = temp;
	}
	
	public void size() {
		int count = 0;
		while(head != null) {
			head = head.getNext();
			count++;
		}
		System.out.println("The Queue has "+ count + " elements.");
	}
	
	public void isEmpty() {
		if (head == null) {
			System.out.println("Queue is Empty");
		}
		else {
			System.out.println("There are elements in Queue");
		}
	}
	
	public void printList() {
		StringBuffer printformat = new StringBuffer("My Nodes: ");
		INode temp = this.head;
		while (temp != null) {
			printformat.append(temp.getKey());
			if ( temp != tail) {
				printformat.append("->");
			}
			temp = temp.getNext();
		}
		System.out.println(printformat);
	}
	
	public Integer cashBalanceAvail(Integer cashBalance) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1.Deposit 2.Withdraw: ");
		if (sc.nextInt() == 1) {
			cashBalance += sc.nextInt();
			System.out.println(cashBalance);
			System.out.println("Removed " + head.getKey() + " from queue.");
			return cashBalance;
		}
		else {
			int check = sc.nextInt();
			if (check <= cashBalance) {
				cashBalance-=check;
				System.out.println(cashBalance);
				System.out.println("Removed " + head.getKey() + " from queue.");
				return cashBalance;
			}
			else {
				System.out.println("Please withdraw amount less than " + cashBalance);
			}
		}
		return cashBalance;
	}
}
