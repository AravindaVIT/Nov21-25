package com.world;

public class WhileLoopDemo {

	public static void main(String[] args) {
		System.out.println("=========== while loop");
		int counter = 2;
		while (counter < 5 && counter>1) {
			System.out.println("counter: " + counter++);
		}

		// Infinite loop
//		while (true) {
//			
//		}
	}

}