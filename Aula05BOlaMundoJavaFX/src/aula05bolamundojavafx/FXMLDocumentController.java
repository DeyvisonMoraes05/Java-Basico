package aula05bolamundojavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    private Button Button;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("Clique em Mim!");
        label.setText("Olá, Mundo!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
