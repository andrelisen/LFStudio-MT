/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modulos.MaquinaTuring.screens;

import java.io.BufferedReader;
import main.modulos.MaquinaTuring.controllers.TuringController;
import main.LFStudio;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import view.TelaConfiguracao;
import view.TelaExecucao;


/**
 *
 * @author andrelise
 * @author thiagoleal
 */

public class TuringConfigPanel extends javax.swing.JPanel {
    javax.swing.JPanel JanelaExecucao;
    public DefaultTableModel model1;
    public File pathFile;
    public static String pathToFile;
    public static boolean config=false;
    
    public TuringConfigPanel( javax.swing.JPanel janela) {
        JanelaExecucao = janela;
        initComponents();
        model1 = (DefaultTableModel) tabelaTrans.getModel();
        //torna icones de erros invisíveis
        //MaquinaTuringImport();
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Pilha_BodyConfig1 = new javax.swing.JPanel();
        t_tra1 = new javax.swing.JLabel();
        t_ea1 = new javax.swing.JLabel();
        t_ei1 = new javax.swing.JLabel();
        t_ap1 = new javax.swing.JLabel();
        t_a1 = new javax.swing.JLabel();
        turing_btn_minus = new javax.swing.JButton();
        turing_btn_plus = new javax.swing.JButton();
        alfabeto = new javax.swing.JTextField();
        estadoInicial = new javax.swing.JTextField();
        estadoFinal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaTrans = new javax.swing.JTable();
        conjEstados = new javax.swing.JTextField();
        erroConjFinais = new javax.swing.JLabel();
        erroAlfabeto = new javax.swing.JLabel();
        erroEInicial = new javax.swing.JLabel();
        erroEFinal = new javax.swing.JLabel();
        erroFuncTrans = new javax.swing.JLabel();
        Pilha_tituloPilha = new javax.swing.JLabel();
        Turing_salvarBtn = new javax.swing.JLabel();
        Pilha_subTitulo = new javax.swing.JLabel();
        Pilha_ConfigTitulo1 = new javax.swing.JLabel();
        Turing_processarBtn = new javax.swing.JLabel();

        setBackground(new java.awt.Color(28, 28, 28));
        setPreferredSize(new java.awt.Dimension(574, 646));

        jPanel1.setBackground(new java.awt.Color(28, 28, 28));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(574, 646));
        jPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jPanel1AncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                jPanel1AncestorRemoved(evt);
            }
        });
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });

        Pilha_BodyConfig1.setBackground(new java.awt.Color(28, 28, 28));
        Pilha_BodyConfig1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        Pilha_BodyConfig1.setForeground(new java.awt.Color(51, 51, 51));

        t_tra1.setBackground(new java.awt.Color(51, 51, 51));
        t_tra1.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 20)); // NOI18N
        t_tra1.setForeground(new java.awt.Color(255, 255, 255));
        t_tra1.setText("Funções de transições");

        t_ea1.setBackground(new java.awt.Color(51, 51, 51));
        t_ea1.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 20)); // NOI18N
        t_ea1.setForeground(new java.awt.Color(255, 255, 255));
        t_ea1.setText("Estado Inicial");

        t_ei1.setBackground(new java.awt.Color(51, 51, 51));
        t_ei1.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 20)); // NOI18N
        t_ei1.setForeground(new java.awt.Color(255, 255, 255));
        t_ei1.setText("Estado Final");

        t_ap1.setBackground(new java.awt.Color(51, 51, 51));
        t_ap1.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 20)); // NOI18N
        t_ap1.setForeground(new java.awt.Color(255, 255, 255));
        t_ap1.setText("Alfabeto");

        t_a1.setBackground(new java.awt.Color(51, 51, 51));
        t_a1.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 20)); // NOI18N
        t_a1.setForeground(new java.awt.Color(255, 255, 255));
        t_a1.setText("Estados");

        turing_btn_minus.setText("-");
        turing_btn_minus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                turing_btn_minusMouseClicked(evt);
            }
        });

        turing_btn_plus.setText("+");
        turing_btn_plus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                turing_btn_plusMouseClicked(evt);
            }
        });

        alfabeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alfabetoActionPerformed(evt);
            }
        });

        estadoInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoInicialActionPerformed(evt);
            }
        });

        estadoFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoFinalActionPerformed(evt);
            }
        });

        tabelaTrans.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        tabelaTrans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Estado atual", "Símbolo lido", "Símbolo escrito", "Novo estado", "Movimento"
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

        conjEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conjEstadosActionPerformed(evt);
            }
        });

        erroConjFinais.setFont(new java.awt.Font("Open Sans Condensed", 0, 18)); // NOI18N
        erroConjFinais.setForeground(new java.awt.Color(255, 0, 0));
        erroConjFinais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/erroY.png"))); // NOI18N
        erroConjFinais.setDisabledIcon(null);

        erroAlfabeto.setFont(new java.awt.Font("Open Sans Condensed", 0, 18)); // NOI18N
        erroAlfabeto.setForeground(new java.awt.Color(255, 0, 0));
        erroAlfabeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/erroY.png"))); // NOI18N

        erroEInicial.setFont(new java.awt.Font("Open Sans Condensed", 0, 18)); // NOI18N
        erroEInicial.setForeground(new java.awt.Color(255, 0, 0));
        erroEInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/erroY.png"))); // NOI18N

        erroEFinal.setFont(new java.awt.Font("Open Sans Condensed", 0, 18)); // NOI18N
        erroEFinal.setForeground(new java.awt.Color(255, 0, 0));
        erroEFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/erroY.png"))); // NOI18N

        erroFuncTrans.setFont(new java.awt.Font("Open Sans Condensed", 0, 18)); // NOI18N
        erroFuncTrans.setForeground(new java.awt.Color(255, 0, 0));
        erroFuncTrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/erroY.png"))); // NOI18N

        javax.swing.GroupLayout Pilha_BodyConfig1Layout = new javax.swing.GroupLayout(Pilha_BodyConfig1);
        Pilha_BodyConfig1.setLayout(Pilha_BodyConfig1Layout);
        Pilha_BodyConfig1Layout.setHorizontalGroup(
            Pilha_BodyConfig1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pilha_BodyConfig1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pilha_BodyConfig1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pilha_BodyConfig1Layout.createSequentialGroup()
                        .addGroup(Pilha_BodyConfig1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Pilha_BodyConfig1Layout.createSequentialGroup()
                                .addGroup(Pilha_BodyConfig1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Pilha_BodyConfig1Layout.createSequentialGroup()
                                        .addComponent(t_a1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18))
                                    .addGroup(Pilha_BodyConfig1Layout.createSequentialGroup()
                                        .addGroup(Pilha_BodyConfig1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(t_ea1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(t_ap1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(Pilha_BodyConfig1Layout.createSequentialGroup()
                                        .addComponent(t_ei1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(Pilha_BodyConfig1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(erroEFinal, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(erroEInicial, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(erroAlfabeto, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(erroConjFinais, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(t_tra1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Pilha_BodyConfig1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pilha_BodyConfig1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(estadoInicial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(alfabeto, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(conjEstados, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(estadoFinal))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pilha_BodyConfig1Layout.createSequentialGroup()
                                .addComponent(erroFuncTrans)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(turing_btn_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(turing_btn_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        Pilha_BodyConfig1Layout.setVerticalGroup(
            Pilha_BodyConfig1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pilha_BodyConfig1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pilha_BodyConfig1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Pilha_BodyConfig1Layout.createSequentialGroup()
                        .addGroup(Pilha_BodyConfig1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Pilha_BodyConfig1Layout.createSequentialGroup()
                                .addGroup(Pilha_BodyConfig1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(Pilha_BodyConfig1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(t_a1)
                                        .addComponent(conjEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(erroConjFinais))
                                .addGap(10, 10, 10)
                                .addGroup(Pilha_BodyConfig1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(t_ap1)
                                    .addComponent(alfabeto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(erroAlfabeto))
                        .addGap(10, 10, 10)
                        .addGroup(Pilha_BodyConfig1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_ea1)
                            .addComponent(estadoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(erroEInicial))
                .addGap(10, 10, 10)
                .addGroup(Pilha_BodyConfig1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Pilha_BodyConfig1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(t_ei1)
                        .addComponent(estadoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(erroEFinal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pilha_BodyConfig1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pilha_BodyConfig1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(Pilha_BodyConfig1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(turing_btn_minus)
                            .addComponent(turing_btn_plus))
                        .addComponent(erroFuncTrans))
                    .addComponent(t_tra1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addContainerGap())
        );

        Pilha_tituloPilha.setBackground(new java.awt.Color(70, 71, 74));
        Pilha_tituloPilha.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        Pilha_tituloPilha.setForeground(new java.awt.Color(255, 255, 255));

        Turing_salvarBtn.setBackground(new java.awt.Color(51, 51, 51));
        Turing_salvarBtn.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 22)); // NOI18N
        Turing_salvarBtn.setForeground(new java.awt.Color(255, 255, 255));
        Turing_salvarBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Turing_salvarBtn.setText("Salvar Máquina");
        Turing_salvarBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Turing_salvarBtn.setOpaque(true);
        Turing_salvarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Turing_salvarBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Turing_salvarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Turing_salvarBtnMouseExited(evt);
            }
        });

        Pilha_subTitulo.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 22)); // NOI18N
        Pilha_subTitulo.setForeground(new java.awt.Color(255, 255, 255));
        Pilha_subTitulo.setText("                  Configuração");

        Pilha_ConfigTitulo1.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 36)); // NOI18N
        Pilha_ConfigTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        Pilha_ConfigTitulo1.setText("<html><p style=\"padding-bottom: 16px;\">Máquina de Turing</p></html>");
        Pilha_ConfigTitulo1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        Turing_processarBtn.setBackground(new java.awt.Color(51, 51, 51));
        Turing_processarBtn.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 22)); // NOI18N
        Turing_processarBtn.setForeground(new java.awt.Color(255, 255, 255));
        Turing_processarBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Turing_processarBtn.setText("Processar Máquina");
        Turing_processarBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Turing_processarBtn.setOpaque(true);
        Turing_processarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Turing_processarBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Turing_processarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Turing_processarBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Pilha_tituloPilha)
                                    .addComponent(Pilha_BodyConfig1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Pilha_subTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(15, 15, 15))
                            .addComponent(Turing_salvarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Turing_processarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(Pilha_ConfigTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Pilha_ConfigTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Pilha_tituloPilha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pilha_subTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pilha_BodyConfig1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Turing_salvarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Turing_processarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    private void MaquinaTuringImport(){
        ArrayList<String> linha = new ArrayList<>();
        try {
			FileReader file = new FileReader(pathToFile);
			BufferedReader br = new BufferedReader(file);
			while (br.ready()) {
				linha.add(br.readLine());
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        estadoInicial.setText(linha.get(0));
        estadoFinal.setText(linha.get(1));
        conjEstados.setText(linha.get(4));
        alfabeto.setText(linha.get(5));
         model1.removeRow(0);
        for (int i = 7; i < linha.size(); i++) {
            String row[] = linha.get(i).split(",");
           
            model1.addRow(new Object[]{
                row[0],
                row[1],
                row[2],
                row[3],
                row[4]
            });
        }
    }
    private void Turing_salvarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Turing_salvarBtnMouseExited
        Turing_salvarBtn.setBackground(Turing_salvarBtn.getBackground().darker().darker());
    }//GEN-LAST:event_Turing_salvarBtnMouseExited

    private void Turing_salvarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Turing_salvarBtnMouseEntered
        Turing_salvarBtn.setBackground(Turing_salvarBtn.getBackground().brighter().brighter());
    }//GEN-LAST:event_Turing_salvarBtnMouseEntered

    private void Turing_salvarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Turing_salvarBtnMouseClicked
        JFrame parentFrame = new JFrame();
        JFileChooser fileChooser = new JFileChooser();
        
        String conjuntoEstados = conjEstados.getText();
        String simbAlfabeto = alfabeto.getText();
        String eInicial = estadoInicial.getText();
        String eFinal = estadoFinal.getText();
        int tamTable = tabelaTrans.getRowCount();

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

            fileChooser.setDialogTitle("Specify a file to save");   

            int userSelection = fileChooser.showSaveDialog(parentFrame);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                pathFile=fileChooser.getSelectedFile();
               // System.out.println("Save as file: " + fileToSave.getAbsolutePath());
            }

            FileWriter arq;
            try {
                arq = new FileWriter(pathFile, true);
                PrintWriter gravarArq = new PrintWriter(arq);

                //System.out.println(estadoInicial.getText());
                //System.out.println(estadoFinal.getText());
                gravarArq.print(estadoInicial.getText() + "\n");
                gravarArq.print(estadoFinal.getText());
                gravarArq.print("\n_\n%\n");
                gravarArq.print(conjEstados.getText() + "\n");
                gravarArq.print(alfabeto.getText()+ "\n"+ "\n");

                for (int i = 0; i < model1.getRowCount(); i++) {
                    for (int j = 0; j < model1.getColumnCount(); j++) {
                        gravarArq.print(model1.getValueAt(i, j).toString() + ",");
                    }
                    gravarArq.print("\n");
                }
                arq.close();
            } catch (IOException ex) {
                Logger.getLogger(TelaConfiguracao.class.getName()).log(Level.SEVERE, null, ex);
            }        // TODO add your handling code here:
        }
    }//GEN-LAST:event_Turing_salvarBtnMouseClicked

    private void Turing_processarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Turing_processarBtnMouseExited
        Turing_processarBtn.setBackground(Turing_processarBtn.getBackground().darker().darker());
    }//GEN-LAST:event_Turing_processarBtnMouseExited

    private void Turing_processarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Turing_processarBtnMouseEntered
        Turing_processarBtn.setBackground(Turing_processarBtn.getBackground().brighter().brighter());
    }//GEN-LAST:event_Turing_processarBtnMouseEntered

    private void Turing_processarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Turing_processarBtnMouseClicked
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
            // TODO add your handling code here:
        JFrame parentFrame = new JFrame();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");   

        int userSelection = fileChooser.showSaveDialog(parentFrame);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            pathFile=fileChooser.getSelectedFile();
           // System.out.println("Save as file: " + fileToSave.getAbsolutePath());
        }
        
        FileWriter arq;
        try {
            arq = new FileWriter(pathFile, true);
            PrintWriter gravarArq = new PrintWriter(arq);
            
            //System.out.println(estadoInicial.getText());
            //System.out.println(estadoFinal.getText());
            
            gravarArq.print(estadoInicial.getText() + "\n");
            gravarArq.print(estadoFinal.getText());
            gravarArq.print("\n_\n%\n");
                gravarArq.print(conjEstados.getText() + "\n");
                gravarArq.print(alfabeto.getText()+ "\n"+ "\n");
            
            for(int i=0; i < model1.getRowCount(); i++){
                for(int j=0; j < model1.getColumnCount(); j++){
                    gravarArq.print(model1.getValueAt(i, j).toString() + ",");
                }
                gravarArq.print("\n");
            }
            arq.close();
        } catch (IOException ex) {
            Logger.getLogger(TelaConfiguracao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        TuringProcessamentoPanel.pathFile = pathFile.toString();
        LFStudio.cl.show(JanelaExecucao, "turingProcessamentoPanel");
        
        }
      
    }//GEN-LAST:event_Turing_processarBtnMouseClicked

    private void conjEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conjEstadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conjEstadosActionPerformed

    private void estadoFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoFinalActionPerformed

    private void estadoInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoInicialActionPerformed

    private void alfabetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alfabetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alfabetoActionPerformed

    private void turing_btn_plusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turing_btn_plusMouseClicked
        model1.addRow(new Object[]{});
    }//GEN-LAST:event_turing_btn_plusMouseClicked

    private void turing_btn_minusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turing_btn_minusMouseClicked
        if (model1.getRowCount() - 1 > 0) {
            model1.removeRow(model1.getRowCount() - 1);
        }
    }//GEN-LAST:event_turing_btn_minusMouseClicked

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained

    }//GEN-LAST:event_jPanel1FocusGained

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown

    }//GEN-LAST:event_jPanel1ComponentShown

    private void jPanel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel1AncestorAdded
       if(config==true){
           MaquinaTuringImport();
       }
    }//GEN-LAST:event_jPanel1AncestorAdded

    private void jPanel1AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel1AncestorMoved

    }//GEN-LAST:event_jPanel1AncestorMoved

    private void jPanel1AncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel1AncestorRemoved

    }//GEN-LAST:event_jPanel1AncestorRemoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pilha_BodyConfig1;
    private javax.swing.JLabel Pilha_ConfigTitulo1;
    private javax.swing.JLabel Pilha_subTitulo;
    private javax.swing.JLabel Pilha_tituloPilha;
    private javax.swing.JLabel Turing_processarBtn;
    private javax.swing.JLabel Turing_salvarBtn;
    private javax.swing.JTextField alfabeto;
    private javax.swing.JTextField conjEstados;
    private javax.swing.JLabel erroAlfabeto;
    private javax.swing.JLabel erroConjFinais;
    private javax.swing.JLabel erroEFinal;
    private javax.swing.JLabel erroEInicial;
    private javax.swing.JLabel erroFuncTrans;
    private javax.swing.JTextField estadoFinal;
    private javax.swing.JTextField estadoInicial;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel t_a1;
    private javax.swing.JLabel t_ap1;
    private javax.swing.JLabel t_ea1;
    private javax.swing.JLabel t_ei1;
    private javax.swing.JLabel t_tra1;
    private javax.swing.JTable tabelaTrans;
    private javax.swing.JButton turing_btn_minus;
    private javax.swing.JButton turing_btn_plus;
    // End of variables declaration//GEN-END:variables
}
