/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modulos.AutomatoFinitoPilha.screens;

import java.util.ArrayList;
import main.modulos.AutomatoFinitoNaoDeterministico.controllers.Injection;
import main.modulos.AutomatoFinitoPilha.controllers.AFP_Injection;
import main.modulos.AutomatoFinitoPilha.domain.model.Arvore;
import main.modulos.AutomatoFinitoPilha.domain.model.AutomatoDePilha;

/**
 *
 * @author michel
 */
public class PilhaProcessamentoPanel extends javax.swing.JPanel {
    javax.swing.JPanel JanelaExecucao;

    /**
     * Creates new form test1
     */
    public PilhaProcessamentoPanel(javax.swing.JPanel janela) {
        JanelaExecucao= janela;
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

        jPanel1 = new javax.swing.JPanel();
        processamento1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AFP_Retorno = new javax.swing.JTextArea();
        validarPalavraPilha1 = new javax.swing.JLabel();
        t_e = new javax.swing.JLabel();
        t_proces1 = new javax.swing.JLabel();
        r_e = new javax.swing.JTextField();
        AFND3_Titulo7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(70, 71, 74));
        setPreferredSize(new java.awt.Dimension(579, 648));

        jPanel1.setBackground(new java.awt.Color(28, 28, 28));
        jPanel1.setPreferredSize(new java.awt.Dimension(579, 648));

        processamento1.setBackground(new java.awt.Color(0, 0, 0));
        processamento1.setPreferredSize(new java.awt.Dimension(360, 321));

        AFP_Retorno.setBackground(new java.awt.Color(0, 0, 0));
        AFP_Retorno.setColumns(20);
        AFP_Retorno.setForeground(new java.awt.Color(255, 255, 255));
        AFP_Retorno.setRows(5);
        jScrollPane1.setViewportView(AFP_Retorno);

        javax.swing.GroupLayout processamento1Layout = new javax.swing.GroupLayout(processamento1);
        processamento1.setLayout(processamento1Layout);
        processamento1Layout.setHorizontalGroup(
            processamento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processamento1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
        );
        processamento1Layout.setVerticalGroup(
            processamento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processamento1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap())
        );

        validarPalavraPilha1.setBackground(new java.awt.Color(51, 51, 51));
        validarPalavraPilha1.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 20)); // NOI18N
        validarPalavraPilha1.setForeground(new java.awt.Color(255, 255, 255));
        validarPalavraPilha1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        validarPalavraPilha1.setText("Validar Palavra");
        validarPalavraPilha1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        validarPalavraPilha1.setOpaque(true);
        validarPalavraPilha1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                validarPalavraPilha1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                validarPalavraPilha1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                validarPalavraPilha1MouseExited(evt);
            }
        });

        t_e.setBackground(new java.awt.Color(70, 71, 74));
        t_e.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 22)); // NOI18N
        t_e.setForeground(new java.awt.Color(255, 255, 255));
        t_e.setText("Entrada");

        t_proces1.setBackground(new java.awt.Color(70, 71, 74));
        t_proces1.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 24)); // NOI18N
        t_proces1.setForeground(new java.awt.Color(255, 255, 255));
        t_proces1.setText("Processamento");

        AFND3_Titulo7.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 36)); // NOI18N
        AFND3_Titulo7.setForeground(new java.awt.Color(255, 255, 255));
        AFND3_Titulo7.setText("<html><p style=\"padding-bottom: 16px;\">Autômato Pilha</p></html>");
        AFND3_Titulo7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AFND3_Titulo7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_proces1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(validarPalavraPilha1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(processamento1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(t_e)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r_e, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(AFND3_Titulo7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_proces1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(processamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(r_e, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(validarPalavraPilha1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(t_e, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void validarPalavraPilha1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validarPalavraPilha1MouseClicked
       String palavra = r_e.getText();
       AutomatoDePilha teste = AFP_Injection.getAutomato();
       Arvore configurações = new Arvore();
       boolean resposta = teste.Reconhecer(palavra, configurações);
       ArrayList <String>  retorno = new ArrayList ();
       retorno.add(AFP_Injection.getAviso());
       if(AFP_Injection.isConfirm() == true)
       {
       retorno.addAll(teste.printArvore(configurações));
       if(resposta){
            retorno.add("A palavra '"+ palavra +"' pertence a linguagem.");
        } else {
            retorno.add("A palavra '"+ palavra +"' não pertence a linguagem.");
       }
       }
       StringBuilder text = new StringBuilder();
        for (String x : retorno) {
            text.append(x);
            text.append("\n");
        }
        AFP_Retorno.setText(text.toString());
    }//GEN-LAST:event_validarPalavraPilha1MouseClicked

    private void validarPalavraPilha1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validarPalavraPilha1MouseEntered
         validarPalavraPilha1.setBackground(validarPalavraPilha1.getBackground().brighter().brighter());
    }//GEN-LAST:event_validarPalavraPilha1MouseEntered

    private void validarPalavraPilha1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validarPalavraPilha1MouseExited
        validarPalavraPilha1.setBackground(validarPalavraPilha1.getBackground().darker().darker());
    }//GEN-LAST:event_validarPalavraPilha1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AFND3_Titulo7;
    private javax.swing.JTextArea AFP_Retorno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel processamento1;
    private javax.swing.JTextField r_e;
    private javax.swing.JLabel t_e;
    private javax.swing.JLabel t_proces1;
    private javax.swing.JLabel validarPalavraPilha1;
    // End of variables declaration//GEN-END:variables
}
