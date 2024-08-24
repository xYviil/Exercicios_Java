package Exercicios;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N;

        System.out.println("Digite a quantidade de números");
        N = sc.nextInt();

        int[] vet = new int[N];

        System.out.println("Digite o valor dos números!");

        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if (vet[i] < 0) {
                System.out.println(vet[i]);
            }
        }


        sc.close();

    }
}
