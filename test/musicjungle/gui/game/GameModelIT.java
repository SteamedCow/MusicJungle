package musicjungle.gui.game;
import javax.swing.JButton;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * GameModelIT - Integration test for GameModel class
 * @author SteamedCow
 * @version 17-12-2015
 */
public class GameModelIT 
{
    /**
     * Test of setButtons method, of class GameModel.
     */
    @Test
    public void testSetButtons() {
        System.out.println("\nsetButtons (TEST)");
        
        //Positive
        System.out.println(" Run 1 (POS)");
        int amount = 2;
        StubView stub = new StubView();
        GameModel instance = new GameModel(stub, amount, -1);
        assertEquals(2, instance.getButtonCount());
        assertEquals(2, stub.getButtonCount());
        
        System.out.println(" Run 2 (POS)");
        amount = 3;
        stub = new StubView();
        instance = new GameModel(stub, amount, -1);
        assertEquals(amount, instance.getButtonCount());
        assertEquals(amount, stub.getButtonCount());
        
        System.out.println(" Run 3 (POS)");
        amount = Integer.MAX_VALUE;
        stub = new StubView();
        instance = new GameModel(stub, amount, -1);
        assertEquals(9, instance.getButtonCount());
        assertEquals(9, stub.getButtonCount());
        
        //Negative
        System.out.println(" Run 4 (NEG)");
        amount = 1;
        stub = new StubView();
        instance = new GameModel(stub, amount, -1);
        assertEquals(2, instance.getButtonCount());
        assertEquals(2, stub.getButtonCount());
        
        System.out.println(" Run 5 (NEG)");
        amount = 0;
        stub = new StubView();
        instance = new GameModel(stub, amount, -1);
        assertEquals(2, instance.getButtonCount());
        assertEquals(2, stub.getButtonCount());
        
        System.out.println(" Run 6 (NEG)");
        amount = -1;
        stub = new StubView();
        instance = new GameModel(stub, amount, -1);
        assertEquals(2, instance.getButtonCount());
        assertEquals(2, stub.getButtonCount());
        
        System.out.println(" Run 7 (NEG)");
        amount = Integer.MIN_VALUE;
        stub = new StubView();
        instance = new GameModel(stub, amount, -1);
        assertEquals(2, instance.getButtonCount());
        assertEquals(2, stub.getButtonCount());
    }
}

class StubView extends GameView
{
    private int buttonCount = 0;
    
    @Override
    protected void addButton(JButton button) {
        buttonCount++;
    }
    
    protected int getButtonCount() {
        return buttonCount;
    }
}
