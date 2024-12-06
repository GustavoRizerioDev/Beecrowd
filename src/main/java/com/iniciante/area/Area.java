package main.java.com.iniciante.area;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double A = sc.nextDouble();
        Double B = sc.nextDouble();
        Double C = sc.nextDouble();

        Double triangulo = (A * C) / 2;
        Double cirulo = (C * C) * 3.14159;
        Double trapezio = ((A + B) * C) / 2;
        Double quadrado = B * B;
        Double retangulo = A * B;

        System.out.println(String.format("TRIANGULO: %.3f", triangulo));
        System.out.println(String.format("CIRCULO: %.3f", cirulo));
        System.out.println(String.format("TRAPEZIO: %.3f", trapezio));
        System.out.println(String.format("QUADRADO: %.3f", quadrado));
        System.out.println(String.format("RETANGULO: %.3f", retangulo));

    }
}
