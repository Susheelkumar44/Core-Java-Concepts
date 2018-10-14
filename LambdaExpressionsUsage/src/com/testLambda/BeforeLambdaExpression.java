package com.testLambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BeforeLambdaExpression {

	public static void main(String[] args) {
		List<Person> peopleList=Arrays.asList(
			new Person("Susheel","kumar",21),
			new Person("Daya","Sagar",22),
			new Person("Gagan","T K",23),
			new Person("Akhil","MS",21),
			new Person("Akhil","Rai",25)
		);
		
		System.out.println("Printing all names");
		printAllNames(peopleList);
		
		//Sorting
		System.out.println("-------------------------------------");
		System.out.println("Printing names in sorted order");
		Collections.sort(peopleList, new Comparator<Person>() {

			@Override
			public int compare(Person p0, Person p1) {
				return p0.getFirstName().compareTo(p1.getFirstName());
			}
		});
		printAllNames(peopleList);
		
		//Finding with name A
		System.out.println("-----------------------------------------");
		System.out.println("printing names starting with A");
		printConditionally(peopleList,new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("A");
			}
			
		});
	}

	

	private static void printConditionally(List<Person> peopleList, Condition condition) {
		for(Person p:peopleList)
			if(condition.test(p))
			System.out.println(p);
	}		



	private static void printAllNames(List<Person> peopleList) {
		for(Person p:peopleList)
			System.out.println(p);
	}

}
interface Condition{
	public boolean test(Person p);
}
