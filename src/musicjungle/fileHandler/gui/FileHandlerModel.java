package musicjungle.fileHandler.gui;

import java.io.File;

/**
 * FileHandlerModel
 * @author SteamedCow
 * @version 22-12-2015
 */
public class FileHandlerModel 
{
    private final FileHandlerView view;

    FileHandlerModel(FileHandlerView view) {
        this.view = view;
    }

    void setFile(File f) {
        System.out.println("File: " + f.getName());
    }
}