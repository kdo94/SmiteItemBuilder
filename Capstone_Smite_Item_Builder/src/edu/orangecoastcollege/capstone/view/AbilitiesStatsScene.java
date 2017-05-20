
package edu.orangecoastcollege.capstone.view;

import java.util.ArrayList;
import java.util.Arrays;

import edu.orangecoastcollege.capstone.controller.Controller;
import edu.orangecoastcollege.capstone.model.Abilities;
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
public class AbilitiesStatsScene {
    @FXML
    private Button abilitiesStatsBackBtn;

    @FXML
    private Slider abilitiesStatsLevelSL;

    @FXML
    private Label abilitiesStatsNameL;

    @FXML
    private Label abilitiesStatsItem1;

    @FXML
    private Label abilitiesStatsItem2;

    @FXML
    private Label abilitiesStatsItem3;

    @FXML
    private Label abilitiesStatsItem4;

    @FXML
    private Label abilitiesStatsItem5;

    @FXML
    private Label abilitiesStatsItem6;

    @FXML
    private Label abilityStatName1L;

    @FXML
    private Label abilityStatDamage1L;

    @FXML
    private Label abilityStatName2L;

    @FXML
    private Label abilityStatDamage2L;

    @FXML
    private Label abilityStatName3L;

    @FXML
    private Label abilityStatDamage3L;

    @FXML
    private Label abilityStatName4L;

    @FXML
    private Label abilityStatDamage4L;

    @FXML
    private Label abilityStatDamageScaling1L;

    @FXML
    private Label abilityStatDamageScaling2L;

    @FXML
    private Label abilityStatDamageScaling3L;

    @FXML
    private Label abilityStatDamageScaling4L;
  
	private static Controller controller = Controller.getInstance();
	
	/**
	 * Set the stats for God with scaling per slider
	 * 
	 */
	@FXML
	public void scaleAbilityStats()
	{
		//TODO where do abilities come from?
		Abilities currentAbilities = new Abilities();
		
		Build currentBuild = controller.getCurrentBuild();
		God currentGod = currentBuild.getGod();
		double levelFromSlider = abilitiesStatsLevelSL.getValue();
		int intBuffer = 0;
		double doubleBuffer = 0;
		
		abilitiesStatsNameL.setText(currentGod.getName());
		abilitiesStatsItem1.setText(currentBuild.getItem1().getName());
		abilitiesStatsItem2.setText(currentBuild.getItem2().getName());
		abilitiesStatsItem3.setText(currentBuild.getItem3().getName());
		abilitiesStatsItem4.setText(currentBuild.getItem4().getName());
		abilitiesStatsItem5.setText(currentBuild.getItem5().getName());
		abilitiesStatsItem6.setText(currentBuild.getItem6().getName());
		
		abilityStatName1L.setText(currentAbilities.getName1());
		abilityStatName2L.setText(currentAbilities.getName2());
		abilityStatName3L.setText(currentAbilities.getName3());
		abilityStatDamage4L.setText(currentAbilities.getUltimateName());
		
		intBuffer = currentAbilities.getDamage1();
		doubleBuffer = currentAbilities.getScaling1();
		intBuffer = (int)(intBuffer + doubleBuffer * levelFromSlider);
		abilityStatDamage1L.setText(String.valueOf(intBuffer));
		abilityStatDamageScaling1L.setText(String.valueOf(doubleBuffer));
		
		intBuffer = currentAbilities.getDamage2();
		doubleBuffer = currentAbilities.getScaling2();
		intBuffer = (int)(intBuffer + doubleBuffer * levelFromSlider);
		abilityStatDamage2L.setText(String.valueOf(intBuffer));
		abilityStatDamageScaling2L.setText(String.valueOf(doubleBuffer));
		
		intBuffer = currentAbilities.getDamage3();
		doubleBuffer = currentAbilities.getScaling3();
		intBuffer = (int)(intBuffer + doubleBuffer * levelFromSlider);
		abilityStatDamage3L.setText(String.valueOf(intBuffer));
		abilityStatDamageScaling3L.setText(String.valueOf(doubleBuffer));
		
		intBuffer = currentAbilities.getUltimateDamage();
		doubleBuffer = currentAbilities.getUltimateScaling();
		intBuffer = (int)(intBuffer + doubleBuffer * levelFromSlider);
		abilityStatDamage4L.setText(String.valueOf(intBuffer));
		abilityStatDamageScaling4L.setText(String.valueOf(doubleBuffer));
		
	}
	
    @FXML
    public Object back()
    {
    	abilitiesStatsLevelSL.setValue(1);
		
		//TODO scene navigator
//		ViewNavigator.loadScene("All Gods", ViewNavigator.ALL_GODS_SCENE);
		
		return this;
    }
}
