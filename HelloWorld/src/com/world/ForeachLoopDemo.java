package com.world;

public class ForeachLoopDemo {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int sum=0;
		for(int number : arr) {
			System.out.println("number: " + number);
			System.out.println("sum is " + number + "+"  + sum );
			sum+=number;
			
			System.out.println("sum : " + sum);
			
		}
		System.out.println("Total sum : " + sum);
	}

}
// sum is 1 + 0