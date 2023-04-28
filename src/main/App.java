package main;
import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class App {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dolarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		double result = CurrencyConverter.dolarToReal(amount, dolarPrice);
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		
		
	
		sc.close();
	}

}
