package musicjungle.data;
import java.io.File;
import java.util.Random;

/**
 * Utils
 * @author SteamedCOw
 * @version 20-12-2015
 */
public class Utils 
{
    public static String getFileExtension(File f) {
        String ext = null;
        
        final String s = f.getName();
        int i = s.lastIndexOf('.');

        if (i > 0 &&  i < s.length() - 1) 
            ext = s.substring(i+1).toLowerCase();
        
        return ext;
    }
    
    public static int getRandomInteger(int minValue, int maxValue) {
        return new Random().nextInt((maxValue - minValue) + 1) + minValue;
    }
}