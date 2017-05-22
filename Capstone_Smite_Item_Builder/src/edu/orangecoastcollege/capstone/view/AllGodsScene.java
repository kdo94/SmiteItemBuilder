package edu.orangecoastcollege.capstone.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

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
	    private ListView<God> allGodsListView;

	    @FXML
	    private Button cancelButton;

	    @FXML
	    private Button selectButton;
	    
	    @FXML
	    private TextField godNameTF;

		@Override
		public void initialize(URL arg0, ResourceBundle arg1)
		{
			selectButton.setDisable(true);
			pantheonCB.setItems(controller.getDistinctPantheons());
			classCB.setItems(controller.getDistinctClasses());
			allGodsListView.setItems(controller.getAllGods());
		}
		
		/**
		 * Loads the main scene
		 * @return
		 */
		@FXML
		public Object loadMainScene()
		{
			ViewNavigator.loadScene("Smite Item Builder", ViewNavigator.MAIN_SCENE);
			return this;
		}
		
		/**
		 * Filters the gods based on the name and selected combo boxes.
		 * Updates the ListView of all filtered gods
		 * @return
		 */
		@FXML
	    public Object filter()
	    {
	    	String name = godNameTF.getText();
	    	String pantheon = pantheonCB.getSelectionModel().getSelectedItem();
	    	String godClass = classCB.getSelectionModel().getSelectedItem();
	    	allGodsListView.setItems(controller.filterGods(name, pantheon, godClass));
	    	return this;
	    }
		
		/**
		 * Selects the god in the list view and enables the button to add to the build
		 * @return
		 */
		@FXML
		public Object selectGod()
		{
			selectButton.setDisable(false);
			return this;
		}
		
		/**
		 * Loads the add god scene
		 * @return
		 */
		@FXML
		public Object loadAddGodScene()
		{
			ViewNavigator.loadScene("Add God", ViewNavigator.ADD_GOD_SCENE);
			return this;
		}
		
		/**
		 * Add the selected god to the currentBuild and loads up the Main Scene
		 * @return Object
		 */
		@FXML
		public Object addSelectedGod()
		{
			controller.addGodToCurrentBuild(allGodsListView.getSelectionModel().getSelectedItem().getName());
			ViewNavigator.loadScene("Smite Item Builder", ViewNavigator.MAIN_SCENE);
			return this;
		}

}
