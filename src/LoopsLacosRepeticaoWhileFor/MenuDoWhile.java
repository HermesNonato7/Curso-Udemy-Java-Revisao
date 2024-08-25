package LoopsLacosRepeticaoWhileFor;

import java.util.Scanner;

public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Digite uma opção do menu: ");
            System.out.println("1. Sanduaiche");
            System.out.println("2. Pizza");
            System.out.println("3. Sorvete");
            System.out.println("0. Sair");

            opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo do sistema...");
            } else if (opcao == 1) {
                System.out.println("Você escolheu um sanduiche.");
            } else if (opcao == 2) {
                System.out.println("Você escolheu uma pizza.");
            } else {
                System.out.println("VocÊ escolheu um sorvete.");
            }
            //break;
        } while (opcao != 0);

        scanner.close();
    }
}
