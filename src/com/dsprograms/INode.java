package com.dsprograms;

public interface INode<E> {
	
	E getKey();
	void setKey(E key);
	
	INode getNext();
	void setNext(INode next);
}