

import service.fileProcessor.ImageFileProcessor;

public class FileApplication {

    public static void main(String[] args) {

        ImageFileProcessor imageFileProcessor = new ImageFileProcessor();
        System.out.println(imageFileProcessor.openFile("file1.png"));
        System.out.println(imageFileProcessor.writeFile("file1.png"));
        System.out.println(imageFileProcessor.saveFile("file1.png"));

    }
}