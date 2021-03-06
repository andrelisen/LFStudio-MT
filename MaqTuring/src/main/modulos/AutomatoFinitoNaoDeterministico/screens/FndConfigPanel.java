/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modulos.AutomatoFinitoNaoDeterministico.screens;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;
import main.LFStudio;
import main.layout.CustomTable;
import main.modulos.AutomatoFinitoNaoDeterministico.controllers.FndController;
import main.modulos.AutomatoFinitoNaoDeterministico.controllers.AFND_Injection;
import main.modulos.AutomatoFinitoNaoDeterministico.domain.models.NaoDeterministico;

/**
 *
 * @author michel
 */
public class FndConfigPanel extends javax.swing.JPanel {

    FndController controller = new FndController();
    javax.swing.JPanel JanelaExecucao;

    /**
     * Creates new form test1
     */
    public FndConfigPanel(javax.swing.JPanel janela) {
        JanelaExecucao = janela;
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
        FND_BodyConfig = new javax.swing.JPanel();
        FND_LabelAlfabeto = new javax.swing.JLabel();
        FND_LabelEstadosFinais = new javax.swing.JLabel();
        FND_LabelEstados = new javax.swing.JLabel();
        FND_LabelEstadoInicial = new javax.swing.JLabel();
        FND_LabelTabelaTransicao = new javax.swing.JLabel();
        FND_TextFieldAlfabeto = new javax.swing.JTextField();
        FND_jScrollPane2 = new javax.swing.JScrollPane();
        FND_jTable1 = new javax.swing.JTable();
        FND_TextFieldEstados = new javax.swing.JTextField();
        FND_TextFieldEstadoInicial = new javax.swing.JTextField();
        FND_TextFieldEstadosFinais = new javax.swing.JTextField();
        FND_Titulo = new javax.swing.JLabel();
        FND_LabelProcessarAutomato = new javax.swing.JLabel();
        FND_SalvarAutomatojlbl = new javax.swing.JLabel();
        FND_SubTitulo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 51, 51));
        setForeground(new java.awt.Color(28, 28, 28));

        jPanel1.setBackground(new java.awt.Color(28, 28, 28));

        FND_BodyConfig.setBackground(new java.awt.Color(28, 28, 28));
        FND_BodyConfig.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        FND_BodyConfig.setForeground(new java.awt.Color(28, 28, 28));

        FND_LabelAlfabeto.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 22)); // NOI18N
        FND_LabelAlfabeto.setForeground(new java.awt.Color(255, 255, 255));
        FND_LabelAlfabeto.setText("Alfabeto");

        FND_LabelEstadosFinais.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 22)); // NOI18N
        FND_LabelEstadosFinais.setForeground(new java.awt.Color(255, 255, 255));
        FND_LabelEstadosFinais.setText("Estados Finais");

        FND_LabelEstados.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 22)); // NOI18N
        FND_LabelEstados.setForeground(new java.awt.Color(255, 255, 255));
        FND_LabelEstados.setText("Estados");

        FND_LabelEstadoInicial.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 22)); // NOI18N
        FND_LabelEstadoInicial.setForeground(new java.awt.Color(255, 255, 255));
        FND_LabelEstadoInicial.setText("Estado Inicial");

        FND_LabelTabelaTransicao.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 22)); // NOI18N
        FND_LabelTabelaTransicao.setForeground(new java.awt.Color(255, 255, 255));
        FND_LabelTabelaTransicao.setText("Tabela de Transições");

        FND_TextFieldAlfabeto.setBackground(new java.awt.Color(255, 255, 255));
        FND_TextFieldAlfabeto.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        FND_TextFieldAlfabeto.setForeground(new java.awt.Color(0, 0, 0));
        FND_TextFieldAlfabeto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FND_TextFieldAlfabeto.setText("4,8,2,3");
        FND_TextFieldAlfabeto.setToolTipText("");
        FND_TextFieldAlfabeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FND_TextFieldAlfabetoActionPerformed(evt);
            }
        });
        FND_TextFieldAlfabeto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FND_TextFieldAlfabetoKeyReleased(evt);
            }
        });

        FND_jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"coxinha", null, "coxinha,bacon", "coxinha,salada", null},
                {"bacon", "arroz", "arroz", null, null},
                {"salada", null, null, "arroz", null},
                {"arroz", null, "arroz", null, "arroz"}
            },
            new String [] {
                "Estados", "4", "8", "2", "3"
            }
        ));
        FND_jScrollPane2.setViewportView(FND_jTable1);

        FND_TextFieldEstados.setBackground(new java.awt.Color(255, 255, 255));
        FND_TextFieldEstados.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        FND_TextFieldEstados.setForeground(new java.awt.Color(0, 0, 0));
        FND_TextFieldEstados.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FND_TextFieldEstados.setText("coxinha,bacon,salada,arroz");
        FND_TextFieldEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FND_TextFieldEstadosActionPerformed(evt);
            }
        });
        FND_TextFieldEstados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FND_TextFieldEstadosKeyReleased(evt);
            }
        });

        FND_TextFieldEstadoInicial.setBackground(new java.awt.Color(255, 255, 255));
        FND_TextFieldEstadoInicial.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        FND_TextFieldEstadoInicial.setForeground(new java.awt.Color(0, 0, 0));
        FND_TextFieldEstadoInicial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FND_TextFieldEstadoInicial.setText("coxinha");

        FND_TextFieldEstadosFinais.setBackground(new java.awt.Color(255, 255, 255));
        FND_TextFieldEstadosFinais.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        FND_TextFieldEstadosFinais.setForeground(new java.awt.Color(0, 0, 0));
        FND_TextFieldEstadosFinais.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FND_TextFieldEstadosFinais.setText("arroz");
        FND_TextFieldEstadosFinais.setToolTipText("");
        FND_TextFieldEstadosFinais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FND_TextFieldEstadosFinaisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FND_BodyConfigLayout = new javax.swing.GroupLayout(FND_BodyConfig);
        FND_BodyConfig.setLayout(FND_BodyConfigLayout);
        FND_BodyConfigLayout.setHorizontalGroup(
            FND_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FND_BodyConfigLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(FND_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FND_jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(FND_BodyConfigLayout.createSequentialGroup()
                        .addGroup(FND_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FND_LabelEstados)
                            .addComponent(FND_LabelEstadoInicial))
                        .addGap(94, 94, 94)
                        .addGroup(FND_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FND_TextFieldEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FND_TextFieldEstadoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FND_BodyConfigLayout.createSequentialGroup()
                        .addGroup(FND_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FND_LabelEstadosFinais)
                            .addComponent(FND_LabelAlfabeto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(FND_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FND_TextFieldEstadosFinais, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(FND_TextFieldAlfabeto)))
                    .addGroup(FND_BodyConfigLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(FND_LabelTabelaTransicao)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        FND_BodyConfigLayout.setVerticalGroup(
            FND_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FND_BodyConfigLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FND_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FND_LabelAlfabeto)
                    .addComponent(FND_TextFieldAlfabeto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FND_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FND_TextFieldEstadosFinais, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FND_LabelEstadosFinais))
                .addGap(10, 10, 10)
                .addGroup(FND_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FND_TextFieldEstadoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FND_LabelEstadoInicial))
                .addGap(10, 10, 10)
                .addGroup(FND_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FND_TextFieldEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FND_LabelEstados))
                .addGap(25, 25, 25)
                .addComponent(FND_LabelTabelaTransicao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FND_jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        FND_Titulo.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 36)); // NOI18N
        FND_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        FND_Titulo.setText("<html><p style=\"padding-bottom: 16px;\">Autômato FND</p></html>");
        FND_Titulo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        FND_LabelProcessarAutomato.setBackground(new java.awt.Color(51, 51, 51));
        FND_LabelProcessarAutomato.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 22)); // NOI18N
        FND_LabelProcessarAutomato.setForeground(new java.awt.Color(255, 255, 255));
        FND_LabelProcessarAutomato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FND_LabelProcessarAutomato.setText(" Processar Autômato ");
        FND_LabelProcessarAutomato.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FND_LabelProcessarAutomato.setOpaque(true);
        FND_LabelProcessarAutomato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FND_LabelProcessarAutomatoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FND_LabelProcessarAutomatoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FND_LabelProcessarAutomatoMouseExited(evt);
            }
        });

        FND_SalvarAutomatojlbl.setBackground(new java.awt.Color(51, 51, 51));
        FND_SalvarAutomatojlbl.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 22)); // NOI18N
        FND_SalvarAutomatojlbl.setForeground(new java.awt.Color(255, 255, 255));
        FND_SalvarAutomatojlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FND_SalvarAutomatojlbl.setText("Salvar Autômato");
        FND_SalvarAutomatojlbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FND_SalvarAutomatojlbl.setOpaque(true);
        FND_SalvarAutomatojlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FND_SalvarAutomatojlblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FND_SalvarAutomatojlblMouseExited(evt);
            }
        });

        FND_SubTitulo.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 24)); // NOI18N
        FND_SubTitulo.setForeground(new java.awt.Color(255, 255, 255));
        FND_SubTitulo.setText("Configuração");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(FND_LabelProcessarAutomato, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FND_SalvarAutomatojlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FND_BodyConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FND_SubTitulo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(FND_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(FND_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(FND_SubTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(FND_BodyConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(FND_SalvarAutomatojlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(FND_LabelProcessarAutomato, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FND_TextFieldAlfabetoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FND_TextFieldAlfabetoKeyReleased
        String[] estados = FND_TextFieldEstados.getText().split(",");
        String[] alfabeto = FND_TextFieldAlfabeto.getText().split(",");
        Vector<String> vector = null;
        CustomTable tableModel = new CustomTable();
        tableModel.addColumn("Estados");
        for (String rowName : estados) {
            vector = new Vector<String>();
            vector.add(rowName);
            tableModel.insertRow(0, vector);
        }
        for (String columnName : alfabeto) {
            tableModel.addColumn(columnName);
        }
        FND_jTable1.setModel(tableModel);
    }//GEN-LAST:event_FND_TextFieldAlfabetoKeyReleased

    private void FND_LabelProcessarAutomatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FND_LabelProcessarAutomatoMouseClicked
        NaoDeterministico atual = gerarAutomato();
        LFStudio.cl.show(JanelaExecucao, "fndProcessamentoPanel");
    }//GEN-LAST:event_FND_LabelProcessarAutomatoMouseClicked

    private void FND_TextFieldEstadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FND_TextFieldEstadosKeyReleased
        String[] estados = FND_TextFieldEstados.getText().split(",");
        String[] alfabeto = FND_TextFieldAlfabeto.getText().split(",");
        Vector<String> vector = null;
        CustomTable tableModel = new CustomTable();
        tableModel.addColumn("Estados");
        for (String rowName : estados) {
            vector = new Vector<String>();
            vector.add(rowName);
            tableModel.insertRow(0, vector);
        }
        for (String columnName : alfabeto) {
            tableModel.addColumn(columnName);
        }
        FND_jTable1.setModel(tableModel);
    }//GEN-LAST:event_FND_TextFieldEstadosKeyReleased

    private void FND_SalvarAutomatojlblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FND_SalvarAutomatojlblMouseEntered
        FND_SalvarAutomatojlbl.setBackground(FND_SalvarAutomatojlbl.getBackground().brighter().brighter());
    }//GEN-LAST:event_FND_SalvarAutomatojlblMouseEntered

    private void FND_SalvarAutomatojlblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FND_SalvarAutomatojlblMouseExited
        FND_SalvarAutomatojlbl.setBackground(FND_SalvarAutomatojlbl.getBackground().darker().darker());
    }//GEN-LAST:event_FND_SalvarAutomatojlblMouseExited

    private void FND_LabelProcessarAutomatoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FND_LabelProcessarAutomatoMouseEntered
        FND_LabelProcessarAutomato.setBackground(FND_LabelProcessarAutomato.getBackground().brighter().brighter());
    }//GEN-LAST:event_FND_LabelProcessarAutomatoMouseEntered

    private void FND_LabelProcessarAutomatoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FND_LabelProcessarAutomatoMouseExited
        FND_LabelProcessarAutomato.setBackground(FND_LabelProcessarAutomato.getBackground().darker().darker());
    }//GEN-LAST:event_FND_LabelProcessarAutomatoMouseExited

    private void FND_TextFieldAlfabetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FND_TextFieldAlfabetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FND_TextFieldAlfabetoActionPerformed

    private void FND_TextFieldEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FND_TextFieldEstadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FND_TextFieldEstadosActionPerformed

    private void FND_TextFieldEstadosFinaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FND_TextFieldEstadosFinaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FND_TextFieldEstadosFinaisActionPerformed

    /**
     * @author Michel Silva Construtor com conversão de matriz int para char
     * para um automato nao deterministico com transição espontanea
     * @param aceitacao | char[]
     * @param estadoInicial | char
     * @param transicao | char [][][]
     * @param alfabeto | String
     */
    private NaoDeterministico gerarAutomato() {
        // mandar direto
        String alfabetoInserido = FND_TextFieldAlfabeto.getText();
        StringBuilder alfabetoFormatado = new StringBuilder();

        String estadoInicial = FND_TextFieldEstadoInicial.getText();

        String estados = FND_TextFieldEstados.getText();
        String estadosFinais = FND_TextFieldEstadosFinais.getText();

        // Parte da tabela de transição
        String teste[][] = new String[FND_jTable1.getRowCount()][FND_jTable1.getColumnCount()];

        /// pos0 = string abc
        Map<Integer, String> mapaTransicao = new HashMap<>();
        Map<String, Integer> mapaTransInverso = new HashMap<>();

        Map<Integer, String> mapaTransicaoAlfabeto = new HashMap<>();
        Map<String, Integer> mapaTransInversoAlfabeto = new HashMap<>();

        for (int i = 0; i < FND_jTable1.getRowCount(); i++) {
            mapaTransicao.put(i, (String) FND_jTable1.getValueAt(i, 0));
            mapaTransInverso.put((String) FND_jTable1.getValueAt(i, 0), i);
            for (int j = 1; j < FND_jTable1.getColumnCount(); j++) {
                teste[i][j] = (String) FND_jTable1.getValueAt(i, j);
            }
        }

        // Parte estado inicial
        int chaveEstado = mapaTransInverso.get(estadoInicial);

        // Parte de estados finais
        int chaveEstadosFinais[] = new int[estadosFinais.split(",").length];

        String[] comparaEstadosFinais = estadosFinais.split(",");

        int contaEstadosFinais = 0;

        while (contaEstadosFinais < chaveEstadosFinais.length) {
            chaveEstadosFinais[contaEstadosFinais] = mapaTransInverso.get(comparaEstadosFinais[contaEstadosFinais]);
            contaEstadosFinais++;
        }

        int[][][] matrizConversao = new int[FND_jTable1.getRowCount()][FND_jTable1.getColumnCount() - 1][];
        for (int i = 0; i < FND_jTable1.getRowCount(); i++) {
            for (int j = 0; j < FND_jTable1.getColumnCount() - 1; j++) {
                if (teste[i][j + 1] != null) {
                    matrizConversao[i][j] = new int[teste[i][j + 1].split(",").length];
                } else {
                    matrizConversao[i][j] = new int[0];
                }
                for (int k = 0; k < matrizConversao[i][j].length; k++) {
                    matrizConversao[i][j][k] = mapaTransInverso.get(teste[i][j + 1].split(",")[k]);
                }
            }
        }
        
        for (int i = 0; i < alfabetoInserido.split(",").length; i++) {
            mapaTransicaoAlfabeto.put(i, (String) alfabetoInserido.split(",")[i]);
            mapaTransInversoAlfabeto.put((String) alfabetoInserido.split(",")[i], i);
            alfabetoFormatado.append(String.valueOf(i));
        }
        
        AFND_Injection.setMapAlfabeto((HashMap<Integer, String>) mapaTransicaoAlfabeto);
        AFND_Injection.setMapAlfabetoInverso((HashMap<String, Integer>) mapaTransInversoAlfabeto);
        
        NaoDeterministico automato = new NaoDeterministico(chaveEstadosFinais, chaveEstado, matrizConversao, alfabetoFormatado.toString());
        AFND_Injection.setMap((HashMap) mapaTransicao);
        AFND_Injection.setAutomato(chaveEstadosFinais, chaveEstado, matrizConversao, alfabetoFormatado.toString());
        return automato;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FND_BodyConfig;
    private javax.swing.JLabel FND_LabelAlfabeto;
    private javax.swing.JLabel FND_LabelEstadoInicial;
    private javax.swing.JLabel FND_LabelEstados;
    private javax.swing.JLabel FND_LabelEstadosFinais;
    private javax.swing.JLabel FND_LabelProcessarAutomato;
    private javax.swing.JLabel FND_LabelTabelaTransicao;
    private javax.swing.JLabel FND_SalvarAutomatojlbl;
    private javax.swing.JLabel FND_SubTitulo;
    private javax.swing.JTextField FND_TextFieldAlfabeto;
    private javax.swing.JTextField FND_TextFieldEstadoInicial;
    private javax.swing.JTextField FND_TextFieldEstados;
    private javax.swing.JTextField FND_TextFieldEstadosFinais;
    private javax.swing.JLabel FND_Titulo;
    private javax.swing.JScrollPane FND_jScrollPane2;
    private javax.swing.JTable FND_jTable1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
