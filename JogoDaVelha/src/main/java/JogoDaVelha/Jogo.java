
package JogoDaVelha;

/**
 *
 * @author Igor Lopes
 */
public class Jogo extends javax.swing.JFrame {
    
    public boolean jogadorA=true;
    public boolean jogadorB=true;
    public int contPosicao=0;
    public int k=0,i=0;
    int op;
    public String linha1,linha2,linha3,coluna1,coluna2,coluna3,diagonal1,diagonal2;
    
    String [][]posicaoVetor= new String [3][3];
    
    public Jogo() {
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

        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        breiniciar = new javax.swing.JButton();
        txtVisor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b1.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        breiniciar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        breiniciar.setText("Reiniciar");
        breiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breiniciarActionPerformed(evt);
            }
        });

        txtVisor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtVisor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(breiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtVisor)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(breiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void verificarJogadordaVez(){
        if(jogadorA && jogadorB){
            this.op=1;
            jogadorA=false;
            jogadorB=true;
            txtVisor.setText("Vez do jogador: O");
        }else if(jogadorA && jogadorB==false){
            this.op=1;
            jogadorA=false;
            jogadorB=true;
            txtVisor.setText("Vez do jogador: O");
        }else {
            this.op=2;
            jogadorA=true;
            jogadorB=false;
            txtVisor.setText("Vez do jogador: X");
        }
    }
    
    public void limparPosicao(){
        for(i=0;i<3;i++){
            for(k=0;k<3;k++){
                posicaoVetor[i][k]=" ";
            }
        }
    }
    public void desetivarBotao(){
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        
    }
    public void verificarEmpate(){
        contPosicao=0;
        for(i=0;i<3;i++){
            for(k=0;k<3;k++){
                if(posicaoVetor[i][k]=="X"||posicaoVetor[i][k]=="O"){
                    contPosicao+=1;
                }
            }
        }
        
    }
    public void verificarVencedor(){
        linha1=posicaoVetor[0][0]+posicaoVetor[0][1]+ posicaoVetor[0][2];
        linha2=posicaoVetor[1][0]+posicaoVetor[1][1]+ posicaoVetor[1][2];
        linha3=posicaoVetor[2][0]+posicaoVetor[2][1]+ posicaoVetor[2][2];
       
        coluna1=posicaoVetor[0][0]+posicaoVetor[1][0]+ posicaoVetor[2][0];
        coluna2=posicaoVetor[0][1]+posicaoVetor[1][1]+ posicaoVetor[2][1];
        coluna3=posicaoVetor[0][2]+posicaoVetor[1][2]+ posicaoVetor[2][2];
        
        diagonal1=posicaoVetor[0][0]+posicaoVetor[1][1]+ posicaoVetor[2][2];
        diagonal2=posicaoVetor[0][2]+posicaoVetor[1][1]+ posicaoVetor[2][0];
        
       
        if(linha1.equals("XXX")||linha2.equals("XXX")||linha3.equals("XXX")||
           coluna1.equals("XXX")||coluna2.equals("XXX")||coluna3.equals("XXX")||
           diagonal1.equals("XXX")||diagonal2.equals("XXX")){
            
            txtVisor.setText("O vencedor é o X");
            desetivarBotao();
            
        }else if (linha1.equals("OOO")||linha2.equals("OOO")||linha3.equals("OOO")||
           coluna1.equals("OOO")||coluna2.equals("OOO")||coluna3.equals("OOO")||
            diagonal1.equals("OOO")||diagonal2.equals("OOO")){
           
                txtVisor.setText("O vencedor é o O");
                desetivarBotao();
            
        }else if(contPosicao==9){
            txtVisor.setText("Empate!");
        }
        
    }
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // botão01
        verificarJogadordaVez();
        if(op ==1){
            b1.setText("X");
            posicaoVetor[0][0]="X";
        }else {
            b1.setText("O");
            posicaoVetor[0][0]="O";
        }
        b1.setEnabled(false);
        verificarEmpate();
        verificarVencedor();
        
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // botao02
        verificarJogadordaVez();
        if(op ==1){
            b2.setText("X");
            posicaoVetor[0][1]="X";
        }else {
            b2.setText("O");
            posicaoVetor[0][1]="O";
        }
        b2.setEnabled(false);
        verificarEmpate();
        verificarVencedor();
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // botao03
        verificarJogadordaVez();
        if(op ==1){
            b3.setText("X");
            posicaoVetor[0][2]="X";
        }else {
            b3.setText("O");
            posicaoVetor[0][2]="O";
        }
        b3.setEnabled(false);
        verificarEmpate();
        verificarVencedor();
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        //botao04
        verificarJogadordaVez();
        if(op ==1){
            b4.setText("X");
            posicaoVetor[1][0]="X";
        }else {
            b4.setText("O");
            posicaoVetor[1][0]="O";
        }
        b4.setEnabled(false);
        verificarEmpate();
        verificarVencedor();
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        //botao05
        verificarJogadordaVez();
        if(op ==1){
            b5.setText("X");
            posicaoVetor[1][1]="X";
        }else {
            b5.setText("O");
            posicaoVetor[1][1]="O";
        }
        b5.setEnabled(false);
        verificarEmpate();
        verificarVencedor();
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        //botao06
        verificarJogadordaVez();
        if(op ==1){
            b6.setText("X");
            posicaoVetor[1][2]="X";
        }else {
            b6.setText("O");
            posicaoVetor[1][2]="O";
        }
        b6.setEnabled(false);
        verificarEmpate();
        verificarVencedor();
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        //botao07
        verificarJogadordaVez();
        if(op ==1){
            b7.setText("X");
            posicaoVetor[2][0]="X";
        }else {
            b7.setText("O");
            posicaoVetor[2][0]="O";
        }
        b7.setEnabled(false);
        verificarEmpate();
        verificarVencedor();
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        //botao08
        verificarJogadordaVez();
        if(op ==1){
            b8.setText("X");
            posicaoVetor[2][1]="X";
        }else {
            b8.setText("O");
            posicaoVetor[2][1]="O";
        }
        b8.setEnabled(false);
        verificarEmpate();
        verificarVencedor();
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        //botao09
        verificarJogadordaVez();
        if(op ==1){
            b9.setText("X");
            posicaoVetor[2][2]="X";
        }else {
            b9.setText("O");
            posicaoVetor[2][2]="O";
        }
        b9.setEnabled(false);
        verificarEmpate();
        verificarVencedor();
    }//GEN-LAST:event_b9ActionPerformed
    
    private void breiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breiniciarActionPerformed
        //reiniciar botões 
       b1.setText(" ");
       b1.setEnabled(true);
       b2.setText(" ");
       b2.setEnabled(true);
       b3.setText(" ");
       b3.setEnabled(true);
       b4.setText(" ");
       b4.setEnabled(true);
       b5.setText(" ");
       b5.setEnabled(true);
       b6.setText(" ");
       b6.setEnabled(true);
       b7.setText(" ");
       b7.setEnabled(true);
       b8.setText(" ");
       b8.setEnabled(true);
       b9.setText(" ");
       b9.setEnabled(true);
       limparPosicao();
       jogadorA=true;
       jogadorB=true;
       txtVisor.setText(" ");
       
    }//GEN-LAST:event_breiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton breiniciar;
    private javax.swing.JTextField txtVisor;
    // End of variables declaration//GEN-END:variables
}
