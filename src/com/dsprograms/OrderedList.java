package com.dsprograms;

public class OrderedList<E> {
	private INode head;
	
	public OrderedList() {
		head = null;
	}
	
	public void add(INode myNode) {
		if (head == null) {
			head = myNode;
		}
		else {
			int flag = 0;
			INode temp = head;
			INode lastTemp = head;
			while( temp != null) {
				if (String.valueOf(temp.getKey()).compareTo(String.valueOf(myNode.getKey())) > 0) {
					head = myNode;
					head.setNext(temp);
					flag = 1;
					break;
				}
				else {
					if ( temp.getNext() != null && String.valueOf(temp.getNext().getKey()).compareTo(String.valueOf(myNode.getKey())) > 0) {
						INode temp1 = temp.getNext();
						temp.setNext(myNode);
						temp = temp.getNext();
						temp.setNext(temp1);
						flag = 1;
						break;
					}
				}
				temp=temp.getNext();
			}
			if (flag == 0) {
				while (lastTemp.getNext() != null) {
					lastTemp = lastTemp.getNext();
				}
				lastTemp.setNext(myNode);
			}
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
	
	public void pop(E key) {
		INode deleteNode = search(key);
		if (deleteNode!=null)
		{
			INode temp = deleteNode.getNext().getNext();
			deleteNode.setNext(temp);
		}
		else {
			MyNode newAdd = new MyNode(key);
			INode lastAdd = head;
			while(lastAdd.getNext()!=null) {
				lastAdd = lastAdd.getNext();
			}
			lastAdd.setNext(newAdd);
		}
	}
	
	public void printOrderedList() {
		StringBuffer printformat = new StringBuffer("My Nodes: ");
		INode temp = head;
		while (temp != null) {
			printformat.append(temp.getKey());
			if ( temp.getNext() != null) {
				printformat.append("->");
			}
			temp = temp.getNext();
		}
		System.out.println(printformat);
	}
	
}
