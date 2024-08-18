package Exercicios;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args){

        int numeroDigitado;
        int multiplicador;
        int valor;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero");
        numeroDigitado = sc.nextInt();

        if (numeroDigitado > 1000) {
            System.out.println("O numero digitado nao pode ser superior à 1000!");
            return;
        }

        for (multiplicador = 1; multiplicador <= 10; multiplicador++) {
            valor = numeroDigitado * multiplicador;
            System.out.println(multiplicador + "x" + numeroDigitado + "=" + valor);
        }

        sc.close();

    }
}
