package java4exercicios;

public class ValorFinalVariavelXAula4 {

    public static void main(String[] args) {

        int A=3, B=2, C=8, D=7, X=0;


        if (!(A>3) & !(B<5)) {
            X = -10;
        } else if (A>=2 || C<=1) {
            X = (A+D)/2;
        } else if ((A==2)||(B<7)) {
            X = (A+2)*(B-2);
        } else {
            X = ((A+C)/B*(C+D));
        }
        System.out.println("O valor de X é: " + X);

    }
}
