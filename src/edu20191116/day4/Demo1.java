package edu20191116.day4;

public class Demo1 {
	
	public static void main(String[] args) {
		// int, float, double, short, long, boolean, char, byte
		System.out.println(add(10, 20));
		System.out.println(add(100, 200));
		System.out.println(add(-97631, 31590));
		// sout打印
		System.out.println(division(20, 10));
		System.out.println(division(20, 0));
		System.out.println(division(0, 20));

		System.out.println(getSum(1,100));
		System.out.println(getSum(150,200));

	}

	private static int getSum(int x, int y) {
		int sum = 0;
		for (int i = x; i <= y; i++) {
			sum=sum+i;
		}
		return sum;
	}
	
	// int getSum(int start, int end) -> i一直加到j

	private static int add(int a, int b) {
		return a + b;
	}

	// division
	// 当分母为0时，返回0，除法符号：/
	// 例如 division(20,10) -> 2
	// division(20,0) -> 0
	// division(0, 20) -> 0
	private static int division(int a, int b) {
		if (b == 0) {
			return 0;
		}
		return a / b;
	}
}
