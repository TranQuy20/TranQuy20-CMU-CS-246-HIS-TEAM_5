package com.Main;

import java.awt.Toolkit;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setIconImage(); // Thay đôi biểu tượng trên Tittle Bar;
        setWindown(); // Tùy chỉnh cửa sổ;
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uIApp1 = new com.FrontEnd.UIApp();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("E-Calculator Application");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(uIApp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(uIApp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/iconJF/iconTitle6.png"))); // Thêm địa chỉ icon;
    }

    private void setWindown() {
        this.setResizable(false); // Không được phép thay đổi kích thước cửa sổ;
        this.setLocationRelativeTo(null); // Đặt cửa sổ ở giữa màn hình;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.FrontEnd.UIApp uIApp1;
    // End of variables declaration//GEN-END:variables
}
