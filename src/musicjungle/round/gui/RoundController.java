package musicjungle.round.gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javazoom.jl.decoder.JavaLayerException;
import musicjungle.data.FrameController;
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
        
        view.addExitListener(new ExitListener());
        
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

class ExitListener implements ActionListener 
{
    @Override
    public void actionPerformed(ActionEvent e) {
        FrameController.gotoPanel(FrameController.ADD_SONG_SCREEN);
    }
}