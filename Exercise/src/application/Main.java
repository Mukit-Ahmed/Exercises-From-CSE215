package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		Group root = new Group();
		Scene scene = new Scene(root,600,600,Color.GREEN);
		Image icon = new Image("Ai3.png");
		Stage stage = new Stage();
		ImageView imageView = new ImageView(icon);
		imageView.setX(400);
		imageView.setY(200);	
		Text text = new Text();
		
		Circle circle = new Circle();
		
		circle.setCenterX(300);
		circle.setCenterY(300);
		circle.setRadius(80);
		circle.setFill(Color.RED);
		
		
		
		text.setText("This is a Introductory CSE course");
		text.setX(25);
		text.setY(50);
		text.setFont(Font.font("Times New Roman",40));
		root.getChildren().add(text);
		root.getChildren().add(imageView);
		root.getChildren().add(circle);
		
		stage.getIcons().add(icon);
		stage.setScene(scene);
		stage.show();
	}
}
