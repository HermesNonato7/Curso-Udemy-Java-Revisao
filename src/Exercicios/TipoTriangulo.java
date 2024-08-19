package Exercicios;

import java.util.Scanner;

public class TipoTriangulo {

    //    09. Escreva um programa que leia as medidas dos lados de um triângulo e escreva se
//ele é Equilátero, Isósceles ou Escaleno. Sendo que:
//Triângulo Equilátero: possui os 3 lados iguais.
//Triângulo Isósceles: possui 2 ladosiguais.
//Triângulo Escaleno: possui 3 ladosdiferentes.
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

//    Lendo as medidas dos lados do triângulo
        System.out.println("Digite as medidas dos lados do triâgulo: ");
        System.out.println("Lado 1: ");
        double lado1 = entrada.nextDouble();
        System.out.println("Lado 2: ");
        double lado2 = entrada.nextDouble();
        System.out.println("Lado 3: ");
        double lado3 = entrada.nextDouble();

//   Verificando o tipo de triângulo
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("O triângulo é Equilátero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("O triângulo é Isósceles.");
        } else {
            System.out.println("O triânglo é Escaleno.");
        }
        entrada.close();

    }

}
