package corejava.concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringExample {

	public static void main(String[] args) {
		String name="The The quick quick quick brown fox fox fox fox jumps over the the lazy dog lazy";
		
		String[] rmvDup= name.split(" ");
		
		String uniqStr=null;
		
		List<String> rmDuplist = new ArrayList<>();
		for(String str1:rmvDup) {
			rmDuplist.add(str1+" ");
		}
		rmDuplist.stream().sorted(Comparator.comparingInt(String::length))
		.distinct().collect(Collectors.toSet()).forEach(System.out::print);
//		Set<String> uniqSet = new HashSet<>();
		
//		for(String str:rmvDup) {
//			uniqSet.add(str);
//			
//		}
		
		//rmDuplist.stream().distinct().collect(Collectors.toList()).forEach(System.out::print);
		
		//uniqSet.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList()).forEach(System.out::print);
	}
	

}
