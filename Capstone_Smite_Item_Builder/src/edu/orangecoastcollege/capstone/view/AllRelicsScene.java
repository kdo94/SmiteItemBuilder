package edu.orangecoastcollege.capstone.view;

import java.net.URL;
import java.util.ResourceBundle;

import edu.orangecoastcollege.capstone.controller.Controller;
import edu.orangecoastcollege.capstone.model.Relic;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class AllRelicsScene implements Initializable
{

	private static Controller controller = Controller.getInstance();
	@FXML
    private TextField relicSearchTF;

    @FXML
    private ListView<Relic> allRelicsLV;

    @FXML
    private CheckBox upgradeCheckBox;

    @FXML
    private Button cancelButton;

    @FXML
    private Button selectButton;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1)
	{
		// TODO Auto-generated method stub
		allRelicsLV.setItems(controller.getAllRelics());
		
	}
	
}
