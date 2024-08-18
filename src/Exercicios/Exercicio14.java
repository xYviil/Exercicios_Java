package Exercicios;

import java.util.Scanner;

public class Exercicio14 {

public static void main (String[] args){

    Scanner sc = new Scanner(System.in);

    int x, y;

    System.out.println("Digite o primeiro valor:");
    x = sc.nextInt();
    System.out.println("Digite o segundo valor:");
    y = sc.nextInt();

    while (x != y) {
        if (x < y) {
            System.out.println("Crescente");
        } else {
            System.out.println("Decrescente");
        }
        return;
    }
    if (x == y) {
        System.out.println("Igual");
    }


    sc.close();
}


}
