package simplecalculator;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SimpleCalculator extends Application {
   public static void main(String[] args) {
    launch(args);
  }

    @Override
  public void start(Stage primaryStage) throws Exception {
    Parent gp= FXMLLoader.load(getClass().getResource("LayoutGUI.fxml"));
    primaryStage.setScene( new Scene(gp, 260, 315)); // 266, 314
    primaryStage.show();
  }}