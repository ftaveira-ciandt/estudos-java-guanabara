package java9exercicios;

import java.util.Scanner;

public class EquacaoSegundoGrau {

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        float a = n.nextFloat();

        //Scanner b = new Scanner(System.in);
        System.out.print("Digite o segundo numero: ");
        float b = n.nextFloat();
        //Scanner c = new Scanner(System.in);

        System.out.print("Digite o terceiro numero: ");
        float c = n.nextFloat();

        double delta = (Math.pow(b, 2) - 4 * a * c);
        System.out.println();
        System.out.println("Delta dessa operacao é: " + delta);

        if (delta < 0) {
            System.out.println("Nao existem raizes");
        } else {
            System.out.println("Existem raizes reais");
        }
    }

}