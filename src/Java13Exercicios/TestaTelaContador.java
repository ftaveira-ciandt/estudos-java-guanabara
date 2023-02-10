package Java13Exercicios;

import java7exercicios.operadoresswing.OperadoresSwing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestaTelaContador extends JFrame {

    private JPanel mainPanel;

    private JSlider sliInicio;

    private JSlider sliFim;

    private JSlider sliPasso;

    private JButton btnCont;

    private JList lstCont;

    private JLabel lblInicio;

    private JLabel lblFim;

    private JLabel lblPasso;

    public TestaTelaContador() {
        sliInicio.addChangeListener(new ChangeListener() {
            @Override public void stateChanged(final ChangeEvent e) {
                int i = sliInicio.getValue();
                lblInicio.setText(Integer.toString(i));

            }
        });
        sliFim.addChangeListener(new ChangeListener() {
            @Override public void stateChanged(final ChangeEvent e) {
                int f = sliFim.getValue();
                lblFim.setText(Integer.toString(f));
            }
        });
        sliPasso.addChangeListener(new ChangeListener() {
            @Override public void stateChanged(final ChangeEvent e) {
                int p = sliPasso.getValue();
                lblPasso.setText(Integer.toString(p));
            }
        });
        btnCont.addActionListener(new ActionListener() {
            @Override public void actionPerformed(final ActionEvent e) {
                int i = sliInicio.getValue();
                int f = sliFim.getValue();
                int p = sliPasso.getValue();

                DefaultListModel lista = new DefaultListModel<>();

                for (int c = i; c <= f ; c += p) {
                    lista.addElement(c);
                }
                lstCont.setModel(lista);
            }
        });
    }

    public static void main(String[] args) {
        TestaTelaContador t = new TestaTelaContador();
        t.setContentPane(t.mainPanel);
        t.setTitle("Tela Contador");
        t.setSize(500, 500);
        t.setVisible(true);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
