package Pratica1;

public class NotasAlunos 
{
	
	public static void main(System[] args) {
		
	
		 String nome;
		 String matricula;//ATRIBUTOS
		double notaAV1 ;
		double notaAVE ;
		double notaAV2 ;
		String curso;
		
		
		
		
		public NotasAlunos c1 = new NotasAlunos(String nome, String1 matricula,double notaAV1, double notaAVE, double notaAV2, String curso, int periodo ) 
		{
			this.nome = nome;
			this.matricula = matricula;
			this.notaAV1 = notaAV1;
			this.notaAV2 = notaAV2;
			this.curso = curso;
			this.periodo = periodo;
			
		}
	
		public void alterarAV1(double nota) 
		{
			this.notaAV1 = nota;
		}
		public void avaliarAluno () 
		{
			if((this.notaAV1 + this.notaAV2) >= 60) 
			{
				System.out.println(nome + " APROVADO");
			}
			else
				System.out.println(nome + " REPROVADO");
			
		}
		public void avaliarRecuperacao1() 
		{
			if((this.notaAV1 + this.notaAV2 + this.notaAVE / 3) >= 60) 
			{
				System.out.println(nome + " APROVADO");
			}
			else
				System.out.println(nome + " RECUPERAÇÃO");
		}
		public void avaliarRecuperacao() 
		{
			if((this.notaAV1 + this.notaAV2 + this.notaAVE / 3) >= 60) 
			{
				System.out.println(nome + " APROVADO");
			}
			else
				System.out.println(nome + " RECUPERAÇÃO");
			
		}
}
	
