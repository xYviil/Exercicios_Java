package Exercicios;

import java.util.Scanner;

public class Exercicio10 {
public static void main (String[] args)  {

    Scanner sc = new Scanner(System.in);

    int a, b, c;

    System.out.println("Digite o primeiro numero!");
    a = sc.nextInt();
    System.out.println("Digite o segundo numero!");
    b = sc.nextInt();
    System.out.println("Digite o terceiro numero!");
    c = sc.nextInt();

    if (a < b && a < c){
        System.out.println("Menor = " + a);
    } else if (b < c) {
            System.out.println("Menor = " + b);
        } else {
        System.out.println("Menor = " + c);
    }

    sc.close();
}
}
