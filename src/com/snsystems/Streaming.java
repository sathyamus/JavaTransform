package com.snsystems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Streaming {

	public static void main(String[] args) {

		List<Integer> integers = new ArrayList<Integer>();
		for (int i = 0; i <= 100; i++) {
			integers.add(i);
		}

		// sequential stream
		Stream<Integer> sequentialStream = integers.stream();

		long seqTime = 0;
		long parTime = 0;
		
		long start = System.currentTimeMillis();
		
		// using Lamda with Stream API, filter
		
		Stream<Integer> highNums = sequentialStream.filter(p -> p>60);
		highNums.forEach(p -> System.out.println("High num sequential = "+p));

		long end = System.currentTimeMillis();
		
		seqTime = end-start;
		
		// parallel stream
		Stream<Integer> parallelStream = integers.parallelStream();

		start = System.currentTimeMillis();

		// using Lamda with Stream API, filter
		Stream<Integer> highNumsUsingParallelStream = parallelStream.filter(p -> p>60);
		highNumsUsingParallelStream.forEach(p -> System.out.println("High num parallel = "+p));

		end = System.currentTimeMillis();
		parTime = end-start;
		
		System.out.println("\n Time took for Seq : " + (seqTime));
		System.out.println("\n Time took for Par : " + (parTime));
	}

}
