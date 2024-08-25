package LoopsLacosRepeticaoWhileFor.Exercicos;

import java.util.Scanner;

// 06. Escreva um programa Java que calcule a soma dos dígitos de um número inteiro.
public class Exercicio_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int soma = 0;

        while (numero != 0) {
            soma += numero % 10;
            numero /= 10;
        }
        System.out.println(" A soma dos dígitos é: " + soma);
    }
}
