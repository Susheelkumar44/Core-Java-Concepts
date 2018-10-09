package com.susheel.streamoperations;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class ClientTest {

	public static void main(String[] args) {
		List<String> list=new LinkedList<>();
		list.add("susheel");
		list.add("daya"); 
		list.add("gagan");
		list.add("vishwas");
		list.add("vishwas");
		
		/*Stream<String> stream=list.stream();
		Stream<String> distinct=stream.distinct();
		long count=distinct.count();*/
		Stream<String> stream=list.stream();
		long count=stream./*list.parallelStream()*//*stream().*/distinct().count(); 
		System.out.println(count);
		
		/*long c=stream.count(); */
		boolean anyMatch=list.stream().anyMatch(s->s.contains("gaga")); //to check whether string contains given string
		System.out.println(anyMatch); 
		
	}

}
