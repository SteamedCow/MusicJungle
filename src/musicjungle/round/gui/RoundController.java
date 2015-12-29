package musicjungle.round.gui;
import javax.swing.JPanel;
import javazoom.jl.decoder.JavaLayerException;
import musicjungle.models.SongButton;

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
    
    public static void setRound(int buttonCount, int roundTime) {
        model.setRound(buttonCount, roundTime*1000);
    }
    
    public static void newRound() {
        model.startRound();
    }
    
    public static void stopRound() {
        model.stopRound();
    }
    
    public static void guess(SongButton button) {
        model.guess(button);
    }
}