package it.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudDBpersone {
	public void primaConnessione() {

		// "jdbc:mysql://localhost:3306/Contatti?user=root&password=secret";
		String connectionString = "jdbc:mysql://localhost:3306/database1?user=Pasquale_S&password=Acce1313";

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(connectionString);
			PreparedStatement prepared = connection.prepareStatement("insert into persone (cognome, nome, eta) values (?,?,?)");
			prepared.setString(1, "Marroni");
			prepared.setString(2, "Enrico");
			prepared.setInt(3, 55);
			prepared.executeUpdate();
			Statement stm = connection.createStatement();
			ResultSet rs = stm.executeQuery("select * from persone");
			while (rs.next()) {
				System.out.println(rs.getString("cognome") + " " + rs.getString("nome") + " di anni " + rs.getInt("eta"));
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		} catch (Exception exc) {
			System.out.println(exc.getMessage());
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// gestione errore in chiusura
			}
		}

	}
}