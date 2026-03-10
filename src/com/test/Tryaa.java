package com.test;

public class Tryaa {
		public static void main(String[] args) {
		try {
			int a = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Caught an ArithmeticException: " + e.getMessage());
		} finally {
			System.out.println("This block will  execute.");
		}
	}

}
