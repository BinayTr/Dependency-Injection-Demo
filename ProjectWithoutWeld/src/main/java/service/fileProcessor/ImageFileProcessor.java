package service.fileProcessor;


import factories.TimeLoggerFactory;
import loggers.TimeLogger;
import service.editors.ImageFileEditor;
import service.editors.imageFileEditors.GifFileEditor;

public class ImageFileProcessor {

    //ImageFileEditor is an interface here
    private final ImageFileEditor imageFileEditor;
    private final TimeLogger timeLogger;

    public ImageFileProcessor() {
        this.imageFileEditor = new GifFileEditor();  // Worse use if else maze to determine which ImageFileEditor client wants to choose !!!
        this.timeLogger = new TimeLoggerFactory().getTimeLogger();
    }

    public ImageFileEditor getImageFileditor() {
        return imageFileEditor;
    }

    public TimeLogger getTimeLogger() {
        return timeLogger;
    }

    public String openFile(String fileName) {
        return imageFileEditor.openFile(fileName) + " at: " + timeLogger.getTime();
    }

    public String editFile(String fileName) {
        return imageFileEditor.editFile(fileName) + " at: " + timeLogger.getTime();
    }

    public String writeFile(String fileName) {
        return imageFileEditor.writeFile(fileName) + " at: " + timeLogger.getTime();
    }

    public String saveFile(String fileName) {
        return imageFileEditor.saveFile(fileName)+ " at: " + timeLogger.getTime();
    }
}
