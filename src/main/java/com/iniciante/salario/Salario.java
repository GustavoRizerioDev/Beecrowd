package main.java.com.iniciante.salario;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer A = sc.nextInt();
        Integer B = sc.nextInt();
        Double C = sc.nextDouble();

        Double salario = B * C;

        System.out.println("NUMBER = " + A);
        System.out.println(String.format("SALARY = U$ %.2f",salario));
    }
}
