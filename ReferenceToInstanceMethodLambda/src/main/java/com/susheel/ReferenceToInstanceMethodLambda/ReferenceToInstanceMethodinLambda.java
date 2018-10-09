package com.susheel.ReferenceToInstanceMethodLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.susheel.model.Person;


public class ReferenceToInstanceMethodinLambda {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Susheel", 21));
		persons.add(new Person("Dayasagar", 21));
		persons.add(new Person("Onkar", 29));
		persons.add(new Person("Vishwas", 21));
		
		
	List<String> personNames =ReferenceToInstanceMethodinLambda.getPersonsName(persons,Person::getName);
	personNames.forEach(System.out::println);
	}

	private static List<String> getPersonsName(List<Person> persons, Function<Person, String> f) {
		List<String> results  = new ArrayList<>();
		persons.forEach(n->results.add(f.apply(n)));
		return results;
	}

}