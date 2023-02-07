package java10exercicios;

import java.util.Scanner;

public class ProgramaPernas {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        System.out.print("Digite a quantidade de pernas: ");
        int quantidadepernas = t.nextInt();

        String tipo;
        switch (quantidadepernas) {
            case 1:
                tipo = "Monoperna";
                break;
            case 2:
                tipo = "Bipede";
                break;
            case 3:
                tipo = "Tripede";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            case 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";

        }
        System.out.println(tipo);
    }

}
