package Exercicios;

import java.util.Scanner;

public class Exercicio_4 {

    //4. Escreva um programa que determine se um número é positivo, negativo ou zero.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Este numero é zero");
        } else if (num >= 0) {
            System.out.println("Este numero é positivo");
        } else {
            System.out.println("Este numero é negativo");
        }
        sc.close();

    }
}
