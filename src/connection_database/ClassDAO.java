package connection_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClassDAO {
	
	public List<Class> listing() throws SQLException {
		List<Class> listaDisciplinas = new ArrayList<Class>();
		Connection connection = DatabaseApplication.getConnection();
		String sql = "SELECT * FROM disciplina";
		
		PreparedStatement stmt = connection.prepareStatement(sql);
		ResultSet resultTable = stmt.executeQuery();
		
		
		while (resultTable.next()) {
			listaDisciplinas.add(new Class(
					resultTable.getString("nome"),
					resultTable.getString("professor"),
					resultTable.getString("codigo_classroom"),
					resultTable.getInt("periodo")
			));
		}
		
		resultTable.close();
		stmt.close();
		connection.close();
		
		return listaDisciplinas;
	}
	


}
