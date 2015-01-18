/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainGui;

import segooro.*;

/**
 *
 * @author Spek
 */
public class SelAgente extends javax.swing.JPanel {

    private BD bd;
    /**
     * Creates new form SelAgente
     */
    public SelAgente() {
        initComponents();
    }

    public SelAgente(BD bd) {
        this();
        this.bd=bd;
        String agenteins="";
        
        jComboBox1.removeAllItems();
        
        for (int i=0;i<bd.listaagentes.size();i++){
            //System.out.println(bd.listaagentes.get(i).toString());
            agenteins=Integer.toString(bd.listaagentes.get(i).agenteid)+bd.listaagentes.get(i).nome;
            //jPanel2.jComboBox1.addItem(bd.listaagentes.get(0).toString());
            jComboBox1.addItem(bd.listaagentes.get(i).toString());
            agenteins="";
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainGui/logo_comprido.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Selecionar Agente");

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(278, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addContainerGap(249, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        /*String agenteins="";
        
        for (int i=0;i<bd.listaagentes.size();i++){
            agenteins=Integer.toString(bd.listaagentes.get(i).agenteid)+bd.listaagentes.get(i).nome;
            //jPanel2.jComboBox1.addItem(bd.listaagentes.get(0).toString());
            jComboBox1.addItem(bd.listaagentes.get(0).toString());
            agenteins="";
        }*/
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String agenteins="";
        
        jComboBox1.removeAllItems();
        
        for (int i=0;i<bd.listaagentes.size();i++){
            System.out.println(bd.listaagentes.get(i).toString());
            agenteins=Integer.toString(bd.listaagentes.get(i).agenteid)+bd.listaagentes.get(i).nome;
            //jPanel2.jComboBox1.addItem(bd.listaagentes.get(0).toString());
            jComboBox1.addItem(bd.listaagentes.get(i).toString());
            agenteins="";
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
