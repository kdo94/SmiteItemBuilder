package edu.orangecoastcollege.capstone.view;

import java.util.ArrayList;
import java.util.Arrays;

import edu.orangecoastcollege.capstone.controller.Controller;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class AddItemScene
{
	private static Controller controller = Controller.getInstance();
	private static String FIELD_ERROR = "Missing Field Input";
	
    @FXML
    private TextField itemNameTF;

    @FXML
    private TextField itemCostTF;

    @FXML
    private TextField itemHealthTF;

    @FXML
    private TextField itemManaTF;

    @FXML
    private TextField itemPhysicalProtectionTF;

    @FXML
    private TextField itemMagicalProtectionTF;

    @FXML
    private TextField itemPhysicalPowerTF;

    @FXML
    private TextField itemMagicalPowerTF;

    @FXML
    private TextField itemAttackSpeedTF;

    @FXML
    private TextField itemPercentPenetrationTF;

    @FXML
    private TextField itemFlatPenetrationTF;

    @FXML
    private TextField itemCriticalChanceTF;

    @FXML
    private TextField itemCooldownReductionTF;

    @FXML
    private TextField itemPhysicalLifestealTF;

    @FXML
    private TextField itemMagicalLifestealTF;

    @FXML
    private TextField itemPassiveTF;

    @FXML
    private TextField itemHP5TF;

    @FXML
    private TextField itemMP5TF;

    @FXML
    private TextField itemCrowdControlReductionTF;
    
    @FXML
    private Label addItemStatusL;
    
    @FXML
    private Button itemSubmitBtn;
    
    @FXML
    private Button itemCancelBtn;
    
    
    /**
     * Event handler for submit button when adding a item
     * @return
     */
    @FXML
    public Object addItem()
    {
    	boolean okay = true;
    	ArrayList<TextField> tfList = new ArrayList<>(Arrays.asList(itemNameTF, 
    			itemCostTF, 
    			itemHealthTF, 
    			itemManaTF, 
    			itemPhysicalProtectionTF, 
    			itemMagicalProtectionTF, 
    			itemPhysicalPowerTF, 
    			itemMagicalPowerTF, 
    			itemAttackSpeedTF, 
    			itemPercentPenetrationTF, 
    			itemFlatPenetrationTF, 
    			itemCriticalChanceTF, 
    			itemCooldownReductionTF, 
    			itemPhysicalLifestealTF, 
    			itemMagicalLifestealTF, 
    			itemPassiveTF, 
    			itemHP5TF, 
    			itemMP5TF, 
    			itemCrowdControlReductionTF));

    	
    	for(TextField tf: tfList)
    	{
    		if(tf.getText() == null || tf.getText().isEmpty())
    		{
    			addItemStatusL.setText(FIELD_ERROR);
    			addItemStatusL.setTextFill(Color.RED);
    			addItemStatusL.setVisible(true);
    			okay = false;
    			return this;
    		}
    	}
    	
        if(okay)
        {
        	String [] values = new String[]{itemNameTF.getText(),
        			itemCostTF.getText(),
        			itemHealthTF.getText(),
        			itemManaTF.getText(),
        			itemPhysicalProtectionTF.getText(),
        			itemMagicalProtectionTF.getText(),
        			itemPhysicalPowerTF.getText(),
        			itemMagicalPowerTF.getText(),
        			itemAttackSpeedTF.getText(),
        			itemPercentPenetrationTF.getText(),
        			itemFlatPenetrationTF.getText(),
        			itemCriticalChanceTF.getText(),
        			itemCooldownReductionTF.getText(),
        			itemPhysicalLifestealTF.getText(),
        			itemMagicalLifestealTF.getText(),
        			itemPassiveTF.getText(),
        			itemHP5TF.getText(),
        			itemMP5TF.getText(),
        			itemCrowdControlReductionTF.getText()};

            controller.addItem(values);
            
        	for(TextField tf: tfList)
        		tf.clear();
        	
			addItemStatusL.setText("Add Item");
			addItemStatusL.setTextFill(Color.BLACK);
			
			//TODO scene navigator
			ViewNavigator.loadScene("Smite Item Builder", ViewNavigator.MAIN_SCENE);
        }    	
    	
    	return this;
    }
    
    /**
     * Return user to view of all items
     * @return
     */
    @FXML
    public Object cancel()
    {
    	ArrayList<TextField> tfList = new ArrayList<>(Arrays.asList(itemNameTF, 
    			itemCostTF, 
    			itemHealthTF, 
    			itemManaTF, 
    			itemPhysicalProtectionTF, 
    			itemMagicalProtectionTF, 
    			itemPhysicalPowerTF, 
    			itemMagicalPowerTF, 
    			itemAttackSpeedTF, 
    			itemPercentPenetrationTF, 
    			itemFlatPenetrationTF, 
    			itemCriticalChanceTF, 
    			itemCooldownReductionTF, 
    			itemPhysicalLifestealTF, 
    			itemMagicalLifestealTF, 
    			itemPassiveTF, 
    			itemHP5TF, 
    			itemMP5TF, 
    			itemCrowdControlReductionTF));
    	
    	for(TextField tf: tfList)
    		tf.clear();
   
		addItemStatusL.setText("Add Item");
		addItemStatusL.setTextFill(Color.BLACK);
		
		ViewNavigator.loadScene("Smite Item Builder", ViewNavigator.MAIN_SCENE);
		
		return this;
    }
    
}
