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
		selectButton.setDisable(true);
		allRelicsLV.setItems(controller.getAllRelics());
	}
	
	@FXML
	public Object loadMainScene()
	{
		ViewNavigator.loadScene("Smite Item Builder", ViewNavigator.MAIN_SCENE);
		return this;
	}
	
	@FXML
	public Object selectRelic()
	{
		selectButton.setDisable(false);
		return this;
	}
	
	@FXML
	public Object addRelicToBuild()
	{
		int id = MainScene.itemNumber;
		if(id == 1)
			controller.addRelic1ToCurrentBuild(allRelicsLV.getSelectionModel().getSelectedItem().getName());
		else if(id == 2)
			controller.addRelic2ToCurrentBuild(allRelicsLV.getSelectionModel().getSelectedItem().getName());
		return this;
	}
	
}
