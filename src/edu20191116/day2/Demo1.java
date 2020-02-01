package edu20191116.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu20191116.common.MD5Util;
import edu20191116.day1.vo.UserInfo;

public class Demo1 {
	/**
	 * 1 means active
	 */
	private static final int VALID_ACTIVE = 1;
	
	public static void main(String[] args) {
		UserInfo user = new UserInfo();
		user.setValid(VALID_ACTIVE);
		user.setUserName("tom");
		
		UserInfo user2 = new UserInfo();
		user2.setValid(VALID_ACTIVE);
		user2.setUserName("jerry");
		
		System.out.println(MD5Util.textToMD5U16("tom"));
		
		// 1. 编写一个方法。去除List集合中的重复元素。
		List<String> list = distinctList();
		for (String s : list) {
			System.out.println(s);
		}
		// 2. 取出一个字符串中字母出现的次数。如："asjkdhasjkdhasd" a(2)b(1)k(2)...
		countWord("asjkdhasjkdhasd");
		String str = "jjaskdju";// [j,j,a,s,k,d,j,u]
		char[] arry = str.toCharArray();
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (char c : arry) {
			if (null == map.get(String.valueOf(c))) {
				// 如果没有
			} else {
				// 如果有 ，当前值+1 put map.get(String.valueOf(c))+1;
			}
		}
		// char[] arry = s.toCharArray();

		// for (String key : map.keySet()) {
		// System.out.println("key= " + key + " and value= " + map.get(key));
		// }

		// 3. 写一个排序算法，排序List<String名字> Ac, Abe, Abed ,B
		// Collections.sort
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		// 4. 打印99乘法表，输入多少，打印多少
		printMuilti(5);
		System.out.println(list);

	}

	private static List<String> distinctList() {
		List<String> list = new ArrayList<String>();
		list.add("tom");
		list.add("jerry");
		list.add("tom");
		List<String> result = new ArrayList<String>();
		for (String s : list) {
			if (contains(result, s))
				continue;// list.contains(s)
			result.add(s);
		}

		return result;
	}

	private static boolean contains(List<String> list, String str) {
		for (String s : list) {
			if (s.equals(str))
				return true;
		}
		return false;
	}

	private static void countWord(String s) {
		char[] arry = s.toCharArray();
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (char c : arry) {
			if (null == map.get(String.valueOf(c))) {
				map.put(String.valueOf(c), 1);
			} else {
				map.put(String.valueOf(c), map.get(String.valueOf(c)) + 1);
			}
		}

		for (String key : map.keySet()) {
			System.out.println("key= " + key + " and value= " + map.get(key));
		}
	}

	private static void printMuilti(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + j * i + " ");
			}
			System.out.println();
		}
	}
}
