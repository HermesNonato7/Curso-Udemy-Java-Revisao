package Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_6 {

    public static void main(String[] args) {

       // 6. Escreva um programa que calcule o perímetro e a área de um retângulo.

        double altura, largura;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a largura do retângulo: ");
        largura = entrada.nextDouble();
        System.out.println("Digite a altura do retângulo: ");
        altura = entrada.nextDouble();

        double perimetro = 2 * (largura + altura);
        double area = largura * altura;

        System.out.println("O perímetro dfo retângulo é: " + new DecimalFormat(".##").format(perimetro));
        System.out.println("A área do retângulo é " + new DecimalFormat(".##").format(area));

        entrada.close();

    }
}
