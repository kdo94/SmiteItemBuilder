package edu.orangecoastcollege.capstone.view;

import edu.orangecoastcollege.capstone.controller.Controller;
import edu.orangecoastcollege.capstone.model.God;
import edu.orangecoastcollege.capstone.model.Item;
import edu.orangecoastcollege.capstone.model.Relic;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class MainScene {

	Controller controller = Controller.getInstance();
    @FXML
    private ComboBox<God> allGodsCB;
    @FXML
    private Button viewAllGodsButton;
    @FXML
    private ComboBox<Item> item1CB;
    @FXML
    private ComboBox<Item> item2CB;
    @FXML
    private ComboBox<Item> item3CB;
    @FXML
    private ComboBox<Item> item4CB;
    @FXML
    private ComboBox<Item> item5CB;
    @FXML
    private ComboBox<Item> item6CB;
    @FXML
    private ComboBox<Relic> relic1CB;
    @FXML
    private ComboBox<Relic> relic2CB;
    @FXML
    private TextArea statsTextArea;
    @FXML
    private Button statsButton;
    
}
