package java7exercicios.operadoresswing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperadoresSwing extends JFrame {

    private JTextField txtNum;

    private JTextField txtDen;

    private JButton btnDividir;

    private JPanel mainPanel;

    private JLabel lblDiv;

    private JLabel lblResto;

    public OperadoresSwing() {
        btnDividir.addActionListener(new ActionListener() {
            @Override public void actionPerformed(final ActionEvent e) {

                double num = Double.parseDouble(txtNum.getText());
                double den = Double.parseDouble(txtDen.getText());
                double div = (num / den);
                double res = (num % den);
                lblDiv.setText(String.valueOf(div));
                lblResto.setText(String.valueOf(res));

            }
        });

    }

    public static void main(String[] args) {
        OperadoresSwing os = new OperadoresSwing();
        os.setContentPane(os.mainPanel);
        os.setTitle("Operadores Swing");
        os.setSize(200,300);
        os.setVisible(true);
        os.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
