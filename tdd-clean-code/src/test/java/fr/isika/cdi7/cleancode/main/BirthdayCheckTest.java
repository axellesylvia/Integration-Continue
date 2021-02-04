package fr.isika.cdi7.cleancode.main;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

import fr.isika.cdi7.cleancode.birthdaycheck.BirthdayCheck;
import fr.isika.cdi7.cleancode.birthdaycheck.FounisseurDateDeTest;

public class BirthdayCheckTest {

	/*
	 * Ecrire une méthode qui vérifie si la 
	 * date du jour est mon anniversaire
	 */
	@Test(expected=Exception.class)
	public void shouldTellIsNotMyBirthDayForInvalidDate() throws Exception {
		LocalDate now = LocalDate.of(2021, 2, 2);
		BirthdayCheck birthdayCheck = new BirthdayCheck(new FounisseurDateDeTest(now));
		assertFalse(birthdayCheck.isMyBirthday(null));
	}
	
	@Test
	public void shouldTellIsMyBirthday() throws Exception {
		LocalDate now = LocalDate.of(2021, 2, 2);
		BirthdayCheck birthdayCheck = new BirthdayCheck(new FounisseurDateDeTest(now));
		LocalDate myBirthDate = LocalDate.of(2021, 2, 2);
		assertTrue(birthdayCheck.isMyBirthday(myBirthDate));
	}

	@Test
	public void shouldTellIsNotMyBirthDay() throws Exception {
		LocalDate now = LocalDate.of(2021, 2, 2);
		BirthdayCheck birthdayCheck = new BirthdayCheck(new FounisseurDateDeTest(now));
		LocalDate myBirthDate = LocalDate.of(2021, 2, 3);
		assertFalse(birthdayCheck.isMyBirthday(myBirthDate));
	}
}
