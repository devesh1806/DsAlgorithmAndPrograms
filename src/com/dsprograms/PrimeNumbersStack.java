package com.dsprograms;

public class PrimeNumbersStack <E> {
	private INode head;
	private INode tail;
	
	public PrimeNumbersStack() {
		
		this.head = null;
		this.tail = null;
	}
	
	public void add(INode myNode) {
		if (this.head == null) {
			this.head = myNode;
		}
		if (this.tail == null) {
			this.tail = myNode;
		}
		else {
			INode temp = head;
			head = myNode;
			head.setNext(temp);
		}
	}
	
	public void push(INode myNode) {
		add(myNode);
	}
	
	public void peek() {
		System.out.print(head.getKey() + " ");
	}
	
	public void pop() {
		try {
			INode temp = head.getNext();
			head = temp;
		}
		catch (Exception NullPointerException){
			System.out.println("Stack is empty");
		}
	}
	
	public int size() {
		int i =0;
		INode temp = head;
		while (temp != null) {
			i++;
			temp = temp.getNext();
		}
		return i;
	}
	
	public boolean isEmpty() {
		if ( this.size()==0 ) return true;
		return false;
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
}