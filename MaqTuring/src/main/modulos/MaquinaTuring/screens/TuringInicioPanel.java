/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modulos.MaquinaTuring.screens;

import main.LFStudio;
import java.awt.Font;
import javax.swing.JLabel;
import java.io.File;
import javax.swing.JFileChooser;
import view.TelaExecucao;

/**
 *
 * @author andrelise
 * @author thiagoleal
 */
public class TuringInicioPanel extends javax.swing.JPanel {
    javax.swing.JPanel JanelaExecucao;
    /**
     * Creates new form test1
     * @param janela
     */
    public TuringInicioPanel(javax.swing.JPanel janela) {
        this.JanelaExecucao = janela;
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

        turingTitle = new javax.swing.JPanel();
        Turing_LabelNovaMaquina4 = new javax.swing.JLabel();
        Turing_LabelImportarMaquina4 = new javax.swing.JLabel();
        Turing_LabelAutomatoFND4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(579, 648));

        turingTitle.setBackground(new java.awt.Color(28, 28, 28));
        turingTitle.setPreferredSize(new java.awt.Dimension(579, 648));

        Turing_LabelNovaMaquina4.setBackground(new java.awt.Color(0, 0, 0));
        Turing_LabelNovaMaquina4.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 28)); // NOI18N
        Turing_LabelNovaMaquina4.setForeground(new java.awt.Color(255, 255, 255));
        Turing_LabelNovaMaquina4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Turing_LabelNovaMaquina4.setText("Nova máquina");
        Turing_LabelNovaMaquina4.setAlignmentX(5.0F);
        Turing_LabelNovaMaquina4.setAlignmentY(5.0F);
        Turing_LabelNovaMaquina4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Turing_LabelNovaMaquina4.setPreferredSize(new java.awt.Dimension(150, 22));
        Turing_LabelNovaMaquina4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Turing_LabelNovaMaquina4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Turing_LabelNovaMaquina4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Turing_LabelNovaMaquina4MouseExited(evt);
            }
        });

        Turing_LabelImportarMaquina4.setBackground(new java.awt.Color(0, 0, 0));
        Turing_LabelImportarMaquina4.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 28)); // NOI18N
        Turing_LabelImportarMaquina4.setForeground(new java.awt.Color(255, 255, 255));
        Turing_LabelImportarMaquina4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Turing_LabelImportarMaquina4.setText("Importar máquina");
        Turing_LabelImportarMaquina4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Turing_LabelImportarMaquina4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Turing_LabelImportarMaquina4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Turing_LabelImportarMaquina4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Turing_LabelImportarMaquina4MouseExited(evt);
            }
        });

        Turing_LabelAutomatoFND4.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 48)); // NOI18N
        Turing_LabelAutomatoFND4.setForeground(new java.awt.Color(255, 255, 255));
        Turing_LabelAutomatoFND4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Turing_LabelAutomatoFND4.setText("<html><p style=\"padding-bottom: 16px;\">Máquina de Turing</p></html>");

        jSeparator1.setBackground(new java.awt.Color(28, 28, 28));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout turingTitleLayout = new javax.swing.GroupLayout(turingTitle);
        turingTitle.setLayout(turingTitleLayout);
        turingTitleLayout.setHorizontalGroup(
            turingTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(turingTitleLayout.createSequentialGroup()
                .addGroup(turingTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Turing_LabelNovaMaquina4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(turingTitleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Turing_LabelAutomatoFND4))
                    .addComponent(Turing_LabelImportarMaquina4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(turingTitleLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 103, Short.MAX_VALUE)))
                .addContainerGap())
        );
        turingTitleLayout.setVerticalGroup(
            turingTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, turingTitleLayout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(Turing_LabelAutomatoFND4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(Turing_LabelNovaMaquina4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Turing_LabelImportarMaquina4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(turingTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(turingTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Turing_LabelNovaMaquina4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Turing_LabelNovaMaquina4MouseClicked
        LFStudio.cl.show(JanelaExecucao, "turingConfigPanel");        // TODO add your handling code here:
    }//GEN-LAST:event_Turing_LabelNovaMaquina4MouseClicked

    private void Turing_LabelNovaMaquina4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Turing_LabelNovaMaquina4MouseEntered
        Font f = Turing_LabelNovaMaquina4.getFont();
        Turing_LabelNovaMaquina4.setFont(f.deriveFont(f.getStyle(), f.getSize2D()+4));
    }//GEN-LAST:event_Turing_LabelNovaMaquina4MouseEntered

    private void Turing_LabelNovaMaquina4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Turing_LabelNovaMaquina4MouseExited
        Font f = Turing_LabelNovaMaquina4.getFont();
        Turing_LabelNovaMaquina4.setFont(f.deriveFont(f.getStyle(), f.getSize2D()-4));
    }//GEN-LAST:event_Turing_LabelNovaMaquina4MouseExited

    private void Turing_LabelImportarMaquina4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Turing_LabelImportarMaquina4MouseEntered
        Font f = Turing_LabelImportarMaquina4.getFont();
        Turing_LabelImportarMaquina4.setFont(f.deriveFont(f.getStyle(), f.getSize2D()+4));
    }//GEN-LAST:event_Turing_LabelImportarMaquina4MouseEntered

    private void Turing_LabelImportarMaquina4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Turing_LabelImportarMaquina4MouseExited
        Font f = Turing_LabelImportarMaquina4.getFont();
        Turing_LabelImportarMaquina4.setFont(f.deriveFont(f.getStyle(), f.getSize2D()-4));
    }//GEN-LAST:event_Turing_LabelImportarMaquina4MouseExited

    private void Turing_LabelImportarMaquina4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Turing_LabelImportarMaquina4MouseClicked
        JFileChooser fileChooser = new JFileChooser();
        
        int response = fileChooser.showOpenDialog(null);//select file to open
        
        if(response == JFileChooser.APPROVE_OPTION){
            File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
            System.out.println(file);
            
            TuringProcessamentoPanel.pathFile = file.toString();
            LFStudio.cl.show(JanelaExecucao, "turingProcessamentoPanel");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_Turing_LabelImportarMaquina4MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Turing_LabelAutomatoFND4;
    private javax.swing.JLabel Turing_LabelImportarMaquina4;
    private javax.swing.JLabel Turing_LabelNovaMaquina4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel turingTitle;
    // End of variables declaration//GEN-END:variables
}