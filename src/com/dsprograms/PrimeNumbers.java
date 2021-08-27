package com.dsprograms;

public class PrimeNumbers<E> {
	
	public static Integer[] prime(Integer x,Integer y) {
		Integer[] primeArr = new Integer[30];
		
		if (x==1) x=2;
		int k = 0;
		for(int i=x;i<=y;i++) {
			int flag = 2;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if (i%j==0) flag++;
			}
			if (flag==2) {
				primeArr[k]=i;
				k++;
			}
		}
		return primeArr;
	}
	
	private static int reverse(int change) {
		int res=0;
		while(change!=0) {
			int check = change%10;
			res = res*10+check;
			change /= 10;
		}
		return res;
	}
	
	public static Integer[] anagrams(Integer[] newArr,int totalSize) {
		Integer[] anagram = new Integer[totalSize];
		int k =0;
		for(int i=0;i<newArr.length-1;i++) {
			for(int j=i+1;j<newArr.length;j++) {
				if (newArr[j]!=null && newArr[i]!=null &&reverse(newArr[i])==newArr[j]) {
					anagram[k]=newArr[i];
					k++;
					anagram[k]=reverse(newArr[i]);
					k++;
				}
			}
		}
		return anagram;
	}
	
	public static void main(String[] args) {
		
		Integer[][] primeNumbers = new Integer[10][30];
		for(int i=0,j=0;i<1000;i=i+100,j++) {
			primeNumbers[j]= prime(i+1,i+100);
		}
		Integer[] newArr = new Integer[300];
		int k=0;
		for(int i=0;i<10;i++) {
			for(int j=0;j<30;j++) {
				if (primeNumbers[i][j]!=null) {
					newArr[k]=primeNumbers[i][j];
					k++;
				}
			}
		}
		
		Integer[] anagrams = anagrams(newArr,k+1);
		Integer[] notAnagrams = new Integer[k+1];
		
		int z=0;
		for(int i=0;i<newArr.length;i++) {
			int flag = 0;
			for(int j=0;j<anagrams.length;j++) {
				if (newArr[i]==anagrams[j]) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				notAnagrams[z]=newArr[i];
				z++;
			}
		}
		
		Integer[][] anagramsNotAnagrams = new Integer[][] {anagrams,notAnagrams};
	}
	
}
