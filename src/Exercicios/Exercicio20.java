package Exercicios;
import java.util.Scanner;

public class Exercicio20 {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double temperatura;
    double fahrenheit;
    char resposta;

    do {

        System.out.println("Digite a temperatura em Celsius!");
        temperatura = sc.nextDouble();
        fahrenheit = 9.0 * temperatura / 5.0 + 32.0;

        System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);

        System.out.println("Deseja repetir (s/n)?");
        resposta = sc.next().charAt(0);

    } while (resposta != 'n');

    sc.close();

    }
}
