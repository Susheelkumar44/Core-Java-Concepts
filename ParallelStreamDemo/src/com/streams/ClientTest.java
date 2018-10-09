package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ClientTest {
	public static void main(String args[])
	{
		List<Student> list=new ArrayList<>();
		list.add(new Student("Susheel",21));
		list.add(new Student("Daya",22));
		list.add(new Student("Gagan",23));
		list.add(new Student("Vishwas",24));
		
		System.out.println("Implementing serial stream");
		Stream<Student> stream=list.stream();
		stream.forEach(s->System.out.println(s));
		//stream.forEach(s->doProcess(s));
		System.out.println("------------------------------");
		System.out.println("Implementing parallel stream");
		Stream<Student> parallelStream=list.parallelStream();
		parallelStream.forEach(s->doProcess(s));
	}

	private static void doProcess(Student s) {
		System.out.println(s);
	}
}
