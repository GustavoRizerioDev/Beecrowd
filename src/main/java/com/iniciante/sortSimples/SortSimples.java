package main.java.com.iniciante.sortSimples;

import java.util.Scanner;

public class SortSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer A = sc.nextInt();
        Integer B = sc.nextInt();
        Integer C = sc.nextInt();

        if (A < B && A < C){
            System.out.println(A);
            if (B < C){
                System.out.println(B);
                System.out.println(C);
            } else {
                System.out.println(C);
                System.out.println(B);
            }
        } else if (B < C){
            System.out.println(B);
            if (A < C){
                System.out.println(A);
                System.out.println(C);
            } else {
                System.out.println(C);
                System.out.println(A);
            }
        } else {
            System.out.println(C);
            if (A < B){
                System.out.println(A);
                System.out.println(B);
            } else {
                System.out.println(B);
                System.out.println(A);
            }
        }

        System.out.println();

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}
