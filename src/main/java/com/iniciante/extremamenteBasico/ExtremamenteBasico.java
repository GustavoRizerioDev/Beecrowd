package main.java.com.iniciante.extremamenteBasico;

import java.util.Scanner;

public class ExtremamenteBasico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer A = sc.nextInt();
        Integer B = sc.nextInt();

        Integer X = A + B;

        System.out.println("X = " + X);
    }
}
