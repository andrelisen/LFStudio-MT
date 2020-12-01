/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import maquina_turing.Reconhecer;

/**
 *
 * @author andrelise
 */
public class TelaExecucao extends javax.swing.JFrame {
    
    public DefaultTableModel model1;
    public int indexPassoApasso= 0;
    public String pathFile;
    /**
     * Creates new form TelaExecucao
     */
    public TelaExecucao(String pathFile) {
        initComponents();
        this.pathFile = pathFile;
        setLocationRelativeTo(null); 
    }

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
        inputPalavra = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaExec = new javax.swing.JTable();
        carregaEntrada = new javax.swing.JToggleButton();
        jLabel13 = new javax.swing.JLabel();
        executar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 700));
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
        jLabel1.setForeground(new java.awt.Color(193, 193, 193));
        jLabel1.setText("EXECUÇÃO DA MÁQUINA DE TURING");

        jLabel11.setFont(new java.awt.Font("Open Sans Condensed Light", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(193, 193, 193));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Entrada");

        tabelaExec.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaExec.setAutoscrolls(false);
        tabelaExec.setEditingRow(1);
        jScrollPane1.setViewportView(tabelaExec);

        carregaEntrada.setText("CARREGAR ENTRADA");
        carregaEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carregaEntradaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Open Sans Condensed Light", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(193, 193, 193));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Palavra");

        executar.setText("EXECUÇÃO PASSO A PASSO");
        executar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout telaInternaPrincLayout = new javax.swing.GroupLayout(telaInternaPrinc);
        telaInternaPrinc.setLayout(telaInternaPrincLayout);
        telaInternaPrincLayout.setHorizontalGroup(
            telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaInternaPrincLayout.createSequentialGroup()
                .addGroup(telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaInternaPrincLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(telaInternaPrincLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(carregaEntrada)
                                .addComponent(inputPalavra)
                                .addComponent(jScrollPane1))
                            .addComponent(executar)))
                    .addGroup(telaInternaPrincLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnVoltar)
                        .addGap(296, 296, 296)
                        .addComponent(jLabel1)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        telaInternaPrincLayout.setVerticalGroup(
            telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaInternaPrincLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltar)
                    .addComponent(jLabel1))
                .addGap(55, 55, 55)
                .addGroup(telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(carregaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(telaInternaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaInternaPrincLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaInternaPrincLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(executar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(telaInternaPrinc, javax.swing.GroupLayout.PREFERRED_SIZE, 1340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(telaInternaPrinc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        new TelaConfiguracao().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void carregaEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carregaEntradaActionPerformed
     boolean leitura=false,initPassoAPAsso=false;
        Reconhecer maquinadeTuring = new Reconhecer();
        ArrayList<String> config = new ArrayList<>();
        
        String palavra = inputPalavra.getText();
        
        if(initPassoAPAsso == false){
            leitura = maquinadeTuring.reconhecer(palavra, config,pathFile);
            initPassoAPAsso=true;
        }
        
        if (leitura == true) {
            System.out.println("Palavra reconhecida");
        } else {
            System.out.println("Palavra não reconhecida");
        }
        
        model1 = (DefaultTableModel) tabelaExec.getModel();

        for (int i = 0; i < config.size(); i++) {
            String row[] = config.get(i).split(",");
            model1.addRow(new Object[]{
                row[0],
                row[1],
                row[4],
                row[2],
                row[3],
            });
        }
      
    }//GEN-LAST:event_carregaEntradaActionPerformed

    private void executarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executarActionPerformed
         boolean leitura;
        Reconhecer maquinadeTuring = new Reconhecer();
        ArrayList<String> config = new ArrayList<>();
         
        String palavra = inputPalavra.getText();
        
        leitura = maquinadeTuring.reconhecer(palavra, config,pathFile);
        
        if (leitura == true) {
            System.out.println("Palavra reconhecida");
        } else {
            System.out.println("Palavra não reconhecida");
        }
        
        model1 = (DefaultTableModel) tabelaExec.getModel();
        if(indexPassoApasso < config.size()){
            String row[] = config.get(indexPassoApasso).split(",");
            model1.addRow(new Object[]{
                row[0],
                row[1],
                row[4],
                row[2],
                row[3],
            });
            indexPassoApasso++;
        }
        else{
            JOptionPane.showMessageDialog (null, "Máquina Terminou a computação", "Fim execução", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_executarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaExecucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaExecucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaExecucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaExecucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TelaExecucao(pathFile).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JToggleButton carregaEntrada;
    private javax.swing.JToggleButton executar;
    private javax.swing.JTextField inputPalavra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTable tabelaExec;
    private javax.swing.JPanel telaInternaPrinc;
    // End of variables declaration//GEN-END:variables
}
