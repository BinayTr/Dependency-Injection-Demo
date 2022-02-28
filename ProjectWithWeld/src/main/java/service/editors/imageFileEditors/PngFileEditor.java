package service.editors.imageFileEditors;

import jakarta.annotation.Priority;
import jakarta.enterprise.inject.Alternative;
import jakarta.inject.Named;
import qualifiers.PngFileEditorQualifier;
import service.editors.ImageFileEditor;

//@PngFileEditorQualifier
//@Named("PngFileEditor")
@Alternative
@Priority(1000)
public class PngFileEditor implements ImageFileEditor {

    @Override
    public String openFile(String fileName) {
        return "Opening PNG file " + fileName;
    }

    @Override
    public String editFile(String fileName) {
        return "Editing PNG file " + fileName;
    }

    @Override
    public String writeFile(String fileName) {
        return "Writing PNG file " + fileName;
    }

    @Override
    public String saveFile(String fileName) {
        return "Saving PNG file " + fileName;
    }
}