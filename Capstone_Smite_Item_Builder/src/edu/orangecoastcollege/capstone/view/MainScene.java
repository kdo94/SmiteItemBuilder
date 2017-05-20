package edu.orangecoastcollege.capstone.view;

import java.net.URL;
import java.util.ResourceBundle;

import edu.orangecoastcollege.capstone.controller.Controller;
import edu.orangecoastcollege.capstone.model.God;
import edu.orangecoastcollege.capstone.model.Item;
import edu.orangecoastcollege.capstone.model.Relic;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class MainScene implements Initializable 
{
	Controller controller = Controller.getInstance();
    @FXML
    private ComboBox<String> allGodsCB;

    @FXML
    private Button viewAllGodsButton;

    @FXML
    private Button loreButton;

    @FXML
    private ComboBox<String> item1CB;

    @FXML
    private ComboBox<String> item2CB;

    @FXML
    private ComboBox<String> item3CB;

    @FXML
    private ComboBox<String> item4CB;

    @FXML
    private ComboBox<String> item5CB;

    @FXML
    private ComboBox<String> item6CB;

    @FXML
    private ComboBox<String> relic1CB;

    @FXML
    private ComboBox<String> relic2CB;

    @FXML
    private TextArea statsTextArea;

    @FXML
    private Button godStatsButton;

    @FXML
    private Button abilityStatsButton;

    @Override
	public void initialize(URL location, ResourceBundle resources) 
    {
    	loreButton.setDisable(true);
		allGodsCB.setItems(controller.getGodNames());
		item1CB.setItems(controller.getItemNames());
		item2CB.setItems(controller.getItemNames());
		item3CB.setItems(controller.getItemNames());
		item4CB.setItems(controller.getItemNames());
		item5CB.setItems(controller.getItemNames());
		item6CB.setItems(controller.getItemNames());
		relic1CB.setItems(controller.getItemNames());
		relic2CB.setItems(controller.getItemNames());
	}
}
