package telas;

import static java.lang.Thread.sleep;

public class splash extends javax.swing.JFrame {
    public splash() {
        initComponents();
        
        new Thread () {
            public void run (){
                for (int i=0; i<=110; i++)
            {
                try{
                    sleep(40);
                    barra.setValue(i); 
                    
                    if (barra.getValue()<=30){
                        mensagem.setText("Iniciando o sistema de cadastro de livros");
                    }else if (barra .getValue()<=60){
                            mensagem.setText("Aguarde.");
                        
                        }else if (barra.getValue()<=70){
                            mensagem.setText("Aguarde..");
                        
                        }else if (barra.getValue()<=80){
                            mensagem.setText("Aguarde...");
                        
                        }else if (barra.getValue()<=90){
                            mensagem.setText("Aguarde....");
                        
                        }else {
                            mensagem.setText("Abertura do sistema concluída.");
                        }
           
                } catch (InterruptedException ex){
            
            }
            
            }
                telaLogin login = new telaLogin();
                login.setVisible(true);
                dispose();
            }
        } .start();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        mensagem = new javax.swing.JLabel();
        barra = new javax.swing.JProgressBar();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        titulo.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("CADASTRO DE LIVROS");
        getContentPane().add(titulo);
        titulo.setBounds(120, 90, 490, 40);

        mensagem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mensagem.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(mensagem);
        mensagem.setBounds(190, 340, 460, 30);
        getContentPane().add(barra);
        barra.setBounds(130, 284, 480, 30);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gifLivro2.gif"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 730, 380);

        setSize(new java.awt.Dimension(703, 407));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JProgressBar barra;
    private javax.swing.JLabel mensagem;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
