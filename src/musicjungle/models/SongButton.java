package musicjungle.models;
import javax.swing.JButton;

/**
 * SongButton
 * @author SteamedCow
 * @version 26-12-2015
 */
public class SongButton extends JButton
{
    private Song song = null;
    private boolean correctAnswer = false;

    public SongButton() {
        super();
    }

    public SongButton(Song song, boolean correctAnswer) {
        this.song = song;
        this.correctAnswer = correctAnswer;
    }

    public SongButton(String text, Song song, boolean correctAnswer) {
        super(text);
        this.song = song;
        this.correctAnswer = correctAnswer;
    }
    
    public void setSong(Song song) {
        this.song = song;
    }
    
    public Song getSong() {
        return song;
    }
    
    public void setCorrectAnswer(boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
    
    public boolean isCorrectAnswer() {
        return correctAnswer;
    }
}