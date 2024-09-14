package com.mycompany.ejercicioenclase91324;
import java.util.Scanner;

public class CelsiusAFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce los grados Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = 32 + (9 * celsius / 5);
        System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit.");
    }
}
