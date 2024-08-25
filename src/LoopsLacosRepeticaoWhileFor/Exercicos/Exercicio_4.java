package LoopsLacosRepeticaoWhileFor.Exercicos;

// 04. Escreva um programa Java que imprima os números primos entre 1 e 50 usando um
//loop for.

public class Exercicio_4 {
    public static void main(String[] args) {
        for (int numero = 2; numero <= 50; numero++) {
            boolean ehPrimo = true;
            for (int j = 2; j < numero; j++) {
                if (numero % j == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                System.out.println(numero + " é primo.");
            }
        }
    }
}
