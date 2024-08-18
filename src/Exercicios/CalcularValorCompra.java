package Exercicios;

import java.util.Scanner;

public class CalcularValorCompra {
    // 08. Dado que existe um mercado onde as maçãs custam R$ 0,30 cada se forem compradas
//menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze. Escreva um
//programa que leia o número de maçãs compradas, calcule e escreva o valor total da
//compra.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de maçãs compradas: ");
        int quantidade = scanner.nextInt();

        double precoUnitario;
        if (quantidade < 12) {
            precoUnitario = 0.30;
        } else {
            precoUnitario = 0.25;
        }

        double valorTotal = quantidade * precoUnitario;
        System.out.println("O valor total da compra é: R$ " + valorTotal);

        scanner.close();

    }
}
