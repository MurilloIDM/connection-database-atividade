package connection_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseApplication {
	
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/atiProjeto?serverTimezone=UTC", "root", "");
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
