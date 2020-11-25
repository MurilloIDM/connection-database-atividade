package connection_database;

public class Class {
	
	private String nome;
	private String professor;
	private String codigoClassRoom;
	private Integer periodo;

	public String getNome() { return this.nome; }
	
	public void setNome(String nome) { this.nome = nome; }
	
	public String getProfessor() { return this.professor; }
	
	public void setProfessor(String professor) { this.professor = professor; }
	
	public String getCodigoClassRoom() { return this.codigoClassRoom; }
	
	public void setCodigoClassRoom(String codigoClassRoom) { this.codigoClassRoom = codigoClassRoom; }
	
	public Integer getPeriodo() { return this.periodo; }
	
	public void setPeriodo(Integer periodo) { this.periodo = periodo; }
	
	public Class(String nome, String professor, String codigoClassRoom, Integer periodo) {
		this.nome = nome;
		this.professor = professor;
		this.codigoClassRoom = codigoClassRoom;
		this.periodo = periodo;
	}
	
}
