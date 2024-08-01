package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, horas, minutos, segundos, resto;

        System.out.println("Informe o tempo desejado para converter em segundos.");
        n = sc.nextInt();

        horas = n / 3600;
        resto = n % 3600;

        minutos = resto / 60;
        segundos = resto % 60;

        System.out.printf("%d:%d:%d",horas, minutos,segundos);

        sc.close();


    }
}
