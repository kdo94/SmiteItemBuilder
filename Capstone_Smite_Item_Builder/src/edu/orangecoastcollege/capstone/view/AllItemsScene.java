package edu.orangecoastcollege.capstone.view;

import edu.orangecoastcollege.capstone.controller.Controller;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class AllItemsScene
{
	private static Controller controller = Controller.getInstance();
	@FXML
	private CheckBox allItemsCheckBox;
	@FXML
	private CheckBox populatItemsCheckBox;
	@FXML
	private CheckBox relicsCheckBox;
	@FXML
	private CheckBox starterItemsCheckBox;
	@FXML
	private CheckBox powerCheckBox;
	@FXML
	private CheckBox attackSpeedCheckBox;
	@FXML
	private CheckBox lifestealCheckBox;
	@FXML
	private CheckBox penetrationCheckBox;
	@FXML
	private CheckBox physicalCheckBox;
	@FXML
	private CheckBox magicalCheckBox;
	@FXML
	private CheckBox healthCheckBox;
	@FXML
	private CheckBox hp5CheckBox;
	@FXML
	private CheckBox auraCheckBox;
	@FXML
	private CheckBox cooldownCheckBox;
	@FXML
	private CheckBox manaCheckBox;
	@FXML
	private CheckBox mp5CheckBox;
	@FXML
	private TextField descTF;
	@FXML
	private TextField costTF;
	@FXML
	private Button clearButton;
	@FXML
	private Button sellButton;
	@FXML
	private Button purchaseButton;
	
	@FXML
	public Object filterItems()
	{
		return this;
	}
	
	@FXML Object sellItem()
	{
		return this;
	}
	
	@FXML Object purchaseItem()
	{
		return this;
	}
	
	@FXML Object clear()
	{
		return this;
	}
}
