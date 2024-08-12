package Exercicios;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        int hora;

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas horas?");
        hora = sc.nextInt();

        if (hora <= 12) {
                System.out.println("Bom dia! Ainda são " + hora + " horas!");
        } else {
            if (hora <= 16) {
                System.out.println("Boa tarde! Já são " + hora + " horas!");
            } else {
                if (hora <= 23) {
                    System.out.println("Boa noite! Já são " + hora + " horas!");
                } else {
                    System.out.println("Horário incorreto!");
                }
            }
        }
        sc.close();
    }
}
