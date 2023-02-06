package java7exercicios.operadoresswing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class TestaSuperCalculadora extends JFrame {

    private JPanel mainPanel;

    private JSpinner txtNum;

    private JLabel lblRestoDivisao2;

    private JLabel lblElevadoCubo;

    private JLabel lblRaizQuadrada;

    private JLabel lblRaizCubica;

    private JLabel lblValorAbsoluto;

    private JButton calcularButton;

    public TestaSuperCalculadora() {
        calcularButton.addActionListener(new ActionListener() {
            @Override public void actionPerformed(final ActionEvent e) {

                int num = Integer.parseInt(txtNum.getValue().toString());

                // resto da divisao por 2
                int r = num % 2;
                lblRestoDivisao2.setText(Integer.toString(r));

                // elevado ao cubo
                double el3 = Math.pow(num, 3);
                lblElevadoCubo.setText(Double.toString(el3));

                // raiz quadrada
                Double raizq = Math.sqrt(num);
                lblRaizQuadrada.setText(String.format("%.2f", raizq));

                // raiz cubica
                double raizc = Math.cbrt(num);
                lblRaizCubica.setText(String.format("%.2f", raizc));

                // Valor absolouto
                int abs = Math.abs(num);
                lblValorAbsoluto.setText(Integer.toString(abs));






            }
        });

    }  public static void main(String[] args) {
        TestaSuperCalculadora T = new TestaSuperCalculadora();
        T.setContentPane(T.mainPanel);
        T.setTitle("Super Calculador");
        T.setSize(300, 400);
        T.setVisible(true);
        T.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
