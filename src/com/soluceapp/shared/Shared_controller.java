package com.soluceapp.shared;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.sql.SQLException;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;
import java.io.IOException;

public class Shared_controller {

	private Parent root;
	private Stage stage_connect;
	private Scene scene;
	
	@FXML private Button acceder1;
	@FXML private Button acceder2;
	@FXML private Button stopappli;
	@FXML private Button acceder3;
	@FXML private AnchorPane init_pane;
	@FXML private AnchorPane norm_pane;
	@FXML private Button submitButton;
	@FXML private PasswordField mp_id;
	@FXML private TextField dutil_id;
	
	@FXML public void acceder1 (ActionEvent event) throws IOException {	
		root = FXMLLoader.load(getClass().getResource("/com/soluceapp/shared/Connect_frame.fxml"));
		stage_connect = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.setFill(Color.TRANSPARENT);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage_connect.setScene(scene);
		stage_connect.show();} 
	
	@FXML public void acceder3 () throws IOException {
		FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(getClass().getResource("/com/soluceapp/admin/Admin_frame.fxml"));
       	Stage stage = (Stage) norm_pane.getScene().getWindow();
    	root =loader.load();
    	Scene scene = new Scene(root);
    	stage.setScene(scene);
    	stage.show();}
	
	@FXML public void acceder2 () throws IOException {
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(getClass().getResource("/com/soluceapp/util/Util_frame.fxml"));
    	Stage stage = (Stage) norm_pane.getScene().getWindow();
    	root =loader.load();
    	Scene scene = new Scene(root);
    	stage.setScene(scene);
    	stage.show();} 
	
	@FXML public void stopappli_ini (ActionEvent event) throws IOException {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Fermeture");
		alert.setContentText("Désirez-vous fermer l'application ? ");
		if(alert.showAndWait().get() == ButtonType.OK) {
		Stage stage = (Stage) init_pane.getScene().getWindow();
		stage.close();}}
	
	@FXML public void stopappli_norm (ActionEvent event) throws IOException {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Fermeture");
		alert.setContentText("Désirez-vous fermer l'application ? ");
		if(alert.showAndWait().get() == ButtonType.OK) {
		Stage stage = (Stage) norm_pane.getScene().getWindow();
		stage.close();}}

 	@FXML void login(ActionEvent event) throws SQLException{
 	Window owner = submitButton.getScene().getWindow();

    if (dutil_id.getText().isEmpty()) {showAlert(Alert.AlertType.ERROR, owner, "Formulaire incomplet !",  "Merci de saisir votre nom d'utilisateur (ou un mail)"); return;}
    if (mp_id.getText().isEmpty()) {showAlert(Alert.AlertType.ERROR, owner, "Formulaire incomplet !", "Merci de saisir votre mot de passe"); return;}

    String dutil = dutil_id.getText();
    String mp = mp_id.getText();
    String type = "admin";

    Shared_db shared_db = new Shared_db();
    boolean flag = shared_db.validate(dutil, mp);
    boolean flag2 = shared_db.repart(dutil, mp, type);

    if (!flag) { infoBox("Merci de saisir le bon mot de passe et nom d'utilisateur", null, "Echoué.");} 
    else { try {if (!flag2) {acceder2 (); } else acceder3 ();} catch (IOException e) {e.printStackTrace();} } }

 	public static void infoBox (String infoMessage, String headerText, String title) {
    Alert alert = new Alert(AlertType.CONFIRMATION);
    alert.setContentText(infoMessage);
    alert.setTitle(title);
    alert.setHeaderText(headerText);
    alert.showAndWait();}

 	private static void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
    Alert alert = new Alert(alertType);
    alert.setTitle(title);
    alert.setHeaderText(null);
    alert.setContentText(message);
    alert.initOwner(owner);
    alert.show();}

 	@FXML public void modifmp (ActionEvent event) throws IOException {}
 	
 	@FXML public void creacompte (ActionEvent event) throws IOException {}
 	

}
