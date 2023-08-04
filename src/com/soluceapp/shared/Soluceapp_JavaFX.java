package com.soluceapp.shared;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.paint.Color;

public class Soluceapp_JavaFX extends Application {
	
	@Override
	public void start(Stage stage) {
		try {			
			Parent root = FXMLLoader.load(getClass().getResource("/com/soluceapp/shared/Init_frame.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene.setFill(Color.TRANSPARENT);
			stage.getIcons().add(new javafx.scene.image.Image("logo.png"));
			stage.initStyle(StageStyle.TRANSPARENT);
			stage.show();	
			stage.setOnCloseRequest(event -> {event.consume(); try {stopappli(stage);} catch (IOException e) {e.printStackTrace();}});
		} catch(Exception e) {e.printStackTrace();}}
	
	public void stopappli (Stage stage) throws IOException {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Fermeture");
		alert.setContentText("Avez-vous sauvegardé avant de fermer ?  ");
		if(alert.showAndWait().get() == ButtonType.OK) {
		stage.close();}}
	
public static void main(String[] args) {launch(args);}
}

