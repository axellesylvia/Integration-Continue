package fr.isika.cdi7.cleancode.currency;

/**
 * Currency converter.
 */
public class CurrencyConverter {

	/**
	 * Converts the given amount from the source currency to the target currency.
	 * 
	 * @param sourceCurrency
	 * @param targetCurrency
	 * @param amoutToConvert
	 * @return
	 * @throws IllegalArgumentException if source or target are null values.
	 */
	public static Double convert(final Currency sourceCurrency, final Currency targetCurrency,
			final double amoutToConvert) throws IllegalArgumentException {

		// Normalement cette vérification doit être faite par l'appelant mais
		// dans une démarche de réutilisation
		// on peut intégrer le contrôle dans le traitement
		if (sourceCurrency == null || targetCurrency == null)
			throw new IllegalArgumentException();

		if (sourceCurrency.equals(targetCurrency))
			return amoutToConvert;

		switch (sourceCurrency) {
		case EUR:
			return fromEuroToDollars(amoutToConvert);
		case USD:
			return fromDollarsToEuros(amoutToConvert);
		default:
			return Double.valueOf(0);
		}
	}

	/*
	 * Private utility methods (convenience methods used for simpicity)
	 */

	private static double fromEuroToDollars(double amount) {
		return CurrencyConversionRates.EURO_TO_USD.getConversionRate() * amount;
	}

	private static double fromDollarsToEuros(double amount) {
		return CurrencyConversionRates.USD_TO_EUR.getConversionRate() * amount;
	}
}
