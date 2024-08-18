package Exercicios;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N;
        System.out.println("Digite o numero de vezes que deseja executar:");
        N = sc.nextInt();
        int soma = 0;


        for (int i = 0; i < N; i++ ) {
            int x = sc.nextInt();
            soma = soma + x;
        }

        System.out.println(soma);

        sc.close();

    }
}
