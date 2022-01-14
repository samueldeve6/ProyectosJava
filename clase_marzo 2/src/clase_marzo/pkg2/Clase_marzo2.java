/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_marzo.pkg2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class Clase_marzo2 extends JFrame implements ActionListener {
    JPanel p1;
    JTextField t1;
    JButton b1;
    JLabel l1;
    JColorChooser j1;

    //Constructor  
    public Clase_marzo2()  {
        setBounds(300, 200, 500, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        p1 = new JPanel();
        p1.setBackground(Color.yellow);
        p1.setLayout(new FlowLayout());
        t1 = new JTextField(10);
        b1 = new JButton("botón");
        //escuchar con ActionListener el componente
        b1.addActionListener(this);
        l1= new JLabel("Digite algo: ");
        j1= new JColorChooser();
       
        add(p1);
        p1.add(l1);
        p1.add(t1);
        p1.add(b1);
        p1.add(j1);
        setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clase_marzo2 interfazz = new Clase_marzo2();
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
       String evento;
       evento = b1.getActionCommand();
        if (evento.equals("botón")) {
            JOptionPane.showMessageDialog(null, "sirve mi botón");
        }
    }
    
     
}
