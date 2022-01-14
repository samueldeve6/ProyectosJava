/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumadosnumerospoo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class SumaDosNumerosPoo extends JFrame implements ActionListener {
    JPanel p1;
    JTextField caja1;
    JTextField caja2;
    JTextField caja3;
    JButton b1;
    JLabel l1;
    JLabel numero1;
    JLabel numero2;
    JLabel numero3;
    //Constructor  
    public SumaDosNumerosPoo()  {
        setBounds(300, 200, 500, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        p1 = new JPanel();
        
        p1.setBackground(Color.yellow);
        p1.setLayout(new FlowLayout());
        caja1 = new JTextField(10);
        

        numero1 = new JLabel();
        numero2 = new JLabel();
        numero3 = new JLabel();
        
        caja2 = new JTextField(10);
        caja3 = new JTextField(10);
        b1 = new JButton("botón");
        //escuchar con ActionListener el componente
        b1.addActionListener(this);
        numero1= new JLabel("Numero 1: ");
        numero2 = new JLabel("Numero 2: ");
        numero3 = new JLabel("                    Resultado ");
    
       
        add(p1);
        
        p1.add(numero1);
        p1.add(caja1);
        p1.add(numero2);
        p1.add(caja2);
        p1.add(numero3);
        p1.add(caja3);
        p1.add(b1);
        
        setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SumaDosNumerosPoo interfazz = new SumaDosNumerosPoo();
    }
      public int suma(int a, int b){
    return a+b;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        caja3.setText(suma(Integer.parseInt(caja1.getText()), Integer.parseInt(caja2.getText()))+"");
    }
    }

     
