import java.util.Scanner;

public class CalculadoraIdade {

    public static void main(String[] args) {
        // 1 -> pegar o ano atual
        // 2 -> pegar o anode nascimento
        // 3 -> subtrair o ano atual - ano de nascimento

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano atual:");
        int anoAtual = sc.nextInt();
        System.out.println("Digite o ano do seu nascimento:");
        int anoNascimento = sc.nextInt();

        int resultado = anoAtual - anoNascimento;

        System.out.println("A sua idade é " + resultado);

    }
}
