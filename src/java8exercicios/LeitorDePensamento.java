package java8exercicios;

import java.util.Scanner;

public class LeitorDePensamento {

    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);
        System.out.println("Tente adivinhar o numero que estou pensando, digite um valor entre 1 e 5: ");
        int valordigitado = valor.nextInt();

        double n = 1 + Math.random() * (5 - 1);
        int nvalor = (int) n;


        String v1 = "Voce acertou o meu pensamento, pensei: " + nvalor;
        String v2 = "Nào foi dessa vez, tente novamento.Eu estava pensando em: " + nvalor;

        String res = (nvalor == valordigitado) ? v1:v2;

//        if (nvalor == valordigitado) {
//            System.out.println("Voce acertou o meu pensamento, pensei: " + nvalor);
//        } else {
//            System.out.println("Nào foi dessa vez, tente novamento.Eu estava pensando em: " + nvalor);
//
//        }
    }

}
