package fr.isika.cdi7.cleancode.birthdaycheck;

import java.time.LocalDate;

public class FournisseurDateSysteme implements FournisseurDate {

	@Override
	public LocalDate now() {
		return LocalDate.now();
	}

}
