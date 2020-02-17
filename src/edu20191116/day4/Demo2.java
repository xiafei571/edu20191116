package edu20191116.day4;

public class Demo2 {
	public static void main(String[] args) {

		People p1 = new Chinese();
		p1.setName("xia");
		
		People p2 = new Japanese();
		p2.setName("tom");
	
		Restaurant rs = new Restaurant();
		rs.run(p1);
		rs.run(p2);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
