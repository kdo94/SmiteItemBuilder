package edu.orangecoastcollege.capstone.view;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewNavigator {
	public static final String BUILDS_SCENE = "BuildsScene.fxml";
	public static final String ALL_ITEMS_SCENE = "AllItemsScene.fxml";
	public static final String MAIN_SCENE = "MainScene.fxml";
	public static final String ADD_GOD_SCENE = "AddGodScene.fxml";
	public static final String ADD_ITEM_SCENE = "AddItemScene.fxml";
	public static final String GOD_LORE_SCENE = "GodLoreScene.fxml";
	public static final String GOD_STATS_SCENE = "GodStatsScene.fxml";
	public static final String ABILITIES_STATS_SCENE = "AbilitiesStatsScene.fxml";
	public static final String ALL_GODS_SCENE = "AllGodsScene.fxml";
	public static final String ALL_RELICS_SCENE = "AllRelicsScene.fxml";
	public static final String ALL_BUILDS_SCENE = "BuildsScene.fxml";

	public static Stage mainStage;

	public static void setStage(Stage stage) {
		mainStage = stage;
	}

	public static void loadScene(String title, String sceneFXML) {

		try {
			mainStage.setTitle(title);
			Scene scene = new Scene(FXMLLoader.load(ViewNavigator.class.getResource(sceneFXML)));
			mainStage.setScene(scene);
			mainStage.show();
		} 
		catch (IOException e) {
			System.err.println("Error loading: " + sceneFXML + "\n" + e.getMessage());
			e.printStackTrace();
		}
	}

}
