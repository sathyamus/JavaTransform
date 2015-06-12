package com.snsystems;


interface IsReferable1 {

	public void referenceDemo();
	default void referenceDemo1() {
		ReferenceDemo.commonMethod();
	}
	
}

public class ReferenceDemo2 {
	
	public static void commonMethod() {
		System.out.println("This method is already defined");
	}
	
	public void implement() {
//		// Anonymous class
//		IsReferable ref1 = new IsReferable() {
//			
//			@Override
//			public void referenceDemo() {
//				ReferenceDemo.commonMethod();
//			}
//		};
//		
//		ref1.referenceDemo();
//		
//		// Lambda impl
//		IsReferable ref2 = () -> ReferenceDemo.commonMethod();
//		ref2.referenceDemo();
//		
		
		// Using referential scope C++
		IsReferable1 ref3 = ReferenceDemo2::commonMethod; ref3.referenceDemo();
		IsReferable1 ref4 = ReferenceDemo2::commonMethod; ref4.referenceDemo1();
		
	}

	public static void main(String[] args) {
		ReferenceDemo2 demo = new ReferenceDemo2();
		demo.implement();
	}
}
