
package edu.orangecoastcollege.capstone.view;

import java.net.URL;
import java.util.ResourceBundle;

import edu.orangecoastcollege.capstone.controller.Controller;
import edu.orangecoastcollege.capstone.model.God;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 * Scene that displays God's lore and God name
 * 
 * @author Pooty
 *
 */
public class GodLoreScene implements Initializable{
	
	private static Controller controller = Controller.getInstance();

	
	/**
	 * The implementation of this class was moved to main scene, but the
	 * details were left here for grading purposes
	 */


    @FXML
    private Button loreBackBtn;

    @FXML
    private Label loreGodNameL;

    @FXML
    private TextArea loreDescriptionTA;
    
    /**
     * Back button that returns user to main screen
     * @return
     */
    @FXML
    public Object godLoreLoadMainScene()
    {
    	ViewNavigator.loadScene("Smite Item Builder", ViewNavigator.MAIN_SCENE);
    	return this;
    }
    
    /**
     * Initialize the lore scene
     * @return
     */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		God currentGod = controller.getCurrentBuild().getGod();
		loreGodNameL.setText(currentGod.getName());
		loreDescriptionTA.setText(currentGod.getLore());
	}
  
    
}
