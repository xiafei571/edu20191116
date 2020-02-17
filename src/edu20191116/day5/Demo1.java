package edu20191116.day5;

public class Demo1 {
	// >20
	private final static int NORMAL_DRINK = 0;
	// >40
	private final static int STRONG_DRINK = 1;
	// 20< <60
	private final static int YOUNG_DRINK = 2;

	public static void main(String[] args) {
		// false
		System.out.println(checkAge2(NORMAL_DRINK, 10));
		// true
		System.out.println(checkAge2(NORMAL_DRINK, 25));
		// false
		System.out.println(checkAge2(STRONG_DRINK, 25));
		// ture
		System.out.println(checkAge2(STRONG_DRINK, 45));
		// false
		System.out.println(checkAge2(YOUNG_DRINK, 65));
		// true
		System.out.println(checkAge2(YOUNG_DRINK, 25));
	}

	private static boolean checkAge(int type, int age) {
		if (type == NORMAL_DRINK) {
			if (age >= 20) {
				return true;
			}
		} else if (type == STRONG_DRINK) {
			if (age >= 40) {
				return true;
			}
		} else {
			if (age >= 20 && age < 60) {
				return true;
			}
		}

		return false;
	}

	private static boolean checkAge2(int type, int age) {
		switch (type) {
		case NORMAL_DRINK:
			if (age >= 20) {
				return true;
			}
			break;
		case STRONG_DRINK:
			if (age >= 40) {
				return true;
			}
			break;
		case YOUNG_DRINK:
			if (age >= 20 && age < 60) {
				return true;
			}
			break;

		default:
			return false;
		}
		return false;
	}
}
