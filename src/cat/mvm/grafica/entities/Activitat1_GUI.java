package cat.mvm.grafica.entities;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Activitat1_GUI extends JFrame {
    private JLabel jlbFName;
    private JLabel jlbLName;
    private JLabel jlbPosition;
    private JTextField jtfFName;
    private JTextField jtfLName;
    private JTextField jtfPosition;
    private JButton jbtOK;
    private JTextArea jtfShowText;
    private JButton jbtClear;

    public Activitat1_GUI(){
        this.setSize(500, 500); //Mida de la ventana
        this.setResizable(false); //Quitar la opcion de modificar el size de la ventana
        this.setTitle("Name and position"); //Título de la ventana
        this.setVisible(true); //Visibilidad on
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar el programa al cerrar la app
        initComponents();
    }

    private void initComponents(){
        jlbFName = new JLabel();
        jlbLName = new JLabel();
        jlbPosition = new JLabel();
        jtfFName = new JTextField();
        jtfLName = new JTextField();
        jtfPosition = new JTextField();
        jbtOK = new JButton();
        jtfShowText = new JTextArea();
        jbtClear = new JButton();

        getContentPane().setLayout(null);

        jlbFName.setText("First name"); //Texto label de Firstname
        getContentPane().add(jlbFName);
        jlbFName.setBounds(22,28,116,14);

        jtfFName.setHorizontalAlignment(JTextField.RIGHT); //Input TextField de FirstName
        getContentPane().add(jtfFName);
        jtfFName.setBounds(100,28,250,20);

        jlbLName.setText("Last name"); //Texto label de Lastname
        getContentPane().add(jlbLName);
        jlbLName.setBounds(22, 68, 116, 14);

        jtfLName.setHorizontalAlignment(JTextField.RIGHT); //Input TextField de Lastname
        getContentPane().add(jtfLName);
        jtfLName.setBounds(100, 68, 250, 20);

        jlbPosition.setText("Position"); //Texto label de Position
        getContentPane().add(jlbPosition);
        jlbPosition.setBounds(22,108,116,14);

        jtfPosition.setHorizontalAlignment(JTextField.RIGHT); //Input TextField de Position
        getContentPane().add(jtfPosition);
        jtfPosition.setBounds(100,108,250,20);

        jbtOK.setText("OK"); //Botón OK, primer botón, pasa los datos al showtext
        getContentPane().add(jbtOK);
        jbtOK.setBounds(290, 148, 60, 20);
        jbtOK.setMnemonic('O'); //ALT + O como aceptar
        jbtOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jbtOKActionPerformed(e);
            }
        });

        getContentPane().add(jtfShowText); //Área de texto grande para printar datos
        jtfShowText.setBounds(22, 188, 440, 200);

        jbtClear.setText("Clear"); //Botón Clear, segundo botón, límpia los datos del showtext
        getContentPane().add(jbtClear);
        jbtClear.setBounds(390, 410, 70, 20);
        jbtClear.setMnemonic('C'); //ALT + C como aceptar
        jbtClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jbtClearActionPerformed(e);
            }
        });
    }

    private void jbtClearActionPerformed(ActionEvent evt){ //Método del primer botón
        jtfShowText.setText("");
    }

    private void jbtOKActionPerformed(ActionEvent evt){ //Método del segundo botón
        var showDates = jtfFName.getText() + "\n" + jtfLName.getText() + "\n" + jtfPosition.getText();
        jtfShowText.setText(showDates);
    }
}
