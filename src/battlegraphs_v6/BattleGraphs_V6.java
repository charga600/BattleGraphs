
package battlegraphs_v6;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BattleGraphs_V6 
{   
    JPanel cards;
    
    public static final String menuStr = "Main Menu";
    public static final String diffStr = "Difficulty Selection";
    public static final String gameStr = "Game Screen";
    public static final String helpStr = "Help Screen";
    
    public int playerNumbers = 1;  //1 = singleplayer, 2 = two player
    public int diffSetting = 1; //1 = easy, 2 = moderate, 3 = hard
    
    public boolean sPClicked = false; //false for not clicked, true for clicked (ie cannot be clicked again)
    public boolean tPClicked = false;
    public boolean easyClicked = false;
    public boolean moderateClicked = false;
    public boolean hardClicked = false;
    public boolean helpClicked = false;
    
    public void addComponentToPane (Container pane)
    {
        JPanel MainMenuCard = new MainMenu_V6();
        JPanel DifficultySelectorCard = new DifficultySelection_V6();
        JPanel GameScreen = new GameScreen_V6();
        JPanel HelpScreen = new HelpScreen_V6();
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1,7));
        buttonPanel.setBounds(25, 800, 25, 800);
        
        JButton singlePlayer = new JButton("SinglePlayer");
        JButton twoPlayer = new JButton("Two Player");
        JButton easy = new JButton("Easy");
        JButton moderate = new JButton("Moderate");
        JButton hard = new JButton("Hard");
        JButton confirm = new JButton("Confirm");
        JButton help = new JButton("Help");
        
        singlePlayer.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent ae) 
            {
                if (sPClicked == false)
                {
                    cards.removeAll();
                    cards.add(DifficultySelectorCard, diffStr);
                    playerNumbers = 1;
                    cards.repaint();
                    cards.revalidate();
                    sPClicked = true;
                    tPClicked = true;
                }
                else if (sPClicked == true)
                {
                    JOptionPane.showMessageDialog(pane,"You have already completed this step");
                }
                else
                {
                    JOptionPane.showMessageDialog(pane,"Fatal Error");
                }
            }
        });
        twoPlayer.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                if (tPClicked == false)
                {
                    cards.removeAll();
                    cards.add(DifficultySelectorCard, diffStr);
                    playerNumbers = 2;
                    cards.repaint();
                    cards.revalidate();
                    sPClicked = true;
                    tPClicked = true;
                }
                else if (tPClicked == true)
                {
                    JOptionPane.showMessageDialog(pane,"You have already completed this step");
                }
                else
                {
                    JOptionPane.showMessageDialog(pane,"Fatal Error");
                }
            }
        });
        easy.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                if(isClickable(1) == true)
                {
                    if (easyClicked == false)
                    {
                        cards.removeAll();
                        cards.add(GameScreen, gameStr);
                        diffSetting = 1;
                        cards.repaint();
                        cards.revalidate();
                        easyClicked = true;
                        moderateClicked = true;
                        hardClicked = true;
                    }
                    else if (easyClicked == true)
                    {
                        JOptionPane.showMessageDialog(pane,"You have already completed this step");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(pane,"Fatal Error");
                    }
                }
                else if (isClickable(2) == false)
                {
                    JOptionPane.showMessageDialog(pane,"You haven't selected a mode");
                }
                else
                {
                    JOptionPane.showMessageDialog(pane,"Fatal Error");
                }
            }
        });
        moderate.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                if(isClickable(1) == true)
                {
                    if (moderateClicked == false)
                    {
                        cards.removeAll();
                        cards.add(GameScreen, gameStr);
                        diffSetting = 2;
                        cards.repaint();
                        cards.revalidate();
                        easyClicked = true;
                        moderateClicked = true;
                        hardClicked = true;
                    }
                    else if (moderateClicked == true)
                    {
                        JOptionPane.showMessageDialog(pane,"You have already completed this step");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(pane,"Fatal Error");
                    }
                }
                else if (isClickable(1) == false)
                {
                    JOptionPane.showMessageDialog(pane,"You haven't selected a mode");
                }
                else
                {
                    JOptionPane.showMessageDialog(pane,"Fatal Error");
                }
            }
        });
        hard.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                if(isClickable(1) == true)
                {
                    if (hardClicked == false)
                    {
                        cards.removeAll();
                        cards.add(GameScreen, gameStr);
                        diffSetting = 3;
                        cards.repaint();
                        cards.revalidate();
                        easyClicked = true;
                        moderateClicked = true;
                        hardClicked = true;
                    }
                    else if (hardClicked == true)
                    {
                        JOptionPane.showMessageDialog(pane,"You have already completed this step");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(pane,"Fatal Error");
                    }
                }
                else if (isClickable(1) == false)
                {
                    JOptionPane.showMessageDialog(pane,"You haven't selected a mode");
                }
                else
                {
                    JOptionPane.showMessageDialog(pane,"Fatal Error");
                }
            }
        });
        confirm.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                if (isClickable(2) == true)
                {
                    
                }else if(isClickable(2) == false)
                {
                    JOptionPane.showMessageDialog(pane,"You haven't selected a mode and/or difficulty");
                }
                else
                {
                    JOptionPane.showMessageDialog(pane,"Fatal Error");
                }
            }
        });
        help.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                if (isClickable(2) == true)
                {
                    if (helpClicked == false)
                    {
                        cards.removeAll();
                        cards.add(HelpScreen, helpStr);
                        cards.repaint();
                        cards.revalidate();
                        helpClicked = true;
                    }
                    else if (helpClicked == true)
                    {
                        cards.removeAll();
                        cards.add(GameScreen, gameStr);
                        cards.repaint();
                        cards.revalidate();
                        helpClicked = false;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(pane,"Fatal Error");
                    }
                }else if(isClickable(2) == false)
                {
                    JOptionPane.showMessageDialog(pane,"You haven't selected a mode and/or difficulty");
                }
                else
                {
                    JOptionPane.showMessageDialog(pane,"Fatal Error");
                }
            }
        });
        
        
        buttonPanel.add(singlePlayer);
        buttonPanel.add(twoPlayer);
        buttonPanel.add(easy);
        buttonPanel.add(moderate);
        buttonPanel.add(hard);
        buttonPanel.add(confirm);
        buttonPanel.add(help);
        
        cards = new JPanel(new CardLayout());
        
        cards.add(MainMenuCard, menuStr);
        
        pane.add(buttonPanel, BorderLayout.PAGE_START);
        pane.add(cards, BorderLayout.CENTER);
    }
    
    private static void createAndShowGUI() 
    {
        JFrame frame = new JFrame("BattleGraphs");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new java.awt.Dimension(800, 505));
        frame.setResizable(false);
        
        BattleGraphs_V6 containerPanel = new BattleGraphs_V6();
        containerPanel.addComponentToPane(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) 
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() 
            {
                createAndShowGUI();
            }
        });
    }
    
    public boolean isClickable(int stage)
    {
        
        boolean returnCheck = false;
        
        if(sPClicked == true && tPClicked == true && stage == 2) // mode is selected and difficulty has been selected (two lines below)
        {
            if(easyClicked == true && moderateClicked == true && hardClicked == true)
            {
                returnCheck = true;
            }
            else if (easyClicked == false && moderateClicked == false && hardClicked == false)
            {
                returnCheck = false;
            }
        }
        else if (sPClicked == true && tPClicked == true) // mode 
        {
            returnCheck = true;
        }
        else if (sPClicked == false && tPClicked == false)
        {
            returnCheck = false;
        }
        else
        {
            returnCheck = false;
        }
        
        return returnCheck;
    }
}