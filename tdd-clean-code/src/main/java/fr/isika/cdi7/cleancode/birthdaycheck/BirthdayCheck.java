package fr.isika.cdi7.cleancode.birthdaycheck;

import java.time.LocalDate;

public class BirthdayCheck {

	private final FournisseurDate founisseurDate;
	
	public BirthdayCheck(final FournisseurDate founisseurDate) {
		this.founisseurDate = founisseurDate;
	}

	/**
	 * ... . 
	 * @param myBirthDate
	 * @return
	 * @throws Exception if myBirthDate is null.
	 */
	public boolean isMyBirthday(final LocalDate myBirthDate) throws Exception {
		if(myBirthDate == null) throw new Exception("Invalid date");
		return this.founisseurDate.now().equals(myBirthDate);
	}

}
