package com.test;

import java.util.Locale;

public class TCPTest {
	public static void main(String[] args) {
		Locale[] availableLocales = Locale.getAvailableLocales();
		for (Locale locale : availableLocales) {
			System.out.println(locale);
		}
	}
}
