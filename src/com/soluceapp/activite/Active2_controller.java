package com.soluceapp.activite;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;

public class Active2_controller {
	private Parent root;
	
    @FXML   private MenuItem acceder1;
    @FXML   private MenuItem acceder2;
    @FXML   private MenuItem acceder5;
    @FXML   private MenuItem acceder4;
    @FXML   private AnchorPane active_pane;
    @FXML   private MenuItem stopapplimenu;

    @FXML public void acceder1 (ActionEvent event) throws IOException {	
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(getClass().getResource("/com/soluceapp/shared/Connect_frame.fxml"));
       	Stage stage = (Stage) active_pane.getScene().getWindow();
    	root =loader.load();
    	Scene scene = new Scene(root);
    	stage.setScene(scene);
    	stage.show();}
    
    @FXML public void acceder2 () throws IOException {
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(getClass().getResource("/com/soluceapp/util/Util_frame.fxml"));
    	Stage stage = (Stage) active_pane.getScene().getWindow();
    	root =loader.load();
    	Scene scene = new Scene(root);
    	stage.setScene(scene);
    	stage.show();}

    @FXML
    public void acceder4 (ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(getClass().getResource("/com/soluceapp/activite/Active1_frame.fxml"));
       	Stage stage = (Stage) active_pane.getScene().getWindow();
    	root =loader.load();
    	Scene scene = new Scene(root);
    	stage.setScene(scene);
    	stage.show();}

    
    @FXML
    public void acceder5 (ActionEvent event) throws IOException {	
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(getClass().getResource("/com/soluceapp/activite/Active2_frame.fxml"));
       	Stage stage = (Stage) active_pane.getScene().getWindow();
    	root =loader.load();
    	Scene scene = new Scene(root);
    	stage.setScene(scene);
    	stage.show();}

    @FXML
    public void stopappli (ActionEvent event) throws IOException {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Fermeture");
		alert.setContentText("Désirez-vous fermer l'application ? ");
		if(alert.showAndWait().get() == ButtonType.OK) {
		Stage stage = (Stage) active_pane.getScene().getWindow();
		stage.close();}}

}