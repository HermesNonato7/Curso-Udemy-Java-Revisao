package LoopsLacosRepeticaoWhileFor;

import java.util.Scanner;

public class LoopComWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int contador = scanner.nextInt();
        int valor = 1;

        while(valor <= contador){

            if(valor % 2 == 0){
                System.out.println(valor);
            }
            valor++;
        }
        scanner.close();
    }
}
