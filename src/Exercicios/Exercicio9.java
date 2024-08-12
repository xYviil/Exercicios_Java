package Exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor = 100; // telefone tempo
        int acumulado, diferenca, outro;
        int padrao = 50; // valor taxa padrao

        System.out.println("Digite quantos minutos de telefone você usou! ");
        acumulado = sc.nextInt();
        if (acumulado > valor){
            diferenca = (acumulado - valor) * 2;
            outro = diferenca + padrao;
            System.out.println("O valor total foi de R$: " + outro + ",00");
        } else {
            System.out.println("R$" + padrao + ",00");
        }
    }
}
