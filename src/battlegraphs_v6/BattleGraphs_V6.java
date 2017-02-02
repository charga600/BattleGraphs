
package battlegraphs_v6;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BattleGraphs_V6 
{
        
    JPanel cards;
    
    public static final String mainMenu = "Difficulty Selection";
    public static final String diffSelec = "Difficulty Selection";
    public static final String placement = "Difficulty Selection";
    public static final String help = "Difficulty Selection";
    
    public int playerNumbers = 1;  //1 = singleplayer, 2 = two player
    
    public void addComponentToPane (Container pane)
    {
        JPanel MainMenuCard = new MainMenu_V6();
        JPanel DifficultySelectorCard = new DifficultySelection_V6();
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1,7));
        buttonPanel.setBounds(25, 420, 25, 420);
        
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
                cards.removeAll();
                cards.add(DifficultySelectorCard, diffSelec);
                playerNumbers = 1;
                cards.repaint();
                cards.revalidate();
            }
        });
        singlePlayer.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae) 
            {
                cards.removeAll();
                cards.add(DifficultySelectorCard, diffSelec);
                playerNumbers = 2;
                cards.repaint();
                cards.revalidate();
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
        
        cards.add(MainMenuCard, mainMenu);
        
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