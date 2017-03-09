
package battlegraphs_v6;

public class HelpScreen_V6 extends javax.swing.JPanel {

    public HelpScreen_V6() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoDisplayArea = new javax.swing.JPanel();
        helpArea = new javax.swing.JPanel();

        setBackground(new java.awt.Color(10, 44, 77));
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setMaximumSize(new java.awt.Dimension(800, 455));
        setMinimumSize(new java.awt.Dimension(800, 455));

        infoDisplayArea.setBackground(new java.awt.Color(10, 44, 77));
        infoDisplayArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        infoDisplayArea.setAlignmentX(0.0F);
        infoDisplayArea.setAlignmentY(0.0F);
        infoDisplayArea.setMaximumSize(new java.awt.Dimension(325, 455));
        infoDisplayArea.setMinimumSize(new java.awt.Dimension(325, 455));
        infoDisplayArea.setPreferredSize(new java.awt.Dimension(325, 455));

        javax.swing.GroupLayout infoDisplayAreaLayout = new javax.swing.GroupLayout(infoDisplayArea);
        infoDisplayArea.setLayout(infoDisplayAreaLayout);
        infoDisplayAreaLayout.setHorizontalGroup(
            infoDisplayAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
        );
        infoDisplayAreaLayout.setVerticalGroup(
            infoDisplayAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        helpArea.setBackground(new java.awt.Color(10, 44, 77));
        helpArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        helpArea.setAlignmentX(0.0F);
        helpArea.setAlignmentY(0.0F);
        helpArea.setMaximumSize(new java.awt.Dimension(455, 455));
        helpArea.setMinimumSize(new java.awt.Dimension(455, 455));
        helpArea.setName(""); // NOI18N
        helpArea.setPreferredSize(new java.awt.Dimension(455, 455));
        helpArea.setLayout(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(helpArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(infoDisplayArea, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(infoDisplayArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(helpArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel helpArea;
    private javax.swing.JPanel infoDisplayArea;
    // End of variables declaration//GEN-END:variables
}
