package com.snsystems;

interface InterfaceTest {
	
	public class classInt {
		public void test() {
			System.out.println("Test");
		}
	}

}

public class ClassInsideInterface implements InterfaceTest { 
	ClassInsideInterface obj = new ClassInsideInterface();
}