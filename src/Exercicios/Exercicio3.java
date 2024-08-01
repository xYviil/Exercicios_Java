package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

    public static void  main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome1, nome2;
        int idade1, idade2;

        System.out.println("Digite o nome da primeira pessoa:");
        nome1 = sc.nextLine();
        System.out.println("Digite a idade da primeira pessoa:");
        idade1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o nome da segunda pessoa:");
        nome2 = sc.nextLine();
        System.out.println("Digite a idade da segunda pessoa:");
        idade2 = sc.nextInt();

        double media = (double) (idade1 + idade2) / 2;
        System.out.printf("O nome das pessoas são: %s e %s, a média de idade deles é de %.1f anos. %n", nome1, nome2, media);

        sc.close();


    }
}
