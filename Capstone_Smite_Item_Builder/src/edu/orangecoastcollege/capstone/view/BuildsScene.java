package edu.orangecoastcollege.capstone.view;

import java.net.URL;
import java.util.ResourceBundle;

import edu.orangecoastcollege.capstone.controller.Controller;
import edu.orangecoastcollege.capstone.model.Build;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

/**
 * A scene that has all the builds in the database and allows for the addition or deletion of records.
 * Each record has a God, 6 items, and 2 Relics
 * @author Kevin Do
 * @version 1.0
 */
public class BuildsScene implements Initializable
{

	private static Controller controller = Controller.getInstance();
    @FXML
    private Button backButton;

    @FXML
    private ListView<Build> allBuildsListView;

    @FXML
    private Button deleteBuildButton;

    @FXML
    private Button loadBuildButton;

    @Override
	public void initialize(URL location, ResourceBundle resources)
    {
    	deleteBuildButton.setDisable(true);
    	loadBuildButton.setDisable(true);
    	allBuildsListView.setItems(controller.getAllBuilds());
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
     * Sets the current build to the selected build and load the main scene
     * @return
     */
    @FXML
    public Object loadBuild()
    {
    	controller.setCurrentBuild(allBuildsListView.getSelectionModel().getSelectedItem());
    	ViewNavigator.loadScene("Smite Item Builder", ViewNavigator.MAIN_SCENE);
    	return this;
    }
    
    /**
     * Enables the delete and load button.
     * @return
     */
    @FXML
    public Object selectBuild()
    {
    	deleteBuildButton.setDisable(false);
    	loadBuildButton.setDisable(false);
    	return this;
    }
    
    /**
     * Deletes the selected build in the listview and updates it
     * @return
     */
    @FXML
    public Object deleteBuild()
    {
    	controller.deleteBuild(allBuildsListView.getSelectionModel().getSelectedItem());
    	return this;
    }
}
