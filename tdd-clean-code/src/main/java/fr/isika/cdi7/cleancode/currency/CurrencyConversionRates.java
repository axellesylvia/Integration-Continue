package fr.isika.cdi7.cleancode.currency;

/**
 * Enum pour représenter les règles métier de conversion de devises.
 */
public enum CurrencyConversionRates {

	// @formatter:off
	
	EURO_TO_USD		(Currency.EUR, Currency.USD, 1.2), 
	EUR_TO_EUR		(Currency.USD, Currency.EUR, 1.0),

	USD_TO_EUR		(Currency.USD, Currency.EUR, 0.8), 
	USD_TO_USD		(Currency.USD, Currency.EUR, 1.0)
	;

	// @formatter:on

	private double conversionRate;

	private CurrencyConversionRates(Currency source, Currency target, double conversionRate) {
		this.conversionRate = conversionRate;
	}

	/**
	 * Returns the convertion rate value for the enum instance.
	 * 
	 * @return
	 */
	public double getConversionRate() {
		return conversionRate;
	}

}
