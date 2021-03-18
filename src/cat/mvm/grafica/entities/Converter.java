package cat.mvm.grafica.entities;

import javax.swing.*;
import java.awt.event.*;

public class Converter extends JFrame {
    private JButton jbtAceptar;
    private JLabel jlbGradosC;
    private JLabel jlbGradosF;
    private JTextField jtfGradosC;
    private JTextField jtfGradosF;
    private Object objTextField;

    public Converter(){
        this.setSize(300, 200);
        this.setTitle("Conversor de temperatura");
        initComponents();
    }

    private void initComponents(){
        jlbGradosC = new JLabel();
        jlbGradosF = new JLabel();
        jtfGradosC = new JTextField();
        jtfGradosF = new JTextField();
        jbtAceptar = new JButton();

        addWindowListener(new WindowAdapter() { //Para cierre de app al clicar X
            @Override
            public void windowClosing(WindowEvent e) {
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });

        getContentPane().setLayout(null);

        jlbGradosC.setText("Graus Centigrads");
        getContentPane().add(jlbGradosC);
        jlbGradosC.setBounds(12,28,116,14);

        jtfGradosC.setHorizontalAlignment(JTextField.RIGHT);
        jtfGradosC.setText("0.0");
        jtfGradosC.addFocusListener(new FocusAdapter() { //FocusGained sirve para al hacer click seleccionar todo
            @Override
            public void focusGained(FocusEvent e) {
                jtfGradosFocusGained(e);
            }
        });
        jtfGradosC.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                jtfGradosKeyTyped(e);
            }
        });
        getContentPane().add(jtfGradosC);
        jtfGradosC.setBounds(132,28,144,20);

        jlbGradosF.setText("Graus Farenheit");
        getContentPane().add(jlbGradosF);
        jlbGradosF.setBounds(12,68,104,24);

        jtfGradosF.setHorizontalAlignment(JTextField.RIGHT);
        jtfGradosF.setText("32.0");
        jtfGradosF.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) { //FocusGained sirve para al hacer click seleccionar todo
                jtfGradosFocusGained(e);
            }
        });
        jtfGradosF.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                jtfGradosKeyTyped(e);
            }
        });
        getContentPane().add(jtfGradosF);
        jtfGradosF.setBounds(132,72,144,20);

        jbtAceptar.setText("Aceptar");
        jbtAceptar.setMnemonic('A');
        getRootPane().setDefaultButton(jbtAceptar); //boton por defecto (enter)
        jbtAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jbtAceptarActionPerformed(e);
            }
        });
        getContentPane().add(jbtAceptar);
        jbtAceptar.setBounds(175, 120, 100, 24);
    }

    private void jbtAceptarActionPerformed(ActionEvent evt){
        try{
            double grados;
            if(objTextField == jtfGradosC){ //Si escribe aqui
                grados = Double.parseDouble(jtfGradosC.getText())*9.0/5.0 + 32.0; //Formula más conversion a double
                String texto = String.format("%.2f", grados); //Double a String
                jtfGradosF.setText(texto); //Ponerlo en el texto
            }

            if(objTextField == jtfGradosF){
                grados = (Double.parseDouble(jtfGradosF.getText())-32) * 5.0/9.0;
                String texto = String.format("%.2f", grados);
                jtfGradosC.setText(texto);
            }
        }
        catch (NumberFormatException n){
            jtfGradosC.setText("0.0");
            jtfGradosF.setText("32.0");
        }
    }

    private void jtfGradosKeyTyped(KeyEvent evt){
        objTextField = evt.getSource();
    }
    private void jtfGradosFocusGained(FocusEvent evt){ //FocusGained sirve para al hacer click seleccionar todo
        JTextField objEnfocado = (JTextField) evt.getSource();
        objEnfocado.selectAll();
    }
}
