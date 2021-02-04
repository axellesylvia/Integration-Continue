package fr.isika.cdi7.cleancode.main;

import java.time.LocalDate;

import fr.isika.cdi7.cleancode.birthdaycheck.BirthdayCheck;
import fr.isika.cdi7.cleancode.birthdaycheck.FournisseurDateDepuisBDD;
import fr.isika.cdi7.cleancode.currency.Currency;
import fr.isika.cdi7.cleancode.currency.CurrencyConverter;

public class Main {

	public static void main(String[] args) throws Exception {
		
		double euros = 10.0;
		double dollars  = CurrencyConverter.convert(Currency.EUR, Currency.USD, 10);
		
		StringBuilder builder = new StringBuilder();
		builder.append(euros);
		builder.append(" € = ");
		builder.append(dollars);
		builder.append(" $");
//		System.out.println(builder.toString());

		// Avec la classe MessageFormat
//		System.out.println(MessageFormat.format("{0} € = {1} $", euros, dollars));
		
		
		
//		System.out.println(Addition.add(55, 20));
		
		
		BirthdayCheck check = new BirthdayCheck(new FournisseurDateDepuisBDD());
		
		System.out.println(check.isMyBirthday(LocalDate.of(1999, 2, 15)));
	}

}
