package com.dsprograms;


public class SimpleBalancedParanthesis <E> {
	private INode head;
	private INode tail;
	
	public SimpleBalancedParanthesis() {
		
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
			tail.setNext(myNode);
			tail = myNode;
		}
	}
	
	public void push(INode myNode) {
		add(myNode);
	}
	
	public void peek() {
		System.out.println(tail.getKey());
	}
	
	public void pop() {
		try {
			INode temp = head.getNext();
			head = temp;
		}
		catch (Exception NullPointerException){
			push(new MyNode(')'));
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