package musicjungle.round.gui;
import javax.swing.JPanel;

/**
 * RoundController
 * @author SteamedCow
 * @version 17-12-2015
 */
public class RoundController 
{
    private final RoundView view;
    private static RoundModel model;

    public RoundController() {
        view = new RoundView();
        model = new RoundModel(view);
    }
    
    public JPanel getPanel() {
        return view;
    }
    
    public static void newRound(int buttonCount, int roundTime) {
        model.newRound(buttonCount, roundTime*1000);
    }
    
    public static void startRound() {
        model.startRound();
    }
}