package main.java.com.iniciante.triangulo;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double A = sc.nextDouble();
        Double B = sc.nextDouble();
        Double C = sc.nextDouble();

        if (A < B + C && B < A + C && C < A + B) {
            System.out.println("Perimetro = " + (A + B + C));
        } else {
            System.out.println("Area = " + ((A + B) * C) / 2);
        }
    }
}
