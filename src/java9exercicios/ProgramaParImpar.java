package java9exercicios;

import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class ProgramaParImpar {

    public static void main(String[] args) {

        Scanner pareimpar = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int valordigitado = pareimpar.nextInt();

        String v1 = "O numero" + valordigitado + " é par. ";
        String v2 = "O numero" + valordigitado + " é impar. ";
        if ((valordigitado % 2 == 0)) {

            System.out.println("O numero" + valordigitado + " é par. ");

        } else {
            System.out.println("O numero" + valordigitado + " é impar. ");

        }

    }

}
