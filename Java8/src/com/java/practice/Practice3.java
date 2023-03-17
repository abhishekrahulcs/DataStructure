package com.java.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice3 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(8, 2, 5, 7, 3, 6);
		// collect() method returning list of oddNumbers
		List<Integer> oddnumbers = list.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		System.out.println(oddnumbers);

	}

}
