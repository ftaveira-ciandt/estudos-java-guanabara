package java9exercicios;

import java.util.Scanner;

public class ProgramaMedia {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a sua primeira nota: ");
        float n1 = teclado.nextFloat();

        System.out.print("Digite a sua segunda nota: ");
        float n2 = teclado.nextFloat();

        float media = ((n1 + n2) / 2);
        System.out.println("Sua media foi de: " + media);

        if (media > 9) {
            System.out.println("Parabens, voce foi aprovado com uma nota alta");
        }
    }
}
