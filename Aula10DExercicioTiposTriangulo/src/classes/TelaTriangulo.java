/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Deyvison Moraes
 */
public class TelaTriangulo extends javax.swing.JFrame {

    /**
     * Creates new form telaTriangulo
     */
    public TelaTriangulo() { // MÉTODO CONSTRUTOR DA CLASSE
        initComponents();
        painelResultado.setVisible(false); // PARA ESCONDER O PAINEL
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sliderA = new javax.swing.JSlider();
        sliderB = new javax.swing.JSlider();
        sliderC = new javax.swing.JSlider();
        lblA = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        btnVerificar = new javax.swing.JButton();
        painelResultado = new javax.swing.JPanel();
        lblForma = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seguimento A");

        jLabel2.setText("Seguimento B");

        jLabel3.setText("Seguimento C");

        sliderA.setMaximum(20);
        sliderA.setValue(0);
        sliderA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderAStateChanged(evt);
            }
        });

        sliderB.setMaximum(20);
        sliderB.setValue(0);
        sliderB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderBStateChanged(evt);
            }
        });

        sliderC.setMaximum(20);
        sliderC.setValue(0);
        sliderC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderCStateChanged(evt);
            }
        });

        lblA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblA.setForeground(new java.awt.Color(102, 102, 102));
        lblA.setText("0");

        lblB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblB.setForeground(new java.awt.Color(102, 102, 102));
        lblB.setText("0");

        lblC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblC.setForeground(new java.awt.Color(102, 102, 102));
        lblC.setText("0");

        btnVerificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVerificar.setForeground(new java.awt.Color(0, 0, 255));
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        lblForma.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblForma.setForeground(new java.awt.Color(102, 102, 255));
        lblForma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblForma.setText("Forma ou não?");

        lblTipo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(255, 102, 102));
        lblTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipo.setText("Tipo de Triângulo");

        javax.swing.GroupLayout painelResultadoLayout = new javax.swing.GroupLayout(painelResultado);
        painelResultado.setLayout(painelResultadoLayout);
        painelResultadoLayout.setHorizontalGroup(
            painelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblForma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelResultadoLayout.setVerticalGroup(
            painelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelResultadoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblForma)
                .addGap(46, 46, 46)
                .addComponent(lblTipo)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/equilatero.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(sliderA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(lblA))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(sliderB, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(sliderC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblB)
                            .addComponent(lblC, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnVerificar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(lblA)
                            .addComponent(sliderA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(lblB, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(sliderB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblC))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sliderC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addGap(18, 18, 18)
                        .addComponent(btnVerificar)
                        .addGap(18, 18, 18)
                        .addComponent(painelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        // TODO add your handling code here:

        // PARA PEGAR OS VALORES DE CADA SLIDE
        int numeroA = sliderA.getValue();
        int numeroB = sliderB.getValue();
        int numeroC = sliderC.getValue();

        /*
        // MEU CÓDIGO
        if (numeroA < numeroB + numeroC && numeroB < numeroA + numeroC && numeroC < numeroA + numeroB ) {
            //  PARA MUDAR O STATUS DO LABEL = "lblForma"
            lblForma.setText("FORMAM TRIÂNGULO");
            if (numeroA == numeroB && numeroB == numeroC) {
                lblTipo.setText("EQUILÁTERO");
            }
            else if (numeroA == numeroB && numeroB != numeroC) {
                lblTipo.setText("ISÓSCELES");
            }
            else if (numeroA != numeroB && numeroB != numeroC && numeroA != numeroC) {
                lblTipo.setText("ESCALENO");
            }
        }
        else {
            lblForma.setText("NÃO FORMAM TRIÂNGULO");
            lblTipo.setText("---------------------");
        }*/
        // CÓDIGO PROFESSOR GUANABARA
        if (numeroA < numeroB + numeroC && numeroB < numeroA + numeroC && numeroC < numeroA + numeroB) {
            lblForma.setText("FORMAM TRIÂNGULO");
            if (numeroA == numeroB && numeroB == numeroC) {
                lblTipo.setText("Equilátero");
            } else if (numeroA != numeroB && numeroB != numeroC && numeroA != numeroC) {
                lblTipo.setText("Escaleno");
            } else {
                lblTipo.setText("Isósceles");
            }
        } else {
            lblForma.setText("NÃO FORMAM TRIÂNGULO");
            lblTipo.setText("---------------------");
        }

        // MOSTRA O PAINEL AO CLICAR NO BOTÃO "VERIFICAR"
        painelResultado.setVisible(true);
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void sliderAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderAStateChanged
        // TODO add your handling code here:
        // FAZ COM QUE A LABEL = "lblA" RECEBER O VALOR QUE ESTÁ DENTRO DO SLIDE = "sliderA"
        // JÁ FAZENDO A CONVERSÃO DE TIPOS, NESSE CASO DE Intger PARA String
        lblA.setText(Integer.toString(sliderA.getValue()));
    }//GEN-LAST:event_sliderAStateChanged

    private void sliderBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderBStateChanged
        // TODO add your handling code here:
        // FAZ COM QUE A LABEL = "lblB" RECEBER O VALOR QUE ESTÁ DENTRO DO SLIDE = "sliderB"
        // JÁ FAZENDO A CONVERSÃO DE TIPOS, NESSE CASO DE Intger PARA String
        lblB.setText(Integer.toString(sliderB.getValue()));
    }//GEN-LAST:event_sliderBStateChanged

    private void sliderCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderCStateChanged
        // TODO add your handling code here:
        // FAZ COM QUE A LABEL = "lblC" RECEBER O VALOR QUE ESTÁ DENTRO DO SLIDE = "sliderC"
        // JÁ FAZENDO A CONVERSÃO DE TIPOS, NESSE CASO DE Intger PARA String
        lblC.setText(Integer.toString(sliderC.getValue()));
    }//GEN-LAST:event_sliderCStateChanged

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
            java.util.logging.Logger.getLogger(TelaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTriangulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblForma;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel painelResultado;
    private javax.swing.JSlider sliderA;
    private javax.swing.JSlider sliderB;
    private javax.swing.JSlider sliderC;
    // End of variables declaration//GEN-END:variables
}
