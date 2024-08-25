package LoopsLacosRepeticaoWhileFor.Exercicos;

import java.util.Scanner;

/*
07. Escreva um programa Java que verifique se um número é um número perfeito. Um
número perfeito é aquele que é igual à soma de seus divisores próprios (excluindo ele
mesmo).
*/
public class Exercicio_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Diite um número: ");
        int numero = scanner.nextInt();
        int somaDivisores = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }
        if (somaDivisores == numero) {
            System.out.println(numero + " é um número perfeito");
        } else {
            System.out.println(numero + " não é um número perfeito");
        }
        scanner.close();
    }
}
