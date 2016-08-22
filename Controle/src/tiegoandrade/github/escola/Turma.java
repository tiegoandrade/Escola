package tiegoandrade.github.escola;
/**
 * Classe uma turma de alunos.
 * 
 * @version 1.0 08-05-2016
 * @author Tiego
 *
 */
public class Turma {
	
	/** Alunos que compoem uma determinada turma. */
	Aluno aluno1;
	Aluno aluno2;
	Aluno aluno3;
	
	/**
	 * Método de calcúla a média de uma turma baseado nas notas dos alunos.
	 * 
	 * @return A média da Turma.
	 */
	double CalcularMedia(){
		double media = aluno1.calcularMedia() + aluno2.calcularMedia() + aluno3.calcularMedia();
		return media/3;
	}
}
