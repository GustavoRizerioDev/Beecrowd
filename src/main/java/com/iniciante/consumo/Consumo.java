package main.java.com.iniciante.consumo;

import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer A = sc.nextInt();
        Double B = sc.nextDouble();

        Double valor = A / B;

        System.out.println(String.format("%.3f km/l", valor));

    }
}
