package corejava.concepts;

import java.util.HashMap;

public class CustomImmutableClass extends HashMap<String, Integer> {

	public static void main(String[] args) {
		/*
		 * 1.Class is final
		 * 2.private members
		 * 3.final fields
		 * 4.intialize all variables inside constructor
		 * 5.don't provide setters
		 * 6.always return a copy of object (clone)
		 * */
		new HashMap();
	}

}
