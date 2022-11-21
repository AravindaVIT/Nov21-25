package com.world;

public class NestedLoopsDemo {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			System.out.println("i= " +i);
			for(int j=0;j<3;j++)
			{
				System.out.print("j= " +j +"\t");
			}System.out.println("");
			System.out.println("***");
		}
			
	}

}
