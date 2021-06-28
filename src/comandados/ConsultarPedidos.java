/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comandados;

import javax.swing.JOptionPane;
import model.Comanda;

/**
 *
 * @author gabri
 */
public class ConsultarPedidos extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarPedidos
     */
    public ConsultarPedidos() {
        initComponents();
        Comanda comanda = (Comanda) Comandados.comandas.get(0);
        numeroPedidoJL.setText("0");
        qtdDaCasaJL.setText(comanda.getDaCasa());
        qtdBurguerJL.setText(comanda.getBurguer());
        qtdKidsJL.setText(comanda.getKids());
        qtdBaconJL.setText(comanda.getBacon());
        qtdCheddarJL.setText(comanda.getCheddar());
        qtdAguaGasJL.setText(comanda.getAguaGas());
        qtdAguaJL.setText(comanda.getAgua());
        qtdCocaColaJL.setText(comanda.getCocaCola());
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
        numeroPedidoJL = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        qtdDaCasaJL = new javax.swing.JLabel();
        qtdBurguerJL = new javax.swing.JLabel();
        qtdKidsJL = new javax.swing.JLabel();
        qtdBaconJL = new javax.swing.JLabel();
        qtdCheddarJL = new javax.swing.JLabel();
        qtdAguaGasJL = new javax.swing.JLabel();
        qtdAguaJL = new javax.swing.JLabel();
        qtdCocaColaJL = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Pedido:");

        numeroPedidoJL.setText("jLabel2");

        jButton1.setText("Anterior");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Próximo");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel3.setText("Da Casa:");

        jLabel4.setText("Burguer:");

        jLabel5.setText("Kids");

        jLabel6.setText("Bacon:");

        jLabel7.setText("Cheddar:");

        jLabel8.setText("Água c/ Gás:");

        jLabel9.setText("Água:");

        jLabel10.setText("Coca-Cola:");

        qtdDaCasaJL.setText("jLabel11");

        qtdBurguerJL.setText("jLabel12");

        qtdKidsJL.setText("jLabel13");

        qtdBaconJL.setText("jLabel14");

        qtdCheddarJL.setText("jLabel15");

        qtdAguaGasJL.setText("jLabel16");

        qtdAguaJL.setText("jLabel17");

        qtdCocaColaJL.setText("jLabel18");

        jButton3.setText("Voltar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Pedido Concluído");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(numeroPedidoJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(qtdDaCasaJL)
                                    .addComponent(qtdKidsJL)
                                    .addComponent(qtdBurguerJL)
                                    .addComponent(qtdBaconJL)
                                    .addComponent(qtdCheddarJL)
                                    .addComponent(qtdAguaGasJL)
                                    .addComponent(qtdAguaJL)
                                    .addComponent(qtdCocaColaJL)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton4)))
                        .addGap(105, 105, 105))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numeroPedidoJL)
                    .addComponent(jButton3))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(qtdDaCasaJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(qtdBurguerJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(qtdKidsJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(qtdBaconJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(qtdCheddarJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(qtdAguaGasJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(qtdAguaJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(qtdCocaColaJL))
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        int numero = Integer.parseInt(numeroPedidoJL.getText());
        for(int i = 0; i < Comandados.comandas.size(); i++){
            if(numero + 1 == i){
                Comanda comanda = (Comanda) Comandados.comandas.get(i);
                numeroPedidoJL.setText(String.valueOf(i));
                qtdDaCasaJL.setText(comanda.getDaCasa());
                qtdBurguerJL.setText(comanda.getBurguer());
                qtdKidsJL.setText(comanda.getKids());
                qtdBaconJL.setText(comanda.getBacon());
                qtdCheddarJL.setText(comanda.getCheddar());
                qtdAguaGasJL.setText(comanda.getAguaGas());
                qtdAguaJL.setText(comanda.getAgua());
                qtdCocaColaJL.setText(comanda.getCocaCola());               
            }
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int numero = Integer.parseInt(numeroPedidoJL.getText());
        for(int i = 0; i < Comandados.comandas.size(); i++){
            if(numero - 1 == i){
                Comanda comanda = (Comanda) Comandados.comandas.get(i);
                numeroPedidoJL.setText(String.valueOf(i));
                qtdDaCasaJL.setText(comanda.getDaCasa());
                qtdBurguerJL.setText(comanda.getBurguer());
                qtdKidsJL.setText(comanda.getKids());
                qtdBaconJL.setText(comanda.getBacon());
                qtdCheddarJL.setText(comanda.getCheddar());
                qtdAguaGasJL.setText(comanda.getAguaGas());
                qtdAguaJL.setText(comanda.getAgua());
                qtdCocaColaJL.setText(comanda.getCocaCola());               
            }
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        int numero = Integer.parseInt(numeroPedidoJL.getText());
        if(numero == 0){              
            Comandados.comandas.remove(numero);
        } else{
            JOptionPane.showMessageDialog(rootPane, "Você deve concluir o pedido anterior antes!");
        }
    }//GEN-LAST:event_jButton4MouseClicked

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
            java.util.logging.Logger.getLogger(ConsultarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarPedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel numeroPedidoJL;
    private javax.swing.JLabel qtdAguaGasJL;
    private javax.swing.JLabel qtdAguaJL;
    private javax.swing.JLabel qtdBaconJL;
    private javax.swing.JLabel qtdBurguerJL;
    private javax.swing.JLabel qtdCheddarJL;
    private javax.swing.JLabel qtdCocaColaJL;
    private javax.swing.JLabel qtdDaCasaJL;
    private javax.swing.JLabel qtdKidsJL;
    // End of variables declaration//GEN-END:variables
}
