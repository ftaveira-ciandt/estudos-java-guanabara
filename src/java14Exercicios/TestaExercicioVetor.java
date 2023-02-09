package java14Exercicios;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TestaExercicioVetor extends JFrame {

    private JPanel mainPanel;

    private JSpinner txtNum;

    private JButton btnAdd;

    private JButton btnRem;

    private JButton btnOrd;

    private JLabel lblSelecionado;

    private JScrollPane scrollPanel;

    private JList lstVetor;







    int vetor[] = new int[5];
    DefaultListModel lista = new DefaultListModel();
    int selecionado = 0;

    public TestaExercicioVetor() {

        for (int c = 0; c< vetor.length; c++) {
            lista.addElement(vetor[c]);
        }



        btnAdd.addActionListener(new ActionListener() {
            @Override public void actionPerformed(final ActionEvent e) {

                vetor[selecionado] = Integer.parseInt(txtNum.getValue().toString());

                lista.removeAllElements();
                for (int c = 0; c< vetor.length; c++) {
                    lista.addElement(vetor[c]);
                }

            }
        });
        lstVetor.addMouseListener(new MouseAdapter() {
            @Override public void mouseClicked(final MouseEvent e) {
                super.mouseClicked(e);
                selecionado = lstVetor.getSelectedIndex();
                lblSelecionado.setText("[" + selecionado + "]");

            }
        });
    }

    public static void main(String[] args) {
        TestaExercicioVetor t = new TestaExercicioVetor();
        t.setContentPane(t.mainPanel);
        t.setTitle("Tela Vetor");
        t.setSize(500, 500);
        t.setVisible(true);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

