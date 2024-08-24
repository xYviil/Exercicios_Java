// Mostrar na tela a média de altura das pessoas e a porcentagem de pessoas com menos de 16 anos.
package Exercicios;

import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N;

        System.out.println("Digite o número de pessoas que estão participando!");
        N = sc.nextInt();

        String[] nomes = new String[N];
        int[] idade = new int[N];
        float[] altura = new float[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Digite o nome da pessoa!");
            nomes[i] = sc.next();
            System.out.println("Digite a idade!");
            idade[i] = sc.nextInt();
            System.out.println("Digite a altura!");
            altura[i] = sc.nextFloat();
        }

        float alturaTodos = 0;
        for (int i = 0; i < N; i ++) {
            alturaTodos = alturaTodos + altura[i];
        }

        float mediaAltura = alturaTodos / N;

        System.out.printf("%.2f%n", mediaAltura);

        sc.close();
    }
}
