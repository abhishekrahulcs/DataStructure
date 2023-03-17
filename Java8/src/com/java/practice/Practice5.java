package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class Practice5 {

	public static void main(String[] args) {

		List<String> languageList = Arrays.asList("Java", "C", "C++", "Python", "Scala", "Kotlin");
		Spliterator<String> languageSpliterator = languageList.spliterator();
		languageSpliterator.tryAdvance(System.out::println);
		languageSpliterator.tryAdvance(System.out::println);
		languageSpliterator.forEachRemaining(System.out::println);
        
		List<String> names=new ArrayList<String>();
		names.add("Charlie");
		names.add("Douglas");
		names.add("Sundaram");
		names.add("Charlie");
		names.add("Yuki");
		names.stream().distinct().forEach(System.out::println);
		
		List<String> name=new ArrayList<String>();
		name.add("Charlie");
		name.add("Douglous");
		name.add("Sundaram");
		name.add("Charlie");
		name.add("Yuki");
		System.out.println("************************");
		//External iteration of collections
		for(String name1:name) {
			System.out.println(name1);
		}
		System.out.println("************************");
		name.stream().map(String::toUpperCase).forEach(System.out::println);
		
	}
}