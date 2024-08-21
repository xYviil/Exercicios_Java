package Exercicios;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.println("Digite o primeiro valor!");
        x = sc.nextInt();
        System.out.println("Digite o segundo valor!");
        y = sc.nextInt();

        int min, max;

        if (x < y) {
            min = x;
            max = y;
        } else {
            min = y;
            max = x;
        }

        int soma = 0;
        for (int i = min + 1 ; i < max ; i++) {
            if (i % 2 != 0) {
                soma = soma + i;
            }

        }

        System.out.println(soma);
        sc.close();

    }
}
