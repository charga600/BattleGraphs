
package battlegraphs_v6;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BattleGraphs_V6 
{
        
    JPanel cards;
    
    public void addComponentToPane (Container pane)
    {
        JPanel MainMenuCard = new MainMenu_V6();
        JPanel DifficultySelectorCard = new DifficultySelection_V6();
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1,7));
        buttonPanel.setBounds(25, 420, 25, 420);
        buttonPanel.add(new JButton("Single Player"));
        buttonPanel.add(new JButton("Two Player"));
        buttonPanel.add(new JButton("Easy"));
        buttonPanel.add(new JButton("Moderate"));
        buttonPanel.add(new JButton("Hard"));
        buttonPanel.add(new JButton("Confirm"));
        buttonPanel.add(new JButton("Help"));
        
        cards = new JPanel(new CardLayout());
        
        cards.add(MainMenuCard, "MainMenuCard");
        cards.add(DifficultySelectorCard, "DifficultyCard");
        
        pane.add(buttonPanel, BorderLayout.PAGE_START);
        pane.add(cards, BorderLayout.CENTER);
    }

    public void cardSwitchMethod(String panelName)
    {
        CardLayout cL = (CardLayout) (cards.getLayout());
        cL.show(cards, panelName);
    }
    
    private static void createAndShowGUI() 
    {
        JFrame frame = new JFrame("BattleGraphs");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new java.awt.Dimension(800, 455));
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
}