package main.java.com.iniciante.areaDoCirculo;

import java.util.Scanner;

public class Area{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double n = 3.14159;
        Double raio = sc.nextDouble();

        Double area = n * (raio * raio);

        System.out.println(String.format("A=%.4f", area));
    }
}
