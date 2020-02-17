package edu20191116.day4;

public class SoundCard implements Pci {
	//implements 实现-接口， 可以实现多个接口
	//extends 继承-类， 只能继承一个父类

	@Override
	public void open() {
		System.out.println("SoundCard open!");
	}

	@Override
	public void close() {
		System.out.println("SoundCard close!");
	}

}
