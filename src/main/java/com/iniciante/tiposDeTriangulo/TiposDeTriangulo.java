package main.java.com.iniciante.tiposDeTriangulo;

import java.util.Scanner;

public class TiposDeTriangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Double A = sc.nextDouble();
        Double B = sc.nextDouble();
        Double C = sc.nextDouble();

        if (A >= B + C || B >= A + C || C >= A + B){
            System.out.println("NAO FORMA TRIANGULO");
        } else if (Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2) || Math.pow(B, 2) == Math.pow(A, 2) + Math.pow(C, 2) || Math.pow(C, 2) == Math.pow(A, 2) + Math.pow(B, 2)){
            System.out.println("TRIANGULO RETANGULO");
        } else if (Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2) || Math.pow(B, 2) > Math.pow(A, 2) + Math.pow(C, 2) || Math.pow(C, 2) > Math.pow(A, 2) + Math.pow(B, 2)){
            System.out.println("TRIANGULO OBTUSANGULO");
        } else if (Math.pow(A, 2) < Math.pow(B, 2) + Math.pow(C, 2) || Math.pow(B, 2) < Math.pow(A, 2) + Math.pow(C, 2) || Math.pow(C, 2) < Math.pow(A, 2) + Math.pow(B, 2)){
            System.out.println("TRIANGULO ACUTANGULO");
        }

        if (A.equals(B) && B.equals(C)){
            System.out.println("TRIANGULO EQUILATERO");
        } else if (A.equals(B) || B.equals(C) || A.equals(C)) {
            System.out.println("TRIANGULO ISOSCELES");
        }


    }
}

GIT_AUTHOR_DATE="2025-01-11T14:00:00-03:00" GIT_COMMITTER_DATE="2025-01-11T14:00:00-03:00" git commit src/main/java/com/iniciante/tiposDeTriangulo/TiposDeTriangulo.java -m ":sparkles: feat: Exercicios resolvidos"



