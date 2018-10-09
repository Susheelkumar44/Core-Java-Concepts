package com.susheel.ReferenceToInstanceMethodLambda;

/**
 * Hello world!
 *
 */
import java.util.ArrayList;
import java.util.List;

public class ClientTest {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Susheel");
		names.add("Kumar");
		names.add("Daya");
		names.add("sagar");
		names.add("Gagan");
		
		//names.forEach(x->System.out.println(x));
		names.forEach(System.out::println);
	}

}
