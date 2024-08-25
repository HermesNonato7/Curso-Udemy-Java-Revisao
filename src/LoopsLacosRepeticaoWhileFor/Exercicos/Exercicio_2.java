package LoopsLacosRepeticaoWhileFor.Exercicos;

// 02. Escreva um programa Java que calcule a soma dos números de 1 a 100 usando um
//loop while.

public class Exercicio_2 {
    public static void main(String[] args) {
        int i = 1;
        int soma = 0;
        while (i <= 100) {
            soma += i;
            i++;
        }
        System.out.println("Soma: " + soma);

    }
}
