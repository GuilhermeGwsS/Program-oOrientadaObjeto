package Prova;
public class MainQuest�o1 {

public static void main(String[] args) 
{
  Professor professor = new Professor("Jo�o", "joao@email.com", "123",
      50.0f, 20);
  System.out.println(professor.mostraProfessor());

  Aluno aluno = new Aluno("Maria", "maria@email.com", "456",
      3, 2);
  System.out.println(aluno.mostraAluno());
}
}