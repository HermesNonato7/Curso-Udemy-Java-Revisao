public class CalculadoraIMC {

    public static void main(String[] args) {
        // peso div (altura * altura)

        float peso = 1.80f;
        float altura = 1.75f;

        float resultado = peso / (altura * altura);

        System.out.println("O IMC para o peso " + peso +
                " e altura " + altura + " é " + resultado);

    }
}
