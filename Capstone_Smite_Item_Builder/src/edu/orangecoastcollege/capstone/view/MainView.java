package edu.orangecoastcollege.capstone.view;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainView extends Application
{

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		// TODO Auto-generated method stub
		ViewNavigator.setStage(primaryStage);
		ViewNavigator.loadScene("All Items Scene", ViewNavigator.ADD_ITEM_SCENE);
	}

	public static void main(String[] args)
	{
		launch(args);
	}

}
