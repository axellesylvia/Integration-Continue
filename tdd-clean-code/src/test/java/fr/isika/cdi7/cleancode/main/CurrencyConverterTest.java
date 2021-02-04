package fr.isika.cdi7.cleancode.main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.isika.cdi7.cleancode.currency.Currency;
import fr.isika.cdi7.cleancode.currency.CurrencyConverter;

public class CurrencyConverterTest {

	@Test(expected=IllegalArgumentException.class)
	public void shouldThrowExceptionIfInvalidSourceCurrency() {
		CurrencyConverter.convert(null, Currency.USD, 1.0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void shouldThrowExceptionIfInvalidTargetCurrency() {
		CurrencyConverter.convert(Currency.EUR, null, 1.0);
	}
	
	@Test
	public void shouldConvertEurosToDollars() {
		Double expectedDollars = Double.valueOf(1.2);
		Double eurosToConvert = Double.valueOf(1.0);
		assertEquals(expectedDollars, 
				CurrencyConverter.convert(Currency.EUR, Currency.USD, eurosToConvert));
	}
	
	@Test
	public void shouldConvertDollarsToEuros() {
		Double expectedEuros = Double.valueOf(0.8);
		Double dollarsToConvert = Double.valueOf(1.0);
		assertEquals(expectedEuros, 
				CurrencyConverter.convert(Currency.USD, Currency.EUR, dollarsToConvert));
	}

	@Test
	public void shouldConvertEurosToEuros() {
		assertEquals(Double.valueOf(1.0), 
				CurrencyConverter.convert(Currency.EUR, Currency.EUR, 1.0));
	}
	
	@Test
	public void shouldConvertDollarsToDollars() {
		assertEquals(Double.valueOf(1.0), 
				CurrencyConverter.convert(Currency.USD, Currency.USD, 1.0));
	}
}
