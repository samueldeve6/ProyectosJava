/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panelejercicio;
import javax.swing.*;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class Panelejercicio extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {        
 
                
        JFrame frame = new JFrame("Cuadro de chat");       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        frame.setSize(400, 400);        
 
        
        JMenuBar menu1 = new JMenuBar();       
        JMenu menu2 = new JMenu("Archivo");       
        JMenu menu3 = new JMenu("Ayuda");       
        menu1.add(menu2);       
        menu1.add(menu3);       
        JMenuItem mitem1 = new JMenuItem("Abrir");       
        JMenuItem mitem2 = new JMenuItem("Guardar como");       
        menu2.add(mitem1);       
        menu2.add(mitem2);        
 
             
        JPanel panel = new JPanel();    
        JLabel label = new JLabel("Introducir texto");       
        JTextField etiqueta = new JTextField(10);        
        JButton enviar = new JButton("Enviar");       
        JButton reinicializar = new JButton("Restablecer");       
        panel.add(etiqueta);     
        panel.add(label);       
        panel.add(enviar);       
        panel.add(reinicializar);        
 
       
        JTextArea interfaz = new JTextArea();        
 
              
        frame.getContentPane().add(BorderLayout.SOUTH, panel);       
        frame.getContentPane().add(BorderLayout.NORTH, menu1);       
        frame.getContentPane().add(BorderLayout.CENTER, interfaz);       
        frame.setVisible(true);   
    }
}