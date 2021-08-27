package com.dsprograms;

public class MyMapNode <K> implements INode<K> {
	private K key;
	MyMapNode<K> next;
	
	public MyMapNode(K key) {
		this.key = key;
		this.next = null;
	}
	
	public void setNext(INode next) {
		this.next = (MyMapNode<K>) next;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
	
	public K getKey() {
		return key;
	}
	
	public INode getNext() {
		return next;
	}
	
	@Override
	public String toString() {
		StringBuffer myMapNodeString = new StringBuffer();
		myMapNodeString.append("MyMapNode={K=").append(key).append("}");
		if (next != null) {
			myMapNodeString.append("->").append(next);
		}
		return myMapNodeString.toString();
	}
}
