package exercicio01;

public class Calculadora {

    public static void soma(double valor1, double valor2) {

        double resultado = valor1 + valor2;

        System.out.println("A soma entre " + valor1 + " e " + valor2 + " é igual: " + resultado);
    }

    public static void subtracao(double valor1, double valor2) {

        double resultado = valor1 - valor2;

        System.out.println("A subtracao entre " + valor1 + " e " + valor2 + " é igual: " + resultado);
    }

    public static void multiplicacao(double valor1, double valor2) {

        double resultado = valor1 * valor2;

        System.out.println("A multiplicação entre " + valor1 + " e " + valor2 + " é igual: " + resultado);
    }

    public static void  divisao(double valor1, double valor2) {

        double resultado = valor1 / valor2;

        System.out.println("A divisão entre " + valor1 + " e " + valor2 + " é igual: " + resultado);
    }

}
