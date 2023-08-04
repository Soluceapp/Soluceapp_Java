package com.soluceapp.shared;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Shared_db {

    private static final String DATABASE_URL = "jdbc:mysql://localhost/registre_java";
    private static final String DATABASE_USERNAME = "root";
    private static final String DATABASE_PASSWORD = "";
    private static final String SELECT_QUERY = "SELECT * FROM registre WHERE dutil = ? and dmp = ?";


    public boolean validate(String dutil, String mp) throws SQLException {      
        try (Connection con = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);)          
        		{PreparedStatement prep = con.prepareCall(SELECT_QUERY);  
            	prep.setString(1, dutil); 
            	prep.setString(2, mp); 
            	ResultSet res = prep.executeQuery();
            	if (res.next()) {return true;} con.close();} 
        catch (SQLException e) {printSQLException(e);  }return false;}

    public boolean repart(String dutil, String mp, String type) throws SQLException {      
		try (Connection con = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);)          
        		{PreparedStatement prep = con.prepareCall("SELECT * FROM registre WHERE dutil = ? and dmp = ? and type = ?");  
            	prep.setString(1, dutil); 
            	prep.setString(2, mp);
            	prep.setString(3, "admin"); 
            	ResultSet res = prep.executeQuery();
            	if (res.next()) {return true;} con.close();} 
        catch (SQLException e) {printSQLException(e);  }return false;}
    
    public static void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();}}}}
}
