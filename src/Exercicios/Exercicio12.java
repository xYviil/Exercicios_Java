package Exercicios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        int soma = 0;

        System.out.println("Digite o valor de X");
        x = sc.nextInt();

        while (x != 0) {
            soma = soma + x;
            x = sc.nextInt();
        }

        System.out.println(soma);

        sc.close();

    }
}
