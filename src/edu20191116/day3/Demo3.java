package edu20191116.day3;

public class Demo3 {

	public static void main(String[] args) {
		int[][] array = new int[3][9];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 9; j++) {
				//if(array[i][j] == 0) 打印空格
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
}
