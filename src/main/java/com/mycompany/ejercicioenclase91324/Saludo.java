package com.mycompany.ejercicioenclase91324;

import java.util.Scanner;

public class Saludo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Buenos días " + nombre);
    }
}