package fr.isika.cdi7.cleancode.birthdaycheck;

import java.time.LocalDate;

public class FounisseurDateDeTest implements FournisseurDate {

	private LocalDate now;

	public FounisseurDateDeTest(LocalDate now) {
		this.now = now;
	}

	@Override
	public LocalDate now() {
		return now;
	}

}
