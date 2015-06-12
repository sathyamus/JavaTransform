package com.snsystems;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lamda {

	public static void main(String[] args) {
		
		// # 1 #
		Arrays.asList("a", "b", "c").forEach(ele -> {
			System.out.println(ele);
			System.out.println(ele);
		});

		System.out.println("\n");
		for (String s : Arrays.asList("a", "b", "c")) {
			System.out.println(s);
		}
		

		System.out.println("\n");
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		// # 2 #
		
		// Old approach
		int sum = 0;
		for (Integer num : integers) {
			int x = num * num;
			sum = sum+x;
		}
		System.out.println(sum);
		
		// New approach with Lamda
		int sum1 = integers.stream().map( x-> x*x).reduce((x,  y) -> x+y).get();
		System.out.println(sum1);
		
		
		// # 3 #
		System.out.println("\n Print all numbers");
		evaluate(integers, (n)->true);
		
		System.out.println("\n Print no numbers");
		evaluate(integers, (n)->false);

		System.out.println("\n Print even numbers");
		evaluate(integers, (n)-> n%2 == 0);

		System.out.println("\n Print odd numbers");
		evaluate(integers, (n)-> n%2 != 0);

		System.out.println("\n Print numbers geater than 5");
		evaluate(integers, (n)-> n >= 5);

		// # 4 #
		
		
		Button button = new Button();
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Doing something");
			}
		});
		button.addActionListener(event->System.out.println("Doing something"));

	}

	private static void evaluate(List<Integer> integers, Predicate<Integer> predicate) {
		for (Integer i : integers) {
			if (predicate.test(i)) {
				System.out.print(i + " ");
			}
		}
		
	}

}
