package Exercicios;

import java.util.Scanner;

public class Exercicio_7 {

    // 07. Escreva um programa para ler o ano de nascimento de uma pessoa e escrever
    // uma mensagem que diga se ela poderá ou não votar este ano.
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = entrada.nextInt();

        System.out.println("Digite o ano atual: ");
        int anoAtual = entrada.nextInt();

        // Verificando se a pessoa pode votar
        if (anoAtual - anoNascimento >= 18) {
            System.out.println("Você pod votar este ano.");
        } else {
            System.out.println("Você não pode votar este ano.");
        }
        entrada.close();

    }

}
