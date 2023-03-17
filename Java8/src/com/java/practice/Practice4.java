package com.java.practice;

import java.util.*;
import java.util.stream.Collectors;

public class Practice4 {

	public static void main(String[] args) {
		List<Student1> studentList = new ArrayList<Student1>();
        
		studentList.add(new Student1("Paul", 11, "Economics", 78.9));
		studentList.add(new Student1("Zevin", 12, "Computer Science", 91.2));
		studentList.add(new Student1("Harish", 13, "History", 83.7));
		studentList.add(new Student1("Xiano", 14, "Literature", 71.5));
		studentList.add(new Student1("Soumya", 15, "Economics", 77.5));
		studentList.add(new Student1("Asif", 16, "Mathematics", 89.4));
		studentList.add(new Student1("Nihira", 17, "Computer Science", 84.6));
		studentList.add(new Student1("Mitshu", 18, "History", 73.5));
		studentList.add(new Student1("Vijay", 19, "Mathematics", 92.8));
		studentList.add(new Student1("Harry", 20, "History", 71.9));
		
     // Collecting top 3 performing students into List
		
		List<Student1> top3student = studentList.stream()
				.sorted(Comparator.comparingDouble(Student1::getPercentage).reversed()).limit(3)
				.collect(Collectors.toList());
		//System.out.println(top3student);
		
		//Collecting subjects offered into Set
		Set<String> subjects = studentList.stream().map(Student1::getSubject).collect(Collectors.toSet());
		//System.out.println(subjects);
		
		//Collecting name and percentage of each student into a Map
		
		Map<String, Double> namePercentageMap = studentList.stream()
				.collect(Collectors.toMap(Student1::getName, Student1::getPercentage));
		//System.out.println(namePercentageMap);
		
		//Collecting first 3 students into LinkedList
		Collection<Student1> studentLinkedList = studentList.stream().limit(3).collect(Collectors.toCollection(LinkedList::new));
        
		System.out.println(studentLinkedList);
		
		
		//Collecting the names of all students joined as a string
		String namesJoined=studentList.stream().map(Student1::getName).collect(Collectors.joining(", "));
		System.out.println(namesJoined);
		
		//Counting number of students.
		Long studentCount=studentList.stream().collect(Collectors.counting());
		System.out.println(studentCount);
		
		//Collecting highest percentage
		Optional<Double> highPercentage=studentList.stream().map(Student1::getPercentage).collect(Collectors.maxBy(Comparator.naturalOrder()));
		System.out.println(highPercentage);
		
		
		//Collecting lowest percentage
		Optional<Double> lowPercentage=studentList.stream().map(Student1::getPercentage).collect(Collectors.minBy(Comparator.naturalOrder()));
		System.out.println(lowPercentage);
		
		
		//Collecting sum of percentages
		Double sumOfPercentages=studentList.stream().collect(Collectors.summingDouble(Student1::getPercentage));
		System.out.println(sumOfPercentages);
		
		//Collecting average percentage
		Double averagingPercentage=studentList.stream().collect(Collectors.averagingDouble(Student1::getPercentage));
		System.out.println(averagingPercentage);
		
		//Extracting highest, lowest and average of percentage of students
		DoubleSummaryStatistics dsumstatics=studentList.stream().collect(Collectors.summarizingDouble(Student1::getPercentage));
		System.out.println("Highest Percentage : "+dsumstatics.getMax());
		System.out.println("Lowest Percentage :"+dsumstatics.getMin());
		System.out.println("average percentage :"+dsumstatics.getAverage());
		
		//Grouping the students by subject
		Map<String,List<Student1>> studentGroupbysubject=studentList.stream().collect(Collectors.groupingBy(Student1::getSubject));
		System.out.println(studentGroupbysubject);
		
		//Partitioning the students who got above 80.0% from who don’t.
		Map<Boolean, List<Student1>> studentpartitionedByPercentage=studentList.stream().collect(Collectors.partitioningBy(student->student.getPercentage()>80.0));
		System.out.println(studentpartitionedByPercentage);
		
		//Collecting first three students into List and making it unmodifiable
		List<Student1> first3Students =studentList.stream().limit(3).collect(Collectors.collectingAndThen(Collectors.toList(),Collections::unmodifiableList));
		System.out.println(first3Students);
		
		

}
}