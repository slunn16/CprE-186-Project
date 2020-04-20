package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class NumLetters {
	
	private static CharSequence entryString;
	private static String word;
	
	public static void display(String title) {
		
		//Set up stage
		Stage window = new Stage();
		window.setTitle(title);
		
		//Create Label
		Label numLetters = new Label("Enter the word: ");
		
		//Create Textfield
		TextField entryBox = new TextField();
		
		//Create enter button
		Button enter = new Button("Enter");
		
		//Handles the event of the enter button
		enter.setOnAction(e -> {
			entryString = entryBox.getCharacters();
			word = entryString.toString();
			if(word.length() > 0) {
				window.close();
				GameDisplay.play(title, word);
			}
			else {
				notValidDisplay();
			}
		});
		
		HBox layout = new HBox();
		layout.getChildren().addAll(numLetters,entryBox,enter);
		Scene scene = new Scene(layout, 350, 50);
		
		window.setScene(scene);
		window.showAndWait();
	}
	
	public static void notValidDisplay() {
		
		Stage invalid = new Stage();
		
		Label message = new Label("This is not a valid word.");
		Button accept = new Button("Ok");
		
		accept.setOnAction(e -> invalid.close());
		
		VBox layout = new VBox();
		layout.getChildren().addAll(message, accept);
		Scene scene = new Scene(layout, 200, 50);
		
		invalid.setScene(scene);
		invalid.showAndWait();
		
	}
	
}
