package it.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProvaConnDB {
	
	static String connectionString = "jdbc:mysql://localhost:3306/database1?user=Pasquale_S&password=Acce1313";
	
	public static void avviaConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(connectionString);
			PreparedStatement prepared = connection.prepareStatement("SELECT * FROM persone;");
			ResultSet rs = prepared.executeQuery();
			
			while(rs.next()) {
				System.out.println("ID: " + rs.getInt(1) + ", nome: " + rs.getString("nome") + ", cognome: " + rs.getString("cognome"));
			}
		} catch (SQLException e) {
			System.out.println("Connessione al DataBase non riuscita...");
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					System.out.println("\nLa connessione sta per chiudersi...");
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("Errore, la connessione non è mai stata aperta!");
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		avviaConnection();
		
	}

}
