package LoopsLacosRepeticaoWhileFor;

import java.util.Scanner;

public class LoopComFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int valor = scanner.nextInt();

        for (int contador = 1; contador <= valor; contador++) {
            if (contador % 2 == 0) {
                System.out.println(contador);
            }
        }
        scanner.close();
    }
}
