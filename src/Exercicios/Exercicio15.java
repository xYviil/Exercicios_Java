package Exercicios;

import java.util.Scanner;

public class Exercicio15 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade;
        int soma = 0;
        int cont = 0;

        System.out.println("Digite a idade do indivíduo!");
        idade = sc.nextInt();

        while (idade >= 0) {
            soma = soma + idade;
            cont = cont + 1;
            idade = sc.nextInt();
        }

        if (cont > 0) {
            double media = (double) soma / cont;
            System.out.printf("%.2f%n", media);
        } else {
            System.out.println("Impossível calcular!");
        }

        sc.close();
    }
}
