package com.testLambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class UsingMorefunctionalInterface {
	public static void main(String[] args) {
		List<Person> peopleList=Arrays.asList(
				new Person("Susheel","kumar",21),
				new Person("Daya","Sagar",22),
				new Person("Gagan","T K",23),
				new Person("Akhil","MS",21),
				new Person("Akhil","Rai",25)
			);
			
			System.out.println("***********Using Lambda Expressions********************");
			System.out.println("Printing all names");
			printAllNames(peopleList);
			
			//Sorting
			System.out.println("-------------------------------------");
			System.out.println("Printing names in sorted order");
			
			Collections.sort(peopleList, (p0,p1)-> p0.getFirstName().compareTo(p1.getLastName()));
			printAllNames(peopleList);
			
			//Finding with name A
			System.out.println("-----------------------------------------");
			System.out.println("printing names starting with A");
			printConditionally(peopleList,p->p.getFirstName().startsWith("A"));
		}

		private static void printConditionally(List<Person> peopleList, Predicate<Person> predicate) {
			for(Person p:peopleList)
				if(predicate.test(p))
				System.out.println(p);
		}		

		private static void printAllNames(List<Person> peopleList) {
			for(Person p:peopleList)
				System.out.println(p);
		}

	}

