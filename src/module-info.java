module Soluceapp_JavaFX {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	
	opens com.soluceapp.shared to javafx.graphics, javafx.fxml;
	opens com.soluceapp.util to javafx.graphics, javafx.fxml;
	opens com.soluceapp.activite to javafx.graphics, javafx.fxml;
	opens com.soluceapp.admin to javafx.graphics, javafx.fxml;
}
