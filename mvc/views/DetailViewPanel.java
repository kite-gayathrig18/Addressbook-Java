/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.views;

import java.awt.Point;
import javax.swing.JComponent;

/**
 *
 * @author Bharathy KGiSL
 */
public class DetailViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public DetailViewPanel() {
        initComponents();
        
    }
    
    public javax.swing.JTextField getNameField()
    {
        
        return txt_name;
        
    }
     public javax.swing.JTextField getMobileField()
    {
        
        return txt_mobileno;
        
    }
      public javax.swing.JTextField geteMailField()
    {
        
        return txt_email;
        
    }
       
        public javax.swing.JTextField getrollnoField()
    {
            return txt_rno;
    }
        public javax.swing.JTextField getStateField(){
            return txt_state;
        }
      public void setName(String name)
      {
          txt_name.setText(name);
      }
       public void setMobile(String mobile)
      {
          txt_mobileno.setText(mobile);
      }
        public void seteMail(String email)
      {
          txt_email.setText(email);
      }
        
        public void setRollno(String rno)
      {
          txt_rno.setText(rno);
            
      }
         public void setState(String state)
      {
          txt_state.setText(state);
            
      }
        
        
        public JComponent getComponent() 
        {
            return this;
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_mobileno = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_rno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_state = new javax.swing.JTextField();

        jToggleButton1.setText("jToggleButton1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setBackground(new java.awt.Color(200, 200, 200));

        jLabel1.setText("Name*");

        jLabel2.setText("Mobile No*");

        jLabel3.setText("Email");

        txt_name.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txt_name.setForeground(new java.awt.Color(0, 0, 255));
        txt_name.setName("txt_name"); // NOI18N

        txt_mobileno.setName("txt_mobileno"); // NOI18N
        txt_mobileno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mobilenoActionPerformed(evt);
            }
        });

        txt_email.setName("txt_email"); // NOI18N
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        jLabel5.setText("rollno");

        txt_rno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rnoActionPerformed(evt);
            }
        });

        jLabel6.setText("state");

        txt_state.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_stateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_mobileno, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(txt_name, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(txt_rno)
                    .addComponent(txt_state))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_mobileno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txt_rno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txt_state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_mobilenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mobilenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mobilenoActionPerformed

    private void txt_rnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rnoActionPerformed

    private void txt_stateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_stateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_stateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_mobileno;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_rno;
    private javax.swing.JTextField txt_state;
    // End of variables declaration//GEN-END:variables

}