package java7exercicios;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;

        System.out.println("A média é igual a " + m);

        int numero = 5;
        int valor = 5 + numero++;
        int valor2 = valor+numero;
        System.out.println(valor);
        System.out.println(valor2);


        int x =4;
        x += 4;
        System.out.println(x);

        float y = 8.3f;
        int ar = (int) Math.floor(y);
        System.out.println(ar);

        double ale = Math.random();
        double n = (int) (1 + ale * (10-1)  );
        System.out.println(n);

    }

}
