
package BattleGraphs_V1;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BattleGraphs_V1
{
    JPanel cards;
    
    public void addComponentToPane (Container pane)
    {
        JPanel MainMenuCard = new MainMenu_V1();
        JPanel DifficultySelectorCard = new DifficultySelector_V1();
        
        cards = new JPanel(new CardLayout());
        
        cards.add(MainMenuCard, "MainMenuCard");
        cards.add(DifficultySelectorCard, "DifficultyCard");
        
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
        frame.setPreferredSize(new java.awt.Dimension(725, 420));
        frame.setResizable(false);
        
        BattleGraphs_V1 containerPanel = new BattleGraphs_V1();
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
