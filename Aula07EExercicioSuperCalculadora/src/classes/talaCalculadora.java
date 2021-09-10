/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Usuario
 */
public class talaCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form talaCalculadora
     */
    public talaCalculadora() { // CONSTRUTOR, É UM MÉTODO COM O MESMO NOME DA CLASSE
        initComponents();
        painelCalculo.setVisible(false);
        
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
        txtNumero = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        painelCalculo = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblResto = new javax.swing.JLabel();
        lblCubo = new javax.swing.JLabel();
        lblQuadrada = new javax.swing.JLabel();
        lblCubica = new javax.swing.JLabel();
        lblAbsoluto = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Informe um Valor:");

        txtNumero.setModel(new javax.swing.SpinnerNumberModel(1, -50, 50, 1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calculadora2.jpg"))); // NOI18N

        jLabel12.setText("Resto da Divisão por 2");

        jLabel14.setText("Elevado ao Cubo");

        jLabel15.setText("Raiz Quadrada");

        jLabel16.setText("Raiz Cúbica");

        jLabel17.setText("Valor Absoluto");

        lblResto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblResto.setForeground(new java.awt.Color(0, 0, 255));
        lblResto.setText("0");

        lblCubo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCubo.setForeground(new java.awt.Color(0, 0, 255));
        lblCubo.setText("0");

        lblQuadrada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblQuadrada.setForeground(new java.awt.Color(0, 0, 255));
        lblQuadrada.setText("0");

        lblCubica.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCubica.setForeground(new java.awt.Color(0, 0, 255));
        lblCubica.setText("0");

        lblAbsoluto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAbsoluto.setForeground(new java.awt.Color(0, 0, 255));
        lblAbsoluto.setText("0");

        javax.swing.GroupLayout painelCalculoLayout = new javax.swing.GroupLayout(painelCalculo);
        painelCalculo.setLayout(painelCalculoLayout);
        painelCalculoLayout.setHorizontalGroup(
            painelCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCalculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCalculoLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                        .addComponent(lblResto))
                    .addGroup(painelCalculoLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAbsoluto))
                    .addGroup(painelCalculoLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCubo))
                    .addGroup(painelCalculoLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblQuadrada))
                    .addGroup(painelCalculoLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCubica)))
                .addContainerGap())
        );
        painelCalculoLayout.setVerticalGroup(
            painelCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCalculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lblResto))
                .addGap(18, 18, 18)
                .addGroup(painelCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(lblCubo))
                .addGap(18, 18, 18)
                .addGroup(painelCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lblQuadrada))
                .addGap(18, 18, 18)
                .addGroup(painelCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lblCubica))
                .addGap(18, 18, 18)
                .addGroup(painelCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lblAbsoluto))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnCalcular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon.png"))); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addComponent(painelCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(btnCalcular)
                        .addGap(18, 18, 18)
                        .addComponent(painelCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        int numero = Integer.parseInt(txtNumero.getValue().toString());
        
        // CALCULAR O RESTO DA DIVISÃO POR 2
        int resto = numero % 2;
        lblResto.setText(Integer.toString(resto));
        
        
        // CALCULAR A ELEVAÇÃO AO CUBO 3
        double cubo = Math.pow(numero, 3);
        lblCubo.setText(Double.toString(cubo));
        
        // CALCULAR A RAIZ QUADRADA MEU CÓDIGO
        /*double quadrada = Math.sqrt(numero);
        lblQuadrada.setText(Double.toString(quadrada));*/
        
        // CÓDIGO PROFESSOR GUANABARA
        double quadrada = Math.sqrt(numero);
        lblQuadrada.setText(String.format("%.2f", quadrada));
        
        // CALCULAR A RAIZ CÚBICA MEU CÓDIGO
        /*double cubica = Math.cbrt(numero);
        lblCubica.setText(Double.toString(cubica));*/
        
        // CÓDIGO PROFESSOR GUANABARA
        double cubica = Math.cbrt(numero);
        lblCubica.setText(String.format("%.2f", cubica));
        
        // CALCULAR O VALOR ABSOLUTO MEU CÓDIGO
        /*float absoluto = Math.abs(numero);
        lblAbsoluto.setText(Float.toString(absoluto));*/
        
        // CÓDIGO PROFESSOR GUANABARA
        int absoluto = Math.abs(numero);
        lblAbsoluto.setText(Integer.toString(absoluto));
        
        // MOSTRAR O PAINEL AO CLICAR NO BOTÃO "CALCULAR"
        painelCalculo.setVisible(true);
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(talaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(talaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(talaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(talaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new talaCalculadora().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAbsoluto;
    private javax.swing.JLabel lblCubica;
    private javax.swing.JLabel lblCubo;
    private javax.swing.JLabel lblQuadrada;
    private javax.swing.JLabel lblResto;
    private javax.swing.JPanel painelCalculo;
    private javax.swing.JSpinner txtNumero;
    // End of variables declaration//GEN-END:variables
}
