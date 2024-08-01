package Outros;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        int y = 32;
        double x = 15.332421;

        Locale.setDefault(Locale.US);
        System.out.println(y);
        System.out.printf("%.3f%n", x);
        System.out.println("Resultado= " + x + " Metros");
        System.out.printf("Resultado= %,2f metros%n ", x);


        String nome = "Yvil";
        int idade = 23;
        double renda = 2500.00;

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais mensais%n", nome, idade, renda);
    }
}
