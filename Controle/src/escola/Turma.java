package escola;

public class Turma {
	
	// Atributos da classe
	Aluno aluno1;
	Aluno aluno2;
	Aluno aluno3;
	
	// Método de calcúla a média de uma turma baseado nas notas dos alunos.
	double CalcularMedia(){
		double media = aluno1.calcularMedia() + aluno2.calcularMedia() + aluno3.calcularMedia();
		return media/3;
	}
}
