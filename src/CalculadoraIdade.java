public class CalculadoraIdade {

    public static void main(String[] args) {
        // 1 -> pegar o ano atual
        // 2 -> pegar o anode nascimento
        // 3 -> subtrair o ano atual - ano de nascimento

        int anoAtual = 2024;
        int anoNascimento = 1986;

        int resultado = anoAtual - anoNascimento;

        System.out.println("A idade é " + resultado);

    }
}
