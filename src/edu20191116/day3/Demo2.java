package edu20191116.day3;

import java.util.Stack;

import javax.xml.transform.Source;

public class Demo2 {

	public static int rpn(String str) {
		Stack<Integer> stack = new Stack<Integer>();
		char[] array = str.toCharArray();
		//判断是不是数字 word>=48 && word<=57
		//42*, 43+, 45-, 47/
		//add 入栈
		stack.add(3);
		stack.add(4);
		//pop出栈
		return stack.pop() + stack.pop();
	}
	
	public static void main(String[] args) {
		System.out.println(rpn("34+5*"));
	}
}
