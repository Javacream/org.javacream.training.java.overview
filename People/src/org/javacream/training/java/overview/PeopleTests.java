package org.javacream.training.java.overview;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PeopleTests {

	private PeopleManager peopleManager;
	
	@Before public void setUp() {
		peopleManager = new PeopleManager();
	}
	@Test public void aCreatedPersonMustBeFound() {
		Integer createdId = peopleManager.create("Sawitzki", "Rainer");
		Person searched = peopleManager.findById(createdId);
		Assert.assertNotNull(searched);
		Assert.assertEquals("Sawitzki", searched.getLastname());
	}

	@Test public void heightOfAPersonMustBeBetween50and280() {
		Integer createdId = peopleManager.create("Sawitzki", "Rainer");
		Person searched = peopleManager.findById(createdId);
		searched.setHeight(90);
	}
	@Test(expected = IllegalArgumentException.class) public void heightOfAPersonMustBeBetween50and280VheckError() {
		Integer createdId = peopleManager.create("Sawitzki", "Rainer");
		Person searched = peopleManager.findById(createdId);
		searched.setHeight(9);
	}

}
