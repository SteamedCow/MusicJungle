package musicjungle.fileHandler;
import java.io.File;
import javax.swing.filechooser.FileFilter;
import musicjungle.data.Utils;

/**
 * ImageFilter
 * @author Lasse
 * @version 20-12-2015
 */
public class AudioFilter extends FileFilter
{
    @Override
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }

        final String extension = Utils.getFileExtension(f);
        if (extension != null) {
            return extension.equals("mp3") ||
                    extension.equals("wav");
        }
        else
            return false;
    }

    @Override
    public String getDescription() {
        return "Audio \".mp3/.wav\"";
    }
}