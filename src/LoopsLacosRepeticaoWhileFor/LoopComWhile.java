package LoopsLacosRepeticaoWhileFor;

import java.util.Scanner;

public class LoopComWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        int contador = entrada.nextInt();
        int valor = 1;

        while (valor <= contador) {

            // Se o MOD for= 0 vai retornar os números pares, se for 1 retorna os números impares
            if(valor % 2 == 1) {
                System.out.println(valor);
            }
            valor++;
        }

        entrada.close();

    }
}
