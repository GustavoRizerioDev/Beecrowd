package main.java.com.iniciante.media3;

import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double A = sc.nextDouble();
        Double B = sc.nextDouble();
        Double C = sc.nextDouble();
        Double D = sc.nextDouble();

        Double media = (A * 2 + B * 3 + C * 4 + D) / 10;

        if (media >= 7.0) {
            System.out.println(String.format("Media: %.1f", media));
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println(String.format("Media: %.1f", media));
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println(String.format("Media: %.1f", media));
            System.out.println("Aluno em exame.");
            Double E = sc.nextDouble();
            System.out.println(String.format("Nota do exame: %.1f", E));
            Double mediaFinal = (media + E) / 2;
            if (mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println(String.format("Media final: %.1f", mediaFinal));
        }

    }
}
