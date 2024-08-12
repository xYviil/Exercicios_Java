package Exercicios;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args){

        double valorA, valorB, valorC;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        valorA = sc.nextDouble();
        if (valorA == 0) {
            System.out.println("Impossível calcular!");
            return;
        }
        System.out.println("Digite o valor de B");
        valorB = sc.nextDouble();
        System.out.println("Digite o valor de C");
        valorC = sc.nextDouble();

        double delta = Math.pow(valorB, 2) - 4 * valorA * valorC;
        if (delta < 0) {
            System.out.println("Impossível calcular, a raiz de delta é menor que 0!");
            return;
        }

        double x1 = (-valorB + Math.sqrt(delta)) / (2 * valorA);
        double x2 = (-valorB - Math.sqrt(delta)) / (2 * valorA);

        System.out.printf("R1 = %.5f%n", x1);
        System.out.printf("R2 = %.5f%n", x2);

        sc.close();

    }
}
