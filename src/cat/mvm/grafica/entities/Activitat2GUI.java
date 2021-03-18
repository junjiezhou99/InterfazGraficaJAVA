package cat.mvm.grafica.entities;

import javax.swing.*;

public class Activitat2GUI extends JFrame{
    private JLabel jlbFName;
    private JLabel jlbLName;
    private JLabel jlbBDate;
    private JTextField jtfFName;
    private JTextField jtfLName;
    private JTextField jtfBDate;

    public Activitat2GUI(){
        this.setSize(600, 400); //Mida de la ventana
        this.setResizable(false); //Quitar la opcion de modificar el size de la ventana
        this.setTitle("Health Profile and Body Mass Index Calculator"); //Título de la ventana
        this.setVisible(true); //Visibilidad on
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar el programa al cerrar la app
        initComponents();
    }

    private void initComponents() {
        jlbFName = new JLabel();
        jlbLName = new JLabel();
        jlbBDate = new JLabel();
        jtfFName = new JTextField();
        jtfLName = new JTextField();
        jtfBDate = new JTextField();

        getContentPane().setLayout(null);

        jlbFName.setText("First name"); //Texto label de Firstname
        getContentPane().add(jlbFName);
        jlbFName.setBounds(22,18,116,14);

        jtfFName.setHorizontalAlignment(JTextField.RIGHT); //Input TextField de FirstName
        getContentPane().add(jtfFName);
        jtfFName.setBounds(100,18,130,20);

        jlbLName.setText("Last name"); //Texto label de Lastname
        getContentPane().add(jlbLName);
        jlbLName.setBounds(22, 48, 116, 14);

        jtfLName.setHorizontalAlignment(JTextField.RIGHT); //Input TextField de Lastname
        getContentPane().add(jtfLName);
        jtfLName.setBounds(100, 48, 130, 20);
    }
}
