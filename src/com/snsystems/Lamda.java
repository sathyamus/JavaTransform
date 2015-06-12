package com.snsystems;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Lamda {

	public static void main(String[] args) {
		Arrays.asList("a", "b", "c").forEach(ele -> {
			System.out.println(ele);
		});

		for (String s : Arrays.asList("a", "b", "c")) {
			System.out.println(s);
		}
		
		
		Button button = new Button();
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Doing something");
			}
		});
		button.addActionListener(event->System.out.println("Doing something"));

	}

}
