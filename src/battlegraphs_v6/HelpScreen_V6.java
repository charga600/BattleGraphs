/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlegraphs_v6;

/**
 *
 * @author Charlie
 */
public class HelpScreen_V6 extends javax.swing.JPanel {

    /**
     * Creates new form HelpScreen_V6
     */
    public HelpScreen_V6() {
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

        infoDisplayArea = new javax.swing.JPanel();
        helpArea = new javax.swing.JPanel();

        infoDisplayArea.setBackground(new java.awt.Color(220, 220, 220));
        infoDisplayArea.setAlignmentX(0.0F);
        infoDisplayArea.setAlignmentY(0.0F);
        infoDisplayArea.setMaximumSize(new java.awt.Dimension(310, 455));
        infoDisplayArea.setMinimumSize(new java.awt.Dimension(310, 455));
        infoDisplayArea.setPreferredSize(new java.awt.Dimension(310, 455));

        javax.swing.GroupLayout infoDisplayAreaLayout = new javax.swing.GroupLayout(infoDisplayArea);
        infoDisplayArea.setLayout(infoDisplayAreaLayout);
        infoDisplayAreaLayout.setHorizontalGroup(
            infoDisplayAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        infoDisplayAreaLayout.setVerticalGroup(
            infoDisplayAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        helpArea.setBackground(new java.awt.Color(200, 200, 200));

        javax.swing.GroupLayout helpAreaLayout = new javax.swing.GroupLayout(helpArea);
        helpArea.setLayout(helpAreaLayout);
        helpAreaLayout.setHorizontalGroup(
            helpAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );
        helpAreaLayout.setVerticalGroup(
            helpAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(helpArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(infoDisplayArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(helpArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(infoDisplayArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel helpArea;
    private javax.swing.JPanel infoDisplayArea;
    // End of variables declaration//GEN-END:variables
}
