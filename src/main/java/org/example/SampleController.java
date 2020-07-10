package org.example;

import org.example.secret.EncryptionService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.ResourceBundle;

/**
 * Our GUI. This class does not necessarily have to be obfuscated.
 *
 * @author Thomas Bolz
 *
 */
public class SampleController extends BorderPane implements Initializable {

    @FXML //  fx:id="btnEcrypt"
    private Button btnEcrypt; // Value injected by FXMLLoader
    @FXML //  fx:id="lblStatus"
    private Label lblStatus; // Value injected by FXMLLoader
    @FXML //  fx:id="txtEncrypted"
    private TextField txtEncrypted; // Value injected by FXMLLoader
    @FXML //  fx:id="txtInput"
    private TextField txtInput; // Value injected by FXMLLoader

    public SampleController() {
        super();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
                "Sample.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }

    }

    @Override // This method is called by the FXMLLoader when initialization is complete
    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
        assert btnEcrypt != null : "fx:id=\"btnEcrypt\" was not injected: check your FXML file 'Sample.fxml'.";
        assert lblStatus != null : "fx:id=\"lblStatus\" was not injected: check your FXML file 'Sample.fxml'.";
        assert txtEncrypted != null : "fx:id=\"txtEncrypted\" was not injected: check your FXML file 'Sample.fxml'.";
        assert txtInput != null : "fx:id=\"txtInput\" was not injected: check your FXML file 'Sample.fxml'.";

        // initialize your logic here: all @FXML variables will have been injected

    }

    // Handler for Button[fx:id="btnEcrypt"] onAction
    @FXML
    public void handleButtonAction(ActionEvent event) {
        System.out.println("Action Event");
        EncryptionService service = new EncryptionService();
        String text = service.encrypt(txtInput.getText());
        txtEncrypted.setText(text);
        String status = MessageFormat.format("Text ''{0}'' was encrypted.", txtInput.getText());
        lblStatus.setText(status);
    }
}
