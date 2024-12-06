package main.java.com.iniciante.maior;

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer A = sc.nextInt();
        Integer B = sc.nextInt();
        Integer C = sc.nextInt();

        if (A > B && A > C){
            System.out.println(A + " eh o maior");
        } else if (B > C) {
            System.out.println(B + " eh o maior");
        } else{
            System.out.println(C + " eh o maior");
        }
    }
}
