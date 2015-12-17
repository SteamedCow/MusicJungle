package musicjungle.gui.game;
import javax.swing.JPanel;

/**
 * GameController
 * @author SteamedCow
 * @version 17-12-2015
 */
public class GameController 
{
    private final GameView view;
    private static GameModel model;

    public GameController(int buttonCount, int roundTime) {
        view = new GameView();
        model = new GameModel(view, buttonCount, roundTime*1000);
    }
    
    public JPanel getPanel() {
        return view;
    }
    
    public static void newRound() {
        model.newRound();
    }
    
    public static void startRound() {
        model.startRound();
    }
}