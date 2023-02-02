package java6exercicios;

import java.util.Scanner;

public class TiposPrimitvos2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine(); //entra com o nome no teminal

        System.out.print("Digite sua nota: ");
        float nota = teclado.nextFloat();





        System.out.printf("A nota de %s é %.4f \n", nome, nota);
        System.out.format("A nota de %s é %.4f \n", nome, nota);

    }

}
