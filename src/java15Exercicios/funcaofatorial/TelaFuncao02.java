package java15Exercicios.funcaofatorial;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaFuncao02 extends JFrame {

    private JSpinner txtNum;

    private JButton btnFatorial;

    private JLabel lblFormula;

    private JLabel lblResultado;

    private JPanel mainPanel;

    public TelaFuncao02() {
        btnFatorial.addActionListener(new ActionListener() {
            @Override public void actionPerformed(final ActionEvent e) {
                int n = Integer.parseInt(txtNum.getValue().toString());
                Fatorial f = new Fatorial();
                f.setValor(n);
                lblFormula.setText(f.getFormula());
                lblResultado.setText(Integer.toString(f.getFatorial()));

            }

            public static void main(String[] args) {
                TelaFuncao02 tf = new TelaFuncao02();
                tf.setContentPane(tf.mainPanel);
                tf.setTitle("Tela Fatorial");
                tf.setSize(400, 400);
                tf.setVisible(true);
                tf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });

    }

    public static class Funcao01 {

        public static void main(String[] args) {

            Fatorial f = new Fatorial();
            f.setValor(5);
            System.out.print(f.getFormula());
            System.out.println(f.getFatorial());
        }



    }

}
