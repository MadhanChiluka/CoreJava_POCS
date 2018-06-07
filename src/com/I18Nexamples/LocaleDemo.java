package com.I18Nexamples;

import java.util.Locale;

public class LocaleDemo {

	public static void main(String[] args) {
		Locale locale1 = Locale.getDefault();
		System.out.println(locale1.getCountry() + "_____" + locale1.getLanguage());
		System.out.println(locale1.getDisplayCountry() + "_____" + locale1.getDisplayLanguage());

		Locale locale2 = new Locale("pa", "IN");
		locale2.setDefault(locale2);
		System.out.println(locale2.getDisplayLanguage() + "_____" + locale2.getDisplayCountry());

		String[] string = Locale.getISOLanguages();
		for (String string1 : string) {
			System.out.println("ISO language is "+string1);
		}
		String[] strings = Locale.getISOCountries();
		for (String string1 : strings) {
			 System.out.println("ISO countries "+string1);
		}
		Locale[] locales = Locale.getAvailableLocales();
		for (Locale locale3 : locales) {
			System.out.println("All Available locales is " + locale3);
		}

	}

}
