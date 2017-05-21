
package edu.orangecoastcollege.capstone.view;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

import edu.orangecoastcollege.capstone.controller.Controller;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

/**
 * Scene for adding a god to database and application
 * includes all attributes from user input
 *
 *
 * @author ptang10
 *
 */
public class AddGodScene implements Initializable
{
	private static Controller controller = Controller.getInstance();
	private static String FIELD_ERROR = "Missing Field Input";
	
    @FXML
    private TextField godNameTF;

    @FXML
    private TextField godBaseHealthTF;

    @FXML
    private TextField godBasePhysicalProtectTF;

    @FXML
    private TextField godBaseMagicalProtectTF;

    @FXML
    private TextField godBaseManaTF;

    @FXML
    private TextField godBaseAttackSpeedTF;

    @FXML
    private TextField godBaseHP5TF;

    @FXML
    private TextField godBaseMP5TF;

    @FXML
    private TextField godPhysicalProtectionScaling;

    @FXML
    private TextField godMagicalProtectionScaling;

    @FXML
    private TextField godBaseMovementSpeedTF;

    @FXML
    private TextField godBaseDamageTF;

    @FXML
    private TextField godDamageScalingTF;

    @FXML
    private TextField godPantheonTF;

    @FXML
    private TextArea godLoredTA;

    @FXML
    private ComboBox<String> godClassCB;

    @FXML
    private ComboBox<String> godTypeCB;

    @FXML
    private TextField godHealthScalingTF;
    
    @FXML
    private Label addGodStatusL;
    
    @FXML
    private Button godSubmitBtn;
    
    @FXML
    private Button godCancelBtn;
    
    
    /**
     * Event handler for submit button when adding a god
     * @return
     */
    @FXML
    public Object addGod()
    {
    	boolean okay = true;
    	ArrayList<TextField> tfList = new ArrayList<>(Arrays.asList(godNameTF, 
    			godBaseHealthTF, godBasePhysicalProtectTF, godBaseMagicalProtectTF, 
    			godBaseManaTF, godBaseAttackSpeedTF, godBaseHP5TF, godBaseMP5TF, 
    			godPhysicalProtectionScaling, godMagicalProtectionScaling, 
    			godBaseMovementSpeedTF, godBaseDamageTF, godDamageScalingTF, 
    			godPantheonTF, godHealthScalingTF));
    	
    	for(TextField tf: tfList)
    	{
    		if(tf.getText() == null || tf.getText().isEmpty())
    		{
    			addGodStatusL.setText(FIELD_ERROR);
    			addGodStatusL.setTextFill(Color.RED);
    			addGodStatusL.setVisible(true);
    			okay = false;
    			return this;
    		}
    	}
    	
    	
    	if(godLoredTA.getText() == null || godLoredTA.getText().isEmpty())
    	{
			addGodStatusL.setText("Lore is missing");
			addGodStatusL.setTextFill(Color.RED);
			addGodStatusL.setVisible(true);
			okay = false;
			return this;
    	}
    	
    	String cb = godClassCB.getSelectionModel().getSelectedItem();
    	if(cb == null || cb.isEmpty())
    	{
			addGodStatusL.setText("God Class is missing");
			addGodStatusL.setTextFill(Color.RED);
			addGodStatusL.setVisible(true);
			okay = false; 
			return this;
    	}
    	
    	cb = godTypeCB.getSelectionModel().getSelectedItem();
    	if(cb == null || cb.isEmpty())
    	{
			addGodStatusL.setText("God Type is missing");
			addGodStatusL.setTextFill(Color.RED);
			addGodStatusL.setVisible(true);
			okay = false;
			return this;
    	}
    	
        if(okay)
        {
        	String [] values = new String[]{godNameTF.getText(),
        			godClassCB.getSelectionModel().getSelectedItem(),
        			godTypeCB.getSelectionModel().getSelectedItem(),
        			godBaseHealthTF.getText(),
        			godHealthScalingTF.getText(),
        			godBasePhysicalProtectTF.getText(),
        			godBaseMagicalProtectTF.getText(),
        			godBaseManaTF.getText(),
        			godBaseAttackSpeedTF.getText(),
        			godBaseHP5TF.getText(),
        			godBaseMP5TF.getText(),
        			godPhysicalProtectionScaling.getText(),
        			godMagicalProtectionScaling.getText(),
        			godBaseMovementSpeedTF.getText(),
        			godBaseDamageTF.getText(),
        			godDamageScalingTF.getText(),
        			godPantheonTF.getText(),
        			godLoredTA.getText()};

            controller.addGod(values);
            
        	for(TextField tf: tfList)
        		tf.clear();
        	
        	godClassCB.getSelectionModel().clearSelection();
        	godTypeCB.getSelectionModel().clearSelection();
        	godLoredTA.clear();
			addGodStatusL.setText("Add God");
			addGodStatusL.setTextFill(Color.BLACK);
			
			//TODO scene navigator
			ViewNavigator.loadScene("Smite Item Builder", ViewNavigator.MAIN_SCENE);
        }    	
    	
    	return this;
    }
    
    /**
     * Return user to view all gods scene
     * @return
     */
    @FXML
    public Object cancel()
    {
    	ArrayList<TextField> tfList = new ArrayList<>(Arrays.asList(godNameTF, 
    			godBaseHealthTF, godBasePhysicalProtectTF, godBaseMagicalProtectTF, 
    			godBaseManaTF, godBaseAttackSpeedTF, godBaseHP5TF, godBaseMP5TF, 
    			godPhysicalProtectionScaling, godMagicalProtectionScaling, 
    			godBaseMovementSpeedTF, godBaseDamageTF, godDamageScalingTF, 
    			godPantheonTF, godHealthScalingTF));
    	for(TextField tf: tfList)
    		tf.clear();
    	
    	godClassCB.getSelectionModel().clearSelection();
    	godTypeCB.getSelectionModel().clearSelection();
    	godLoredTA.clear();
		addGodStatusL.setText("Add God");
		addGodStatusL.setTextFill(Color.BLACK);
		
		//TODO scene navigator
		ViewNavigator.loadScene("Smite Item Builder", ViewNavigator.MAIN_SCENE);
		
		return this;
    }

    /**
     * Initializes scene of add god
     * @param location
     * @param resources
     */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		godClassCB.setItems(controller.getGodClasses());
		godTypeCB.setItems(controller.getGodTypes());
	}
}
