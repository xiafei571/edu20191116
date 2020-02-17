package edu20191116.day4;

public class People {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println(name + " eat!!!");
	}
	
	public People() {
		
	}
	
	public People(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "People [name=" + name + "]";
	}
	

}
