package fr.isika.cdi7.cleancode.main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.isika.cdi7.cleancode.addition.Addition;

public class AdditionTest {

	@Test
	public void shouldAddTowNumbers() {
		assertEquals(2, Addition.add(1, 1));
	}
}
