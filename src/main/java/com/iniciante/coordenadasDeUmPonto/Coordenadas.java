package main.java.com.iniciante.coordenadasDeUmPonto;

import java.util.Scanner;

public class Coordenadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double X = sc.nextDouble();
        Double Y = sc.nextDouble();

        if (X == 0 && Y == 0){
            System.out.println("Origem");
        } else if (X == 0){
            System.out.println("Eixo Y");
        } else if (Y == 0){
            System.out.println("Eixo X");
        } else if (X > 0 && Y > 0){
            System.out.println("Q1");
        } else if (X < 0 && Y > 0){
            System.out.println("Q2");
        } else if (X < 0 && Y < 0){
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }
    }
}
