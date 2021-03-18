package cat.mvm.grafica.entities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    public MyFrame(){
        this.setSize(500, 500);
        //this.setResizable(false); //Quitar la opcion de modificar el size de la ventana
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH); //Abrir en ventana completa

        Toolkit screen = Toolkit.getDefaultToolkit(); //Intento de cambiar el icono
        Image MyIcon = screen.getImage("src/icon.png");
        setIconImage(MyIcon);

        Dimension screenSize = screen.getScreenSize(); //Coger la dimension de la pantalla
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        this.setSize(screenWidth/2, screenHeight/2);
        this.setLocation(screenWidth/4, screenHeight/4);

        JPanel buttons = new JPanel();
        JButton hello = new JButton("Say hi ^^");

        JButton bye = new JButton("Say goodbye ^^");
        buttons.add(hello);
        buttons.add(bye);

        JTextField txtOut = new JTextField("Pulsa un botó");
        hello.addActionListener(new ActionListener() { //Actividad del boton
            @Override
            public void actionPerformed(ActionEvent e) {
                txtOut.setText("Hola people!");
            }
        });
        bye.addActionListener(new ActionListener() { //Actividad del boton
            @Override
            public void actionPerformed(ActionEvent e) {
                txtOut.setText("Adios people!");
            }
        });
        JSplitPane mainPannel = new JSplitPane(JSplitPane.VERTICAL_SPLIT, buttons, txtOut);
        this.getContentPane().add(mainPannel);

        this.setTitle("Aplicacion mamadisima"); //Título de la ventana
        this.setVisible(true); //Visibilidad, true para que se vea
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar la ventana al darle al X


    }
}
