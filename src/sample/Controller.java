package sample;

//import io.sentry.Sentry;
import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.web.HTMLEditor;

//import javax.print.DocFlavor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller {
    @FXML private Button converter;
    // @FXML private Button saver;
    // @FXML private Button reader;
    @FXML private TextArea textArea;
    @FXML private HTMLEditor htmlEditor;

    @FXML private void saverActn(ActionEvent event){
        try {
            FileOutputStream fout = new FileOutputStream("info.txt");
            fout.write(textArea.getText().getBytes());
            //fout.write(HTMLEditor.getText().getBytes());
            fout.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML private void readerActn(ActionEvent event) {
        try {
            FileInputStream fin = new FileInputStream("info.txt");
            String text = new Scanner(fin).nextLine();
            textArea.setText(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    @FXML private void converterActn(ActionEvent event) {
        textArea.setText(htmlEditor.getHtmlText());
    }




}
