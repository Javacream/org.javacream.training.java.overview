package org.javacream.training.java.overview;

import java.util.HashMap;

public class PeopleManager {

	private Integer counter = 0;
	private HashMap<Integer, Person> people = new HashMap<Integer, Person>();
	Integer create(String lastname, String firstname) {
		Person person = new Person(lastname, firstname, counter++);
		people.put(counter, person);
		return counter;
		
	}
	
	Person findById(Integer id) {
		return people.get(id);
		
	}
}
