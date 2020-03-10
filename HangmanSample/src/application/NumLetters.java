package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class NumLetters {
	
	public static void display(String title) {
		CharSequence entryString;
		String number;
		int letters;
		
		//Set up stage
		Stage window = new Stage();
		window.setTitle(title);
		
		//Create Label
		Label numLetters = new Label("Enter the number of letters: ");
		
		//Create Textfield
		TextField entryBox = new TextField();
		
		//Create enter button
		Button enter = new Button("Enter");
		
		//Handles the event of the enter button
		enter.setOnAction(e -> {
			window.close();
		});
		
		HBox layout = new HBox();
		layout.getChildren().addAll(numLetters,entryBox,enter);
		Scene scene = new Scene(layout, 350, 50);
		
		window.setScene(scene);
		window.showAndWait();
	}
	
}
