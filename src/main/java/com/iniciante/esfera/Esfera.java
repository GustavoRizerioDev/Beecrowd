package main.java.com.iniciante.esfera;

import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double r = sc.nextDouble();

        Double total = (4.0 / 3.0) * 3.14159 * (r * r * r);

        System.out.println(String.format("VOLUME = %.3f", total));
    }
}
