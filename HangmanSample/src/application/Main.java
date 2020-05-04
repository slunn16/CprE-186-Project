package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.scene.paint.Color;


public class Main extends Application {
	
	/**
	 * Starts the main menu for the game.
	 */
	@Override
	public void start(Stage primaryStage) {
		
		//Set opening hangman window
		Stage hangman = new Stage();
		String title = "Hangman";
		hangman.setTitle(title);
		
		//New Game button set up
		Button newGame = new Button("New Game");
		newGame.setStyle("-fx-background-color: grey;");
		newGame.setTextFill(Color.DARKBLUE);
		newGame.setMinWidth(300);
		newGame.setOnAction(e -> {
			hangman.close();
			NumLetters.display(title);
			});
		
		//Opening Words for Hangman game
		Label openingWords = new Label("Hangman");
		openingWords.setMinHeight(100);
		openingWords.setFont(new Font("Arial", 48));
		openingWords.setTextFill(Color.DARKRED);
		
		//Set Scene
		VBox layout = new VBox();
		layout.setStyle("-fx-background-color: black;");
		layout.getChildren().addAll(openingWords,newGame);
		layout.setAlignment(Pos.CENTER);
		Scene scene = new Scene(layout, 400, 300);
		
		//Show
		hangman.setScene(scene);
		hangman.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
