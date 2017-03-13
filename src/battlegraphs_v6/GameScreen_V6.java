
package battlegraphs_v6;

public class GameScreen_V6 extends javax.swing.JPanel 
{
    int gameStage = 1; // 1 = place CV, 2 = place BB, 3 = place CR, 4 = place SB, 5 = place DD, 6 = game is in play, 7 = user wins, 8 = AI wins, 9 = game over
    int masterRange = -1;
    int orientation = 0; // 0 = null, 1 = verticle, 2 = horizontal 
    int SXGreaterEX = 0; // 0 = null, 1 = startX is greater than endX, 2 = endX is greater than startX
    int CVIcons = 5;
    int BBIcons = 4;
    int CRIcons = 3;
    int SBIcons = 3;
    int DDIcons = 2;
    int arrayTracker = 0;
    int AIShips = 17; // AI ships remaining
    int playerShips = 0;
    int xCordOne = 0;
    int yCordOne = 0;
    int xCordTwo = 0;
    int yCordTwo = 0;
    int questionType = 0; // 0 = null, 1 = find x intercept, 2 = find y intercept, 3 = find gradient, 4 = find equation
    
    float Gradient = 0;
    float yIntercept = 0;
    float xIntercept = 0;
    
    String[] shipCords = new String[17];
    String equation = "";
    String answer = "";
    
    boolean firstRun = true;
    
    public GameScreen_V6() 
    {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gridDisplayArea = new javax.swing.JPanel();
        grid = new javax.swing.JPanel();
        A1 = new javax.swing.JLabel();
        A2 = new javax.swing.JLabel();
        A3 = new javax.swing.JLabel();
        A4 = new javax.swing.JLabel();
        A5 = new javax.swing.JLabel();
        A6 = new javax.swing.JLabel();
        A7 = new javax.swing.JLabel();
        A8 = new javax.swing.JLabel();
        A9 = new javax.swing.JLabel();
        A10 = new javax.swing.JLabel();
        B1 = new javax.swing.JLabel();
        B2 = new javax.swing.JLabel();
        B3 = new javax.swing.JLabel();
        B4 = new javax.swing.JLabel();
        B5 = new javax.swing.JLabel();
        B6 = new javax.swing.JLabel();
        B7 = new javax.swing.JLabel();
        B8 = new javax.swing.JLabel();
        B9 = new javax.swing.JLabel();
        B10 = new javax.swing.JLabel();
        C1 = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        C3 = new javax.swing.JLabel();
        C4 = new javax.swing.JLabel();
        C5 = new javax.swing.JLabel();
        C6 = new javax.swing.JLabel();
        C7 = new javax.swing.JLabel();
        C8 = new javax.swing.JLabel();
        C9 = new javax.swing.JLabel();
        C10 = new javax.swing.JLabel();
        D1 = new javax.swing.JLabel();
        D2 = new javax.swing.JLabel();
        D3 = new javax.swing.JLabel();
        D4 = new javax.swing.JLabel();
        D5 = new javax.swing.JLabel();
        D6 = new javax.swing.JLabel();
        D7 = new javax.swing.JLabel();
        D8 = new javax.swing.JLabel();
        D9 = new javax.swing.JLabel();
        D10 = new javax.swing.JLabel();
        E1 = new javax.swing.JLabel();
        E2 = new javax.swing.JLabel();
        E3 = new javax.swing.JLabel();
        E4 = new javax.swing.JLabel();
        E5 = new javax.swing.JLabel();
        E6 = new javax.swing.JLabel();
        E7 = new javax.swing.JLabel();
        E8 = new javax.swing.JLabel();
        E9 = new javax.swing.JLabel();
        F1 = new javax.swing.JLabel();
        F2 = new javax.swing.JLabel();
        F3 = new javax.swing.JLabel();
        F4 = new javax.swing.JLabel();
        F5 = new javax.swing.JLabel();
        F6 = new javax.swing.JLabel();
        F7 = new javax.swing.JLabel();
        F8 = new javax.swing.JLabel();
        F9 = new javax.swing.JLabel();
        F10 = new javax.swing.JLabel();
        G1 = new javax.swing.JLabel();
        G2 = new javax.swing.JLabel();
        G3 = new javax.swing.JLabel();
        G4 = new javax.swing.JLabel();
        G5 = new javax.swing.JLabel();
        G6 = new javax.swing.JLabel();
        G7 = new javax.swing.JLabel();
        G8 = new javax.swing.JLabel();
        G9 = new javax.swing.JLabel();
        G10 = new javax.swing.JLabel();
        H1 = new javax.swing.JLabel();
        H2 = new javax.swing.JLabel();
        H3 = new javax.swing.JLabel();
        H4 = new javax.swing.JLabel();
        H5 = new javax.swing.JLabel();
        H6 = new javax.swing.JLabel();
        H7 = new javax.swing.JLabel();
        H8 = new javax.swing.JLabel();
        H9 = new javax.swing.JLabel();
        H10 = new javax.swing.JLabel();
        I1 = new javax.swing.JLabel();
        I2 = new javax.swing.JLabel();
        I3 = new javax.swing.JLabel();
        I4 = new javax.swing.JLabel();
        I5 = new javax.swing.JLabel();
        I6 = new javax.swing.JLabel();
        I7 = new javax.swing.JLabel();
        I8 = new javax.swing.JLabel();
        I9 = new javax.swing.JLabel();
        I10 = new javax.swing.JLabel();
        J1 = new javax.swing.JLabel();
        J2 = new javax.swing.JLabel();
        J3 = new javax.swing.JLabel();
        J4 = new javax.swing.JLabel();
        J5 = new javax.swing.JLabel();
        J6 = new javax.swing.JLabel();
        J7 = new javax.swing.JLabel();
        J8 = new javax.swing.JLabel();
        J9 = new javax.swing.JLabel();
        E10 = new javax.swing.JLabel();
        J10 = new javax.swing.JLabel();
        col10 = new javax.swing.JLabel();
        aLine = new javax.swing.JLabel();
        bLine = new javax.swing.JLabel();
        cLine = new javax.swing.JLabel();
        dLine = new javax.swing.JLabel();
        eLine = new javax.swing.JLabel();
        fLine = new javax.swing.JLabel();
        gLine = new javax.swing.JLabel();
        hLine = new javax.swing.JLabel();
        iLine = new javax.swing.JLabel();
        jLine = new javax.swing.JLabel();
        col1 = new javax.swing.JLabel();
        col2 = new javax.swing.JLabel();
        col3 = new javax.swing.JLabel();
        col4 = new javax.swing.JLabel();
        col5 = new javax.swing.JLabel();
        col6 = new javax.swing.JLabel();
        col7 = new javax.swing.JLabel();
        col8 = new javax.swing.JLabel();
        col9 = new javax.swing.JLabel();
        infoDisplayArea = new javax.swing.JPanel();
        yCordField = new javax.swing.JTextField();
        xCordField = new javax.swing.JTextField();
        xCordLabel = new javax.swing.JLabel();
        yCordLabel = new javax.swing.JLabel();
        firstLine = new javax.swing.JLabel();
        confirmButton = new javax.swing.JButton();
        secondLine = new javax.swing.JLabel();
        fourthLine = new javax.swing.JLabel();
        thirdLine = new javax.swing.JLabel();
        fifthLine = new javax.swing.JLabel();
        sixthLine = new javax.swing.JLabel();
        seventhLine = new javax.swing.JLabel();
        eigthLine = new javax.swing.JLabel();
        ninthLine = new javax.swing.JLabel();

        setBackground(new java.awt.Color(10, 44, 77));
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setMaximumSize(new java.awt.Dimension(800, 455));
        setMinimumSize(new java.awt.Dimension(800, 455));
        setPreferredSize(new java.awt.Dimension(800, 455));

        gridDisplayArea.setBackground(new java.awt.Color(10, 44, 77));
        gridDisplayArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gridDisplayArea.setAlignmentX(0.0F);
        gridDisplayArea.setAlignmentY(0.0F);
        gridDisplayArea.setMaximumSize(new java.awt.Dimension(455, 455));
        gridDisplayArea.setMinimumSize(new java.awt.Dimension(455, 455));
        gridDisplayArea.setPreferredSize(new java.awt.Dimension(455, 455));
        gridDisplayArea.setLayout(null);

        grid.setBackground(new java.awt.Color(21, 184, 207));
        grid.setToolTipText("");
        grid.setAlignmentX(0.0F);
        grid.setAlignmentY(0.0F);
        grid.setMaximumSize(new java.awt.Dimension(420, 420));
        grid.setMinimumSize(new java.awt.Dimension(420, 420));
        grid.setPreferredSize(new java.awt.Dimension(420, 420));
        grid.setLayout(null);

        A1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A1.setAlignmentY(0.0F);
        A1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        A1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A1.setIconTextGap(0);
        A1.setMaximumSize(new java.awt.Dimension(40, 40));
        A1.setMinimumSize(new java.awt.Dimension(40, 40));
        A1.setPreferredSize(new java.awt.Dimension(40, 40));
        A1.setRequestFocusEnabled(false);
        grid.add(A1);
        A1.setBounds(10, 10, 40, 40);

        A2.setBackground(new java.awt.Color(18, 158, 189));
        A2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A2.setAlignmentY(0.0F);
        A2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        A2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A2.setIconTextGap(0);
        A2.setMaximumSize(new java.awt.Dimension(40, 40));
        A2.setMinimumSize(new java.awt.Dimension(40, 40));
        A2.setOpaque(true);
        A2.setPreferredSize(new java.awt.Dimension(40, 40));
        A2.setRequestFocusEnabled(false);
        grid.add(A2);
        A2.setBounds(50, 10, 40, 40);

        A3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A3.setAlignmentY(0.0F);
        A3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        A3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A3.setIconTextGap(0);
        A3.setMaximumSize(new java.awt.Dimension(40, 40));
        A3.setMinimumSize(new java.awt.Dimension(40, 40));
        A3.setPreferredSize(new java.awt.Dimension(40, 40));
        A3.setRequestFocusEnabled(false);
        grid.add(A3);
        A3.setBounds(90, 10, 40, 40);

        A4.setBackground(new java.awt.Color(18, 158, 189));
        A4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A4.setAlignmentY(0.0F);
        A4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        A4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A4.setIconTextGap(0);
        A4.setMaximumSize(new java.awt.Dimension(40, 40));
        A4.setMinimumSize(new java.awt.Dimension(40, 40));
        A4.setOpaque(true);
        A4.setPreferredSize(new java.awt.Dimension(40, 40));
        A4.setRequestFocusEnabled(false);
        grid.add(A4);
        A4.setBounds(130, 10, 40, 40);

        A5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A5.setAlignmentY(0.0F);
        A5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        A5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A5.setIconTextGap(0);
        A5.setMaximumSize(new java.awt.Dimension(40, 40));
        A5.setMinimumSize(new java.awt.Dimension(40, 40));
        A5.setPreferredSize(new java.awt.Dimension(40, 40));
        A5.setRequestFocusEnabled(false);
        grid.add(A5);
        A5.setBounds(170, 10, 40, 40);

        A6.setBackground(new java.awt.Color(18, 158, 189));
        A6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A6.setAlignmentY(0.0F);
        A6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        A6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A6.setIconTextGap(0);
        A6.setMaximumSize(new java.awt.Dimension(40, 40));
        A6.setMinimumSize(new java.awt.Dimension(40, 40));
        A6.setOpaque(true);
        A6.setPreferredSize(new java.awt.Dimension(40, 40));
        A6.setRequestFocusEnabled(false);
        grid.add(A6);
        A6.setBounds(210, 10, 40, 40);

        A7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A7.setAlignmentY(0.0F);
        A7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        A7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A7.setIconTextGap(0);
        A7.setMaximumSize(new java.awt.Dimension(40, 40));
        A7.setMinimumSize(new java.awt.Dimension(40, 40));
        A7.setPreferredSize(new java.awt.Dimension(40, 40));
        A7.setRequestFocusEnabled(false);
        grid.add(A7);
        A7.setBounds(250, 10, 40, 40);

        A8.setBackground(new java.awt.Color(18, 158, 189));
        A8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A8.setAlignmentY(0.0F);
        A8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        A8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A8.setIconTextGap(0);
        A8.setMaximumSize(new java.awt.Dimension(40, 40));
        A8.setMinimumSize(new java.awt.Dimension(40, 40));
        A8.setOpaque(true);
        A8.setPreferredSize(new java.awt.Dimension(40, 40));
        A8.setRequestFocusEnabled(false);
        grid.add(A8);
        A8.setBounds(290, 10, 40, 40);

        A9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A9.setAlignmentY(0.0F);
        A9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        A9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A9.setIconTextGap(0);
        A9.setMaximumSize(new java.awt.Dimension(40, 40));
        A9.setMinimumSize(new java.awt.Dimension(40, 40));
        A9.setPreferredSize(new java.awt.Dimension(40, 40));
        A9.setRequestFocusEnabled(false);
        grid.add(A9);
        A9.setBounds(330, 10, 40, 40);

        A10.setBackground(new java.awt.Color(18, 158, 189));
        A10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A10.setAlignmentY(0.0F);
        A10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        A10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A10.setIconTextGap(0);
        A10.setMaximumSize(new java.awt.Dimension(40, 40));
        A10.setMinimumSize(new java.awt.Dimension(40, 40));
        A10.setOpaque(true);
        A10.setPreferredSize(new java.awt.Dimension(40, 40));
        A10.setRequestFocusEnabled(false);
        grid.add(A10);
        A10.setBounds(370, 10, 40, 40);

        B1.setBackground(new java.awt.Color(18, 158, 189));
        B1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B1.setAlignmentY(0.0F);
        B1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        B1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B1.setIconTextGap(0);
        B1.setMaximumSize(new java.awt.Dimension(40, 40));
        B1.setMinimumSize(new java.awt.Dimension(40, 40));
        B1.setOpaque(true);
        B1.setPreferredSize(new java.awt.Dimension(40, 40));
        B1.setRequestFocusEnabled(false);
        grid.add(B1);
        B1.setBounds(10, 50, 40, 40);

        B2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B2.setAlignmentY(0.0F);
        B2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        B2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B2.setIconTextGap(0);
        B2.setMaximumSize(new java.awt.Dimension(40, 40));
        B2.setMinimumSize(new java.awt.Dimension(40, 40));
        B2.setPreferredSize(new java.awt.Dimension(40, 40));
        B2.setRequestFocusEnabled(false);
        grid.add(B2);
        B2.setBounds(50, 50, 40, 40);

        B3.setBackground(new java.awt.Color(18, 158, 189));
        B3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B3.setAlignmentY(0.0F);
        B3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        B3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B3.setIconTextGap(0);
        B3.setMaximumSize(new java.awt.Dimension(40, 40));
        B3.setMinimumSize(new java.awt.Dimension(40, 40));
        B3.setOpaque(true);
        B3.setPreferredSize(new java.awt.Dimension(40, 40));
        B3.setRequestFocusEnabled(false);
        grid.add(B3);
        B3.setBounds(90, 50, 40, 40);

        B4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B4.setAlignmentY(0.0F);
        B4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        B4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B4.setIconTextGap(0);
        B4.setMaximumSize(new java.awt.Dimension(40, 40));
        B4.setMinimumSize(new java.awt.Dimension(40, 40));
        B4.setPreferredSize(new java.awt.Dimension(40, 40));
        B4.setRequestFocusEnabled(false);
        grid.add(B4);
        B4.setBounds(130, 50, 40, 40);

        B5.setBackground(new java.awt.Color(18, 158, 189));
        B5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B5.setAlignmentY(0.0F);
        B5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        B5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B5.setIconTextGap(0);
        B5.setMaximumSize(new java.awt.Dimension(40, 40));
        B5.setMinimumSize(new java.awt.Dimension(40, 40));
        B5.setOpaque(true);
        B5.setPreferredSize(new java.awt.Dimension(40, 40));
        B5.setRequestFocusEnabled(false);
        grid.add(B5);
        B5.setBounds(170, 50, 40, 40);

        B6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B6.setAlignmentY(0.0F);
        B6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        B6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B6.setIconTextGap(0);
        B6.setMaximumSize(new java.awt.Dimension(40, 40));
        B6.setMinimumSize(new java.awt.Dimension(40, 40));
        B6.setPreferredSize(new java.awt.Dimension(40, 40));
        B6.setRequestFocusEnabled(false);
        grid.add(B6);
        B6.setBounds(210, 50, 40, 40);

        B7.setBackground(new java.awt.Color(18, 158, 189));
        B7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B7.setAlignmentY(0.0F);
        B7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        B7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B7.setIconTextGap(0);
        B7.setMaximumSize(new java.awt.Dimension(40, 40));
        B7.setMinimumSize(new java.awt.Dimension(40, 40));
        B7.setOpaque(true);
        B7.setPreferredSize(new java.awt.Dimension(40, 40));
        B7.setRequestFocusEnabled(false);
        grid.add(B7);
        B7.setBounds(250, 50, 40, 40);

        B8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B8.setAlignmentY(0.0F);
        B8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        B8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B8.setIconTextGap(0);
        B8.setMaximumSize(new java.awt.Dimension(40, 40));
        B8.setMinimumSize(new java.awt.Dimension(40, 40));
        B8.setPreferredSize(new java.awt.Dimension(40, 40));
        B8.setRequestFocusEnabled(false);
        grid.add(B8);
        B8.setBounds(290, 50, 40, 40);

        B9.setBackground(new java.awt.Color(18, 158, 189));
        B9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B9.setAlignmentY(0.0F);
        B9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        B9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B9.setIconTextGap(0);
        B9.setMaximumSize(new java.awt.Dimension(40, 40));
        B9.setMinimumSize(new java.awt.Dimension(40, 40));
        B9.setOpaque(true);
        B9.setPreferredSize(new java.awt.Dimension(40, 40));
        B9.setRequestFocusEnabled(false);
        grid.add(B9);
        B9.setBounds(330, 50, 40, 40);

        B10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B10.setAlignmentY(0.0F);
        B10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        B10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B10.setIconTextGap(0);
        B10.setMaximumSize(new java.awt.Dimension(40, 40));
        B10.setMinimumSize(new java.awt.Dimension(40, 40));
        B10.setPreferredSize(new java.awt.Dimension(40, 40));
        B10.setRequestFocusEnabled(false);
        grid.add(B10);
        B10.setBounds(370, 50, 40, 40);

        C1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C1.setAlignmentY(0.0F);
        C1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        C1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C1.setIconTextGap(0);
        C1.setMaximumSize(new java.awt.Dimension(40, 40));
        C1.setMinimumSize(new java.awt.Dimension(40, 40));
        C1.setPreferredSize(new java.awt.Dimension(40, 40));
        C1.setRequestFocusEnabled(false);
        grid.add(C1);
        C1.setBounds(10, 90, 40, 40);

        C2.setBackground(new java.awt.Color(18, 158, 189));
        C2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C2.setAlignmentY(0.0F);
        C2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        C2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C2.setIconTextGap(0);
        C2.setMaximumSize(new java.awt.Dimension(40, 40));
        C2.setMinimumSize(new java.awt.Dimension(40, 40));
        C2.setOpaque(true);
        C2.setPreferredSize(new java.awt.Dimension(40, 40));
        C2.setRequestFocusEnabled(false);
        grid.add(C2);
        C2.setBounds(50, 90, 40, 40);

        C3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C3.setAlignmentY(0.0F);
        C3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        C3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C3.setIconTextGap(0);
        C3.setMaximumSize(new java.awt.Dimension(40, 40));
        C3.setMinimumSize(new java.awt.Dimension(40, 40));
        C3.setPreferredSize(new java.awt.Dimension(40, 40));
        C3.setRequestFocusEnabled(false);
        grid.add(C3);
        C3.setBounds(90, 90, 40, 40);

        C4.setBackground(new java.awt.Color(18, 158, 189));
        C4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C4.setAlignmentY(0.0F);
        C4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        C4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C4.setIconTextGap(0);
        C4.setMaximumSize(new java.awt.Dimension(40, 40));
        C4.setMinimumSize(new java.awt.Dimension(40, 40));
        C4.setOpaque(true);
        C4.setPreferredSize(new java.awt.Dimension(40, 40));
        C4.setRequestFocusEnabled(false);
        grid.add(C4);
        C4.setBounds(130, 90, 40, 40);

        C5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C5.setAlignmentY(0.0F);
        C5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        C5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C5.setIconTextGap(0);
        C5.setMaximumSize(new java.awt.Dimension(40, 40));
        C5.setMinimumSize(new java.awt.Dimension(40, 40));
        C5.setPreferredSize(new java.awt.Dimension(40, 40));
        C5.setRequestFocusEnabled(false);
        grid.add(C5);
        C5.setBounds(170, 90, 40, 40);

        C6.setBackground(new java.awt.Color(18, 158, 189));
        C6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C6.setAlignmentY(0.0F);
        C6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        C6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C6.setIconTextGap(0);
        C6.setMaximumSize(new java.awt.Dimension(40, 40));
        C6.setMinimumSize(new java.awt.Dimension(40, 40));
        C6.setOpaque(true);
        C6.setPreferredSize(new java.awt.Dimension(40, 40));
        C6.setRequestFocusEnabled(false);
        grid.add(C6);
        C6.setBounds(210, 90, 40, 40);

        C7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C7.setAlignmentY(0.0F);
        C7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        C7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C7.setIconTextGap(0);
        C7.setMaximumSize(new java.awt.Dimension(40, 40));
        C7.setMinimumSize(new java.awt.Dimension(40, 40));
        C7.setPreferredSize(new java.awt.Dimension(40, 40));
        C7.setRequestFocusEnabled(false);
        grid.add(C7);
        C7.setBounds(250, 90, 40, 40);

        C8.setBackground(new java.awt.Color(18, 158, 189));
        C8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C8.setAlignmentY(0.0F);
        C8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        C8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C8.setIconTextGap(0);
        C8.setMaximumSize(new java.awt.Dimension(40, 40));
        C8.setMinimumSize(new java.awt.Dimension(40, 40));
        C8.setOpaque(true);
        C8.setPreferredSize(new java.awt.Dimension(40, 40));
        C8.setRequestFocusEnabled(false);
        grid.add(C8);
        C8.setBounds(290, 90, 40, 40);

        C9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C9.setAlignmentY(0.0F);
        C9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        C9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C9.setIconTextGap(0);
        C9.setMaximumSize(new java.awt.Dimension(40, 40));
        C9.setMinimumSize(new java.awt.Dimension(40, 40));
        C9.setPreferredSize(new java.awt.Dimension(40, 40));
        C9.setRequestFocusEnabled(false);
        grid.add(C9);
        C9.setBounds(330, 90, 40, 40);

        C10.setBackground(new java.awt.Color(18, 158, 189));
        C10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C10.setAlignmentY(0.0F);
        C10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        C10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C10.setIconTextGap(0);
        C10.setMaximumSize(new java.awt.Dimension(40, 40));
        C10.setMinimumSize(new java.awt.Dimension(40, 40));
        C10.setOpaque(true);
        C10.setPreferredSize(new java.awt.Dimension(40, 40));
        C10.setRequestFocusEnabled(false);
        grid.add(C10);
        C10.setBounds(370, 90, 40, 40);

        D1.setBackground(new java.awt.Color(18, 158, 189));
        D1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D1.setAlignmentY(0.0F);
        D1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        D1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        D1.setIconTextGap(0);
        D1.setMaximumSize(new java.awt.Dimension(40, 40));
        D1.setMinimumSize(new java.awt.Dimension(40, 40));
        D1.setOpaque(true);
        D1.setPreferredSize(new java.awt.Dimension(40, 40));
        D1.setRequestFocusEnabled(false);
        grid.add(D1);
        D1.setBounds(10, 130, 40, 40);

        D2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D2.setAlignmentY(0.0F);
        D2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        D2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        D2.setIconTextGap(0);
        D2.setMaximumSize(new java.awt.Dimension(40, 40));
        D2.setMinimumSize(new java.awt.Dimension(40, 40));
        D2.setPreferredSize(new java.awt.Dimension(40, 40));
        D2.setRequestFocusEnabled(false);
        grid.add(D2);
        D2.setBounds(50, 130, 40, 40);

        D3.setBackground(new java.awt.Color(18, 158, 189));
        D3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D3.setAlignmentY(0.0F);
        D3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        D3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        D3.setIconTextGap(0);
        D3.setMaximumSize(new java.awt.Dimension(40, 40));
        D3.setMinimumSize(new java.awt.Dimension(40, 40));
        D3.setOpaque(true);
        D3.setPreferredSize(new java.awt.Dimension(40, 40));
        D3.setRequestFocusEnabled(false);
        grid.add(D3);
        D3.setBounds(90, 130, 40, 40);

        D4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D4.setAlignmentY(0.0F);
        D4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        D4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        D4.setIconTextGap(0);
        D4.setMaximumSize(new java.awt.Dimension(40, 40));
        D4.setMinimumSize(new java.awt.Dimension(40, 40));
        D4.setPreferredSize(new java.awt.Dimension(40, 40));
        D4.setRequestFocusEnabled(false);
        grid.add(D4);
        D4.setBounds(130, 130, 40, 40);

        D5.setBackground(new java.awt.Color(18, 158, 189));
        D5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D5.setAlignmentY(0.0F);
        D5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        D5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        D5.setIconTextGap(0);
        D5.setMaximumSize(new java.awt.Dimension(40, 40));
        D5.setMinimumSize(new java.awt.Dimension(40, 40));
        D5.setOpaque(true);
        D5.setPreferredSize(new java.awt.Dimension(40, 40));
        D5.setRequestFocusEnabled(false);
        grid.add(D5);
        D5.setBounds(170, 130, 40, 40);

        D6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D6.setAlignmentY(0.0F);
        D6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        D6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        D6.setIconTextGap(0);
        D6.setMaximumSize(new java.awt.Dimension(40, 40));
        D6.setMinimumSize(new java.awt.Dimension(40, 40));
        D6.setPreferredSize(new java.awt.Dimension(40, 40));
        D6.setRequestFocusEnabled(false);
        grid.add(D6);
        D6.setBounds(210, 130, 40, 40);

        D7.setBackground(new java.awt.Color(18, 158, 189));
        D7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D7.setAlignmentY(0.0F);
        D7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        D7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        D7.setIconTextGap(0);
        D7.setMaximumSize(new java.awt.Dimension(40, 40));
        D7.setMinimumSize(new java.awt.Dimension(40, 40));
        D7.setOpaque(true);
        D7.setPreferredSize(new java.awt.Dimension(40, 40));
        D7.setRequestFocusEnabled(false);
        grid.add(D7);
        D7.setBounds(250, 130, 40, 40);

        D8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D8.setAlignmentY(0.0F);
        D8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        D8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        D8.setIconTextGap(0);
        D8.setMaximumSize(new java.awt.Dimension(40, 40));
        D8.setMinimumSize(new java.awt.Dimension(40, 40));
        D8.setPreferredSize(new java.awt.Dimension(40, 40));
        D8.setRequestFocusEnabled(false);
        grid.add(D8);
        D8.setBounds(290, 130, 40, 40);

        D9.setBackground(new java.awt.Color(18, 158, 189));
        D9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D9.setAlignmentY(0.0F);
        D9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        D9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        D9.setIconTextGap(0);
        D9.setMaximumSize(new java.awt.Dimension(40, 40));
        D9.setMinimumSize(new java.awt.Dimension(40, 40));
        D9.setOpaque(true);
        D9.setPreferredSize(new java.awt.Dimension(40, 40));
        D9.setRequestFocusEnabled(false);
        grid.add(D9);
        D9.setBounds(330, 130, 40, 40);

        D10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D10.setAlignmentY(0.0F);
        D10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        D10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        D10.setIconTextGap(0);
        D10.setMaximumSize(new java.awt.Dimension(40, 40));
        D10.setMinimumSize(new java.awt.Dimension(40, 40));
        D10.setPreferredSize(new java.awt.Dimension(40, 40));
        D10.setRequestFocusEnabled(false);
        grid.add(D10);
        D10.setBounds(370, 130, 40, 40);

        E1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E1.setAlignmentY(0.0F);
        E1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        E1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        E1.setIconTextGap(0);
        E1.setMaximumSize(new java.awt.Dimension(40, 40));
        E1.setMinimumSize(new java.awt.Dimension(40, 40));
        E1.setPreferredSize(new java.awt.Dimension(40, 40));
        E1.setRequestFocusEnabled(false);
        grid.add(E1);
        E1.setBounds(10, 170, 40, 40);

        E2.setBackground(new java.awt.Color(18, 158, 189));
        E2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E2.setAlignmentY(0.0F);
        E2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        E2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        E2.setIconTextGap(0);
        E2.setMaximumSize(new java.awt.Dimension(40, 40));
        E2.setMinimumSize(new java.awt.Dimension(40, 40));
        E2.setOpaque(true);
        E2.setPreferredSize(new java.awt.Dimension(40, 40));
        E2.setRequestFocusEnabled(false);
        grid.add(E2);
        E2.setBounds(50, 170, 40, 40);

        E3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E3.setAlignmentY(0.0F);
        E3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        E3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        E3.setIconTextGap(0);
        E3.setMaximumSize(new java.awt.Dimension(40, 40));
        E3.setMinimumSize(new java.awt.Dimension(40, 40));
        E3.setPreferredSize(new java.awt.Dimension(40, 40));
        E3.setRequestFocusEnabled(false);
        grid.add(E3);
        E3.setBounds(90, 170, 40, 40);

        E4.setBackground(new java.awt.Color(18, 158, 189));
        E4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E4.setAlignmentY(0.0F);
        E4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        E4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        E4.setIconTextGap(0);
        E4.setMaximumSize(new java.awt.Dimension(40, 40));
        E4.setMinimumSize(new java.awt.Dimension(40, 40));
        E4.setOpaque(true);
        E4.setPreferredSize(new java.awt.Dimension(40, 40));
        E4.setRequestFocusEnabled(false);
        grid.add(E4);
        E4.setBounds(130, 170, 40, 40);

        E5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E5.setAlignmentY(0.0F);
        E5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        E5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        E5.setIconTextGap(0);
        E5.setMaximumSize(new java.awt.Dimension(40, 40));
        E5.setMinimumSize(new java.awt.Dimension(40, 40));
        E5.setPreferredSize(new java.awt.Dimension(40, 40));
        E5.setRequestFocusEnabled(false);
        grid.add(E5);
        E5.setBounds(170, 170, 40, 40);

        E6.setBackground(new java.awt.Color(18, 158, 189));
        E6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E6.setAlignmentY(0.0F);
        E6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        E6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        E6.setIconTextGap(0);
        E6.setMaximumSize(new java.awt.Dimension(40, 40));
        E6.setMinimumSize(new java.awt.Dimension(40, 40));
        E6.setOpaque(true);
        E6.setPreferredSize(new java.awt.Dimension(40, 40));
        E6.setRequestFocusEnabled(false);
        grid.add(E6);
        E6.setBounds(210, 170, 40, 40);

        E7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E7.setAlignmentY(0.0F);
        E7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        E7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        E7.setIconTextGap(0);
        E7.setMaximumSize(new java.awt.Dimension(40, 40));
        E7.setMinimumSize(new java.awt.Dimension(40, 40));
        E7.setPreferredSize(new java.awt.Dimension(40, 40));
        E7.setRequestFocusEnabled(false);
        grid.add(E7);
        E7.setBounds(250, 170, 40, 40);

        E8.setBackground(new java.awt.Color(18, 158, 189));
        E8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E8.setAlignmentY(0.0F);
        E8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        E8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        E8.setIconTextGap(0);
        E8.setMaximumSize(new java.awt.Dimension(40, 40));
        E8.setMinimumSize(new java.awt.Dimension(40, 40));
        E8.setOpaque(true);
        E8.setPreferredSize(new java.awt.Dimension(40, 40));
        E8.setRequestFocusEnabled(false);
        grid.add(E8);
        E8.setBounds(290, 170, 40, 40);

        E9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E9.setAlignmentY(0.0F);
        E9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        E9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        E9.setIconTextGap(0);
        E9.setMaximumSize(new java.awt.Dimension(40, 40));
        E9.setMinimumSize(new java.awt.Dimension(40, 40));
        E9.setPreferredSize(new java.awt.Dimension(40, 40));
        E9.setRequestFocusEnabled(false);
        grid.add(E9);
        E9.setBounds(330, 170, 40, 40);

        F1.setBackground(new java.awt.Color(18, 158, 189));
        F1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F1.setAlignmentY(0.0F);
        F1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        F1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        F1.setIconTextGap(0);
        F1.setMaximumSize(new java.awt.Dimension(40, 40));
        F1.setMinimumSize(new java.awt.Dimension(40, 40));
        F1.setOpaque(true);
        F1.setPreferredSize(new java.awt.Dimension(40, 40));
        F1.setRequestFocusEnabled(false);
        grid.add(F1);
        F1.setBounds(10, 210, 40, 40);

        F2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F2.setAlignmentY(0.0F);
        F2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        F2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        F2.setIconTextGap(0);
        F2.setMaximumSize(new java.awt.Dimension(40, 40));
        F2.setMinimumSize(new java.awt.Dimension(40, 40));
        F2.setPreferredSize(new java.awt.Dimension(40, 40));
        F2.setRequestFocusEnabled(false);
        grid.add(F2);
        F2.setBounds(50, 210, 40, 40);

        F3.setBackground(new java.awt.Color(18, 158, 189));
        F3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F3.setAlignmentY(0.0F);
        F3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        F3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        F3.setIconTextGap(0);
        F3.setMaximumSize(new java.awt.Dimension(40, 40));
        F3.setMinimumSize(new java.awt.Dimension(40, 40));
        F3.setOpaque(true);
        F3.setPreferredSize(new java.awt.Dimension(40, 40));
        F3.setRequestFocusEnabled(false);
        grid.add(F3);
        F3.setBounds(90, 210, 40, 40);

        F4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F4.setAlignmentY(0.0F);
        F4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        F4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        F4.setIconTextGap(0);
        F4.setMaximumSize(new java.awt.Dimension(40, 40));
        F4.setMinimumSize(new java.awt.Dimension(40, 40));
        F4.setPreferredSize(new java.awt.Dimension(40, 40));
        F4.setRequestFocusEnabled(false);
        grid.add(F4);
        F4.setBounds(130, 210, 40, 40);

        F5.setBackground(new java.awt.Color(18, 158, 189));
        F5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F5.setAlignmentY(0.0F);
        F5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        F5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        F5.setIconTextGap(0);
        F5.setMaximumSize(new java.awt.Dimension(40, 40));
        F5.setMinimumSize(new java.awt.Dimension(40, 40));
        F5.setOpaque(true);
        F5.setPreferredSize(new java.awt.Dimension(40, 40));
        F5.setRequestFocusEnabled(false);
        grid.add(F5);
        F5.setBounds(170, 210, 40, 40);

        F6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F6.setAlignmentY(0.0F);
        F6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        F6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        F6.setIconTextGap(0);
        F6.setMaximumSize(new java.awt.Dimension(40, 40));
        F6.setMinimumSize(new java.awt.Dimension(40, 40));
        F6.setPreferredSize(new java.awt.Dimension(40, 40));
        F6.setRequestFocusEnabled(false);
        grid.add(F6);
        F6.setBounds(210, 210, 40, 40);

        F7.setBackground(new java.awt.Color(18, 158, 189));
        F7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F7.setAlignmentY(0.0F);
        F7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        F7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        F7.setIconTextGap(0);
        F7.setMaximumSize(new java.awt.Dimension(40, 40));
        F7.setMinimumSize(new java.awt.Dimension(40, 40));
        F7.setOpaque(true);
        F7.setPreferredSize(new java.awt.Dimension(40, 40));
        F7.setRequestFocusEnabled(false);
        grid.add(F7);
        F7.setBounds(250, 210, 40, 40);

        F8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F8.setAlignmentY(0.0F);
        F8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        F8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        F8.setIconTextGap(0);
        F8.setMaximumSize(new java.awt.Dimension(40, 40));
        F8.setMinimumSize(new java.awt.Dimension(40, 40));
        F8.setPreferredSize(new java.awt.Dimension(40, 40));
        F8.setRequestFocusEnabled(false);
        grid.add(F8);
        F8.setBounds(290, 210, 40, 40);

        F9.setBackground(new java.awt.Color(18, 158, 189));
        F9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F9.setAlignmentY(0.0F);
        F9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        F9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        F9.setIconTextGap(0);
        F9.setMaximumSize(new java.awt.Dimension(40, 40));
        F9.setMinimumSize(new java.awt.Dimension(40, 40));
        F9.setOpaque(true);
        F9.setPreferredSize(new java.awt.Dimension(40, 40));
        F9.setRequestFocusEnabled(false);
        grid.add(F9);
        F9.setBounds(330, 210, 40, 40);

        F10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F10.setAlignmentY(0.0F);
        F10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        F10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        F10.setIconTextGap(0);
        F10.setMaximumSize(new java.awt.Dimension(40, 40));
        F10.setMinimumSize(new java.awt.Dimension(40, 40));
        F10.setPreferredSize(new java.awt.Dimension(40, 40));
        F10.setRequestFocusEnabled(false);
        grid.add(F10);
        F10.setBounds(370, 210, 40, 40);

        G1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        G1.setAlignmentY(0.0F);
        G1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        G1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        G1.setIconTextGap(0);
        G1.setMaximumSize(new java.awt.Dimension(40, 40));
        G1.setMinimumSize(new java.awt.Dimension(40, 40));
        G1.setPreferredSize(new java.awt.Dimension(40, 40));
        G1.setRequestFocusEnabled(false);
        grid.add(G1);
        G1.setBounds(10, 250, 40, 40);

        G2.setBackground(new java.awt.Color(18, 158, 189));
        G2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        G2.setAlignmentY(0.0F);
        G2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        G2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        G2.setIconTextGap(0);
        G2.setMaximumSize(new java.awt.Dimension(40, 40));
        G2.setMinimumSize(new java.awt.Dimension(40, 40));
        G2.setOpaque(true);
        G2.setPreferredSize(new java.awt.Dimension(40, 40));
        G2.setRequestFocusEnabled(false);
        grid.add(G2);
        G2.setBounds(50, 250, 40, 40);

        G3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        G3.setAlignmentY(0.0F);
        G3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        G3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        G3.setIconTextGap(0);
        G3.setMaximumSize(new java.awt.Dimension(40, 40));
        G3.setMinimumSize(new java.awt.Dimension(40, 40));
        G3.setPreferredSize(new java.awt.Dimension(40, 40));
        G3.setRequestFocusEnabled(false);
        grid.add(G3);
        G3.setBounds(90, 250, 40, 40);

        G4.setBackground(new java.awt.Color(18, 158, 189));
        G4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        G4.setAlignmentY(0.0F);
        G4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        G4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        G4.setIconTextGap(0);
        G4.setMaximumSize(new java.awt.Dimension(40, 40));
        G4.setMinimumSize(new java.awt.Dimension(40, 40));
        G4.setOpaque(true);
        G4.setPreferredSize(new java.awt.Dimension(40, 40));
        G4.setRequestFocusEnabled(false);
        grid.add(G4);
        G4.setBounds(130, 250, 40, 40);

        G5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        G5.setAlignmentY(0.0F);
        G5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        G5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        G5.setIconTextGap(0);
        G5.setMaximumSize(new java.awt.Dimension(40, 40));
        G5.setMinimumSize(new java.awt.Dimension(40, 40));
        G5.setPreferredSize(new java.awt.Dimension(40, 40));
        G5.setRequestFocusEnabled(false);
        grid.add(G5);
        G5.setBounds(170, 250, 40, 40);

        G6.setBackground(new java.awt.Color(18, 158, 189));
        G6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        G6.setAlignmentY(0.0F);
        G6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        G6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        G6.setIconTextGap(0);
        G6.setMaximumSize(new java.awt.Dimension(40, 40));
        G6.setMinimumSize(new java.awt.Dimension(40, 40));
        G6.setOpaque(true);
        G6.setPreferredSize(new java.awt.Dimension(40, 40));
        G6.setRequestFocusEnabled(false);
        grid.add(G6);
        G6.setBounds(210, 250, 40, 40);

        G7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        G7.setAlignmentY(0.0F);
        G7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        G7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        G7.setIconTextGap(0);
        G7.setMaximumSize(new java.awt.Dimension(40, 40));
        G7.setMinimumSize(new java.awt.Dimension(40, 40));
        G7.setPreferredSize(new java.awt.Dimension(40, 40));
        G7.setRequestFocusEnabled(false);
        grid.add(G7);
        G7.setBounds(250, 250, 40, 40);

        G8.setBackground(new java.awt.Color(18, 158, 189));
        G8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        G8.setAlignmentY(0.0F);
        G8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        G8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        G8.setIconTextGap(0);
        G8.setMaximumSize(new java.awt.Dimension(40, 40));
        G8.setMinimumSize(new java.awt.Dimension(40, 40));
        G8.setOpaque(true);
        G8.setPreferredSize(new java.awt.Dimension(40, 40));
        G8.setRequestFocusEnabled(false);
        grid.add(G8);
        G8.setBounds(290, 250, 40, 40);

        G9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        G9.setAlignmentY(0.0F);
        G9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        G9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        G9.setIconTextGap(0);
        G9.setMaximumSize(new java.awt.Dimension(40, 40));
        G9.setMinimumSize(new java.awt.Dimension(40, 40));
        G9.setPreferredSize(new java.awt.Dimension(40, 40));
        G9.setRequestFocusEnabled(false);
        grid.add(G9);
        G9.setBounds(330, 250, 40, 40);

        G10.setBackground(new java.awt.Color(18, 158, 189));
        G10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        G10.setAlignmentY(0.0F);
        G10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        G10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        G10.setIconTextGap(0);
        G10.setMaximumSize(new java.awt.Dimension(40, 40));
        G10.setMinimumSize(new java.awt.Dimension(40, 40));
        G10.setOpaque(true);
        G10.setPreferredSize(new java.awt.Dimension(40, 40));
        G10.setRequestFocusEnabled(false);
        grid.add(G10);
        G10.setBounds(370, 250, 40, 40);

        H1.setBackground(new java.awt.Color(18, 158, 189));
        H1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H1.setAlignmentY(0.0F);
        H1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        H1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        H1.setIconTextGap(0);
        H1.setMaximumSize(new java.awt.Dimension(40, 40));
        H1.setMinimumSize(new java.awt.Dimension(40, 40));
        H1.setOpaque(true);
        H1.setPreferredSize(new java.awt.Dimension(40, 40));
        H1.setRequestFocusEnabled(false);
        grid.add(H1);
        H1.setBounds(10, 290, 40, 40);

        H2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H2.setAlignmentY(0.0F);
        H2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        H2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        H2.setIconTextGap(0);
        H2.setMaximumSize(new java.awt.Dimension(40, 40));
        H2.setMinimumSize(new java.awt.Dimension(40, 40));
        H2.setPreferredSize(new java.awt.Dimension(40, 40));
        H2.setRequestFocusEnabled(false);
        grid.add(H2);
        H2.setBounds(50, 290, 40, 40);

        H3.setBackground(new java.awt.Color(18, 158, 189));
        H3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H3.setAlignmentY(0.0F);
        H3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        H3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        H3.setIconTextGap(0);
        H3.setMaximumSize(new java.awt.Dimension(40, 40));
        H3.setMinimumSize(new java.awt.Dimension(40, 40));
        H3.setOpaque(true);
        H3.setPreferredSize(new java.awt.Dimension(40, 40));
        H3.setRequestFocusEnabled(false);
        grid.add(H3);
        H3.setBounds(90, 290, 40, 40);

        H4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H4.setAlignmentY(0.0F);
        H4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        H4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        H4.setIconTextGap(0);
        H4.setMaximumSize(new java.awt.Dimension(40, 40));
        H4.setMinimumSize(new java.awt.Dimension(40, 40));
        H4.setPreferredSize(new java.awt.Dimension(40, 40));
        H4.setRequestFocusEnabled(false);
        grid.add(H4);
        H4.setBounds(130, 290, 40, 40);

        H5.setBackground(new java.awt.Color(18, 158, 189));
        H5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H5.setAlignmentY(0.0F);
        H5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        H5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        H5.setIconTextGap(0);
        H5.setMaximumSize(new java.awt.Dimension(40, 40));
        H5.setMinimumSize(new java.awt.Dimension(40, 40));
        H5.setOpaque(true);
        H5.setPreferredSize(new java.awt.Dimension(40, 40));
        H5.setRequestFocusEnabled(false);
        grid.add(H5);
        H5.setBounds(170, 290, 40, 40);

        H6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H6.setAlignmentY(0.0F);
        H6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        H6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        H6.setIconTextGap(0);
        H6.setMaximumSize(new java.awt.Dimension(40, 40));
        H6.setMinimumSize(new java.awt.Dimension(40, 40));
        H6.setPreferredSize(new java.awt.Dimension(40, 40));
        H6.setRequestFocusEnabled(false);
        grid.add(H6);
        H6.setBounds(210, 290, 40, 40);

        H7.setBackground(new java.awt.Color(18, 158, 189));
        H7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H7.setAlignmentY(0.0F);
        H7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        H7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        H7.setIconTextGap(0);
        H7.setMaximumSize(new java.awt.Dimension(40, 40));
        H7.setMinimumSize(new java.awt.Dimension(40, 40));
        H7.setOpaque(true);
        H7.setPreferredSize(new java.awt.Dimension(40, 40));
        H7.setRequestFocusEnabled(false);
        grid.add(H7);
        H7.setBounds(250, 290, 40, 40);

        H8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H8.setAlignmentY(0.0F);
        H8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        H8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        H8.setIconTextGap(0);
        H8.setMaximumSize(new java.awt.Dimension(40, 40));
        H8.setMinimumSize(new java.awt.Dimension(40, 40));
        H8.setPreferredSize(new java.awt.Dimension(40, 40));
        H8.setRequestFocusEnabled(false);
        grid.add(H8);
        H8.setBounds(290, 290, 40, 40);

        H9.setBackground(new java.awt.Color(18, 158, 189));
        H9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H9.setAlignmentY(0.0F);
        H9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        H9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        H9.setIconTextGap(0);
        H9.setMaximumSize(new java.awt.Dimension(40, 40));
        H9.setMinimumSize(new java.awt.Dimension(40, 40));
        H9.setOpaque(true);
        H9.setPreferredSize(new java.awt.Dimension(40, 40));
        H9.setRequestFocusEnabled(false);
        grid.add(H9);
        H9.setBounds(330, 290, 40, 40);

        H10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H10.setAlignmentY(0.0F);
        H10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        H10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        H10.setIconTextGap(0);
        H10.setMaximumSize(new java.awt.Dimension(40, 40));
        H10.setMinimumSize(new java.awt.Dimension(40, 40));
        H10.setPreferredSize(new java.awt.Dimension(40, 40));
        H10.setRequestFocusEnabled(false);
        grid.add(H10);
        H10.setBounds(370, 290, 40, 40);

        I1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I1.setAlignmentY(0.0F);
        I1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        I1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        I1.setIconTextGap(0);
        I1.setMaximumSize(new java.awt.Dimension(40, 40));
        I1.setMinimumSize(new java.awt.Dimension(40, 40));
        I1.setPreferredSize(new java.awt.Dimension(40, 40));
        I1.setRequestFocusEnabled(false);
        grid.add(I1);
        I1.setBounds(10, 330, 40, 40);

        I2.setBackground(new java.awt.Color(18, 158, 189));
        I2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I2.setAlignmentY(0.0F);
        I2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        I2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        I2.setIconTextGap(0);
        I2.setMaximumSize(new java.awt.Dimension(40, 40));
        I2.setMinimumSize(new java.awt.Dimension(40, 40));
        I2.setOpaque(true);
        I2.setPreferredSize(new java.awt.Dimension(40, 40));
        I2.setRequestFocusEnabled(false);
        grid.add(I2);
        I2.setBounds(50, 330, 40, 40);

        I3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I3.setAlignmentY(0.0F);
        I3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        I3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        I3.setIconTextGap(0);
        I3.setMaximumSize(new java.awt.Dimension(40, 40));
        I3.setMinimumSize(new java.awt.Dimension(40, 40));
        I3.setPreferredSize(new java.awt.Dimension(40, 40));
        I3.setRequestFocusEnabled(false);
        grid.add(I3);
        I3.setBounds(90, 330, 40, 40);

        I4.setBackground(new java.awt.Color(18, 158, 189));
        I4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I4.setAlignmentY(0.0F);
        I4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        I4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        I4.setIconTextGap(0);
        I4.setMaximumSize(new java.awt.Dimension(40, 40));
        I4.setMinimumSize(new java.awt.Dimension(40, 40));
        I4.setOpaque(true);
        I4.setPreferredSize(new java.awt.Dimension(40, 40));
        I4.setRequestFocusEnabled(false);
        grid.add(I4);
        I4.setBounds(130, 330, 40, 40);

        I5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I5.setAlignmentY(0.0F);
        I5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        I5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        I5.setIconTextGap(0);
        I5.setMaximumSize(new java.awt.Dimension(40, 40));
        I5.setMinimumSize(new java.awt.Dimension(40, 40));
        I5.setPreferredSize(new java.awt.Dimension(40, 40));
        I5.setRequestFocusEnabled(false);
        grid.add(I5);
        I5.setBounds(170, 330, 40, 40);

        I6.setBackground(new java.awt.Color(18, 158, 189));
        I6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I6.setAlignmentY(0.0F);
        I6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        I6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        I6.setIconTextGap(0);
        I6.setMaximumSize(new java.awt.Dimension(40, 40));
        I6.setMinimumSize(new java.awt.Dimension(40, 40));
        I6.setOpaque(true);
        I6.setPreferredSize(new java.awt.Dimension(40, 40));
        I6.setRequestFocusEnabled(false);
        grid.add(I6);
        I6.setBounds(210, 330, 40, 40);

        I7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I7.setAlignmentY(0.0F);
        I7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        I7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        I7.setIconTextGap(0);
        I7.setMaximumSize(new java.awt.Dimension(40, 40));
        I7.setMinimumSize(new java.awt.Dimension(40, 40));
        I7.setPreferredSize(new java.awt.Dimension(40, 40));
        I7.setRequestFocusEnabled(false);
        grid.add(I7);
        I7.setBounds(250, 330, 40, 40);

        I8.setBackground(new java.awt.Color(18, 158, 189));
        I8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I8.setAlignmentY(0.0F);
        I8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        I8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        I8.setIconTextGap(0);
        I8.setMaximumSize(new java.awt.Dimension(40, 40));
        I8.setMinimumSize(new java.awt.Dimension(40, 40));
        I8.setOpaque(true);
        I8.setPreferredSize(new java.awt.Dimension(40, 40));
        I8.setRequestFocusEnabled(false);
        grid.add(I8);
        I8.setBounds(290, 330, 40, 40);

        I9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I9.setAlignmentY(0.0F);
        I9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        I9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        I9.setIconTextGap(0);
        I9.setMaximumSize(new java.awt.Dimension(40, 40));
        I9.setMinimumSize(new java.awt.Dimension(40, 40));
        I9.setPreferredSize(new java.awt.Dimension(40, 40));
        I9.setRequestFocusEnabled(false);
        grid.add(I9);
        I9.setBounds(330, 330, 40, 40);

        I10.setBackground(new java.awt.Color(18, 158, 189));
        I10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I10.setAlignmentY(0.0F);
        I10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        I10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        I10.setIconTextGap(0);
        I10.setMaximumSize(new java.awt.Dimension(40, 40));
        I10.setMinimumSize(new java.awt.Dimension(40, 40));
        I10.setOpaque(true);
        I10.setPreferredSize(new java.awt.Dimension(40, 40));
        I10.setRequestFocusEnabled(false);
        grid.add(I10);
        I10.setBounds(370, 330, 40, 40);

        J1.setBackground(new java.awt.Color(18, 158, 189));
        J1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J1.setAlignmentY(0.0F);
        J1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        J1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        J1.setIconTextGap(0);
        J1.setMaximumSize(new java.awt.Dimension(40, 40));
        J1.setMinimumSize(new java.awt.Dimension(40, 40));
        J1.setOpaque(true);
        J1.setPreferredSize(new java.awt.Dimension(40, 40));
        J1.setRequestFocusEnabled(false);
        grid.add(J1);
        J1.setBounds(10, 370, 40, 40);

        J2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J2.setAlignmentY(0.0F);
        J2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        J2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        J2.setIconTextGap(0);
        J2.setMaximumSize(new java.awt.Dimension(40, 40));
        J2.setMinimumSize(new java.awt.Dimension(40, 40));
        J2.setPreferredSize(new java.awt.Dimension(40, 40));
        J2.setRequestFocusEnabled(false);
        grid.add(J2);
        J2.setBounds(50, 370, 40, 40);

        J3.setBackground(new java.awt.Color(18, 158, 189));
        J3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J3.setAlignmentY(0.0F);
        J3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        J3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        J3.setIconTextGap(0);
        J3.setMaximumSize(new java.awt.Dimension(40, 40));
        J3.setMinimumSize(new java.awt.Dimension(40, 40));
        J3.setOpaque(true);
        J3.setPreferredSize(new java.awt.Dimension(40, 40));
        J3.setRequestFocusEnabled(false);
        grid.add(J3);
        J3.setBounds(90, 370, 40, 40);

        J4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J4.setAlignmentY(0.0F);
        J4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        J4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        J4.setIconTextGap(0);
        J4.setMaximumSize(new java.awt.Dimension(40, 40));
        J4.setMinimumSize(new java.awt.Dimension(40, 40));
        J4.setPreferredSize(new java.awt.Dimension(40, 40));
        J4.setRequestFocusEnabled(false);
        grid.add(J4);
        J4.setBounds(130, 370, 40, 40);

        J5.setBackground(new java.awt.Color(18, 158, 189));
        J5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J5.setAlignmentY(0.0F);
        J5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        J5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        J5.setIconTextGap(0);
        J5.setMaximumSize(new java.awt.Dimension(40, 40));
        J5.setMinimumSize(new java.awt.Dimension(40, 40));
        J5.setOpaque(true);
        J5.setPreferredSize(new java.awt.Dimension(40, 40));
        J5.setRequestFocusEnabled(false);
        grid.add(J5);
        J5.setBounds(170, 370, 40, 40);

        J6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J6.setAlignmentY(0.0F);
        J6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        J6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        J6.setIconTextGap(0);
        J6.setMaximumSize(new java.awt.Dimension(40, 40));
        J6.setMinimumSize(new java.awt.Dimension(40, 40));
        J6.setPreferredSize(new java.awt.Dimension(40, 40));
        J6.setRequestFocusEnabled(false);
        grid.add(J6);
        J6.setBounds(210, 370, 40, 40);

        J7.setBackground(new java.awt.Color(18, 158, 189));
        J7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J7.setAlignmentY(0.0F);
        J7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        J7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        J7.setIconTextGap(0);
        J7.setMaximumSize(new java.awt.Dimension(40, 40));
        J7.setMinimumSize(new java.awt.Dimension(40, 40));
        J7.setOpaque(true);
        J7.setPreferredSize(new java.awt.Dimension(40, 40));
        J7.setRequestFocusEnabled(false);
        grid.add(J7);
        J7.setBounds(250, 370, 40, 40);

        J8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J8.setAlignmentY(0.0F);
        J8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        J8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        J8.setIconTextGap(0);
        J8.setMaximumSize(new java.awt.Dimension(40, 40));
        J8.setMinimumSize(new java.awt.Dimension(40, 40));
        J8.setPreferredSize(new java.awt.Dimension(40, 40));
        J8.setRequestFocusEnabled(false);
        grid.add(J8);
        J8.setBounds(290, 370, 40, 40);

        J9.setBackground(new java.awt.Color(18, 158, 189));
        J9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J9.setAlignmentY(0.0F);
        J9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        J9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        J9.setIconTextGap(0);
        J9.setMaximumSize(new java.awt.Dimension(40, 40));
        J9.setMinimumSize(new java.awt.Dimension(40, 40));
        J9.setOpaque(true);
        J9.setPreferredSize(new java.awt.Dimension(40, 40));
        J9.setRequestFocusEnabled(false);
        grid.add(J9);
        J9.setBounds(330, 370, 40, 40);

        E10.setBackground(new java.awt.Color(18, 158, 189));
        E10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E10.setAlignmentY(0.0F);
        E10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        E10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        E10.setIconTextGap(0);
        E10.setMaximumSize(new java.awt.Dimension(40, 40));
        E10.setMinimumSize(new java.awt.Dimension(40, 40));
        E10.setOpaque(true);
        E10.setPreferredSize(new java.awt.Dimension(40, 40));
        E10.setRequestFocusEnabled(false);
        grid.add(E10);
        E10.setBounds(370, 170, 40, 40);

        J10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J10.setAlignmentY(0.0F);
        J10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        J10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        J10.setIconTextGap(0);
        J10.setMaximumSize(new java.awt.Dimension(40, 40));
        J10.setMinimumSize(new java.awt.Dimension(40, 40));
        J10.setPreferredSize(new java.awt.Dimension(40, 40));
        J10.setRequestFocusEnabled(false);
        grid.add(J10);
        J10.setBounds(370, 370, 40, 40);

        gridDisplayArea.add(grid);
        grid.setBounds(0, 0, 420, 420);

        col10.setBackground(new java.awt.Color(10, 44, 77));
        col10.setForeground(new java.awt.Color(214, 220, 32));
        col10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        col10.setText("10");
        col10.setAlignmentY(0.0F);
        col10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        col10.setOpaque(true);
        gridDisplayArea.add(col10);
        col10.setBounds(380, 420, 20, 30);

        aLine.setBackground(new java.awt.Color(10, 44, 77));
        aLine.setForeground(new java.awt.Color(214, 220, 32));
        aLine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aLine.setText("A");
        aLine.setAlignmentY(0.0F);
        aLine.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        aLine.setOpaque(true);
        gridDisplayArea.add(aLine);
        aLine.setBounds(420, 20, 30, 20);

        bLine.setBackground(new java.awt.Color(10, 44, 77));
        bLine.setForeground(new java.awt.Color(214, 220, 32));
        bLine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bLine.setText("B");
        bLine.setAlignmentY(0.0F);
        bLine.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bLine.setOpaque(true);
        gridDisplayArea.add(bLine);
        bLine.setBounds(420, 60, 30, 20);

        cLine.setBackground(new java.awt.Color(10, 44, 77));
        cLine.setForeground(new java.awt.Color(214, 220, 32));
        cLine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cLine.setText("C");
        cLine.setAlignmentY(0.0F);
        cLine.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cLine.setOpaque(true);
        gridDisplayArea.add(cLine);
        cLine.setBounds(420, 100, 30, 20);

        dLine.setBackground(new java.awt.Color(10, 44, 77));
        dLine.setForeground(new java.awt.Color(214, 220, 32));
        dLine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dLine.setText("D");
        dLine.setAlignmentY(0.0F);
        dLine.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dLine.setOpaque(true);
        gridDisplayArea.add(dLine);
        dLine.setBounds(420, 140, 30, 20);

        eLine.setBackground(new java.awt.Color(10, 44, 77));
        eLine.setForeground(new java.awt.Color(214, 220, 32));
        eLine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eLine.setText("E");
        eLine.setAlignmentY(0.0F);
        eLine.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eLine.setOpaque(true);
        gridDisplayArea.add(eLine);
        eLine.setBounds(420, 180, 30, 20);

        fLine.setBackground(new java.awt.Color(10, 44, 77));
        fLine.setForeground(new java.awt.Color(214, 220, 32));
        fLine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fLine.setText("F");
        fLine.setAlignmentY(0.0F);
        fLine.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fLine.setOpaque(true);
        gridDisplayArea.add(fLine);
        fLine.setBounds(420, 220, 30, 20);

        gLine.setBackground(new java.awt.Color(10, 44, 77));
        gLine.setForeground(new java.awt.Color(214, 220, 32));
        gLine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gLine.setText("G");
        gLine.setAlignmentY(0.0F);
        gLine.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gLine.setOpaque(true);
        gridDisplayArea.add(gLine);
        gLine.setBounds(420, 260, 30, 20);

        hLine.setBackground(new java.awt.Color(10, 44, 77));
        hLine.setForeground(new java.awt.Color(214, 220, 32));
        hLine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hLine.setText("H");
        hLine.setAlignmentY(0.0F);
        hLine.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        hLine.setOpaque(true);
        gridDisplayArea.add(hLine);
        hLine.setBounds(420, 300, 30, 20);

        iLine.setBackground(new java.awt.Color(10, 44, 77));
        iLine.setForeground(new java.awt.Color(214, 220, 32));
        iLine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iLine.setText("I");
        iLine.setAlignmentY(0.0F);
        iLine.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        iLine.setOpaque(true);
        gridDisplayArea.add(iLine);
        iLine.setBounds(420, 340, 30, 20);

        jLine.setBackground(new java.awt.Color(10, 44, 77));
        jLine.setForeground(new java.awt.Color(214, 220, 32));
        jLine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLine.setText("J");
        jLine.setAlignmentY(0.0F);
        jLine.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLine.setOpaque(true);
        gridDisplayArea.add(jLine);
        jLine.setBounds(420, 380, 30, 20);

        col1.setBackground(new java.awt.Color(10, 44, 77));
        col1.setForeground(new java.awt.Color(214, 220, 32));
        col1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        col1.setText("1");
        col1.setAlignmentY(0.0F);
        col1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        col1.setOpaque(true);
        gridDisplayArea.add(col1);
        col1.setBounds(20, 420, 20, 30);

        col2.setBackground(new java.awt.Color(10, 44, 77));
        col2.setForeground(new java.awt.Color(214, 220, 32));
        col2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        col2.setText("2");
        col2.setAlignmentY(0.0F);
        col2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        col2.setOpaque(true);
        gridDisplayArea.add(col2);
        col2.setBounds(60, 420, 20, 30);

        col3.setBackground(new java.awt.Color(10, 44, 77));
        col3.setForeground(new java.awt.Color(214, 220, 32));
        col3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        col3.setText("3");
        col3.setAlignmentY(0.0F);
        col3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        col3.setOpaque(true);
        gridDisplayArea.add(col3);
        col3.setBounds(100, 420, 20, 30);

        col4.setBackground(new java.awt.Color(10, 44, 77));
        col4.setForeground(new java.awt.Color(214, 220, 32));
        col4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        col4.setText("4");
        col4.setAlignmentY(0.0F);
        col4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        col4.setOpaque(true);
        gridDisplayArea.add(col4);
        col4.setBounds(140, 420, 20, 30);

        col5.setBackground(new java.awt.Color(10, 44, 77));
        col5.setForeground(new java.awt.Color(214, 220, 32));
        col5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        col5.setText("5");
        col5.setAlignmentY(0.0F);
        col5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        col5.setOpaque(true);
        gridDisplayArea.add(col5);
        col5.setBounds(180, 420, 20, 30);

        col6.setBackground(new java.awt.Color(10, 44, 77));
        col6.setForeground(new java.awt.Color(214, 220, 32));
        col6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        col6.setText("6");
        col6.setAlignmentY(0.0F);
        col6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        col6.setOpaque(true);
        gridDisplayArea.add(col6);
        col6.setBounds(220, 420, 20, 30);

        col7.setBackground(new java.awt.Color(10, 44, 77));
        col7.setForeground(new java.awt.Color(214, 220, 32));
        col7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        col7.setText("7");
        col7.setAlignmentY(0.0F);
        col7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        col7.setOpaque(true);
        gridDisplayArea.add(col7);
        col7.setBounds(260, 420, 20, 30);

        col8.setBackground(new java.awt.Color(10, 44, 77));
        col8.setForeground(new java.awt.Color(214, 220, 32));
        col8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        col8.setText("8");
        col8.setAlignmentY(0.0F);
        col8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        col8.setOpaque(true);
        gridDisplayArea.add(col8);
        col8.setBounds(300, 420, 20, 30);

        col9.setBackground(new java.awt.Color(10, 44, 77));
        col9.setForeground(new java.awt.Color(214, 220, 32));
        col9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        col9.setText("9");
        col9.setAlignmentY(0.0F);
        col9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        col9.setOpaque(true);
        gridDisplayArea.add(col9);
        col9.setBounds(340, 420, 20, 30);

        infoDisplayArea.setBackground(new java.awt.Color(10, 44, 77));
        infoDisplayArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        infoDisplayArea.setAlignmentX(0.0F);
        infoDisplayArea.setAlignmentY(0.0F);
        infoDisplayArea.setMaximumSize(new java.awt.Dimension(325, 455));
        infoDisplayArea.setMinimumSize(new java.awt.Dimension(325, 455));
        infoDisplayArea.setPreferredSize(new java.awt.Dimension(325, 455));

        xCordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xCordFieldActionPerformed(evt);
            }
        });

        xCordLabel.setForeground(new java.awt.Color(214, 220, 32));
        xCordLabel.setText("Start Coordinate - ");
        xCordLabel.setToolTipText("");

        yCordLabel.setForeground(new java.awt.Color(214, 220, 32));
        yCordLabel.setText("End Coordinate - ");
        yCordLabel.setToolTipText("");

        firstLine.setForeground(new java.awt.Color(214, 220, 32));
        firstLine.setText("Before we begin, you need to deploy your ships");

        confirmButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        confirmButton.setForeground(new java.awt.Color(10, 44, 77));
        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        secondLine.setForeground(new java.awt.Color(214, 220, 32));
        secondLine.setText("First the Carrier (CV)");

        fourthLine.setForeground(new java.awt.Color(214, 220, 32));
        fourthLine.setText("Pick two squares that have a legnth of 5");

        thirdLine.setForeground(new java.awt.Color(214, 220, 32));
        thirdLine.setText("This is a 5 tile long ship");

        fifthLine.setForeground(new java.awt.Color(214, 220, 32));
        fifthLine.setText("They can be horizontal or vertical, but not diagonal");

        sixthLine.setForeground(new java.awt.Color(214, 220, 32));
        sixthLine.setText("Please enter the coordinate with the smallest number");

        seventhLine.setForeground(new java.awt.Color(214, 220, 32));
        seventhLine.setText("or highest order letter first, e.g.");

        eigthLine.setForeground(new java.awt.Color(214, 220, 32));
        eigthLine.setText("A1 before A5 or A2 before E2");

        ninthLine.setForeground(new java.awt.Color(214, 220, 32));
        ninthLine.setText("Once you have done this, hit confirm");

        javax.swing.GroupLayout infoDisplayAreaLayout = new javax.swing.GroupLayout(infoDisplayArea);
        infoDisplayArea.setLayout(infoDisplayAreaLayout);
        infoDisplayAreaLayout.setHorizontalGroup(
            infoDisplayAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoDisplayAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoDisplayAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoDisplayAreaLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(infoDisplayAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(yCordLabel)
                            .addComponent(xCordLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infoDisplayAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xCordField)
                            .addComponent(yCordField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confirmButton))
                    .addComponent(firstLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(secondLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thirdLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fourthLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fifthLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sixthLine, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                    .addComponent(seventhLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eigthLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ninthLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        infoDisplayAreaLayout.setVerticalGroup(
            infoDisplayAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoDisplayAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(firstLine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(secondLine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thirdLine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fourthLine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fifthLine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sixthLine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seventhLine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eigthLine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ninthLine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(infoDisplayAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoDisplayAreaLayout.createSequentialGroup()
                        .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoDisplayAreaLayout.createSequentialGroup()
                        .addGroup(infoDisplayAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(xCordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xCordLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infoDisplayAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yCordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yCordLabel))
                        .addGap(24, 24, 24))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(gridDisplayArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(infoDisplayArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(infoDisplayArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(gridDisplayArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void xCordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xCordFieldActionPerformed
        
    }//GEN-LAST:event_xCordFieldActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed

        if (gameStage < 6)
        {
            String xCordText = xCordField.getText();
            String yCordText = yCordField.getText();
            String xCordValue = xCordText.substring(1);
            String yCordValue = yCordText.substring(1);
            String xTenTest = xCordText.substring(2);
            String yTenTest = yCordText.substring(2);

            int startXCord = Integer.parseInt(xCordValue);
            int endXCord = Integer.parseInt(yCordValue);

            if (xTenTest != null)
            {
                xCordValue = "10";
            }

            if (yTenTest != null)
            {
                yCordValue = "10";
            }

            switch (gameStage)
            {
                case 1: masterRange = 4;
                    break;
                case 2: masterRange = 3;
                    break;
                case 3: masterRange = 2;
                    break;
                case 4: masterRange = 2;
                    break;
                case 5: masterRange = 1;
                    break;
            }

            int X1subX2 = startXCord - endXCord;
            int X2subX1 = endXCord - startXCord;

            if(X1subX2 == masterRange || X2subX1 == masterRange)
            {
                orientation = 2;
            }
            else
            {
                orientation = 1;
            }

            int i = 0;
            int nextXCord = startXCord;

            char midXCord = xCordText.charAt(0);

            String midCord = "";   

            switch (gameStage) 
            {
                // <editor-fold>
                case 1:
                    i = 3;
                    if (orientation == 2)
                    {
                        identifyGrid(xCordText);

                        while (i > 0)
                        {
                            nextXCord++;
                            midCord = xCordText.charAt(0) + String.valueOf(nextXCord);
                            identifyGrid(midCord);
                            i--;
                        }

                        identifyGrid(yCordText);
                    }
                    else if (orientation == 1)
                    {
                        identifyGrid(xCordText);

                        while (i > 0)
                        {
                            nextXCord = yCordToInt(midXCord);
                            nextXCord--;
                            midXCord = yCordToChar(nextXCord);
                            midCord = Character.toString(midXCord) + String.valueOf(startXCord);
                            identifyGrid(midCord);
                            i--;
                        }

                        identifyGrid(yCordText);
                    }
                    clearAndSetText();
                    break;
                case 2:
                    i = 2;
                    if (orientation == 2)
                    {

                        identifyGrid(xCordText);

                        while (i > 0)
                        {
                            nextXCord++;
                            midCord = xCordText.charAt(0) + String.valueOf(nextXCord);
                            identifyGrid(midCord);
                            i--;
                        }

                        identifyGrid(yCordText);
                    }
                    else if (orientation == 1)
                    {
                        identifyGrid(xCordText);

                        while (i > 0)
                        {
                            nextXCord = yCordToInt(midXCord);
                            nextXCord--;
                            midXCord = yCordToChar(nextXCord);
                            midCord = Character.toString(midXCord) + String.valueOf(startXCord);
                            identifyGrid(midCord);
                            i--;
                        }

                        identifyGrid(yCordText);
                    }
                    clearAndSetText();
                    break;
                case 3:
                    i = 1;
                    if (orientation == 2)
                    {
                        identifyGrid(xCordText);

                        while (i > 0)
                        {
                            nextXCord++;
                            midCord = xCordText.charAt(0) + String.valueOf(nextXCord);
                            identifyGrid(midCord);
                            i--;
                        }

                        identifyGrid(yCordText);
                    }
                    else if (orientation == 1)
                    {
                        identifyGrid(xCordText);

                        while (i > 0)
                        {
                            nextXCord = yCordToInt(midXCord);
                            nextXCord--;
                            midXCord = yCordToChar(nextXCord);
                            midCord = Character.toString(midXCord) + String.valueOf(startXCord);
                            identifyGrid(midCord);
                            i--;
                        }

                        identifyGrid(yCordText);
                    }
                    clearAndSetText();
                    break;
                case 4:
                    i = 1;
                    if (orientation == 2)
                    {
                        identifyGrid(xCordText);

                        while (i > 0)
                        {
                            nextXCord++;
                            midCord = xCordText.charAt(0) + String.valueOf(nextXCord);
                            identifyGrid(midCord);
                            i--;
                        }

                        identifyGrid(yCordText);
                    }
                    else if (orientation == 1)
                    {
                        identifyGrid(xCordText);

                        while (i > 0)
                        {
                            nextXCord = yCordToInt(midXCord);
                            nextXCord--;
                            midXCord = yCordToChar(nextXCord);
                            midCord = Character.toString(midXCord) + String.valueOf(startXCord);
                            identifyGrid(midCord);
                            i--;
                        }

                        identifyGrid(yCordText);
                    }
                    clearAndSetText();
                    break;
                case 5:
                    if (orientation == 2)
                    {
                        identifyGrid(xCordText);
                        identifyGrid(yCordText);

                    }
                    else if (orientation == 1)
                    {
                        identifyGrid(xCordText);
                        identifyGrid(yCordText);
                    }
                    clearAndSetText();
                    break;
                // </editor-fold>
            }
        }
        else if (gameStage == 6)
        {
            equation = "";
            
            while (xCordOne == xCordTwo)
            {
                xCordOne = (int)(Math.random()) - 10;
                xCordOne = (int)(Math.random()) - 10;
            }
            while (yCordOne == yCordTwo)
            {
                yCordOne = (int)(Math.random()) - 10;
                yCordOne = (int)(Math.random()) - 10;
            }
            
            if (gameStage < 6)
            {
                // <editor-fold>

                String xCordText = xCordField.getText();
                String yCordText = yCordField.getText();
                String xCordValue = xCordText.substring(1);
                String yCordValue = yCordText.substring(1);
                String xTenTest = xCordText.substring(2);
                String yTenTest = yCordText.substring(2);

                int startXCord = Integer.parseInt(xCordValue);
                int endXCord = Integer.parseInt(yCordValue);

                if (xTenTest != null)
                {
                    xCordValue = "10";
                }

                if (yTenTest != null)
                {
                    yCordValue = "10";
                }

                switch (gameStage)
                {
                    case 1: masterRange = 4;
                        break;
                    case 2: masterRange = 3;
                        break;
                    case 3: masterRange = 2;
                        break;
                    case 4: masterRange = 2;
                        break;
                    case 5: masterRange = 1;
                        break;
                }

                int X1subX2 = startXCord - endXCord;
                int X2subX1 = endXCord - startXCord;

                if(X1subX2 == masterRange || X2subX1 == masterRange)
                {
                    orientation = 2;
                }
                else
                {
                    orientation = 1;
                }

                int i = 0;
                int nextXCord = startXCord;

                char midXCord = xCordText.charAt(0);

                String midCord = "";   

                switch (gameStage) 
                {
                    // <editor-fold>
                    case 1:
                        i = 3;
                        if (orientation == 2)
                        {
                            identifyGrid(xCordText);

                            while (i > 0)
                            {
                                nextXCord++;
                                midCord = xCordText.charAt(0) + String.valueOf(nextXCord);
                                identifyGrid(midCord);
                                i--;
                            }

                            identifyGrid(yCordText);
                        }
                        else if (orientation == 1)
                        {
                            identifyGrid(xCordText);

                            while (i > 0)
                            {
                                nextXCord = yCordToInt(midXCord);
                                nextXCord--;
                                midXCord = yCordToChar(nextXCord);
                                midCord = Character.toString(midXCord) + String.valueOf(startXCord);
                                identifyGrid(midCord);
                                i--;
                            }

                            identifyGrid(yCordText);
                        }
                        clearAndSetText();
                        break;
                    case 2:
                        i = 2;
                        if (orientation == 2)
                        {

                            identifyGrid(xCordText);

                            while (i > 0)
                            {
                                nextXCord++;
                                midCord = xCordText.charAt(0) + String.valueOf(nextXCord);
                                identifyGrid(midCord);
                                i--;
                            }

                            identifyGrid(yCordText);
                        }
                        else if (orientation == 1)
                        {
                            identifyGrid(xCordText);

                            while (i > 0)
                            {
                                nextXCord = yCordToInt(midXCord);
                                nextXCord--;
                                midXCord = yCordToChar(nextXCord);
                                midCord = Character.toString(midXCord) + String.valueOf(startXCord);
                                identifyGrid(midCord);
                                i--;
                            }

                            identifyGrid(yCordText);
                        }
                        clearAndSetText();
                        break;
                    case 3:
                        i = 1;
                        if (orientation == 2)
                        {
                            identifyGrid(xCordText);

                            while (i > 0)
                            {
                                nextXCord++;
                                midCord = xCordText.charAt(0) + String.valueOf(nextXCord);
                                identifyGrid(midCord);
                                i--;
                            }

                            identifyGrid(yCordText);
                        }
                        else if (orientation == 1)
                        {
                            identifyGrid(xCordText);

                            while (i > 0)
                            {
                                nextXCord = yCordToInt(midXCord);
                                nextXCord--;
                                midXCord = yCordToChar(nextXCord);
                                midCord = Character.toString(midXCord) + String.valueOf(startXCord);
                                identifyGrid(midCord);
                                i--;
                            }

                            identifyGrid(yCordText);
                        }
                        clearAndSetText();
                        break;
                    case 4:
                        i = 1;
                        if (orientation == 2)
                        {
                            identifyGrid(xCordText);

                            while (i > 0)
                            {
                                nextXCord++;
                                midCord = xCordText.charAt(0) + String.valueOf(nextXCord);
                                identifyGrid(midCord);
                                i--;
                            }

                            identifyGrid(yCordText);
                        }
                        else if (orientation == 1)
                        {
                            identifyGrid(xCordText);

                            while (i > 0)
                            {
                                nextXCord = yCordToInt(midXCord);
                                nextXCord--;
                                midXCord = yCordToChar(nextXCord);
                                midCord = Character.toString(midXCord) + String.valueOf(startXCord);
                                identifyGrid(midCord);
                                i--;
                            }

                            identifyGrid(yCordText);
                        }
                        clearAndSetText();
                        break;
                    case 5:
                        if (orientation == 2)
                        {
                            identifyGrid(xCordText);
                            identifyGrid(yCordText);

                        }
                        else if (orientation == 1)
                        {
                            identifyGrid(xCordText);
                            identifyGrid(yCordText);
                        }
                        clearAndSetText();
                        break;
                    // </editor-fold>
                }

                // </editor-fold>

            }

            else if (gameStage == 6)
            {
                if (firstRun == true)
                {
                    xCordField.setText("");
                    answer = "";
                    firstLine.setText("");
                    secondLine.setText("");
                    thirdLine.setText("");
                    fourthLine.setText("");
                    fifthLine.setText("");
                    sixthLine.setText("");
                    seventhLine.setText("");
                    eigthLine.setText("");
                    ninthLine.setText("");
                    firstRun = false;
                }

                answer = xCordLabel.getText();

                if (answer.equals(""))
                {
                    if (AIShips > 0)
                    {
                        xCordLabel.setText("Answer - ");
                        yCordLabel.setText("- ");

                        while (xCordOne == xCordTwo)
                        {
                            xCordOne = (int)(Math.random() * 21) - 10;
                            xCordTwo = (int)(Math.random() * 21) - 10;
                        }

                        while (yCordOne == yCordTwo)
                        {
                            yCordOne = (int)(Math.random() * 21) - 10;
                            yCordTwo = (int)(Math.random() * 21) - 10;
                        }

                        Gradient = (yCordTwo - yCordOne) / (xCordTwo-xCordOne);
                        yIntercept = (yCordOne - (Gradient * xCordOne));
                        xIntercept = ((yIntercept * -1) / Gradient);
                        equation = "y = " + String.valueOf(Gradient) + "x + " + yIntercept;

                        questionType = (int) (Math.random() * 4) + 1;

                        // <editor-fold>

                        switch (questionType)
                        {
                            case 1:
                                firstLine.setText("");
                                firstLine.setText("given the equation of the line AB");
                                secondLine.setText(equation);
                                thirdLine.setText("find the x intercept of AB");
                                answer = Float.toString(xIntercept);
                                break;
                            case 2:
                                firstLine.setText("Given the gradient of the line AB");
                                secondLine.setText(Float.toString(Gradient));
                                thirdLine.setText("and the point C");
                                fourthLine.setText(Float.toString(xCordOne) + ", " + Integer.toString(yCordOne));
                                fifthLine.setText("find the y intercept of AB");
                                answer = Float.toString(yIntercept);
                                break;
                            case 3:
                                firstLine.setText("Given that the Line AB passes through");
                                secondLine.setText("Point A : " +  Integer.toString(xCordOne) + ", " + Integer.toString(yCordOne));
                                thirdLine.setText("Point B : " +  Integer.toString(xCordTwo) + ", " + Integer.toString(yCordTwo));
                                fourthLine.setText("Find the gradient of AB");
                                answer = Float.toString(Gradient);
                                break;
                            case 4:
                                firstLine.setText("Givent that the line AB passes through");
                                secondLine.setText("Point A : " +  Integer.toString(xCordOne) + ", " + Integer.toString(yCordOne));
                                thirdLine.setText("And has a gradient of");
                                fourthLine.setText(Float.toString(Gradient));
                                fifthLine.setText("Find the equation of AB in the form");
                                sixthLine.setText("Y = MX + C");
                                answer = equation;
                                break;
                        }

                        // </editor-fold>
                    }
                }
                else if (xCordLabel.equals(answer))
                {
                    AIShips--;

                    if (AIShips > 0)
                    {
                        firstLine.setText("Correct! Hostile ship sunk");
                        secondLine.setText("The enemy now has " + AIShips + " remaining");
                        thirdLine.setText("Click confirm to continue");
                        xCordField.setText("");
                        answer = "";
                    }
                }
                else 
                {
                    firstLine.setText("Incorrect! We missed the target");
                    secondLine.setText("Click confirm to continue"); 
                    xCordField.setText("");
                    answer = "";
                }
            }
        }
    }//GEN-LAST:event_confirmButtonActionPerformed
    
    // <editor-fold>
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A1;
    private javax.swing.JLabel A10;
    private javax.swing.JLabel A2;
    private javax.swing.JLabel A3;
    private javax.swing.JLabel A4;
    private javax.swing.JLabel A5;
    private javax.swing.JLabel A6;
    private javax.swing.JLabel A7;
    private javax.swing.JLabel A8;
    private javax.swing.JLabel A9;
    private javax.swing.JLabel B1;
    private javax.swing.JLabel B10;
    private javax.swing.JLabel B2;
    private javax.swing.JLabel B3;
    private javax.swing.JLabel B4;
    private javax.swing.JLabel B5;
    private javax.swing.JLabel B6;
    private javax.swing.JLabel B7;
    private javax.swing.JLabel B8;
    private javax.swing.JLabel B9;
    private javax.swing.JLabel C1;
    private javax.swing.JLabel C10;
    private javax.swing.JLabel C2;
    private javax.swing.JLabel C3;
    private javax.swing.JLabel C4;
    private javax.swing.JLabel C5;
    private javax.swing.JLabel C6;
    private javax.swing.JLabel C7;
    private javax.swing.JLabel C8;
    private javax.swing.JLabel C9;
    private javax.swing.JLabel D1;
    private javax.swing.JLabel D10;
    private javax.swing.JLabel D2;
    private javax.swing.JLabel D3;
    private javax.swing.JLabel D4;
    private javax.swing.JLabel D5;
    private javax.swing.JLabel D6;
    private javax.swing.JLabel D7;
    private javax.swing.JLabel D8;
    private javax.swing.JLabel D9;
    private javax.swing.JLabel E1;
    private javax.swing.JLabel E10;
    private javax.swing.JLabel E2;
    private javax.swing.JLabel E3;
    private javax.swing.JLabel E4;
    private javax.swing.JLabel E5;
    private javax.swing.JLabel E6;
    private javax.swing.JLabel E7;
    private javax.swing.JLabel E8;
    private javax.swing.JLabel E9;
    private javax.swing.JLabel F1;
    private javax.swing.JLabel F10;
    private javax.swing.JLabel F2;
    private javax.swing.JLabel F3;
    private javax.swing.JLabel F4;
    private javax.swing.JLabel F5;
    private javax.swing.JLabel F6;
    private javax.swing.JLabel F7;
    private javax.swing.JLabel F8;
    private javax.swing.JLabel F9;
    private javax.swing.JLabel G1;
    private javax.swing.JLabel G10;
    private javax.swing.JLabel G2;
    private javax.swing.JLabel G3;
    private javax.swing.JLabel G4;
    private javax.swing.JLabel G5;
    private javax.swing.JLabel G6;
    private javax.swing.JLabel G7;
    private javax.swing.JLabel G8;
    private javax.swing.JLabel G9;
    private javax.swing.JLabel H1;
    private javax.swing.JLabel H10;
    private javax.swing.JLabel H2;
    private javax.swing.JLabel H3;
    private javax.swing.JLabel H4;
    private javax.swing.JLabel H5;
    private javax.swing.JLabel H6;
    private javax.swing.JLabel H7;
    private javax.swing.JLabel H8;
    private javax.swing.JLabel H9;
    private javax.swing.JLabel I1;
    private javax.swing.JLabel I10;
    private javax.swing.JLabel I2;
    private javax.swing.JLabel I3;
    private javax.swing.JLabel I4;
    private javax.swing.JLabel I5;
    private javax.swing.JLabel I6;
    private javax.swing.JLabel I7;
    private javax.swing.JLabel I8;
    private javax.swing.JLabel I9;
    private javax.swing.JLabel J1;
    private javax.swing.JLabel J10;
    private javax.swing.JLabel J2;
    private javax.swing.JLabel J3;
    private javax.swing.JLabel J4;
    private javax.swing.JLabel J5;
    private javax.swing.JLabel J6;
    private javax.swing.JLabel J7;
    private javax.swing.JLabel J8;
    private javax.swing.JLabel J9;
    private javax.swing.JLabel aLine;
    private javax.swing.JLabel bLine;
    private javax.swing.JLabel cLine;
    private javax.swing.JLabel col1;
    private javax.swing.JLabel col10;
    private javax.swing.JLabel col2;
    private javax.swing.JLabel col3;
    private javax.swing.JLabel col4;
    private javax.swing.JLabel col5;
    private javax.swing.JLabel col6;
    private javax.swing.JLabel col7;
    private javax.swing.JLabel col8;
    private javax.swing.JLabel col9;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel dLine;
    private javax.swing.JLabel eLine;
    private javax.swing.JLabel eigthLine;
    private javax.swing.JLabel fLine;
    private javax.swing.JLabel fifthLine;
    private javax.swing.JLabel firstLine;
    private javax.swing.JLabel fourthLine;
    private javax.swing.JLabel gLine;
    private javax.swing.JPanel grid;
    private javax.swing.JPanel gridDisplayArea;
    private javax.swing.JLabel hLine;
    private javax.swing.JLabel iLine;
    private javax.swing.JPanel infoDisplayArea;
    private javax.swing.JLabel jLine;
    private javax.swing.JLabel ninthLine;
    private javax.swing.JLabel secondLine;
    private javax.swing.JLabel seventhLine;
    private javax.swing.JLabel sixthLine;
    private javax.swing.JLabel thirdLine;
    private javax.swing.JTextField xCordField;
    private javax.swing.JLabel xCordLabel;
    private javax.swing.JTextField yCordField;
    private javax.swing.JLabel yCordLabel;
    // End of variables declaration//GEN-END:variables

    // </editor-fold>
    
    public void identifyGrid(String inputCord)
    {
        switch (inputCord)
        {
            // <editor-fold>
            case "A1":A1.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "A2":A2.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "A3":A3.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "A4":A4.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "A5":A5.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "A6":A6.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "A7":A7.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "A8":A8.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "A9":A9.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "A10":A10.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "B1":B1.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "B2":B2.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "B3":B3.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "B4":B4.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "B5":B5.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "B6":B6.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "B7":B7.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "B8":B8.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "B9":B9.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "B10":B10.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "C1":C1.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "C2":C2.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "C3":C3.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "C4":C4.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "C5":C5.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "C6":C6.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "C7":C7.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "C8":C8.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "C9":C9.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "C10":C10.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "D1":D1.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "D2":D2.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "D3":D3.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "D4":D4.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "D5":D5.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "D6":D6.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "D7":D7.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "D8":D8.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "D9":D9.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "D10":D10.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "E1":E1.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "E2":E2.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "E3":E3.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "E4":E4.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "E5":E5.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "E6":E6.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "E7":E7.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "E8":E8.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "E9":E9.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "E10":E10.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "F1":F1.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "F2":F2.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "F3":F3.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "F4":F4.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "F5":F5.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "F6":F6.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "F7":F7.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "F8":F8.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "F9":F9.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "F10":F10.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "G1":G1.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "G2":G2.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "G3":G3.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "G4":G4.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "G5":G5.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "G6":G6.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "G7":G7.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "G8":G8.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "G9":G9.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "G10":G10.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "H1":H1.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "H2":H2.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "H3":H3.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "H4":H4.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "H5":H5.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "H6":H6.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "H7":H7.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "H8":H8.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "H9":H9.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "H10":H10.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "I1":I1.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "I2":I2.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "I3":I3.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "I4":I4.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "I5":I5.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "I6":I6.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "I7":I7.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "I8":I8.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "I9":I9.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "I10":I10.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "J1":J1.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "J2":J2.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "J3":J3.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "J4":J4.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "J5":J5.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "J6":J6.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "J7":J7.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "J8":J8.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "J9":J9.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            case "J10":J10.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconIdentify())));
                break;
            // </editosr-fold>
        }
        
        recordGrid(inputCord);
    }
    
    public String iconIdentify()
    {
        String iconIdentity = "";
        
        switch (gameStage)
        {
            case 1:
                switch (CVIcons)
                {
                    // <editor-fold>
                    case 5:
                        if(orientation == 1)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Carrier Bow V.png";
                        }
                        else if (orientation == 2)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Carrier Bow H.png";
                        }
                        CVIcons --;
                        break;
                    case 4:
                        if(orientation == 1)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Carrier Forward Midships V.png";
                        }
                        else if (orientation == 2)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Carrier Forward Midships H.png";
                        }
                        CVIcons --;
                        break;
                    case 3:
                        if(orientation == 1)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Carrier Midships V.png";
                        }
                        else if (orientation == 2)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Carrier Midships H.png";
                        }
                        CVIcons --;
                        break;
                    case 2:
                        if(orientation == 1)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Carrier Aft Midships V.png";
                        }
                        else if (orientation == 2)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Carrier Aft Midships H.png";
                        }
                        CVIcons --;
                        break;
                    case 1:
                        if(orientation == 1)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Carrier Stern V.png";
                        }
                        else if (orientation == 2)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Carrier Stern H.png";
                        }
                        CVIcons --;
                        break;
                    // </editor-fold>
                }
                break;
            case 2:
                switch (BBIcons)
                {
                    // <editor-fold>
                    case 4:
                        if(orientation == 1)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Battleship Bow V.png";
                        }
                        else if (orientation == 2)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Battleship Bow H.png";
                        }
                        BBIcons --;
                        break;
                    case 3:
                        if(orientation == 1)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Battleship Forward Midships V.png";
                        }
                        else if (orientation == 2)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Battleship Forward Midships H.png";
                        }
                        BBIcons --;
                        break;
                    case 2:
                        if(orientation == 1)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Battleship Aft Midships V.png";
                        }
                        else if (orientation == 2)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Battleship Aft Midships H.png";
                        }
                        BBIcons --;
                        break;
                    case 1:
                        if(orientation == 1)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Battleship Stern V.png";
                        }
                        else if (orientation == 2)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Battleship Stern H.png";
                        }
                        BBIcons --;
                        break;
                    // </editor-fold>
                }
                break;
            case 3:
                switch (CRIcons)
                {
                // <editor-fold>
                    case 3:
                        if(orientation == 1)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Cruiser Bow V.png";
                        }
                        else if (orientation == 2)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Cruiser Bow H.png";
                        }
                        CRIcons --;
                        break;
                    case 2:
                        if(orientation == 1)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Cruiser Midships V.png";
                        }
                        else if (orientation == 2)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Cruiser Midships H.png";
                        }
                        CRIcons --;
                        break;
                    case 1:
                        if(orientation == 1)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Cruiser Stern V.png";
                        }
                        else if (orientation == 2)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Cruiser Stern H.png";
                        }
                        CRIcons --;
                        break;
                    // </editor-fold>
                }
                break;
            case 4:
                switch (SBIcons)
                {
                // <editor-fold>
                    case 3:
                        if(orientation == 1)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Sub Bow V.png";
                        }
                        else if (orientation == 2)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Sub Bow H.png";
                        }
                        SBIcons --;
                        break;
                    case 2:
                        if(orientation == 1)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Sub Midships V.png";
                        }
                        else if (orientation == 2)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Sub Midships H.png";
                        }
                        SBIcons --;
                        break;
                    case 1:
                        if(orientation == 1)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Sub Stern V.png";
                        }
                        else if (orientation == 2)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Sub Stern H.png";
                        }
                        SBIcons --;
                        break;
                    // </editor-fold>
                }
                break;
            case 5:
                switch (DDIcons)
                {
                // <editor-fold>
                    case 2:
                        if(orientation == 1)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Destroyer Bow V.png";
                        }
                        else if (orientation == 2)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Destroyer Bow H.png";
                        }
                        DDIcons --;
                        break;
                    case 1:
                        if(orientation == 1)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Destroyer Stern V.png";
                        }
                        else if (orientation == 2)
                        {
                            iconIdentity = "/battlegraphs_v6/battlegraphs_v6_icons/Destroyer Stern H.png";
                        }
                        DDIcons --;
                        break;
                    // </editor-fold>
                }
            break;
                
        }
        
        
        return iconIdentity;
    }
    
    public int yCordToInt(char yCharCord)
    {
        int yIntCord = 0;
        
        switch (yCharCord)
        {
            case 'A':
                yIntCord = 10;
                break;
            case 'B':
                yIntCord = 9;
                break;
            case 'C':
                yIntCord = 8;
                break;
            case 'D':
                yIntCord = 7;
                break;
            case 'E':
                yIntCord = 6;
                break;
            case 'F':
                yIntCord = 5;
                break;
            case 'G':
                yIntCord = 4;
                break;
            case 'H':
                yIntCord = 3;
                break;
            case 'I':
                yIntCord = 2;
                break;
            case 'J':
                yIntCord = 1;
                break;
        }
        
        return yIntCord;
    }
    
    public char yCordToChar(int yIntCord)
    {
        char yCharCord = '-';
        
        switch (yIntCord)
        {
            case 10:
                yCharCord = 'A';
                break;
            case 9:
                yCharCord = 'B';
                break;
            case 8:
                yCharCord = 'C';
                break;
            case 7:
                yCharCord = 'D';
                break;
            case 6:
                yCharCord = 'E';
                break;
            case 5:
                yCharCord = 'F';
                break;
            case 4:
                yCharCord = 'G';
                break;
            case 3:
                yCharCord = 'H';
                break;
            case 2:
                yCharCord = 'I';
                break;
            case 1:
                yCharCord = 'J';
                break;
        }
        
        return yCharCord;
    }
    
    public void clearAndSetText()
    {
        xCordField.setText("");
        yCordField.setText("");
        
        switch(gameStage)
        {
            case 1:
                firstLine.setText("Good!");
                secondLine.setText("Now to place your Battleship");
                thirdLine.setText("This is a 4 tile long ship");
                fourthLine.setText("The same rules apply for cord picks");
                fifthLine.setText("Take care to ensure that your picks");
                sixthLine.setText("will not overlap with any other ship");
                seventhLine.setText("");
                eigthLine.setText("");
                ninthLine.setText("");
                gameStage++;
                break;
            case 2:
                firstLine.setText("Good!");
                secondLine.setText("Now to place your Cruiser");
                thirdLine.setText("This is a 3 tile long ship");
                fourthLine.setText("The same rules apply for cord picks");
                fifthLine.setText("Take care to ensure that your picks");
                sixthLine.setText("do will not overlap with any other ship");
                gameStage++;
                break;
            case 3:
                firstLine.setText("Good!");
                secondLine.setText("Now to place your Submarine");
                thirdLine.setText("This is a 3 tile long ship");
                fourthLine.setText("The same rules apply for cord picks");
                fifthLine.setText("Take care to ensure that your picks");
                sixthLine.setText("do will not overlap with any other ship");
                gameStage++;
                break;
            case 4:
                firstLine.setText("Good!");
                secondLine.setText("Now to place your Destroyer");
                thirdLine.setText("This is a 2 tile long ship");
                fourthLine.setText("The same rules apply for cord picks");
                fifthLine.setText("Take care to ensure that your picks");
                sixthLine.setText("do will not overlap with any other ship");
                gameStage++;
                break;
            case 5:
                firstLine.setText("That's all your ships placed");
                secondLine.setText("Now it's time to being the game");
                thirdLine.setText("The enemy has the same ships as you");
                fourthLine.setText("You have to sink them all");
                fifthLine.setText("Answer the questions correctly to score hits");
                sixthLine.setText("The AI will make guesses every round");
                seventhLine.setText("Ships you have lost will be marked");
                eigthLine.setText("Click confirm to continue");
                gameStage++;
                break;
        }
    }
    
    public void recordGrid(String gridRef)
    {
        if (playerShips < 17)
        {
            shipCords[playerShips] = gridRef;
            playerShips++;
        }
    }
}
