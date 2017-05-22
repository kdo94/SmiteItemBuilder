package edu.orangecoastcollege.capstone.view;

import java.net.URL;
import java.util.ResourceBundle;

import edu.orangecoastcollege.capstone.controller.Controller;
import edu.orangecoastcollege.capstone.model.Build;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

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
    
    @FXML
    public Object loadMainScene()
    {
    	ViewNavigator.loadScene("Smite Item Builder", ViewNavigator.MAIN_SCENE);
    	return this;
    }
    
    @FXML
    public Object loadBuild()
    {
    	controller.setCurrentBuild(allBuildsListView.getSelectionModel().getSelectedItem());
    	ViewNavigator.loadScene("Smite Item Builder", ViewNavigator.MAIN_SCENE);
    	return this;
    }
    
    @FXML
    public Object selectBuild()
    {
    	deleteBuildButton.setDisable(false);
    	loadBuildButton.setDisable(false);
    	return this;
    }
    
    @FXML
    public Object deleteBuild()
    {
    	controller.deleteBuild(allBuildsListView.getSelectionModel().getSelectedItem());
    	return this;
    }
}
