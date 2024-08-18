package Exercicios;

import java.util.Scanner;

public class CalcularValorCompra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de maçãs compradas: ");
        int quantidade = entrada.nextInt();

        double precoUnitario;
        if(quantidade < 12){
            precoUnitario = 0.30;
        }else{
            precoUnitario = 0.25;
        }

        double valorCompra = precoUnitario * quantidade;
        System.out.println("O valor total da compra é: R$ " + valorCompra);

        entrada.close();
    }

}
