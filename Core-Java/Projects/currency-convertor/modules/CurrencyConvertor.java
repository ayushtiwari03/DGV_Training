package modules;

import java.util.ArrayList;

public class CurrencyConvertor {
	
	
	public void rupeeToUsd(double amount) {
		double convertedAmount = amount/82.54;
		System.out.println(convertedAmount +"$");
	}
	
	public void rupeeToAud(double amount) {
		double convertedAmount = amount * 0.019;
		System.out.println(convertedAmount +"$");
	}
	
	public void rupeeToPound(double amount) {
		double convertedAmount = amount * 0.011;
		System.out.println(convertedAmount+"£");
	}
	
	public void rupeeToEuro(double amount) {
		double convertedAmount = amount * 0.012;
		System.out.println(convertedAmount+"€");
	}
	
	public void rupeeToYen(double amount) {
		double convertedAmount = amount * 1.8;
		System.out.println(convertedAmount+"¥");
	}
	
	
	
}
