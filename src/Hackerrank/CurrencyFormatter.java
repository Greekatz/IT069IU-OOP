package Hackerrank;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.Currency;


public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();

        // United States formatting
        Currency us = Currency.getInstance(Locale.US);
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);

        NumberFormat fmt = NumberFormat.getCurrencyInstance();
    }
}
