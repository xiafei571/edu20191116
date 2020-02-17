package edu20191116.day4;

public class SonyPrint extends PrintMachine {

	@Override
	void before() {
		System.out.print("Sony[");

	}

	@Override
	void content(String txt) {
		System.out.print(txt);

	}

	@Override
	void after() {
		System.out.println("]");
	}

}
