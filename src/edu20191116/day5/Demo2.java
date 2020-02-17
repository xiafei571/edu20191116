package edu20191116.day5;

public class Demo2 {
	public static void main(String[] args) {
		//int[] array = { 20, 2, 15, 10, 53 };
		//printTriangle(5);
		
		//2*i +1
		//printTriangle(10);
		
		String a = "性别男";
		String b ="	性别女";
		a = a.replaceAll("(\\t|\\s|男|女)","*");
		//只换两边的
		b = b.trim();
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.equals(b));
	}
	
	/*
	 * line = 5
	 *     *    4个空格j，1个星号k  i=0,  j=line-1-i, k=2i+1
	 *    ***   3个空格j，3个星号k  i=1,  j=line-1-i, k=2i+1
	 *   *****  2个空格j，5个星号k  i=2,  j=line-1-i, k=2i+1
	 *  ******* 1个空格j，7个星号k  i=3,  j=line-1-i, k=2i+1
	 * *********0个空格j，9个星号k  i=4,  j=line-1-i, k=2i+1
	 * 
	 */
	private static void printTriangle(int line) {
		for(int i = 0; i < line; i++) {
			for(int j = 0; j < line-1-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < 2*i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/*
	 * line 3
	 * ***** 空格j 星号k
	 *  ***  
	 *   *
	 */
	private static void printTriangle2(int line) {
		//
	}
}
