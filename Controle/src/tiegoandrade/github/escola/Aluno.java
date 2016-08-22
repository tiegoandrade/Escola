package tiegoandrade.github.escola;

public class Aluno {
	
	/** Primeira prova de um aluno. */
	Prova prova1;
	
	/** Segunda prova de uma aluno */
	Prova prova2;
	
	/**
	 * M�todo que calcula a m�dia de um aluno baseado em 2 provas.
	 * 
	 * @return M�dia de um aluno.
	 */
	double calcularMedia(){
		double media = prova1.calcularNotaTotal() + prova2.calcularNotaTotal();
		return media/2;
	}
}


