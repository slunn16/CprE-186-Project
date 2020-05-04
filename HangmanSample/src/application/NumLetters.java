package application;

import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class NumLetters {
	
	private static CharSequence entryString;
	private static String word;
	
	/**
	 * Sets up what is needed for the main game display
	 * 
	 * @param title Title to put int the window for the game
	 */
	public static void display(String title) {
		
		//Set up stage
		Stage window = new Stage();
		window.setTitle(title);
		
		//Create Label
		Label numLetters = new Label("Enter the word: ");
		numLetters.setFont(new Font("Arial", 16));
		numLetters.setTextFill(Color.DARKRED);
		
		//Create Textfield
		TextField entryBox = new TextField();
		
		//Create enter button
		Button enter = new Button("Enter");
		enter.setStyle("-fx-background-color: grey;");
		enter.setTextFill(Color.DARKBLUE);
		
		//Handles the event of the enter button
		enter.setOnAction(e -> {
			entryString = entryBox.getCharacters();
			word = entryString.toString();
			Dictionary dictionary = new Dictionary();
			try {
				dictionary.assembleDictionary();

				if(dictionary.inDic(word)) {
					window.close();
					GameDisplay.play(title, word);
				}
				else {
					notValidDisplay();
				}
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				System.out.println("Error");
			}
			
		});
		
		HBox layout = new HBox();
		layout.setStyle("-fx-background-color: black;");
		layout.getChildren().addAll(numLetters,entryBox,enter);
		Scene scene = new Scene(layout, 350, 50);
		
		window.setScene(scene);
		window.showAndWait();
	}
	
	/**
	 * Sets up new window when the word is not valid.
	 */
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
