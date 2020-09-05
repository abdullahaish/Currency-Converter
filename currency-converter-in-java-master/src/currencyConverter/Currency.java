package currencyConverter;

import java.util.ArrayList;
import java.util.HashMap;

public class Currency {
	private String name;
	private String shortName;
	private HashMap<String, Double> exchangeValues = new HashMap<String, Double>();
	
	// "Currency" Constructor
	public Currency(String nameValue, String shortNameValue) {
		this.name = nameValue;
		this.shortName = shortNameValue;
	}
	
	// Getter for name
	public String getName() {
		return this.name;
	}
	
	// Setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	// Getter for shortName
	public String getShortName() {
		return this.shortName;
	}
	
	// Setter for shortName
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	
	// Getter for exchangeValues
	public HashMap<String, Double> getExchangeValues() {
		return this.exchangeValues;
	}
	
	// Setter for exchangeValues
	public void setExchangeValues(String key, Double value) {
		this.exchangeValues.put(key, value);
	}
	
	// Set default values for a currency
	public void defaultValues() {
		String currency = this.name;
		
		switch (currency) {	
			case "US Dollar":
				this.exchangeValues.put("USD", 1.00);
				this.exchangeValues.put("EUR", 0.84);
				this.exchangeValues.put("GBP", 0.75);
				this.exchangeValues.put("PK", 165.95);
				this.exchangeValues.put("CNY", 6.84);
				this.exchangeValues.put("JPY", 106.24);
				this.exchangeValues.put("CAD", 1.31);
				this.exchangeValues.put("AUD", 1.37);
				this.exchangeValues.put("CHF", 0.91);
				this.exchangeValues.put("NZD", 1.49);
				break;
			case "Euro":
				this.exchangeValues.put("USD", 1.18);
				this.exchangeValues.put("EUR", 1.00);
				this.exchangeValues.put("GBP", 0.89);
				this.exchangeValues.put("PK", 196.46);
				this.exchangeValues.put("CNY", 8.10);
				this.exchangeValues.put("JPY", 125.77);
				this.exchangeValues.put("CAD", 0.88);
				this.exchangeValues.put("AUD", 0.92);
				this.exchangeValues.put("CHF", 0.61);
				this.exchangeValues.put("NZD", 1.000);
				break;
			case "British Pound":
				this.exchangeValues.put("USD", 1.33);
				this.exchangeValues.put("EUR", 1.12);
				this.exchangeValues.put("GBP", 1.00);
				this.exchangeValues.put("PK", 220.54);
				this.exchangeValues.put("CNY", 9.09);
				this.exchangeValues.put("JPY", 141.19);
				this.exchangeValues.put("CAD", 1.55);
				this.exchangeValues.put("AUD", 1.63);
				this.exchangeValues.put("CHF", 1.08);
				this.exchangeValues.put("NZD", 1.77);
				break;
			case "Pakistan":
				this.exchangeValues.put("USD", 0.0060);
				this.exchangeValues.put("EUR", 0.0051);
				this.exchangeValues.put("GBP", 0.0045);
				this.exchangeValues.put("PK", 1.00);
				this.exchangeValues.put("CNY", 0.041);
				this.exchangeValues.put("JPY", 0.64);
				this.exchangeValues.put("CAD", 0.0070);
				this.exchangeValues.put("AUD", 0.0083);
				this.exchangeValues.put("CHF", 0.0055);
				this.exchangeValues.put("NZD", 0.0090);
				break;
			case "Chinese Yuan Renminbi":
				this.exchangeValues.put("USD", 0.15);
				this.exchangeValues.put("EUR", 0.12);
				this.exchangeValues.put("GBP", 0.11);
				this.exchangeValues.put("PK", 24.25);
				this.exchangeValues.put("CNY", 1.00);
				this.exchangeValues.put("JPY", 15.53);
				this.exchangeValues.put("CAD", 0.19);
				this.exchangeValues.put("AUD", 0.20);
				this.exchangeValues.put("CHF", 0.13);
				this.exchangeValues.put("NZD", 0.22);
				break;
			case "Japanese Yen":
				this.exchangeValues.put("USD", 0.0094);
				this.exchangeValues.put("EUR", 0.0080);
				this.exchangeValues.put("GBP", 0.0071);
				this.exchangeValues.put("PK", 1.56);
				this.exchangeValues.put("CNY", 0.064);
				this.exchangeValues.put("JPY", 1.000);
				this.exchangeValues.put("CAD", 0.012);
				this.exchangeValues.put("AUD", 0.013);
				this.exchangeValues.put("CHF", 0.0086);
				this.exchangeValues.put("NZD", 0.014);
				break;
			case "Canadian Dollar":
				this.exchangeValues.put("USD", 0.77);
				this.exchangeValues.put("EUR", 0.65);
				this.exchangeValues.put("GBP", 0.58);
				this.exchangeValues.put("PK", 127.04);
				this.exchangeValues.put("CNY", 5.24);
				this.exchangeValues.put("JPY", 81.33);
				this.exchangeValues.put("CAD", 1.000);
				this.exchangeValues.put("AUD", 1.05);
				this.exchangeValues.put("CHF", 0.70);
				this.exchangeValues.put("NZD", 1.14);
				break;
			case "Australian Dollar":
				this.exchangeValues.put("USD", 0.73);
				this.exchangeValues.put("EUR", 0.62);
				this.exchangeValues.put("GBP", 0.55);
				this.exchangeValues.put("PK", 120.89);
				this.exchangeValues.put("CNY", 4.98);
				this.exchangeValues.put("JPY", 77.36);
				this.exchangeValues.put("CAD", 0.95);
				this.exchangeValues.put("AUD", 1.000);
				this.exchangeValues.put("CHF", 0.66);
				this.exchangeValues.put("NZD", 1.09);
				break;
			case "Swiss Franc":
				this.exchangeValues.put("USD", 1.10);
				this.exchangeValues.put("EUR", 0.93);
				this.exchangeValues.put("GBP", 0.82);
				this.exchangeValues.put("PK", 181.79);
				this.exchangeValues.put("CNY", 7.50);
				this.exchangeValues.put("JPY", 116.38);
				this.exchangeValues.put("CAD", 1.43);
				this.exchangeValues.put("AUD", 1.50);
				this.exchangeValues.put("CHF", 1.000);
				this.exchangeValues.put("NZD", 1.63);
				break;
			case "New Zealand":
				this.exchangeValues.put("USD", 0.67);
				this.exchangeValues.put("EUR", 0.57);
				this.exchangeValues.put("GBP", 0.50);
				this.exchangeValues.put("PK", 111.30);
				this.exchangeValues.put("CNY", 4.60);
				this.exchangeValues.put("JPY", 71.26);
				this.exchangeValues.put("CAD", 0.88);
				this.exchangeValues.put("AUD", 0.92);
				this.exchangeValues.put("CHF", 0.61);
				this.exchangeValues.put("NZD", 1.000);
				break;
		}
	}
	
	// Initialize currencies Australian Dollar
	public static ArrayList<Currency> init() {
		ArrayList<Currency> currencies = new ArrayList<Currency>();
				
		currencies.add( new Currency("US Dollar", "USD") );
		currencies.add( new Currency("Euro", "EUR") );
		currencies.add( new Currency("Canadian Dollar", "CAD") );
		currencies.add( new Currency("Australian Dollar", "AUD") );
		currencies.add( new Currency("New Zealand", "NZD") );
		currencies.add( new Currency("Swiss Franc", "CHF") );
		currencies.add( new Currency("British Pound", "GBP") );
		currencies.add( new Currency("Pakistan", "PK") );
		currencies.add( new Currency("Chinese Yuan Renminbi", "CNY") );
		currencies.add( new Currency("Japanese Yen", "JPY") );
		
		for (Integer i =0; i < currencies.size(); i++) {
			currencies.get(i).defaultValues();
		}		
		
		return currencies;
	}
	
	// Convert a currency to another
	public static Double convert(Double amount, Double exchangeValue) {
		Double price;
		price = amount * exchangeValue;
		price = Math.round(price * 100d) / 100d;
		
		return price;
	}
}