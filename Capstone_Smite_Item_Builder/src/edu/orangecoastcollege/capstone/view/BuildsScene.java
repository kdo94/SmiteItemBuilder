package edu.orangecoastcollege.capstone.view;

import java.net.URL;
import java.util.ResourceBundle;

import edu.orangecoastcollege.capstone.controller.Controller;
import edu.orangecoastcollege.capstone.model.Build;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

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
    	allBuildsListView.setItems(controller.getAllBuilds());
    	allBuildsListView.setCellFactory(new Callback<ListView<Build>, ListCell<Build>>()
    			{
    				public ListCell<Build> call(ListView<Build> allBuildsListView)
    				{
    					return new BuildCell();
    				}
    			});
    }
    
    static class BuildCell extends ListCell<Build>
    {
    	@Override
    	public void  updateItem(Build build, boolean empty)
    	{
    		super.updateItem(build, empty);
    		
    	}
    }
    
    @FXML
    public Object loadMainScene()
    {
    	ViewNavigator.loadScene("Smite Item Builder", ViewNavigator.MAIN_SCENE);
    	return this;
    }
}
