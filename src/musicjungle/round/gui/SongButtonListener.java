package musicjungle.round.gui;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import musicjungle.models.SongButton;

/**
 * SongButtonListener
 * @author SteamedCow
 * @version 27-12-2015
 */
public class SongButtonListener implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof SongButton) {
            final SongButton button = (SongButton) e.getSource();
            
            if (button.isCorrectAnswer()) 
                button.setForeground(Color.green);
            else
                button.setForeground(Color.red);
        }
        else
            throw new ClassCastException("Action event source is not the correct object (SongButton)");
    }
}