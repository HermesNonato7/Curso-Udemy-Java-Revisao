package Exercicios;

import java.util.Scanner;

public class CelsiusParaFahrenheit {

    //5. Escreva um programa Java que converta graus Celsius para Fahrenheit.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero d grau celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("O resultado da conversão para Fahrenheit é : " + fahrenheit + "ºF");

        sc.close();
    }
}
