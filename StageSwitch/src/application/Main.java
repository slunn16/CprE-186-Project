package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	
	Stage window;
	Scene scene1, scene2;
	
	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		
		//Button 1
		Label label1 = new Label("Stage One the easy stage.");
		Button button1 = new Button("Next Stage");
		button1.setOnAction(e -> window.setScene(scene2));
		
		//layout 1 
		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label1, button1);
		scene1 = new Scene(layout1, 200, 200);
		
		//Button 2
		Button button2 = new Button("Wimp out and go back to the first stage.");
		button2.setOnAction(e -> window.setScene(scene1));
		
		//layout 2
		StackPane layout2 = new StackPane();
		layout2.getChildren().add(button2);
		scene2 = new Scene(layout2, 600, 300);
		
		window.setScene(scene1);
		window.setTitle("Stage Switch");
		window.show();
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
