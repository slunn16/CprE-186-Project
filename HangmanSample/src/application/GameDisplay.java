package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class GameDisplay {

	public static void play(String title, String word) {
		
		//Set new stage for main game panel
		Stage game = new Stage();
		game.setTitle(title);
		Pane layout = new Pane();
		int wordLength = word.length();
		Button enter = new Button("Guess one letter");
		enter.setOnAction(e -> {
			
		});
		
		layout.setStyle("-fx-background-color: black;");
		layout.setPrefSize(1500, 1000);
		Label sign = new Label("Letters Guessed");
		sign.setAlignment(Pos.TOP_RIGHT);
		sign.setScaleX(5.0);
		sign.setScaleY(5.0);
		sign.relocate(1200,100);
		Label LettersAvailable = new Label("Letters Available");
		LettersAvailable.setScaleX(5.0);
		LettersAvailable.setScaleY(5.0);
		LettersAvailable.relocate(250,100);
		Circle head = new Circle(100,Color.DARKRED);
		head.relocate(500,300);
		Rectangle torso =new Rectangle (10,150, Color.DARKRED);
		torso.relocate(600,500);
		Rectangle legL = new Rectangle(10,200,Color.DARKRED);
		Rectangle legR = new Rectangle(10,200,Color.DARKRED);
		legL.relocate(590, 650);
		legR.relocate(610, 650);
		Rectangle armL = new Rectangle(100,10,Color.DARKRED);
		Rectangle armR = new Rectangle(100,10,Color.DARKRED);
		armR.relocate(600, 550);
		armL.relocate(500,550);
		Rectangle base = new Rectangle(300,10,Color.DARKRED);
		base.relocate(600, 900);
		Rectangle Height = new Rectangle(10,750,Color.DARKRED);
		Height.relocate(750,150);
		Rectangle connector = new Rectangle(150,10,Color.DARKRED);
		connector.relocate(600, 150); 
		Rectangle last = new Rectangle(10,150,Color.DARKRED);
		last.relocate(600, 150);
		layout.getChildren().addAll(enter,base,Height,connector,last,head,torso,legL,legR,armR,armL,sign,LettersAvailable);
		Scene scene = new Scene(layout);
		
		game.setScene(scene);
		game.showAndWait();
		
		
	}

}
