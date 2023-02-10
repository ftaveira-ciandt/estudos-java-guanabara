package java15Exercicios;

public class TesteFuncao01 {

    static int soma2(int a, int b){
        int s = a + b;
        return s;
    }

    static void soma(int a, int b) {
        int s = a + b;
        System.out.println("A soma é " + s);
    }

    public static void main(String[] args) {
        System.out.println("Comecou o programa");

        soma(5, 2);

        int s2 = soma2(10, 5 );
        System.out.println("Soma 2 vale " + s2);
    }
}
