package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.scene.control.*;
import javafx.geometry.*;

public class GameDisplay {

	public static void play(String title, String word) {
		
		//Set new stage for main game panel
		int[] lives = {6};
		String GuessedLetters = new String("Letters Guessed:");
		int[] letterPosition = {GuessedLetters.length()};
		char[] Guess = new char[GuessedLetters.length() + 54];
		for(int i =0;i < GuessedLetters.length();i++) {
			Guess[i] = GuessedLetters.charAt(i);
		}
		char c = 'x';
		Stage game = new Stage();
		game.setTitle(title);
		Pane layout = new Pane();
		Button button = new Button("Proceed");
		layout.setPadding(new Insets(20, 20,20,20));
		Circle r = new Circle(100,Color.DARKBLUE);
		r.relocate(100,250);
		Rectangle torso = new Rectangle(10,300,Color.DARKBLUE);
		torso.relocate(200, 400);
		Rectangle armR = new Rectangle(100,10,Color.DARKBLUE);
		armR.relocate(210, 540);
		Rectangle armL = new Rectangle(100,10,Color.DARKBLUE);
		armL.relocate(100, 540);
		Rectangle legR = new Rectangle(10,110,Color.DARKBLUE);
		Rectangle legL = new Rectangle(10,100,Color.DARKBLUE);
		Rotate legRrotate = new Rotate();
		Rotate legLrotate = new Rotate();
		legLrotate.setAngle(45);
		legRrotate.setAngle(-45);
		legR.getTransforms().addAll(legRrotate);
		legL.getTransforms().addAll(legLrotate);
		legL.relocate(200,700);
		legR.relocate(200,700);
		Label sign = new Label(String.valueOf(Guess));
		button.setOnAction(e->{
			//c = getNextLetter();
			AlertGuess.display('x');
			boolean loop = false;
			if(word.indexOf(c) == -1 && lives[0] == 6 && !loop) {
				r.relocate(500,250);
				lives[0] = lives[0] -1;
				loop = true;
				Guess[letterPosition[0]] = c;
				letterPosition[0] = letterPosition[0] +1;
				Guess[letterPosition[0]] = ',';
				letterPosition[0] = letterPosition[0] +1;
				sign.setText(String.valueOf(Guess));
			}
			if(word.indexOf(c) ==-1 && lives[0] == 5 && !loop) {
				torso.relocate(600, 400);
				lives[0] = lives[0] -1;
				loop = true;
				Guess[letterPosition[0]] = c;
				letterPosition[0] = letterPosition[0] +1;
				Guess[letterPosition[0]] = ',';
				letterPosition[0] = letterPosition[0] +1;
				sign.setText(String.valueOf(Guess));
			}
			if(word.indexOf(c) ==-1 && lives[0] == 4 && !loop) {
				armR.relocate(610, 540);
				lives[0] = lives[0] -1;
				loop = true;
				Guess[letterPosition[0]] = c;
				letterPosition[0] = letterPosition[0] +1;
				Guess[letterPosition[0]] = ',';
				letterPosition[0] = letterPosition[0] +1;
				sign.setText(String.valueOf(Guess));
			}
			if(word.indexOf(c) ==-1 && lives[0] == 3 && !loop) {
				armL.relocate(500, 540);
				lives[0] = lives[0] -1;
				loop = true;
				Guess[letterPosition[0]] = c;
				letterPosition[0] = letterPosition[0] +1;
				Guess[letterPosition[0]] = ',';
				letterPosition[0] = letterPosition[0] +1;
				sign.setText(String.valueOf(Guess));
			}
			if(word.indexOf(c) ==-1 && lives[0] == 2 && !loop) {
				legL.relocate(600, 700);
				lives[0] = lives[0] -1;
				loop = true;
				Guess[letterPosition[0]] = c;
				letterPosition[0] = letterPosition[0] +1;
				Guess[letterPosition[0]] = ',';
				letterPosition[0] = letterPosition[0] +1;
				sign.setText(String.valueOf(Guess));
			}
			if(word.indexOf(c) ==-1 && lives[0] == 1 && !loop) {
				legR.relocate(600, 700);
				lives[0] = lives[0] -1;
				loop = true;
				Guess[letterPosition[0]] = c;
				letterPosition[0] = letterPosition[0] +1;
				Guess[letterPosition[0]] = ',';
				letterPosition[0] = letterPosition[0] +1;
				sign.setText(String.valueOf(Guess));
			}
		});
		layout.setStyle("-fx-background-color: black;");
		layout.setPrefSize(1500, 1000);
		sign.setAlignment(Pos.TOP_RIGHT);
		sign.setScaleX(5.0);
		sign.setScaleY(5.0);
		sign.relocate(1200,100);
		Label LettersAvailable = new Label("empty");
		LettersAvailable.setScaleX(5.0);
		LettersAvailable.setScaleY(5.0);
		LettersAvailable.relocate(250,100);
		Rectangle base = new Rectangle(300,10,Color.DARKRED);
		base.relocate(600, 900);
		Rectangle tallPiece = new Rectangle(10,750,Color.DARKRED);
	    tallPiece.relocate(750,150);
		Rectangle connector = new Rectangle(150,10,Color.DARKRED);
		connector.relocate(600, 150); 
		Rectangle last = new Rectangle(10,100,Color.DARKRED);
		last.relocate(600, 150);
		layout.getChildren().addAll(base, tallPiece, last,sign,connector,button,r,torso,armR,armL,legL,legR); //,torso,legL,legR,armR,armLbase,Height,connector,last;
		Scene scene = new Scene(layout);
		game.setScene(scene);
		game.show();
	}

}
