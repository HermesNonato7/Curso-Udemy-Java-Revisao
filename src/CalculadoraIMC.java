import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {

        Scanner leitorTeclado = new Scanner(System.in);

        // peso div (altura * altura)
        System.out.println("Digite o seu peso:");
        float peso = leitorTeclado.nextFloat();
        System.out.println("Agora digitea sua altura em cm:");
        float altura = leitorTeclado.nextFloat();

        float resultado = peso / (altura * altura);

        System.out.println("O IMC para o peso " + peso +
                " e altura " + altura + " é " + resultado);

        leitorTeclado.close();

    }
}
