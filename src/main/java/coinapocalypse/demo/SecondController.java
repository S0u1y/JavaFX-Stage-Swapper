package coinapocalypse.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SecondController {

    @FXML
    private Button back;

    @FXML
    private void goBack(ActionEvent event){
        SceneSwapperHandler.swapScenes(event, getClass().getResource("hello-view.fxml"));
    }

}
