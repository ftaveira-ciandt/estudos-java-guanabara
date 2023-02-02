package java6exercicios;

import java.util.Locale;

public class TiposPrimitivos {

    public static void main(String[] args) {

        float nota = 8.5F;
        String nome = "Francisco";

        System.out.println("A sua nota é: " + nota);
        System.out.printf("A nota de %s é %.4f \n", nome, nota);
        System.out.format("A nota de %s é %.4f \n", nome, nota);

    }

}
