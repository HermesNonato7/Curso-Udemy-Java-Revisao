package LoopsLacosRepeticaoWhileFor;

import java.util.Scanner;

public class ContagemDeLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");

        String frase = scanner.nextLine();
        int quantidadeLetras = 0;

        //for (int i = 0; i < frase.length(); i++) {}
        for (int indice = 0; indice < frase.length(); indice++) {
            char letra = frase.charAt(indice);
            boolean isLetra = Character.isLetter(letra);

            if (isLetra) {
                quantidadeLetras++;
            }
        }

        System.out.println("A quantidade de letras é: " + quantidadeLetras);

        scanner.close();
    }

}
