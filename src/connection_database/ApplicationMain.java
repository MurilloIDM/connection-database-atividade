package connection_database;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ApplicationMain {

	public static void main(String[] args) {
		
		ClassDAO accessDatabase = new ClassDAO();
		
		List<Class> listaDisciplinas = new ArrayList<Class>();
		
		try {
			listaDisciplinas = accessDatabase.listing();
			
			for (Class disciplina : listaDisciplinas) {
				System.out.println("Nome disciplina: " + disciplina.getNome());
				System.out.println("Nome do professor: " + disciplina.getProfessor());
				System.out.println("Código do classroom: " + disciplina.getCodigoClassRoom());
				System.out.println("Período: " + disciplina.getPeriodo() + "°");
				System.out.println("\n===========================\n");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
