package edu20191116.day3;

public class Demo1 {
	// private

	public static void main(String[] args) {
		// 联想 alt+/ 或者 ctrl+空格
		// 格式化 ctrl+shfit+f
		// 保存 ctrl+s
		// sout+联想
		System.out.println("Hello world");
		// 8个基本数据类型
		int a = 5;
		int b = 10;
		// + - * /
		System.out.println((a + b) * a);
		// int, long, char, float, double, boolean, byte, short
		String aa = String.valueOf(a);
		String bb = "10";
		System.out.println(aa + bb);
		// Integer, Long, Char, Float, Double, Boolean..
		Integer c = 5;
		String cc = c.toString();
		System.out.println(cc);

		System.out.println(getSum(0, 100));
		System.out.println(getSum(50, 100));
		System.out.println(getSum(100, 200));

		int start = 0;
		int sum = 0;
		while (start <= 100) {
			sum = sum + start;
			start++;
		}
		System.out.println("sum:" + sum);

		ten2Binary(27);
		ten2Binary(10);

		int[] s = { 5, 3, 2, 1 };
		int t0 = s[0];
		s[0] = s[3];
		s[3] = t0;
		for (int i = 0; i < s.length; i++) {//i++ i=i+1
			System.out.print(s[i]);
		}
	}

	private static int getSum(int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	private static void ten2Binary(int num) {// 10 -> 1010
		// 除法/, 取余%, 结束条件是 num==0 的时候
		StringBuilder s = new StringBuilder();
		while (num != 0) {
			s.append(num % 2);
			num = num / 2;
		}

		System.out.println(s.reverse());
	}

}
