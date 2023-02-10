package java8exercicios;

public class OperadoresLogicos {

    public static void main(String[] args) {

        int x=4, y=7, z=12;
        boolean r;
        r= (x<y && y<z)? true:false;
        System.out.println("1: " + r);

        r= (x<y && y==z)? true:false;
        System.out.println("2: " + r);

        r= (x<y || y==z)? true:false;
        System.out.println("3: " + r);

        r= (x<y ^ y==z)? true:false;
        System.out.println("4: " + r);

        r= (x<y ^ y<z)? true:false;
        System.out.println("5: " + r);

    }

}
