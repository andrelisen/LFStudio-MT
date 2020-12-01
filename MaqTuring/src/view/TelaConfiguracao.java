/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andrelise
 */
public class TelaConfiguracao extends javax.swing.JFrame {

    /**
     * Creates new form TelaConfiguracao
     */
    public TelaConfiguracao() {
        initComponents();
        model1 = (DefaultTableModel) tabelaTrans.getModel();
        setLocationRelativeTo(null);
        //torna icones de erros invisíveis
        //conj estados = erroConjFinais
        erroConjFinais.setVisible(false);
        //alfabeto = erroAlfabeto
        erroAlfabeto.setVisible(false);
        //estado inicial = erroEInicial
        erroEInicial.setVisible(false);
        //estado final = erroEFinal
        erroEFinal.setVisible(false);
        //tamanho da tabela e tabela vazia = erroFuncTrans
        erroFuncTrans.setVisible(false);

    }

    public DefaultTableModel model1;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaInternaPrinc = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnExec = new javax.swing.JButton();
        estadoInicial = new javax.swing.JTextField();
        conjEstados = new javax.swing.JTextField();
        alfabeto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaTrans = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        estadoFinal = new javax.swing.JTextField();
        erroEInicial = new javax.swing.JLabel();
        erroConjFinais = new javax.swing.JLabel();
        erroFuncTrans = new javax.swing.JLabel();
        erroAlfabeto = new javax.swing.JLabel();
        erroEFinal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 700));

        telaInternaPrinc.setBackground(new java.awt.Color(70, 71, 74));
        telaInternaPrinc.setMaximumSize(new java.awt.Dimension(1024, 700));
        telaInternaPrinc.setMinimumSize(new java.awt.Dimension(1024, 700));
        telaInternaPrinc.setPreferredSize(new java.awt.Dimension(1024, 700));

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/baseline_keyboard_backspace_white_24dp.png"))); // NOI18N
        btnVoltar.setBorderPainted(false);
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Open Sans Condensed Light", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(196, 196, 196));
        jLabel1.setText("CONFIGURAÇÃO DA MÁQUINA DE TURING");

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/baseline_save_white_24dp.png"))); // NOI18N
        btnSalvar.setBorderPainted(false);
        btnSalvar.setContentAreaFilled(false);
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/baseline_arrow_forward_white_24dp.png"))); // NOI18N
        btnExec.setBorderPainted(false);
        btnExec.setContentAreaFilled(false);
        btnExec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecActionPerformed(evt);
            }
        });

        estadoInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoInicialActionPerformed(evt);
            }
        });

        conjEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conjEstadosActionPerformed(evt);
            }
        });

        alfabeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alfabetoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Open Sans Condensed Light", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(193, 193, 193));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("K");

        jLabel3.setFont(new java.awt.Font("Open Sans Condensed Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(193, 193, 193));
        jLabel3.setText("Conjunto finito de estados");

        jLabel10.setFont(new java.awt.Font("Open Sans Condensed Light", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(193, 193, 193));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Σ");
        jLabel10.setToolTipText("");

        jLabel11.setFont(new java.awt.Font("Open Sans Condensed Light", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(193, 193, 193));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Alfabeto");

        jLabel12.setFont(new java.awt.Font("Open Sans Condensed Light", 2, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(193, 193, 193));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("S");

        jLabel13.setFont(new java.awt.Font("Open Sans Condensed Light", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(193, 193, 193));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Estado inicial");

        jLabel14.setFont(new java.awt.Font("Open Sans Condensed Light", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(193, 193, 193));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("δ");

        jLabel15.setFont(new java.awt.Font("Open Sans Condensed Light", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(193, 193, 193));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Funções de transições");

        tabelaTrans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Estado atual", "Símbolo lido", "Novo estado", "Símbolo escrito", "Movimento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaTrans.setAutoscrolls(false);
        tabelaTrans.setEditingRow(1);
        jScrollPane1.setViewportView(tabelaTrans);

        jButton1.setText("+");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("-");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Open Sans Condensed Light", 2, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(193, 193, 193));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("F");

        jLabel23.setFont(new java.awt.Font("Open Sans Condensed Light", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(193, 193, 193));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Estado Final");

        estadoFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoFinalActionPerformed(evt);
            }
        });

        erroEInicial.setFont(new java.awt.Font("Open Sans Condensed", 0, 18)); // NOI18N
        erroEInicial.setForeground(new java.awt.Color(255, 0, 0));
        erroEInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/erroY.png"))); // NOI18N

        erroConjFinais.setFont(new java.awt.Font("Open Sans Condensed", 0, 18)); // NOI18N
        erroConjFinais.setForeground(new java.awt.Color(255, 0, 0));
        erroConjFinais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/erroY.png"))); // NOI18N
        erroConjFinais.setDisabledIcon(null);

        erroFuncTrans.setFont(new java.awt.Font("Open Sans Condensed", 0, 18)); // NOI18N
        erroFuncTrans.setForeground(new java.awt.Color(255, 0, 0));
        erroFuncTrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/erroY.png"))); // NOI18N

        erroAlfabeto.setFont(new java.awt.Font("Open Sans Condensed", 0, 18)); // NOI18N
        erroAlfabeto.setForeground(new java.awt.Color(255, 0, 0));
        erroAlfabeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/erroY.png"))); // NOI18N

        erroEFinal.setFont(new java.awt.Font("Open Sans Condensed", 0, 18)); // NOI18N
        erroEFinal.setForeground(new java.awt.Color(255, 0, 0));
        erroEFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/erroY.png"))); // NOI18N

        javax.swing.GroupLayout telaInternaPrincLayout = new javax.swing.GroupLayout(telaInternaPrinc);
        telaInternaPrinc.setLayout(telaInternaPrincLayout);
        telaInternaPrincLayout.setHorizontalGroup(
            telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaInternaPrincLayout.createSequentialGroup()
                .addGroup(telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaInternaPrincLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(telaInternaPrincLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaInternaPrincLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213))
                    .addGroup(telaInternaPrincLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(conjEstados)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaInternaPrincLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(telaInternaPrincLayout.createSequentialGroup()
                                .addComponent(estadoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(erroEInicial)
                                .addGap(21, 21, 21)
                                .addGroup(telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(estadoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(alfabeto))
                        .addGap(18, 18, 18)
                        .addGroup(telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(erroConjFinais)
                            .addComponent(erroAlfabeto)
                            .addComponent(erroEFinal)
                            .addComponent(erroFuncTrans))
                        .addContainerGap(94, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaInternaPrincLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addGap(18, 18, 18)
                .addComponent(btnExec)
                .addGap(39, 39, 39))
        );
        telaInternaPrincLayout.setVerticalGroup(
            telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaInternaPrincLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVoltar)
                    .addComponent(jLabel1))
                .addGap(49, 49, 49)
                .addGroup(telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaInternaPrincLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaInternaPrincLayout.createSequentialGroup()
                        .addGroup(telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(erroConjFinais)
                            .addComponent(conjEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)))
                .addGap(20, 20, 20)
                .addGroup(telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(erroAlfabeto)
                    .addGroup(telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(telaInternaPrincLayout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(alfabeto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaInternaPrincLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(telaInternaPrincLayout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel13))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(erroEInicial)
                                    .addComponent(estadoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(telaInternaPrincLayout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23)))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaInternaPrincLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(erroEFinal)
                            .addComponent(estadoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)))
                .addGroup(telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaInternaPrincLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(telaInternaPrincLayout.createSequentialGroup()
                        .addGroup(telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(telaInternaPrincLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(erroFuncTrans))
                        .addGap(34, 34, 34)
                        .addGroup(telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalvar)
                            .addComponent(btnExec))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaInternaPrinc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1352, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(telaInternaPrinc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        if (model1.getRowCount() - 1 > 0) {
            model1.removeRow(model1.getRowCount() - 1);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        model1.addRow(new Object[]{});
    }//GEN-LAST:event_jButton1MouseClicked

    private void alfabetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alfabetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alfabetoActionPerformed

    private void conjEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conjEstadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conjEstadosActionPerformed

    private void estadoInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoInicialActionPerformed

    private void btnExecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecActionPerformed
        // TODO add your handling code here:

        String conjuntoEstados = conjEstados.getText();
        String simbAlfabeto = alfabeto.getText();
        String eInicial = estadoInicial.getText();
        String eFinal = estadoFinal.getText();
        int tamTable = tabelaTrans.getRowCount();

        System.out.println("Conjunto de estados: " + conjuntoEstados);
        System.out.println("Alfabeto: " + simbAlfabeto);
        System.out.println("Estado inicial: " + eInicial);
        System.out.println("Estado final: " + eFinal);
        System.out.println("Tamanho da tabela é:" + tamTable);
        System.out.println(tabelaTrans.getValueAt(0, 0));

        //Colocar if em cada um dos casos de erro
        //torna icones de erros visíveis        
        if (conjuntoEstados.isEmpty() || simbAlfabeto.isEmpty() || eInicial.isEmpty() || eFinal.isEmpty()
                || (tamTable > 0 && tabelaTrans.getValueAt(0, 0) == null)) {
            System.out.println("Faltando entradas!");
            if (conjuntoEstados.isEmpty()) {
                erroConjFinais.setVisible(true);
            }
                        
            if(simbAlfabeto.isEmpty()){
                erroAlfabeto.setVisible(true);
            }
            
            if(eInicial.isEmpty()){
                erroEInicial.setVisible(true);
            }
            
            if(eFinal.isEmpty()){
                erroEFinal.setVisible(true);
            }
            
            if(tamTable > 0 && tabelaTrans.getValueAt(0, 0) == null){
                erroFuncTrans.setVisible(true);
            }
            
        } else {
            new TelaExecucao().setVisible(true);
            this.setVisible(false);
        }

    }//GEN-LAST:event_btnExecActionPerformed

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        // TODO add your handling code here:
        JFrame parentFrame = new JFrame();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");   

        int userSelection = fileChooser.showSaveDialog(parentFrame);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            fileChooser.getSelectedFile();
           // System.out.println("Save as file: " + fileToSave.getAbsolutePath());
        }
        
        FileWriter arq;
        try {
            arq = new FileWriter(fileChooser.getSelectedFile(), true);
            PrintWriter gravarArq = new PrintWriter(arq);

            //System.out.println(estadoInicial.getText());
            //System.out.println(estadoFinal.getText());
            gravarArq.print(estadoInicial.getText() + "\n");
           
            gravarArq.print(estadoFinal.getText());
            
            gravarArq.print("\n_\n%\n\n");

            for (int i = 0; i < model1.getRowCount(); i++) {
                for (int j = 0; j < model1.getColumnCount(); j++) {
                    gravarArq.print(model1.getValueAt(i, j).toString() + ",");
                }
                gravarArq.print("\n");
            }
            arq.close();
        } catch (IOException ex) {
            Logger.getLogger(TelaConfiguracao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnSalvarMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        new TelaInicial().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void estadoFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoFinalActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        String filePath = "C:\\Users\\marco\\Documents\\NetBeansProjects\\LFStudio-MT\\MaqTuring\\txtSalvo.txt";
        File file = new File(filePath);
        try {
            FileWriter fw = new FileWriter(file);
            
            BufferedWriter bw = new  BufferedWriter(fw);
            
            for(int i = 0;i < tabelaTrans.getRowCount();i++){
                for(int j = 0;j < tabelaTrans.getColumnCount();j++){
                    bw.write(tabelaTrans.getValueAt(i, j).toString()+" ");
                }
                bw.newLine();
            }
            
            bw.close();
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(TelaConfiguracao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaConfiguracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConfiguracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConfiguracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConfiguracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConfiguracao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alfabeto;
    private javax.swing.JButton btnExec;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField conjEstados;
    private javax.swing.JLabel erroAlfabeto;
    private javax.swing.JLabel erroConjFinais;
    private javax.swing.JLabel erroEFinal;
    private javax.swing.JLabel erroEInicial;
    private javax.swing.JLabel erroFuncTrans;
    private javax.swing.JTextField estadoFinal;
    private javax.swing.JTextField estadoInicial;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaTrans;
    private javax.swing.JPanel telaInternaPrinc;
    // End of variables declaration//GEN-END:variables
}
