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
	
	public static void main(String[] args) {
		
		Integer[][] primeNumbers = new Integer[10][30];
		for(int i=0,j=0;i<1000;i=i+100,j++) {
			primeNumbers[j]= prime(i+1,i+100);
		}
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<30;j++) {
				if (primeNumbers[i][j]!=null) System.out.print(primeNumbers[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
}
