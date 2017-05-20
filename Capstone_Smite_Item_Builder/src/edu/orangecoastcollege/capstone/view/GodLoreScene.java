
package edu.orangecoastcollege.capstone.view;

import edu.orangecoastcollege.capstone.controller.Controller;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 * Scene that displays God's lore and God name
 * 
 * @author Pooty
 *
 */
public class GodLoreScene {
	
	private static Controller controller = Controller.getInstance();

	
	//TODO This will eventually be erased and ported to wherever the user
	// selects the god
    @FXML
    private Button loreBackBtn;

    @FXML
    private Label loreGodNameL;

    @FXML
    private TextArea loreDescriptionTA;
    
    
    
    
    
}
