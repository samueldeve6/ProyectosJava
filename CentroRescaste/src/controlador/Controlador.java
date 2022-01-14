/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.Mascota;
import vista.Vista;
/**
 * @author Samuel Remolina Alvarez
 * @author Yeferson Guzman
 * @author Diego Jimenez
 */
    public class Controlador implements ActionListener {
    private Mascota model;
    private Vista view;
    DefaultTableModel modelo;
    ArrayList<Mascota> listamascota = new ArrayList<>();
    
    float acumulador = 0;
    int contadorMascota = 0;
    int contadorFelino = 0;
    int contadorCanino = 0;
    float promedio = 0;
    public Controlador(Vista view,Mascota model) {
        this.view = view;
        this.model = model;
        this.view.btnAgregar.addActionListener(this);
        this.view.btnFelino.addActionListener(this);
        this.view.btnCanino.addActionListener(this);
        this.view.btnPromedio.addActionListener(this);
        this.view.btnEliminar.addActionListener(this);
        
    }
    public void iniciarVista(){
      view.setVisible(true);
      view.setLocationRelativeTo(null);
      
    }
    public void contadorFelino() {
        JOptionPane.showMessageDialog(null, "El numero total de felinos es:" + contadorFelino);
    }

    public void contadorCanino() {
        JOptionPane.showMessageDialog(null, "El numero total de caninos es:" + contadorCanino);
    }

    public void listar() {
        DefaultTableModel modeloDefault = new DefaultTableModel(new String[]{"Tipo", "Nombre", "Raza", "Color", "Edad", "Toxoplasmosis o nivel de entrenamient"}, listamascota.size());

        view.tablaMascota.setModel(modeloDefault);

        TableModel modeloMascota = view.tablaMascota.getModel();
 
        for (int i = 0; i < listamascota.size(); i++) {
            Mascota f = listamascota.get(i);
            modeloMascota.setValueAt(f.getTipo(), i, 0);
            modeloMascota.setValueAt(f.getNombre(), i, 1);
            modeloMascota.setValueAt(f.getRaza(), i, 2);
            modeloMascota.setValueAt(f.getColor(), i, 3);
            modeloMascota.setValueAt(f.getEdad(), i, 4);
            modeloMascota.setValueAt(f.getToxoplasmosis(), i, 5);
        }

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==view.btnCanino){
            contadorCanino();
        }
        if(e.getSource()==view.btnFelino){
            contadorFelino();
        }
        if(e.getSource()==view.btnPromedio){
           promedio = acumulador / contadorMascota;
           JOptionPane.showMessageDialog(null, "el numero promedio de edades es: " + promedio);
        }
        if (e.getSource()==view.btnEliminar){
          int objEliminar = view.tablaMascota.getSelectedRow();
          Mascota m = new Mascota();
          m = listamascota.get(objEliminar);
          if(objEliminar>=0){
              listamascota.remove(objEliminar);
          }
          listar();
        }
        
        if(e.getSource()==view.btnAgregar){
        Mascota f = new Mascota();
        f.setTipo(view.txtTipo.getText());
        f.setNombre(view.txtNombre.getText());
        f.setRaza(view.txtRaza.getText());
        f.setColor(view.txtColor.getText());
        f.setEdad(Integer.parseInt(view.txtEdad.getText()));
        f.setToxoplasmosis(view.txtToxoplasmosis.getText());
           
        float ed = Float.parseFloat(view.txtEdad.getText());
        String toxoplasmosis = view.txtToxoplasmosis.getText();
        
        listamascota.add(f);
        acumulador = acumulador + ed;
        contadorMascota = listamascota.size();    
        listar();
        String tipoo = view.txtTipo.getText();
        if (tipoo.equals("felino")) {
            contadorFelino = contadorFelino + 1;

        }
        String tipo1 = view.txtTipo.getText();
        if (tipo1.equals("canino")) {
            contadorCanino = contadorCanino + 1;

        }
    }  
   } 
}
    
                                           
