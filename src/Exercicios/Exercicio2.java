package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double base, altura;
        System.out.println("Digite o valor da base:");
        base = sc.nextDouble();
        System.out.println("Digite o valor da altura:");
        altura = sc.nextDouble();

        double area = base * altura;
        System.out.println("O valor da área é de: " + area);

        double perimetro = (2 * base) + (2 * altura);
        System.out.println("O valor do perímetro é de: " + perimetro);

        double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        System.out.printf("O valor da diagonal é de: %.4f%n", diagonal);

        sc.close();


    }
}
