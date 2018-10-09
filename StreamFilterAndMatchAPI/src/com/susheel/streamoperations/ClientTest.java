package com.susheel.streamoperations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class ClientTest {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		list.add(new Student("susheel",21));
		list.add(new Student("daya",22)); 
		list.add(new Student("gagan",23));
		list.add(new Student("vishwas",22));
		list.add(new Student("akhil",24));
		list.add(new Student("vijay",85));
		
		Stream<Student> filteredList=list.stream().filter(s->s.getAge()>22);
		filteredList.forEach(System.out::println);
		System.out.println("------------------------------");
		
		boolean allMatch=list.stream().allMatch(s->s.getName().contains("a"));
		System.out.println(allMatch);
		
		System.out.println("------------------------------");
		
		boolean anyMatch=list.stream().anyMatch(s->s.getAge()<=24);
		System.out.println(anyMatch);
		
		System.out.println("-------------------------------");
		
		boolean noneMatch=list.stream().noneMatch(s->s.getAge()>90);
		System.out.println(noneMatch);
	}

}
