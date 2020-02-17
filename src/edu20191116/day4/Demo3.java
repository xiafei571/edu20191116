package edu20191116.day4;

public class Demo3 {
	public static void main(String[] args) {
		PrintMachine fuji = new FujiPrint();
		fuji.run("X100F");
		
		PrintMachine sony = new SonyPrint();
		sony.run("Play Station 4");
		
		MainBoard mb = new MainBoard(new SoundCard());
		mb.usePci();
	}

}
