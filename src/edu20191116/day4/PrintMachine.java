package edu20191116.day4;

abstract class PrintMachine {

	abstract void before();
	
	abstract void content(String txt);
	
	abstract void after();
	
	public final void run(String txt) {
		before();
		content(txt);
		after();
	}
}
