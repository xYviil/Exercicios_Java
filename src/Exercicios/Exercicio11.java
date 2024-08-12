package Exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dia;
        String diaDaSemana;

        System.out.println("Digite um numero de 1 até 7!");
        dia = sc.nextInt();

        switch (dia){
            case 1:
                diaDaSemana = "Domingo";
                break;
            case 2:
                diaDaSemana = "Segunda-feira";
                break;
            case 3:
                diaDaSemana = "Terça-feira";
                break;
            case 4:
                diaDaSemana = "Quarta-feira";
                break;
            case 5:
                diaDaSemana = "Quinta-feira";
                break;
            case 6:
                diaDaSemana = "Sexta-feira";
                break;
            case 7:
                diaDaSemana = "Sábado";
                break;
            default:
                diaDaSemana = "valor inválido";
                break;
        }
            System.out.println("Dia da semana: " + diaDaSemana);
    }
}
