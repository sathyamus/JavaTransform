package com.snsystems;


interface IsReferable {

	void referenceDemo();
	
}

public class ReferenceDemo {
	
	public static void commonMethod() {
		System.out.println("This method is already defined");
	}
	
	public void implement() {
		// Anonymous class
		IsReferable ref1 = new IsReferable() {
			
			@Override
			public void referenceDemo() {
				ReferenceDemo.commonMethod();
			}
		};
		
		ref1.referenceDemo();
		
		// Lambda impl
		IsReferable ref2 = () -> ReferenceDemo.commonMethod();
		ref2.referenceDemo();
		
		
		// Using referential scope C++
		IsReferable ref3 = ReferenceDemo::commonMethod; ref3.referenceDemo();
		
	}

	public static void main(String[] args) {
		ReferenceDemo demo = new ReferenceDemo();
		demo.implement();
	}
}
