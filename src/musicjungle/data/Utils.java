package musicjungle.data;

import java.io.File;

/**
 * Utils
 * @author Lasse
 * @version 20-12-2015
 */
public class Utils 
{
    /**
     * Get the extension of a file.
     * @param f
     * @return 
     */
    public static String getFileExtension(File f) {
        String ext = null;
        
        final String s = f.getName();
        int i = s.lastIndexOf('.');

        if (i > 0 &&  i < s.length() - 1) 
            ext = s.substring(i+1).toLowerCase();
        
        return ext;
    }
}