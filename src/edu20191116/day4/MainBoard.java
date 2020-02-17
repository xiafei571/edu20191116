package edu20191116.day4;

public class MainBoard {

	private Pci pci;

	public MainBoard(Pci pci) {
		this.pci = pci;
	}

	public void usePci() {
		pci.open();
	}
}
