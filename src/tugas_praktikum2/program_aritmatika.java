/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_praktikum2;

/**
 *
 * @author Lenovo
 */
public class program_aritmatika extends javax.swing.JFrame {
    String jns = "";
    int jml;
    
    public program_aritmatika() {
        initComponents();
        getJumlah();
        setJenis();
        panel.setVisible(false);
        pilihanbil.setEnabled(false);
        bil3.setVisible(false);
        bil4.setVisible(false);
        b3.setVisible(false);
        b4.setVisible(false);
        bil1.setVisible(false);
        bil2.setVisible(false);
        b1.setVisible(false);
        b2.setVisible(false);
        
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
        jenis = new javax.swing.JComboBox<>();
        jpanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        bil4 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bil1 = new javax.swing.JLabel();
        bil2 = new javax.swing.JLabel();
        bil3 = new javax.swing.JLabel();
        ket = new javax.swing.JLabel();
        b4 = new javax.swing.JTextField();
        pilihanbil = new javax.swing.JComboBox<>();
        b1 = new javax.swing.JTextField();
        b2 = new javax.swing.JTextField();
        b3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        hasil = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("PROGRAM ARITMATIKA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 10, 220, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Jenis Aritmatika");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 60, 100, 14);

        jenis.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Penjumlahan", "Pengurangan", "Perkalian", "Pembagian" }));
        jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisActionPerformed(evt);
            }
        });
        getContentPane().add(jenis);
        jenis.setBounds(270, 60, 130, 20);

        jpanel1.setBackground(new java.awt.Color(255, 204, 153));
        jpanel1.setLayout(null);

        panel.setBackground(new java.awt.Color(255, 204, 102));
        panel.setLayout(null);

        bil4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bil4.setText("Bilangan 4");
        panel.add(bil4);
        bil4.setBounds(40, 210, 130, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Operasi");
        panel.add(jLabel4);
        jLabel4.setBounds(10, 0, 60, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Jumlah Bilangan");
        panel.add(jLabel5);
        jLabel5.setBounds(40, 80, 130, 15);

        bil1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bil1.setText("Bilangan 1");
        panel.add(bil1);
        bil1.setBounds(40, 120, 130, 15);

        bil2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bil2.setText("Bilangan 2");
        panel.add(bil2);
        bil2.setBounds(40, 150, 130, 15);

        bil3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bil3.setText("Bilangan 3");
        panel.add(bil3);
        bil3.setBounds(40, 180, 130, 15);

        ket.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        panel.add(ket);
        ket.setBounds(110, 30, 120, 20);
        panel.add(b4);
        b4.setBounds(170, 200, 150, 30);

        pilihanbil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4" }));
        pilihanbil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihanbilActionPerformed(evt);
            }
        });
        panel.add(pilihanbil);
        pilihanbil.setBounds(170, 70, 150, 20);
        panel.add(b1);
        b1.setBounds(170, 110, 150, 30);
        panel.add(b2);
        b2.setBounds(170, 140, 150, 30);
        panel.add(b3);
        b3.setBounds(170, 170, 150, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("HITUNG");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel.add(jButton1);
        jButton1.setBounds(190, 240, 110, 23);
        panel.add(hasil);
        hasil.setBounds(160, 270, 180, 70);

        jpanel1.add(panel);
        panel.setBounds(40, 96, 370, 360);

        getContentPane().add(jpanel1);
        jpanel1.setBounds(0, 0, 430, 490);

        setBounds(0, 0, 443, 523);
    }// </editor-fold>//GEN-END:initComponents

    private void jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisActionPerformed
       // TODO add your handling code here:
       setJenis();
    }//GEN-LAST:event_jenisActionPerformed
public void setJenis(){
    if(jenis.getSelectedItem().equals("Penjumlahan")){
        jns = "Penjumlahan";
        ket.setText("Penjumlahan");
        panel.setVisible(true);
        pilihanbil.setEnabled(true);
    }
    else if(jenis.getSelectedItem().equals("Pengurangan")){
        jns = "Pengurangan";
        ket.setText("Pengurangan");
        panel.setVisible(true);
        pilihanbil.setEnabled(true);
    }
    else if(jenis.getSelectedItem().equals("Perkalian")){
        jns = "Perkalian";
        ket.setText("Perkalian");
        panel.setVisible(true);
        pilihanbil.setEnabled(true);
}else if(jenis.getSelectedItem().equals("Pembagian")){
        jns = "Pembagian";
        ket.setText("Pembagian");
        panel.setVisible(true);
        pilihanbil.setEnabled(true);
}
}
    private void pilihanbilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihanbilActionPerformed
        // TODO add your handling code here:
       getJumlah();
    }//GEN-LAST:event_pilihanbilActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Double hsl = 0.0;
        Double a1, a2, a3, a4;
        a1 = Double.parseDouble(b1.getText().toString());
        a2 = Double.parseDouble(b2.getText().toString());
        a3 = Double.parseDouble(b3.getText().toString());
        a4 = Double.parseDouble(b4.getText().toString());
        
        if(jns.equals("Penjumlahan")){
            if(jml == 2) {
                hsl = a1 + a2;
                hasil.setText(""+a1+"+"+a2+"="+hsl);
            }
            if(jml == 3) {
                hsl = a1 + a2 +a3;
                hasil.setText(""+a1+"+"+a2+"+"+a3+"="+hsl);
        }
            if(jml == 4) {
                hsl = a1 + a2 +a3+a4;
                hasil.setText(""+a1+"+"+a2+"+"+a3+"+"+a4+"="+hsl);
            }   
        }
        else if(jns.equals("Pengurangan")){
            if(jml == 2) {
                hsl = a1 - a2;
                hasil.setText(""+ a1+"-"+a2+"="+hsl);
            }
            if(jml == 3) {
                hsl = a1 - a2 - a3;
                hasil.setText(""+a1+"-"+a2+"-"+a3+"="+hsl);
        }
            if(jml == 4) {
                hsl = a1 - a2 - a3 - a4;
                hasil.setText(""+a1+"-"+a2+"-"+a3+"-"+a4+"="+hsl);
            }
        else if(jns.equals("Perkalian")){
            if(jml == 2) {
                hsl = a1 * a2;
                hasil.setText(""+a1+"*"+a2+"="+hsl);
            }
            if(jml == 3) {
                hsl = a1 * a2 *a3;
                hasil.setText(""+a1+"*"+a2+"*"+a3+"="+hsl);
        }
            if(jml == 4) {
                hsl = a1 * a2 * a3 * a4;
                hasil.setText(""+a1+"*"+a2+"*"+a3+"*"+a4+"="+hsl);
            }
            else if (jns.equals("Pembagian")){
            if(jml == 2) {
                hsl = a1 / a2;
                hasil.setText(""+a1+"/"+a2+"="+hsl);
            }
            if(jml == 3) {
                hsl = a1 / a2 /a3;
                hasil.setText(""+a1+"/"+a2+"/"+a3+"="+hsl);
        }
            if(jml == 4) {
                hsl = a1 / a2 /a3/a4;
                hasil.setText(""+a1+"/"+a2+"/"+a3+"/"+a4+"="+hsl);
            }
            }
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
public void getJumlah(){
        if(pilihanbil.getSelectedItem().equals("2")){
        bil3.setVisible(false);
        bil4.setVisible(false);
        b3.setVisible(false);
        b4.setVisible(false);
        bil1.setVisible(true);
        bil2.setVisible(true);
        b1.setVisible(true);
        b2.setVisible(true);
        jml = 2;
        }else if(pilihanbil.getSelectedItem().equals("3")){
        bil3.setVisible(true);
        bil4.setVisible(false);
        b3.setVisible(true);
        b4.setVisible(false);
        bil1.setVisible(true);
        bil2.setVisible(true);
        b1.setVisible(true);
        b2.setVisible(true);
        jml = 3;
        }
        else if(pilihanbil.getSelectedItem().equals("2")){
        bil3.setVisible(true);
        bil4.setVisible(true);
        b3.setVisible(true);
        b4.setVisible(true);
        bil1.setVisible(true);
        bil2.setVisible(true);
        b1.setVisible(true);
        b2.setVisible(true);
        jml = 4;
        }
        
}
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
            java.util.logging.Logger.getLogger(program_aritmatika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(program_aritmatika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(program_aritmatika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(program_aritmatika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new program_aritmatika().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField b1;
    private javax.swing.JTextField b2;
    private javax.swing.JTextField b3;
    private javax.swing.JTextField b4;
    private javax.swing.JLabel bil1;
    private javax.swing.JLabel bil2;
    private javax.swing.JLabel bil3;
    private javax.swing.JLabel bil4;
    private javax.swing.JTextField hasil;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> jenis;
    private javax.swing.JPanel jpanel1;
    private javax.swing.JLabel ket;
    private javax.swing.JPanel panel;
    private javax.swing.JComboBox<String> pilihanbil;
    // End of variables declaration//GEN-END:variables
}
