/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcadoju;
import javax.swing.ImageIcon;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author FERNANDO
 */
import javax.swing.JTextField;
public class Moatrarju extends javax.swing.JFrame {

   
    
    
    public Moatrarju() {
        initComponents();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private byte intentos;
    public ImageIcon imagens1 [];
    public ImageIcon imagens2 [];
    public ImageIcon imagens3 [];
    public ImageIcon imagens4 [];
    public ImageIcon imagens5 [];
    public ImageIcon imagens6 [];
    public ImageIcon imagens7 [];
    public ImageIcon imagens8 [];
    private String[] palabras;
    private String palabraF;
    private String[] palaJu;
    public JTextField letrasJ [];
    
          
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnpista = new javax.swing.JToggleButton();
        imag7 = new javax.swing.JLabel();
        imag6 = new javax.swing.JLabel();
        imag8 = new javax.swing.JLabel();
        imag5 = new javax.swing.JLabel();
        imag3 = new javax.swing.JLabel();
        imag2 = new javax.swing.JLabel();
        imag4 = new javax.swing.JLabel();
        imag1 = new javax.swing.JLabel();
        Lpalabras = new javax.swing.JLabel();
        valile = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JToggleButton();
        te1 = new javax.swing.JTextField();
        te2 = new javax.swing.JTextField();
        te3 = new javax.swing.JTextField();
        te4 = new javax.swing.JTextField();
        te5 = new javax.swing.JTextField();
        te6 = new javax.swing.JTextField();
        te7 = new javax.swing.JTextField();
        te8 = new javax.swing.JTextField();
        te9 = new javax.swing.JTextField();
        te10 = new javax.swing.JTextField();
        te11 = new javax.swing.JTextField();
        te12 = new javax.swing.JTextField();
        te13 = new javax.swing.JTextField();
        te14 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnjugar = new javax.swing.JToggleButton();
        btnnuevo = new javax.swing.JToggleButton();
        btnsalir = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 255, 204));

        btnpista.setBackground(new java.awt.Color(255, 204, 0));
        btnpista.setText("Pista");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, imag8, org.jdesktop.beansbinding.ObjectProperty.create(), imag2, org.jdesktop.beansbinding.BeanProperty.create("border"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, imag8, org.jdesktop.beansbinding.ObjectProperty.create(), imag1, org.jdesktop.beansbinding.BeanProperty.create("border"));
        bindingGroup.addBinding(binding);

        Lpalabras.setBackground(new java.awt.Color(0, 153, 0));
        Lpalabras.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        valile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valileActionPerformed(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        te8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                te8ActionPerformed(evt);
            }
        });

        te9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                te9ActionPerformed(evt);
            }
        });

        te10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                te10ActionPerformed(evt);
            }
        });

        te11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                te11ActionPerformed(evt);
            }
        });

        te12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                te12ActionPerformed(evt);
            }
        });

        te13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                te13ActionPerformed(evt);
            }
        });

        te14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                te14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(imag2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(te1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnbuscar)
                                            .addComponent(valile, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(Lpalabras, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(imag1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(te2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(te3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(te4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(te5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(te6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(te7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(te8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(te9, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(te10, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(te11, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(te12, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(te13, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(te14, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imag3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imag4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imag5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imag6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imag7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imag8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnpista)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnpista, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(te1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(te2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(te3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(te4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(te5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(te6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(te7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(te8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(te9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(te10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(te11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(te12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(te13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(te14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Lpalabras, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(valile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(imag7, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(imag1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(imag3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(imag5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(imag8, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(imag6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(imag4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(imag2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))))))
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 0));

        btnjugar.setBackground(new java.awt.Color(0, 0, 102));
        btnjugar.setText("Jugar");
        btnjugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjugarActionPerformed(evt);
            }
        });

        btnnuevo.setBackground(new java.awt.Color(0, 0, 102));
        btnnuevo.setText("Nuevo Juego");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btnsalir.setBackground(new java.awt.Color(0, 0, 102));
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(btnjugar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(btnnuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnjugar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        jSeparator1.setBackground(new java.awt.Color(51, 255, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnjugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjugarActionPerformed
      
        btnjugar.setEnabled(false);/*
        */
        int p;
        Random r = new Random();
        p = r.nextInt(20);
        
        palabras= new String [21];
        
        palabras[0] = "ingsistemas";
        palabras[1] = "ingindustrial";
        palabras[2] = "ingfisica";
        palabras[3] = "matematicas";
        palabras[4] = "ingcivil";
        palabras[5] = "ingcomercial";
        palabras[6] = "ingbiomedica";
        palabras[7] = "ingagronomica";
        palabras[8] = "ingambintal";
        palabras[9] = "economia";
        palabras[10] = "administracion";
        palabras[11] = "contaduria";
        palabras[12] = "ingestadistica";
        palabras[13] = "mercadeo";
        palabras[14] = "ingmultimedia";
        palabras[15] = "teologia";
        palabras[16] = "licenciatura";
        palabras[18] = "informatica";
        palabras[19] = "ingmecanica";
        palabras[20] = "microbiologia";
        
        
        palabraF = palabras[p];
    String palabraEscon = "";
         String[] palaJu = palabraF.split("");
        
        for (int i = 0; i < palaJu.length; i++){
              palabraEscon = palabraEscon + "-";
              System.out.println(palabraEscon); 
          }
         Lpalabras.setText(palabraEscon);
        
         palaJu = palabraF.split(""); 
          for (int i = 0; i < palaJu.length; i++){
            
            System.out.println(palaJu[i]); 
        }
        
                                             

        // TODO add your handling code here:
    }//GEN-LAST:event_btnjugarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        //System.exit(0);
        this.dispose();
         
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
    
   String letra;
   letra = valile.getText();
   int aciertos =0;
        
   imagens1 = new ImageIcon[1];
   imagens1[0] = new ImageIcon(getClass().getResource("imagen/image1.png"));
   
   
   imagens2 = new ImageIcon[1];
   imagens2[0] = new ImageIcon(getClass().getResource("imagen/image2.png"));
   
   imagens3 = new ImageIcon[1];
   imagens3[0] = new ImageIcon(getClass().getResource("imagen/image3.png"));
   
   imagens4 = new ImageIcon[1];
   imagens4[0] = new ImageIcon(getClass().getResource("imagen/image4.png"));
   
   imagens5 = new ImageIcon[1];
   imagens5[0] = new ImageIcon(getClass().getResource("imagen/image5.png"));
   
   imagens6 = new ImageIcon[1];
   imagens6[0] = new ImageIcon(getClass().getResource("imagen/image6.png"));
   
   imagens7 = new ImageIcon[1];
   imagens7[0] = new ImageIcon(getClass().getResource("imagen/image7.png"));
   
   imagens8 = new ImageIcon[1];
   imagens8[0] = new ImageIcon(getClass().getResource("imagen/image8.png"));
   
   
   letrasJ = new JTextField[14];
   
   letrasJ[0] = te1;
   letrasJ[1] = te2;
   letrasJ[2] = te3;
   letrasJ[3] = te4;
   letrasJ[4] = te5;
   letrasJ[5] = te6;
   letrasJ[6] = te7;
   letrasJ[7] = te8;
   letrasJ[8] = te9;
   letrasJ[9] = te10;
   letrasJ[10] = te11;
   letrasJ[11] = te12;
   letrasJ[12] = te13;
   letrasJ[13] = te14;
   
   palaJu = palabraF.split("");
     
        for (String palaJu1 : palaJu) {
            if (palaJu1.equals(letra)) {
                JOptionPane.showMessageDialog(null,"esta letra esta");
                
                intentos = 0;
                aciertos = 1;
            }
        }
   if (intentos == 0){
       imag1.setIcon(imagens1[intentos++]);
       imag2.setIcon(imagens2[intentos]);
       
       JOptionPane.showMessageDialog(null,"esta letra no esta te quedan 3 intentos");
       
   }else{
   
      if (intentos == 1){
           imag3.setIcon(imagens3[intentos++]);
           imag4.setIcon(imagens4[intentos]);
       
           JOptionPane.showMessageDialog(null,"esta letra no esta te quedan 2 intentos");
       
         }else{
   
            if (intentos == 2){
                   imag5.setIcon(imagens5[intentos++]);
                   imag6.setIcon(imagens6[intentos]);
       
                   JOptionPane.showMessageDialog(null,"esta letra no esta te quedan 1 intentos");
       
             }else{
   
                if (intentos == 3){
                       imag7.setIcon(imagens7[intentos++]);
                       imag8.setIcon(imagens8[intentos]);
       
                       JOptionPane.showMessageDialog(null,"perdiste");
       
                       perder y = new perder();
                       y.setVisible(true);
                       Moatrarju.this.dispose();
                    }

            } 
        } 
    }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        
        Moatrarju c = new Moatrarju();
        c.setVisible(true);
        Moatrarju.this.dispose();
        
        
        
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void valileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valileActionPerformed

    private void te8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_te8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_te8ActionPerformed

    private void te9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_te9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_te9ActionPerformed

    private void te10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_te10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_te10ActionPerformed

    private void te11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_te11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_te11ActionPerformed

    private void te12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_te12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_te12ActionPerformed

    private void te13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_te13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_te13ActionPerformed

    private void te14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_te14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_te14ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Moatrarju.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Moatrarju.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Moatrarju.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Moatrarju.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new Moatrarju().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lpalabras;
    private javax.swing.JToggleButton btnbuscar;
    public javax.swing.JToggleButton btnjugar;
    public javax.swing.JToggleButton btnnuevo;
    public javax.swing.JToggleButton btnpista;
    public javax.swing.JToggleButton btnsalir;
    public javax.swing.JLabel imag1;
    public javax.swing.JLabel imag2;
    public javax.swing.JLabel imag3;
    public javax.swing.JLabel imag4;
    public javax.swing.JLabel imag5;
    public javax.swing.JLabel imag6;
    public javax.swing.JLabel imag7;
    public javax.swing.JLabel imag8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTextField te1;
    public javax.swing.JTextField te10;
    public javax.swing.JTextField te11;
    public javax.swing.JTextField te12;
    public javax.swing.JTextField te13;
    public javax.swing.JTextField te14;
    public javax.swing.JTextField te2;
    public javax.swing.JTextField te3;
    public javax.swing.JTextField te4;
    public javax.swing.JTextField te5;
    public javax.swing.JTextField te6;
    public javax.swing.JTextField te7;
    public javax.swing.JTextField te8;
    public javax.swing.JTextField te9;
    private javax.swing.JTextField valile;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
