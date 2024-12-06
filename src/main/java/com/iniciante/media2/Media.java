package main.java.com.iniciante.media2;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double A = sc.nextDouble();
        Double B = sc.nextDouble();
        Double C = sc.nextDouble();

        Double pesoA = 2.00;
        Double pesoB = 3.00;
        Double pesoC = 5.00;

        Double media = (A * pesoA + B * pesoB + C * pesoC) / (pesoA + pesoB + pesoC);

        System.out.println(String.format("MEDIA = %.1f", media));
    }
}
