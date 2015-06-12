package com.snsystems;

interface X {
	static void test() {
		System.out.println("Test");
	}
	
	String getStreet();
	String getCity();
	
	default String getFullAddress() {
		return getStreet()+", "+getCity();
	}
}

class Y implements X {
	private String street;
	private String city;
	
	public Y(String street, String city) {
		this.street = street;
		this.city = city;
	}
	
	@Override
	public String getCity() {
		return this.city;
	}
	
	@Override
	public String getStreet() {
		return this.street;
	}
}

/**
 * @author Administrator
 *
 */
public class DefaultStatic {

	public static void main(String[] args) {
		Y y = new Y("ORR", "Bangalore");
		
		System.out.println(y.getFullAddress());
		
		X.test();
	}
}
