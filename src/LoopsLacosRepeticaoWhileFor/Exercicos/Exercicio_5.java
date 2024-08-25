package LoopsLacosRepeticaoWhileFor.Exercicos;

/*
05. Escreva um programa Java que imprima os números de 1 a 100, substituindo os
múltiplos de 3 por "Fizz" e os múltiplos de 5 por "Buzz". Para os números que são múltiplos
de ambos, imprima "FizzBuzz".
*/
public class Exercicio_5 {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 100; numero++) {
            if (numero % 3 == 0 && numero % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (numero % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(numero);
            }
        }

    }
}
