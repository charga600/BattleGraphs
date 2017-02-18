
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
        menuInfoLabelTop1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(10, 44, 77));
        setMaximumSize(new java.awt.Dimension(800, 455));
        setMinimumSize(new java.awt.Dimension(800, 455));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 455));
        setLayout(null);

        menuTitleLabel.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        menuTitleLabel.setForeground(new java.awt.Color(214, 220, 32));
        menuTitleLabel.setText("Battle Graphs");
        menuTitleLabel.setAlignmentY(0.0F);
        add(menuTitleLabel);
        menuTitleLabel.setBounds(260, 100, 267, 60);

        menuInfoLabelTop.setForeground(new java.awt.Color(214, 220, 32));
        menuInfoLabelTop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuInfoLabelTop.setText("When accessing the Help screen, click once to display it, once again to hide it.");
        menuInfoLabelTop.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(menuInfoLabelTop);
        menuInfoLabelTop.setBounds(200, 220, 380, 14);
        menuInfoLabelTop.getAccessibleContext().setAccessibleName("menuInfoLabelTop");

        menuInfoLabelBottom.setForeground(new java.awt.Color(214, 220, 32));
        menuInfoLabelBottom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuInfoLabelBottom.setText("   either \"Single Player \" or \"Two Player\" at the top of the screen.");
        menuInfoLabelBottom.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(menuInfoLabelBottom);
        menuInfoLabelBottom.setBounds(210, 200, 370, 14);
        menuInfoLabelBottom.getAccessibleContext().setAccessibleName("menuInfoLabelBottom");

        menuInfoLabelTop1.setForeground(new java.awt.Color(214, 220, 32));
        menuInfoLabelTop1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuInfoLabelTop1.setText("Welcome to BattleGraphs, please select a mode from ");
        menuInfoLabelTop1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(menuInfoLabelTop1);
        menuInfoLabelTop1.setBounds(240, 180, 320, 14);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel menuInfoLabelBottom;
    private javax.swing.JLabel menuInfoLabelTop;
    private javax.swing.JLabel menuInfoLabelTop1;
    private javax.swing.JLabel menuTitleLabel;
    // End of variables declaration//GEN-END:variables
}
