package main.java.com.iniciante.calculoSimples;

import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer numero = sc.nextInt();
        Integer qtd = sc.nextInt();
        Double valor = sc.nextDouble();

        Integer numero2 = sc.nextInt();
        Integer qtd2 = sc.nextInt();
        Double valor2 = sc.nextDouble();

        Double valorTotal = (qtd * valor) + (qtd2 * valor2);

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", valorTotal));

    }
}
