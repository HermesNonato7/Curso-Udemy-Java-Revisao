package Exercicios;

import java.util.Scanner;

public class MediaTresNumeros {
    public static void main(String[] args) {
        // 3. Escreva um programa Java que calcule a média de três números inteiros.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int num3 = sc.nextInt();

        int resultado = (num1 + num2 + num3) / 3;

        System.out.println("O resultado da média dos 3 nmumeros é " + resultado);

        sc.close();

    }
}
