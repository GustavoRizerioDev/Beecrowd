package main.java.com.iniciante.media1;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double A = sc.nextDouble();
        Double B = sc.nextDouble();

        Double pesoA = 3.5;
        Double pesoB = 7.5;

        Double media = (A * pesoA + B * pesoB) / (pesoA + pesoB);

        System.out.println(String.format("MEDIA = %.5f", media));
    }
}
