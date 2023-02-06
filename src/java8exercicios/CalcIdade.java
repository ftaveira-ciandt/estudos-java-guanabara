package java8exercicios;

import java.util.Scanner;

public class CalcIdade {

    public static void main(String[] args) {

        Scanner ano = new Scanner(System.in);
        System.out.print("Digite seu ano de nascimento: ");
        Integer anoNascimento = ano.nextInt();
        int idade = 2023 - anoNascimento;
        System.out.println("Você nasceu em: " + anoNascimento);

        String Situacao = (idade < 18 ? "Menor de idade":"Maior de idade");
        System.out.println(Situacao);

        System.out.println();
        System.out.println();
        System.out.println();

        String voto = (idade >= 16 && idade < 18) || (idade > 70) ? "Voce nao é obrigado a votar":"Voce é obrigado a votar";
        System.out.println(voto);







    }



}
