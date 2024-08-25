package LoopsLacosRepeticaoWhileFor.Exercicos;

// 08. Escreva um programa Java que determine se um número é par ou ímpar

import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é ímpar");
        }
        scanner.close();

    }
}
