package LoopsLacosRepeticaoWhileFor;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class LoopComWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        int contador = entrada.nextInt();
        int valor = 1;

        while (valor <= contador) {
            System.out.println(valor);
            valor = valor + 1;
        }

        System.out.println("");
        entrada.close();
    }
}
