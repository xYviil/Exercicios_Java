package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double largura, comprimento, metroQuadrado;


        System.out.println("Digite o valor da largura:");
        largura = Float.parseFloat(sc.nextLine());

        System.out.println("Digite o valor do comprimento:");
        comprimento = Float.parseFloat(sc.nextLine());

        double area = largura * comprimento;

        System.out.println("Digite o valor do metro quadrado:");
        metroQuadrado = Float.parseFloat(sc.nextLine());

        double preco = area * metroQuadrado;

        System.out.printf("A área do terreno é de %.2f metros quadrados!%n", area);
        System.out.printf("E o valor total do terreno é de: R$%.2f%n", preco);

        sc.close();

    }

}
