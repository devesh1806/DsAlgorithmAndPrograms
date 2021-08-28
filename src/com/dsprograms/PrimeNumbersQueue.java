package com.dsprograms;

public class PrimeNumbersQueue <E> {
	private INode head;
	private INode tail;
	
	public PrimeNumbersQueue() {	
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
	
	public void deQueue() {
		while(head != null) {
			System.out.print(head.getKey()+ " ");
			delete();
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
}
	