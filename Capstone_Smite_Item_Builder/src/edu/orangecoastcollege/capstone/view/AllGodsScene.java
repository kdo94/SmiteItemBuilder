package edu.orangecoastcollege.capstone.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import org.controlsfx.control.GridView;

import edu.orangecoastcollege.capstone.controller.Controller;
import edu.orangecoastcollege.capstone.model.God;
import javafx.fxml.Initializable;

public class AllGodsScene implements Initializable
{
		private static Controller controller = Controller.getInstance();
		@FXML
	    private ComboBox<String> pantheonCB;

	    @FXML
	    private ComboBox<String> classCB;

	    @FXML
	    private GridView<God> allGodsGridView;

	    @FXML
	    private Button cancelButton;

	    @FXML
	    private Button selectButton;
	
	@Override
	public void initialize(URL location, ResourceBundle resources)
	{
		pantheonCB.setItems(controller.getDistinctPantheons());
		classCB.setItems(controller.getDistinctClasses());
		allGodsGridView.setItems(controller.getAllGods());
	}

}
