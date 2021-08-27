package com.dsprograms;

public class PalindromeChecker<E> {
	
	private INode head;
	private INode tail;
	
	public PalindromeChecker() {
		this.head = null;
		this.tail = null;	
	}
	
	private void add(INode myNode) {
		if (head==null) head = myNode;
		if (tail==null) tail = myNode;
		else {
			INode temp = head;
			head = myNode;
			head.setNext(temp);
		}
	}
	
	private void append(INode myNode) {
		if (head==null) head = myNode;
		if (tail==null) tail = myNode;
		else {
			tail.setNext(myNode);
			tail=myNode;
		}
	}
	
	public void addRear(INode myNode) {
		add(myNode);
	}
	
	public void addFront(INode myNode) {
		append(myNode);
	}
	
	public String removeFront() {
		String reverse = "";
		while(head.getNext()!=null) {
			reverse+=String.valueOf(head.getKey());
			INode temp = head.getNext();
			head = temp;
		}
		reverse+=String.valueOf(head.getKey());
		return reverse;
	}
	
	public String removeRear() {
		String reverse = "";
		
		while (head.getNext()!=null) {
			INode temp = head;
			while(temp.getNext().getNext()!=null) {
				temp= temp.getNext();
			}
			reverse+=String.valueOf(temp.getNext().getKey());
			temp.setNext(null);
		}
		reverse+=String.valueOf(head.getKey());
		
		return reverse;
	}
	
	public void printList() {
		INode temp = head;
		StringBuffer printout = new StringBuffer();
		while(temp!=null) {
			printout.append(temp.getKey());
			if (temp.getNext() != null) {
				printout.append("->");
			}
			temp = temp.getNext();
		}
		System.out.println(printout);
	}

}
