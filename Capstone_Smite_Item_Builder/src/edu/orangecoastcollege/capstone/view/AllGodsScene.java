package edu.orangecoastcollege.capstone.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

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
	    
	    @FXML
	    private TextField godNameTF;

		@Override
		public void initialize(URL arg0, ResourceBundle arg1)
		{
			// TODO Auto-generated method stub
			pantheonCB.setItems(controller.getDistinctPantheons());
			classCB.setItems(controller.getDistinctClasses());
			allGodsGridView.setItems(controller.getAllGods());
		}
		
		@FXML
		public Object loadMainScene()
		{
			ViewNavigator.loadScene("Smite Item Builder", ViewNavigator.MAIN_SCENE);
			return this;
		}
		
		@FXML
	    public Object filter()
	    {
	    	String name = godNameTF.getText();
	    	String pantheon = pantheonCB.getSelectionModel().getSelectedItem();
	    	String godClass = classCB.getSelectionModel().getSelectedItem();
	    	allGodsGridView.setItems(controller.filterGods(name, pantheon, godClass));
	    	return this;
	    }

}
