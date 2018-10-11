/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akna;

import java.awt.Button;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author MZaX
 */

    class Mezo {
        int m1,m2,bsz ,jsz,ksz; //mezőméret1-2, bombák száma, jelölés száma(?), kattintás száma
        float fok;
        int[][] tabla;
        Button[][] btn;
        Boolean start;
        
        Mezo (int a, int b) {
            m1=a; m2=b; start=true; bsz=0; jsz=0; ksz=0;
            tabla = new int[m1][m2];
            btn = new Button[m1][m2];
        }    
    }



public class Foablak extends javax.swing.JFrame {
    
    Mezo mezo;
    Button btn;
    
    
    
    /**
     * Creates new form Foablak
     */
    public Foablak() {
        initComponents();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button3 = new java.awt.Button();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MZaX's Aknák! :)");
        setLocation(new java.awt.Point(150, 150));
        setName("Aknák!"); // NOI18N
        setResizable(false);

        button3.setLabel("Start");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(20, 10, 40, 1));
        jSpinner1.setValue(20);

        jLabel1.setText("MZaX's JávaAkna 0.1 :)");

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(20, 10, 40, 1));
        jSpinner3.setValue(20);

        jSpinner2.setModel(new javax.swing.SpinnerListModel(new String[] {"Kemény", "Nehéz", "Közepes", "Könnyű"}));
        jSpinner2.setValue("Közepes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                    .addComponent(jSpinner2))))
                        .addGap(0, 105, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed

        //button2.setLocation(5, 5);
        //button2.setVisible(false);
        //button3.setVisible(false);
        
        int i,j;
        mezo = new Mezo((int) jSpinner1.getValue(), (int)jSpinner3.getValue());
        String s=(String) jSpinner2.getValue();
        if (s=="Könnyű") mezo.fok=20; else if (s=="Közepes") mezo.fok=40; else if (s=="Nehéz") mezo.fok=60; else mezo.fok=80;
        
        this.remove(button3); this.remove(jLabel1); this.remove(jSpinner2);
        this.remove(jSpinner1); this.remove(jSpinner3);        
        this.setLayout (null) ;
        this.setSize(mezo.m1*20+6, mezo.m2*20+33);
        //this.setLayout(new GridLayout(mezo.m1,mezo.m2));
        
        for (i=0;i<mezo.m1;i++) for (j=0;j<mezo.m2;j++) {
            mezo.btn[i][j]=new Button(""); btn=mezo.btn[i][j];
            btn.setBounds(i*20,j*20,20,20);
            btn.addMouseListener(new jobbklikk());
            btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyomva(evt);
            }
           });
            this.add(btn);
        } 

        
        this.revalidate();
        this.repaint();
        
    }//GEN-LAST:event_button3ActionPerformed

  class jobbklikk  extends MouseAdapter {
    public void mouseClicked (MouseEvent e) {  
        if (e.getModifiers() == MouseEvent.BUTTON3_MASK) { 
          Object b = e.getSource(); Button bt = (Button) b;          
          String s=bt.getLabel();
          if (s=="") {mezo.jsz++; bt.setLabel("?");} else if (s=="?") {bt.setLabel(""); mezo.jsz--;}
          
          if ( (mezo.jsz+mezo.ksz==mezo.m1*mezo.m2) && mezo.jsz==mezo.bsz ) { /*győzelem*/ } 
          
        }
    }
  } 
    
    void nyomva(java.awt.event.ActionEvent evt) {
        Object b = evt.getSource(); Button bt = (Button) b;
        int x,y; x = bt.getX()/20; y = bt.getY()/20;
        if (bt.getLabel()=="") {
          if (mezo.start) { mezo.start=false;
              int i,j;
              for (i=0; i<mezo.m1; i++) for (j=0;j<mezo.m2;j++) 
                  if (i==x && j==y) mezo.tabla[i][j]=0;
                  else if (Math.random()*100>mezo.fok) mezo.tabla[i][j]=0; else
                  {mezo.tabla[i][j]=1; mezo.bsz++;}
          }
            
          mezo.btn[x][y].setLabel("!");
        
        
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(Foablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Foablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Foablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Foablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Foablak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    // End of variables declaration//GEN-END:variables
}
