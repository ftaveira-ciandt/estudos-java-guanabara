package java8exercicios;

public class ComparadorString {

    public static void main(String[] args) {
        String nome1 = "Francisco";
        String nome2 = "Francisco";
        String nome3 = new String("Francisco");
        String res;
        res = (nome1==nome2)?"igual":"diferente";
        System.out.println(res);

        //equals verifica se o conteudo de um objeto é igual o conteudo de outro.
        String res2;
        res2 = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res2);
    }

}
