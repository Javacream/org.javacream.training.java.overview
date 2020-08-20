package org.javacream.people;

import java.util.HashMap;
import java.util.Map;

public class PeopleManager {

	private Map<String, Person> people = new HashMap<String, Person>();
	void create(String lastname, String firstname) {
		Person person = new Person(lastname, firstname, 50);
		people.put(lastname, person);
		
	}
	
	Person findByLastname(String lastname) {
		return people.get(lastname);
	}
}
