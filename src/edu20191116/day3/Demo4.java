package edu20191116.day3;

public class Demo4 {

	private static int[] C = { 1, 2, 4, 7 };

	private static int calcT(int n, int m) {
		if (m == 0)
			return 0;

		int sum = 0;
		if (C[n] > m) {
			sum += calcT(--n, m);
		} else {
			sum++;
			sum += calcT(n, m - C[n]);
		}
		return sum;
	}

	public static void main(String[] args) {
		// 2
		System.out.println(calcT(2, 3));
		// 3
		System.out.println(calcT(1, 5));
		// 2
		System.out.println(calcT(2, 5));
		// 2
		System.out.println(calcT(3, 5));
	}

}
