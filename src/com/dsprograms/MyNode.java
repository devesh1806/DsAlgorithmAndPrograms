package com.dsprograms;

public class MyNode <E> implements INode<E>{
	
	private E key;
	private INode next;
	
	public MyNode(E key) {
		this.key = key;
		this.next = null;
	}
	
	public void setNext(INode next) {
		this.next = next;
	}
	
	public void setKey(E key) {
		this.key = key;
	}
	
	public E getKey() {
		return key;
	}
	
	public INode getNext() {
		return next;
	}
}
