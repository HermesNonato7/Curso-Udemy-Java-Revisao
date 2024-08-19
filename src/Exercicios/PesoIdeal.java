package Exercicios;

//10. Tendo como entrada a altura e o sexo (codificado da seguinte forma: digitando 1 para
//feminino e digitando 2 para masculino) de uma pessoa, construa um programa que calcule
//e imprima seu peso ideal, utilizando as seguintes Fórmulas:
//- para homens: (72.7 * Altura) – 58
//- para mulheres: (62.1 * Altura) – 44.7

import java.util.Scanner;

public class PesoIdeal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        Solicitando a entrada da altura e do seco
        System.out.println("Digite a altura (em metros): ");
        double altura = entrada.nextDouble();
        System.out.println("Digite o sexo (1 para feminino, 2 para masculino): ");
        int sexo = entrada.nextInt();

//        Calculando o peso ideal com base no sxo
        double pesoIdeal;
        if (sexo == 1) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else if (sexo == 2) {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            System.out.println("Sexo inváido.");
            return;
        }

//        Exibindo o peso ideal
        System.out.println("O peso ideal é: " + pesoIdeal + " kg");
        entrada.close();
    }
}
