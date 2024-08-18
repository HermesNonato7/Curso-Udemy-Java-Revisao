package Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_6 {

    public static void main(String[] args) {

       // 6. Escreva um programa que calcule o perímetro e a área de um retângulo.

        double base, altura, resultado;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro valor (base): ");
        base = entrada.nextDouble();
        System.out.println("Digite o segundo valor (altura): ");
        altura = entrada.nextDouble();

        resultado = base*altura;

        System.out.println("O perimetro do retangulo é: " + new DecimalFormat(".##").format(resultado));

        entrada.close();

    }
}
