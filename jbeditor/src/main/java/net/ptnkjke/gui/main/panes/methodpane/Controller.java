package net.ptnkjke.gui.main.panes.methodpane;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import net.ptnkjke.gui.main.model.classtree.Method;
import net.ptnkjke.service.DataActivity;
import net.ptnkjke.utils.Editor;
import net.ptnkjke.utils.GraphVizCreator;
import net.ptnkjke.utils.JByteParser;
import org.apache.bcel.generic.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * Created by Lopatin on 05.07.2014.
 */
public class Controller {
    @FXML
    private TextArea textArea;
    @FXML
    private ImageView imageView;

    private GraphVizCreator graphVizCreator;

    private ClassGen classGen;
    private Method method;

    public void setMethod(Method method) {
        this.method = method;
        classGen = method.getClassGen();
        int num = method.getMethodIndex();

        MethodGen methodGen = new MethodGen(classGen.getMethodAt(num),
                classGen.getClassName(),
                classGen.getConstantPool());

        StringBuilder sb = new StringBuilder();
        InstructionHandle handle = methodGen.getInstructionList().getStart();

        if (handle != null) {
            do {
                Editor editor = new Editor();
                try {
                    editor.visit(handle);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                sb.append(editor.getResult()).append("\n");
                handle = handle.getNext();
            } while (handle != null);
        }

        textArea.setText(sb.toString());

        graphVizCreator = new GraphVizCreator(methodGen.getInstructionList(), classGen.getConstantPool());
        File image = graphVizCreator.getImage();
        Image img = null;

        if (image == null) {
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(image);
            do {
                img = new Image(new FileInputStream(image));
            } while (img.getWidth() == 0);
            
            fileInputStream.close();

            imageView.setImage(img);
            imageView.setFitWidth(img.getWidth());
            imageView.setFitHeight(img.getHeight());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void testSave() {
        JByteParser jByteParser = new JByteParser();
        ConstantPoolGen constantPoolGen = classGen.getConstantPool();

        jByteParser.parse(textArea.getText(), constantPoolGen);
        InstructionList instructionList = jByteParser.getInstructions();

        int num = method.getMethodIndex();
        org.apache.bcel.classfile.Method old = classGen.getMethodAt(num);

        MethodGen mg = new MethodGen(old, classGen.getClassName(), classGen.getConstantPool());
        mg.setInstructionList(instructionList);
        classGen.setMethodAt(mg.getMethod(), num);

        DataActivity.changes.add(classGen);


/*

        File oldText = new File("temp" + File.separator + "old.text");
        File newText = new File("temp" + File.separator + "new.text");

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(oldText));
            writer.write(textArea.getText());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuilder sb = new StringBuilder();
        InstructionHandle handle = mg.getInstructionList().getStart();

        if (handle != null) {
            do {
                Editor editor = new Editor();
                editor.visit(handle);

                sb.append(editor.getResult()).append("\n");
                handle = handle.getNext();
            } while (handle != null);
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(newText));
            writer.write(sb.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    public TextArea getTextArea() {
        return textArea;
    }

    public void setTextArea(TextArea textArea) {
        this.textArea = textArea;
    }
}
