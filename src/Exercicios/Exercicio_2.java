package Exercicios;

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        // 2. Escreva um programa que declare uma variável do tipo double e calcule
        // o quadrado desse número.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número em cm: ");
        double areaQuadrado = sc.nextDouble();
        double perimetroQuadrado = areaQuadrado * 2;

        System.out.println("o quadrado desse número é " + perimetroQuadrado);
    }
}
