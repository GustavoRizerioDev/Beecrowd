package main.java.com.iniciante.somaSimples;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer A = sc.nextInt();
        Integer B = sc.nextInt();

        Integer X = A + B;

        System.out.println("SOMA = " + X);
    }
}
