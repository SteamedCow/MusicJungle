package musicjungle.gui.game;
import javax.swing.JButton;
import javax.swing.JProgressBar;

/**
 * GameModel
 * @author SteamedCow
 * @version 17-12-2015
 */
public final class GameModel implements Runnable
{
    private final GameView view;
    private final int roundTime;
    private final JButton[] buttons;
    private final JProgressBar timer;
    
    private int round = 0;
    private long t0, t;
    private boolean running = true;

    protected GameModel(GameView view, int buttonCount, int roundTime) {
        this.view = view;
        
        final int bc;
        if(buttonCount > 9)
            bc = 9;
        else if(buttonCount < 2)
            bc = 2;
        else
            bc = buttonCount;
        buttons = new JButton[bc];
        setButtons(bc);
        
        if(roundTime > 10000)
            this.roundTime = 10000;
        else if(roundTime < 1000) {
            if(roundTime == -1)
                this.roundTime = -1;
            else
                this.roundTime = 1000;
        }
        else
            this.roundTime = roundTime;
        
        timer = view.getTimer();
        timer.setMaximum(this.roundTime);
        
        newRound();
    }
    
    protected void startRound() {
        Thread round = new Thread(this);
        round.setDaemon(true);
        t0 = System.currentTimeMillis();
        round.start();
    }
    
    protected void newRound() {
        round++;
        view.setRound(round);
        timer.setValue(roundTime);
    }
    
    private void setButtons(int buttonCount) {
        JButton button;
        for (int i = 0; i < buttonCount; i++) {
            button = new JButton();
            button.setActionCommand("B" + i);
            
            view.addButton(button);
            buttons[i] = button;
        }
    }
    
    protected int getButtonCount() {
        return buttons.length;
    }

    @Override
    public void run() {
        long t, dt;
        
        while(running) {
            t = System.currentTimeMillis();
            dt = t - t0;
            
            timer.setValue((int) (roundTime - dt));
            
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) { }
            
            if(dt > roundTime)
                running = false;
        }
    }
}