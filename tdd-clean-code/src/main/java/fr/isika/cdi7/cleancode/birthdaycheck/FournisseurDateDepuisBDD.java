package fr.isika.cdi7.cleancode.birthdaycheck;

import java.time.LocalDate;

public class FournisseurDateDepuisBDD implements FournisseurDate {

	@Override
	public LocalDate now() {
		// code d'acces bdd 
		// traitements etc ....
		LocalDate date = LocalDate.of(1999, 2, 15);
		return date;
	}

}
