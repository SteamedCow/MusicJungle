package musicjungle.round.gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import musicjungle.data.GameData;
import musicjungle.data.Player;
import musicjungle.models.SongButton;

/**
 * SongButtonListener
 * @author SteamedCow
 * @version 27-12-2015
 */
public class SongButtonListener implements ActionListener, Runnable
{
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof SongButton) {
            RoundController.guess((SongButton) e.getSource());
            RoundController.stopRound();
            
            if(Player.round < GameData.ROUNDS) {
                final Thread newRound = new Thread(this);
                newRound.setDaemon(true);
                newRound.start();
            }
        }
        else
            throw new ClassCastException("Action event source is not the correct object (SongButton)");
    }

    @Override
    public void run() {
        try {
            Thread.sleep(GameData.COOLDOWN_BETWEEN_ROUNDS);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        RoundController.newRound();
    }
}