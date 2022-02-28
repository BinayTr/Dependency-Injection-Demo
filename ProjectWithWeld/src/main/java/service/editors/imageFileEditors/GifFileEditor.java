package service.editors.imageFileEditors;

import jakarta.annotation.Priority;
import jakarta.enterprise.inject.Alternative;
import service.editors.ImageFileEditor;

//@GifFileEditorQualifier
@Alternative
@Priority(100)
public class GifFileEditor implements ImageFileEditor {

    @Override
    public String openFile(String fileName) {
        return "Opening GIF file " + fileName;
    }

    @Override
    public String editFile(String fileName) {
        return "Editing GIF file " + fileName;
    }

    @Override
    public String writeFile(String fileName) {
        return "Writing GIF file " + fileName;
    }

    @Override
    public String saveFile(String fileName) {
        return "Saving GIF file " + fileName;
    }
}
