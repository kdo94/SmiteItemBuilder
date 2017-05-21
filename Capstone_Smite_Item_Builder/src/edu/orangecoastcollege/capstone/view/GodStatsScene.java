
package edu.orangecoastcollege.capstone.view;

import java.util.ArrayList;
import java.util.Arrays;

import edu.orangecoastcollege.capstone.controller.Controller;
import edu.orangecoastcollege.capstone.model.Build;
import edu.orangecoastcollege.capstone.model.God;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

/**
 * GodStatsScene is the controller for the God Stats
 * Scene.  It has the event handlers for user
 * input (god level via slider)
 * 
 * @author Pooty
 *
 */
public class GodStatsScene {
    @FXML
    private Button godStatsBackBtn;

    @FXML
    private Slider godStatsLevelSL;

    @FXML
    private Label godStatsNameL;

    @FXML
    private Label godStatsItem1;

    @FXML
    private Label godStatsItem2;

    @FXML
    private Label godStatsItem3;

    @FXML
    private Label godStatsItem4;

    @FXML
    private Label godStatsItem5;

    @FXML
    private Label godStatsItem6;

    @FXML
    private Label godStatsHealthL;

    @FXML
    private Label godStatsPProtectionL;

    @FXML
    private Label godStatsMProtectionL;

    @FXML
    private Label godStatsDamageL;

    @FXML
    private Label godStatsManaL;

    @FXML
    private Label godStatsAttackSpeedL;

    @FXML
    private Label godStatsHP5L;

    @FXML
    private Label godStatsMP5L;

    @FXML
    private Label godStatsMoveSpeedL;

    @FXML
    private Label godStatsHealthScalingL;

    @FXML
    private Label godStatsPProtectionScalingL;

    @FXML
    private Label godStatsMProtectionScalingL;

    @FXML
    private Label godStatsDamageScalingL;

    @FXML
    private Label godStatsClassL;

    @FXML
    private Label godStatsTypeL;

    @FXML
    private Label godStatsPantheonL;
  
	private static Controller controller = Controller.getInstance();
	
	/**
	 * Set the stats for God with scaling per slider
	 * 
	 */
	@FXML
	public void scaleGodStats()
	{
		Build currentBuild = controller.getCurrentBuild();
		God currentGod = currentBuild.getGod();
		double levelFromSlider = godStatsLevelSL.getValue();
		int intBuffer = 0;
		double doubleBuffer = 0;
		
		godStatsNameL.setText(currentGod.getName());
		godStatsItem1.setText(currentBuild.getItem1().getName());
		godStatsItem2.setText(currentBuild.getItem2().getName());
		godStatsItem3.setText(currentBuild.getItem3().getName());
		godStatsItem4.setText(currentBuild.getItem4().getName());
		godStatsItem5.setText(currentBuild.getItem5().getName());
		godStatsItem6.setText(currentBuild.getItem6().getName());
		
		intBuffer = currentGod.getBaseHealth();
		intBuffer = (int)(intBuffer + currentGod.getHealthScaling() * levelFromSlider);
		godStatsHealthL.setText(String.valueOf(intBuffer));
		
		intBuffer = currentGod.getBasePProtection();
		intBuffer = (int)(intBuffer + currentGod.getPhysicalProtectScaling() * levelFromSlider);
		godStatsPProtectionL.setText(String.valueOf(intBuffer));
		
		intBuffer = currentGod.getBaseMProtection();
		intBuffer = (int)(intBuffer + currentGod.getMagicalProtectScaling() * levelFromSlider);
		godStatsMProtectionL.setText(String.valueOf(intBuffer));
		
		intBuffer = currentGod.getBaseDamage();
		intBuffer = (int)(intBuffer + currentGod.getDamageScaling() * levelFromSlider);
		godStatsDamageL.setText(String.valueOf(intBuffer));
		
		godStatsManaL.setText(String.valueOf(currentGod.getBaseMana()));
		godStatsAttackSpeedL.setText(String.valueOf(currentGod.getBaseAttackSpeed()));
		godStatsHP5L.setText(String.valueOf(currentGod.getBaseHP5()));
		godStatsMP5L.setText(String.valueOf(currentGod.getBaseMP5()));
		godStatsMoveSpeedL.setText(String.valueOf(currentGod.getBaseMovementSpeed()));
		godStatsHealthScalingL.setText(String.valueOf(currentGod.getHealthScaling()));
		godStatsPProtectionScalingL.setText(String.valueOf(currentGod.getPhysicalProtectScaling()));
		godStatsMProtectionScalingL.setText(String.valueOf(currentGod.getMagicalProtectScaling()));
		godStatsDamageScalingL.setText(String.valueOf(currentGod.getDamageScaling()));
		godStatsClassL.setText(currentGod.getGodClass());
		godStatsTypeL.setText(currentGod.getType());
		godStatsPantheonL.setText(currentGod.getPantheon());
	}
	
    @FXML
    public Object back()
    {
    	godStatsLevelSL.setValue(1);
		
		//TODO scene navigator
    	ViewNavigator.loadScene("Smite Item Builder", ViewNavigator.MAIN_SCENE);
		
		return this;
    }
}
