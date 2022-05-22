package exercicio01;

public class Main {

    public static void main(String[] args) {

        System.out.println("Exercício Calculadora");
        Calculadora.soma(5, 8);
        Calculadora.subtracao(9.5, 4.5);
        Calculadora.multiplicacao(9, 6);
        Calculadora.divisao(10, 2.5);

        System.out.println("Exercício Mensagem");
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(16);
        Mensagem.obterMensagem(21);

        System.out.println("Exercício Empréstimo");
        Emprestimo.calcular(1500, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1500, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1500, 5);

    }
}
