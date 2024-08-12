package Exercicios;
import java.util.Scanner;

public class Exercicio7 {

    public static void main (String[] args) {

        double nota1, nota2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da primeira nota!");
        nota1 = sc.nextDouble();
        if (nota1 > 10){
            System.out.println("A nota digitada não pode ser superior a 10!");
            return;
        }

        System.out.println("Digite o valor da segunda nota!");
        nota2 = sc.nextDouble();
        if (nota2 > 10){
            System.out.println("A nota digitada não pode ser superior a 10!");
            return;
        }

        double media = (nota1+nota2) / 2;

        if (media < 6) {
            System.out.printf("Sua média foi de %.2f e você foi REPROVADO!", media);
        } else {
            System.out.printf("Sua média foi de %.2f e você foi APROVADO!", media);
        }

        sc.close();
    }
}
