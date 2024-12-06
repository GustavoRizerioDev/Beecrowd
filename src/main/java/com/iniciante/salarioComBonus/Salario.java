package main.java.com.iniciante.salarioComBonus;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        Double B = sc.nextDouble();
        Double C = sc.nextDouble();

        Double total = B + (C * 0.15);

        System.out.println(String.format("TOTAL = R$ %.2f", total));
    }
}
