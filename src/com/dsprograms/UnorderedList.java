package com.dsprograms;

public class UnorderedList<E> {
	
	private INode head;
	private INode tail;
	
	public void add(INode myNode) {
		if (head==null) head = myNode;
		if (tail == null) tail = myNode;
		else {
			tail.setNext(myNode);
			tail = myNode;
		}
	}
	
	public INode<E> search(E key) {
		INode temp = head;
		int flag = 1;
		while (temp!=null) {
			if (temp.getNext()!=null && (temp.getNext().getKey().equals(key))) {
				flag = 0;
				return temp;
			}
			temp = temp.getNext();
		}
		if (flag == 1) return null;
		return null;
	}
	
	public void delete(E key) {
		INode deleteNode = search(key);
		if (deleteNode!=null)
		{
			INode temp = deleteNode.getNext().getNext();
			deleteNode.setNext(temp);
		}
		
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
