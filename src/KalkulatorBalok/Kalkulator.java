/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package KalkulatorBalok;

import javax.swing.JOptionPane;

/**
 *
 * @author M S I
 */
public class Kalkulator extends javax.swing.JPanel {

    /**
     * Creates new form Kalkulator
     */
    public Kalkulator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panjang = new javax.swing.JTextField();
        lebar = new javax.swing.JTextField();
        tinggi = new javax.swing.JTextField();
        hitung = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        hasil = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        luas = new javax.swing.JRadioButton();
        volume = new javax.swing.JRadioButton();

        jTextField3.setText("jTextField3");

        setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("Kalkulator Balok");

        jLabel2.setText("Panjang");

        jLabel3.setText("Lebar");

        jLabel4.setText("Tinggi");

        // panjang.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         panjangActionPerformed(evt);
        //     }
        // });

        hitung.setBackground(java.awt.Color.lightGray);
        hitung.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hitung.setText("Hitung");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Hasil");

        // hasil.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         hasilActionPerformed(evt);
        //     }
        // });

        reset.setBackground(java.awt.Color.lightGray);
        reset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        luas.setText("Luas Permukaan");
        luas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luasActionPerformed(evt);
            }
        });

        volume.setText("Volume");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(hitung)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(reset))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(13, 13, 13)))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(panjang)
                                    .addComponent(lebar)
                                    .addComponent(tinggi, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(luas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(volume)))))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(panjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tinggi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(luas)
                    .addComponent(volume))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hitung)
                    .addComponent(reset))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == hitung) {
            String inputPanjang = panjang.getText();
            String inputLebar = lebar.getText();
            String inputTinggi = tinggi.getText();
            if (inputPanjang.isEmpty() || inputLebar.isEmpty() || inputTinggi.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Input tidak boleh kosong!");
            } else {
                try {
                    double p = Double.parseDouble(inputPanjang);
                    double l = Double.parseDouble(inputLebar);
                    double t = Double.parseDouble(inputTinggi);
                    if (luas.isSelected() && volume.isSelected()) {
                        JOptionPane.showMessageDialog(this, "Anda hanya dapat memilih salah satu opsi");
                    } else if (luas.isSelected()) {
                        double luasBalok = 2 * ((p * l) + (p * t) + (l * t));
                        hasil.setText(Double.toString(luasBalok));
                    } else if (volume.isSelected()) {
                        double volumeBalok = p * l * t;
                        hasil.setText(Double.toString(volumeBalok));
                    } else {
                        JOptionPane.showMessageDialog(this, "Anda belum memilih opsi");
                    }
                
                    
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Input harus berupa angka!");
                }
            }
        }
    }//GEN-LAST:event_hitungActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == reset) {
            panjang.setText("");
            lebar.setText("");
            tinggi.setText("");
            hasil.setText("");
            luas.setSelected(false);
            volume.setSelected(false);
        }
    }//GEN-LAST:event_resetActionPerformed

    private void luasActionPerformed(java.awt.event.ActionEvent evt) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField hasil;
    private javax.swing.JButton hitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField lebar;
    private javax.swing.JRadioButton luas;
    private javax.swing.JTextField panjang;
    private javax.swing.JButton reset;
    private javax.swing.JTextField tinggi;
    private javax.swing.JRadioButton volume;
    // End of variables declaration//GEN-END:variables
}
