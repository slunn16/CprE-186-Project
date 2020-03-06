package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Stage hangman = new Stage();
		String title = "Hangman";
		hangman.setTitle(title);
		
		Button newGame = new Button("New Game");
		newGame.setMinWidth(300);
		newGame.setOnAction(e -> NumLetters.display(title));
		
		VBox layout = new VBox();
		layout.getChildren().add(newGame);
		layout.setAlignment(Pos.CENTER);
		Scene scene = new Scene(layout, 400, 600);
		
		hangman.setScene(scene);
		hangman.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
