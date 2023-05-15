package Prova;
public class Aluno extends Pessoa {
	  private int periodo;
	  private int turma;

	  public Aluno(String nome, String email, String senha, int periodo, int turma) {
	    super(nome, email, senha);
	    this.periodo = periodo;
	    this.turma = turma;
	  }

	  public String mostraAluno() {
	    return "Nome: " + getNome() + "\nE-mail: " + getEmail() + "\nPer�odo: " + periodo + "\nTurma: " + turma;
	  }

	  // setters e getters
	  public int getPeriodo() {
	    return periodo;
	  }

	  public void setPeriodo(int periodo) {
	    this.periodo = periodo;
	  }

	  public int getTurma() {
	    return turma;
	  }

	  public void setTurma(int turma) 
	  {
	    this.turma = turma;
	  }
}
	