package com.dsprograms;
import java.util.ArrayList;

public class HashingFunctionNumber<K> {
	
	private final int numBuckets;
	ArrayList<OrderedList<K>> myBucketArray;
	
	public HashingFunctionNumber() {
		this.numBuckets = 11;
		this.myBucketArray = new ArrayList<>(numBuckets);
		for(int i=0;i<numBuckets;i++) {
			this.myBucketArray.add(null);
		}
		
	}
	
	private int getBucketIndex(K key) {
		int hashcode = Math.abs(key.hashCode());
		int index = hashcode%numBuckets;
		return index;
	}

	public void add(K key) {
		int index = this.getBucketIndex(key);
		OrderedList myOrderedList = this.myBucketArray.get(index);
		if (myOrderedList == null) {
			myOrderedList = new OrderedList<>();
			this.myBucketArray.set(index, myOrderedList);
		}
		MyMapNode<K> myMapNode = (MyMapNode<K>) myOrderedList.search(key);
		if (myMapNode==null) {
			myMapNode = new MyMapNode<>(key);
			myOrderedList.add(myMapNode);
		}
	}
	
	public void remove(K key) {
		int index = this.getBucketIndex(key);
		OrderedList myOrderedList = this.myBucketArray.get(index);
		myOrderedList.pop(key);
	}
	
	@Override
	public String toString() {
		return "MyLinkedHashMap List{"+ myBucketArray+"}";
	}	
}
