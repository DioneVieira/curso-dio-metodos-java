package Exercicio03;

public class Main {

    public static void main(String[] args) {

        // Retornos
        System.out.println("Exercício retornos");

        double areaQuadrado = Quadrilatero.area(4);
        System.out.println("Área do quadrado:" + areaQuadrado + "m²");

        double areaRetangulo = Quadrilatero.area(15,15);
        System.out.println("Área do retângulo:" + areaRetangulo + "m²");

        double areaTrapezio = Quadrilatero.area(8,6,9);
        System.out.println("Área do trapézio:" + areaTrapezio + "m²");

    }
}
