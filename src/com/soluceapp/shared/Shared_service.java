package com.soluceapp.shared;

/*
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage; */

public class Shared_service {

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*	
	public static void changeScene(ActionEvent event, String fxmlFile, String title, String username, String favChannel)
{
	Parent root = null;
	if (username !=null && favChannel !=null) {
				try {
		FXMLLoader loader = new FXMLLoader(Connect_service.class.getResource(fxmlFile));
		root = loader.load();
		SceneController loggedInController = loader.getController();
		loggedInController.setUserInformation(username, favChannel);
				} catch (IOException e) {e.printStackTrace();}}
		else 
				{try {
		 root = FXMLLoader.load(Connect_service.class.getResource(fxmlFile));
				} catch (IOException e) {e.printStackTrace();}}
		
	Stage stage =(Stage) ((Node) event.getSource()).getScene().getWindow();
	stage.setTitle(title);
	stage.setScene(new Scene(root));
	//stage.setScene(new Scene(root,675,400));
	stage.show();
}
*/	 
	/*
	public void userLogIn(ActionEvent) throws IOException {checkLogin();}

	private void checkLogin() throws IOException {
		Main m = new Main();
		if(username.getText().toString().equals("javacoding")&&password.getText().toString().equals("123")) {wrongLogIn.setText("Success!"); m.changeScene("init_frame.fxml");}
		else if(username.getText().isEmpty()&&password.getText().isEmpty()) {wrongLogIn.setText("Entrez vos informations");}		
		else {wrongLogIn.setText("L'identifiant ou le mot de passe est faux");
	}
	*/
		/*
		@Override
		public void initialize(URL location, ResourceBundle resources) { acceder1.setOnAction(new EventHandler<ActionEvent>() { @Override public void handle(ActionEvent event) {
		Connect_service.changeScene(event, "Connect_frame.fxml", "Log in !", null, null);
		}});}
					
		public void setUserInformation(String username, String favChannel)
		{
			//label_welcome.setText("Welcome"+username+"!");
			
		}
		/*	
		Méthode 2 :
			String resourcePath ="/com/soluceapp/shared/Connect_frame.fxml";
			URL init = getClass().getResource(resourcePath);
			FXMLLoader fxmlLoader = new FXMLLoader(init);
			Scene scene = new Scene (fxmlLoader.load());
			
			
			//Ne change pas---
			stage.setScene(scene);			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene.setFill(Color.TRANSPARENT);
			stage.getIcons().add(new javafx.scene.image.Image("logo.png"));
			stage.initStyle(StageStyle.TRANSPARENT);
			stage.show(); */		 
	 
}