package com.soluceapp.admin;

public class Admin_service {
/*	//---------Pour insérer ou supprimer
	// Charger le driver mysql
	//Class.forName("com.mysql.cj.jdbc.Driver");
	// Créer la connexion
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/registre_java","root","");
	// Créer un état de connexion (sécurité bloque connexion)
	@SuppressWarnings("unused")
	Statement st = con.createStatement();
	// Créer une requête d'insertion
	PreparedStatement stmt = con.prepareStatement("UPDATE registre SET dmp=? WHERE dutil=?");
	stmt.setString(1,"19711007@");   
	stmt.setString(2,"vervisct");    
	stmt.executeUpdate();
	// Fermer la connection
	con.close(); */

	/*
	try {Connection con = DriverManager.getConnection("jdbc:mysql://localhost/registre_java","root","");
	@SuppressWarnings("unused")
	Statement st = con.createStatement();
	PreparedStatement prep = con.prepareCall("select * from registre");
	ResultSet res = prep.executeQuery();
	while(res.next()) {System.out.println("Nom : "+res.getString(3)); }
	con.close(); } 
	catch (Exception e) {System.out.println("Error : "+e.getMessage());}
*/			
}
