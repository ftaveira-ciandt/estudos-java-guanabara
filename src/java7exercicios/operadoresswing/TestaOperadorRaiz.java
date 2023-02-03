package java7exercicios.operadoresswing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestaOperadorRaiz extends JFrame {

    private JPanel mainPanel;

    private JTextField txtDen;

    private JTextField txtNum;

    private JButton btnRaiz;

    private JLabel lblRes;

    private JLabel lblDiv;

    public TestaOperadorRaiz() {
        btnRaiz.addActionListener(new ActionListener() {
            @Override public void actionPerformed(final ActionEvent e) {
                float n = Float.parseFloat(txtNum.getText());
                float d = Float.parseFloat(txtDen.getText());
                float div = n/d;
                float res = (float) Math.sqrt(n);
                lblDiv.setText(Float.toString(div));
                lblRes.setText(Float.toString(res));

            }
        });
    }

    public static void main(String[] args) {
        TestaOperadorRaiz r = new TestaOperadorRaiz();
        r.setContentPane(r.mainPanel);
        r.setVisible(true);
        r.setName("Testa Operador Raiz ");
        r.setSize(500,800);
        r.setTitle("Testa Operador");
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

}
