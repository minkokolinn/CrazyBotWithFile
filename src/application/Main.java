package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
//			VBox root = (VBox)FXMLLoader.load(CrazyBot.class.getResource("CrazyBot.fxml"));	//get class so dr main nk package tu tu out mhr bl loh pyw dr
			VBox root = (VBox)FXMLLoader.load(getClass().getResource("../view/CrazyBot.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.setTitle("Crazy Bot Program");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
