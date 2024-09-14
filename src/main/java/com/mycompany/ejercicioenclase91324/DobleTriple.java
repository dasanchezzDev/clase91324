package com.mycompany.ejercicioenclase91324;

import java.util.Scanner;

public class DobleTriple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int numero = sc.nextInt();
        System.out.println("El doble de " + numero + " es " + (numero * 2));
        System.out.println("El triple de " + numero + " es " + (numero * 3));
    }
}
