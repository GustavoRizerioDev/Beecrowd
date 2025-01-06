package main.java.com.iniciante.lanche;

import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer codigo = sc.nextInt();
        Integer quantidade = sc.nextInt();

        Double total = codigo == 1 ? 4.00 * quantidade
                     : codigo == 2 ? 4.50 * quantidade
                     : codigo == 3 ? 5.00 * quantidade
                     : codigo == 4 ? 2.00 * quantidade
                     : codigo == 5 ? 1.50 * quantidade
                     : 0.0;

        System.out.println(String.format("Total: R$ %.2f", total));
    }
}
