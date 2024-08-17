import java.util.Scanner;

public class CalculaMedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a nota do primeiro trimestre: ");
        double nota1 = leitor.nextDouble();
        System.out.println("Digite a nota do segundo trimestre: ");
        double nota2 = leitor.nextDouble();
        System.out.println("Digite a nota do terceiro trimestre: ");
        double nota3 = leitor.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A media final é: " + media);

        leitor.close();
    }
}
