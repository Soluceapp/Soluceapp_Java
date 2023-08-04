package com.soluceapp.activite;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Active1_controller implements Initializable{
	private Parent root;
	
    @FXML   private MenuItem acceder1;
    @FXML   private MenuItem acceder2;
    @FXML   private MenuItem acceder5;
    @FXML   private MenuItem acceder4;
    @FXML   private AnchorPane active_pane;
    @FXML   private MenuItem stopapplimenu;
    @FXML   private TableView<Active1_service1> table1;
    @FXML   private TableView<Active1_service2> table2;
    @FXML   private TableView<Active1_service3> table3;
    @FXML   private TableColumn<Active1_service1, String> c1;
    @FXML   private TableColumn<Active1_service1, Float> c2;
    @FXML   private TableColumn<Active1_service1, Float> c3;
    @FXML   private TableColumn<Active1_service1, String> c4;
    @FXML   private TableColumn<Active1_service2, String> c5;
    @FXML   private TableColumn<Active1_service2, Float> c6;
    @FXML   private TableColumn<Active1_service2, Float> c7;
    @FXML   private TableColumn<Active1_service2, String> c8;
    @FXML   private TableColumn<Active1_service3, String> c9;
    @FXML   private TableColumn<Active1_service3, String> c10;
    @FXML   private TableColumn<Active1_service3, Float> c11;
    @FXML   private TableColumn<Active1_service3, Float> c12;
 
    ObservableList<Active1_service1> list1 = FXCollections.observableArrayList(
    		new Active1_service1("Immobilisation",45,78,"Capital"),
    		new Active1_service1("Immobilisation",45,78,"Capital")
    		);
    ObservableList<Active1_service2> list2 = FXCollections.observableArrayList(
    		new Active1_service2("Achat MP",65,78,"Vente de produits finis"),
    		new Active1_service2("Achat MP",65,78,"Vente de produits finis")
    		);
    ObservableList<Active1_service3> list3 = FXCollections.observableArrayList(
    		new Active1_service3("101","Capital",0,12),
    		new Active1_service3("101","Capital",0,12)
    		);
    
    @Override public void initialize(URL url, ResourceBundle resourceBundle)
    {
    	c1.setCellValueFactory(new PropertyValueFactory<Active1_service1, String>("c1"));
    	c2.setCellValueFactory(new PropertyValueFactory<Active1_service1, Float>("c2"));
    	c3.setCellValueFactory(new PropertyValueFactory<Active1_service1, Float>("c3"));
    	c4.setCellValueFactory(new PropertyValueFactory<Active1_service1, String>("c4"));
    	c5.setCellValueFactory(new PropertyValueFactory<Active1_service2, String>("c5"));
    	c6.setCellValueFactory(new PropertyValueFactory<Active1_service2, Float>("c6"));
    	c7.setCellValueFactory(new PropertyValueFactory<Active1_service2, Float>("c7"));
    	c8.setCellValueFactory(new PropertyValueFactory<Active1_service2, String>("c8"));
    	c9.setCellValueFactory(new PropertyValueFactory<Active1_service3, String>("c9"));
    	c10.setCellValueFactory(new PropertyValueFactory<Active1_service3, String>("c10"));
    	c11.setCellValueFactory(new PropertyValueFactory<Active1_service3, Float>("c11"));
    	c12.setCellValueFactory(new PropertyValueFactory<Active1_service3, Float>("c12"));
    	table1.setItems(list1);
    	table2.setItems(list2);
    	table3.setItems(list3);
    }
    
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