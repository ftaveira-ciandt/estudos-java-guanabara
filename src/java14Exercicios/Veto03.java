package java14Exercicios;

import java.util.Arrays;

public class Veto03 {

    public static void main(String[] args) {
        double v[] = {3.5, 2.75, 4.5, 9, -5.7};
        for (double valor: v) {
            Arrays.sort(v);
            System.out.println("Valor na posição é " + valor);
        }
    }

}
