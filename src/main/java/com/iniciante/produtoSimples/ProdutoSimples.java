package main.java.com.iniciante.produtoSimples;

import java.util.Scanner;

public class ProdutoSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer A = sc.nextInt();
        Integer B = sc.nextInt();

        Integer X = A * B;

        System.out.println("PROD = " + X);
    }
}
