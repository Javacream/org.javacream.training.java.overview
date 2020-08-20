package org.javacream.people;

import org.junit.Assert;
import org.junit.Test;

public class PeopleTests {
	
	@Test public void testPeopleManager() {
		PeopleManager manager = new PeopleManager();
		manager.create("Sawitzki", "Rainer");
		Person person = manager.findByLastname("Sawitzki");
		Assert.assertEquals("Sawitzki", person.getLastname());
		Assert.assertEquals("Rainer", person.getFirstname());
	}

}
