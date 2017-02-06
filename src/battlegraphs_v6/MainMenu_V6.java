
package battlegraphs_v6;

public class MainMenu_V6 extends javax.swing.JPanel 
{

    public MainMenu_V6() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuTitleLabel = new javax.swing.JLabel();
        menuInfoLabelTop = new javax.swing.JLabel();
        menuInfoLabelBottom = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(775, 455));
        setMinimumSize(new java.awt.Dimension(775, 455));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(775, 455));
        setLayout(null);

        menuTitleLabel.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        menuTitleLabel.setText("Battle Graphs");
        add(menuTitleLabel);
        menuTitleLabel.setBounds(250, 100, 267, 60);

        menuInfoLabelTop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuInfoLabelTop.setText("Welcome to BattleGraphs, please select a mode from ");
        menuInfoLabelTop.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(menuInfoLabelTop);
        menuInfoLabelTop.setBounds(230, 180, 320, 14);
        menuInfoLabelTop.getAccessibleContext().setAccessibleName("menuInfoLabelTop");

        menuInfoLabelBottom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuInfoLabelBottom.setText("   either \"Single Player \" or \"Two Player\" at the top of the screen");
        menuInfoLabelBottom.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(menuInfoLabelBottom);
        menuInfoLabelBottom.setBounds(200, 200, 370, 14);
        menuInfoLabelBottom.getAccessibleContext().setAccessibleName("menuInfoLabelBottom");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel menuInfoLabelBottom;
    private javax.swing.JLabel menuInfoLabelTop;
    private javax.swing.JLabel menuTitleLabel;
    // End of variables declaration//GEN-END:variables
}
