package edu.orangecoastcollege.capstone.view;

import java.net.URL;
import java.util.ResourceBundle;

import edu.orangecoastcollege.capstone.controller.Controller;
import edu.orangecoastcollege.capstone.model.Item;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class AllItemsScene implements Initializable
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
	private CheckBox movementCheckBox;
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
	private Button cancelButton;
	@FXML
	private Button purchaseButton;
	@FXML
	private ListView<Item> allItemsListView;
	
	@FXML Object loadMainScene()
	{
		ViewNavigator.loadScene("Smite Item Builder", ViewNavigator.MAIN_SCENE);
		return this;
	}
	
	@FXML 
	public Object purchaseItem()
	{
		int num = MainScene.itemNumber;
		System.out.println(num + "item scene");
		if(num == 1)
			controller.addItem1ToCurrentBuild(allItemsListView.getSelectionModel().getSelectedItem().getName());
		else if(num == 2)
			controller.addItem2ToCurrentBuild(allItemsListView.getSelectionModel().getSelectedItem().getName());
		else if(num == 3)
			controller.addItem3ToCurrentBuild(allItemsListView.getSelectionModel().getSelectedItem().getName());
		else if(num == 4)
			controller.addItem4ToCurrentBuild(allItemsListView.getSelectionModel().getSelectedItem().getName());
		else if(num == 5)
			controller.addItem5ToCurrentBuild(allItemsListView.getSelectionModel().getSelectedItem().getName());
		else if(num == 6)
			controller.addItem6ToCurrentBuild(allItemsListView.getSelectionModel().getSelectedItem().getName());
		ViewNavigator.loadScene("Smite Item Builder", ViewNavigator.MAIN_SCENE);
		return this;
	}
	
	@FXML Object clear()
	{
		return this;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1)
	{
		purchaseButton.setDisable(true);
		allItemsListView.setItems(controller.getAllItems());
	}
	
	@FXML
	public Object selectItem()
	{
		purchaseButton.setDisable(false);
		return this;
	}
	
	@FXML
	public Object filter()
	{
		boolean power = powerCheckBox.isSelected();
		boolean attackSpeed = attackSpeedCheckBox.isSelected();
		boolean lifesteal = lifestealCheckBox.isSelected();
		boolean penetration = penetrationCheckBox.isSelected();
		boolean physical = physicalCheckBox.isSelected();
		boolean magical = magicalCheckBox.isSelected();
		boolean health = healthCheckBox.isSelected();
		boolean hp5 = hp5CheckBox.isSelected();
		boolean aura = auraCheckBox.isSelected();
		boolean cooldown = cooldownCheckBox.isSelected();
		boolean mana = manaCheckBox.isSelected();
		boolean mp5 = mp5CheckBox.isSelected();
		allItemsListView.setItems(controller.filterItems(power, attackSpeed, lifesteal, 
									penetration, physical, magical, health, hp5, aura, 
									cooldown, mana, mp5));
		return this;
	}
	
	@FXML
	public Object loadAddItemScene()
	{
		ViewNavigator.loadScene("Add Item", ViewNavigator.ADD_ITEM_SCENE);
		return this;
	}
}
