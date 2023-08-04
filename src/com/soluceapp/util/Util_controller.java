package com.soluceapp.util;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Util_controller {
	private Parent root;
		
    @FXML   private MenuItem sauvegarde;
    @FXML   private MenuItem stopapplimenu;
    @FXML   private MenuItem acceder1;
    @FXML   private MenuItem acceder3;
    @FXML   private MenuItem acceder4;
    @FXML   private MenuItem acceder5;
    @FXML  private AnchorPane util_pane;
    
    public void acceder1 (ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(getClass().getResource("/com/soluceapp/shared/Connect_frame.fxml"));
       	Stage stage = (Stage) util_pane.getScene().getWindow();
    	root =loader.load();
    	Scene scene = new Scene(root);
    	stage.setScene(scene);
    	stage.show();}

    public void acceder3 (ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(getClass().getResource("/com/soluceapp/admin/Admin_frame.fxml"));
       	Stage stage = (Stage) util_pane.getScene().getWindow();
    	root =loader.load();
    	Scene scene = new Scene(root);
    	stage.setScene(scene);
    	stage.show();}
       
    @FXML
    public void acceder4 (ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(getClass().getResource("/com/soluceapp/activite/Active1_frame.fxml"));
       	Stage stage = (Stage) util_pane.getScene().getWindow();
    	root =loader.load();
    	Scene scene = new Scene(root);
    	stage.setScene(scene);
    	stage.show();}

    
    @FXML
    public void acceder5 (ActionEvent event) throws IOException {	
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(getClass().getResource("/com/soluceapp/activite/Active2_frame.fxml"));
       	Stage stage = (Stage) util_pane.getScene().getWindow();
    	root =loader.load();
    	Scene scene = new Scene(root);
    	stage.setScene(scene);
    	stage.show();}

    @FXML
    public void sauvegarde (ActionEvent event) throws IOException {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setContentText("Désirez-vous sauvegarder ? ");
		if(alert.showAndWait().get() == ButtonType.OK) {
		alert.setContentText("Sauvegarde effectuée. ");}}

    
    @FXML public void stopappli (ActionEvent event) throws IOException {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Fermeture");
		alert.setContentText("Désirez-vous fermer l'application ? ");
		if(alert.showAndWait().get() == ButtonType.OK) {
		Stage stage = (Stage) util_pane.getScene().getWindow();
		stage.close();}}
}
