package tiegoandrade.github.escola;

/**
 * Classe que representa as partes de uma prova.
 * 
 * @version 1.0 08-05-2016
 * @author Tiego
 *
 */
public class Prova {
	
	/** Nota da primeira parte da prova de um aluno. */
	double notaParte1;
	
	/** Nota da segunda parte da prova de um aluno. */
	double notaParte2;
	
	/**
	 * Método que calcula a soma de duas partes de uma prova.
	 *
	 * @return Nota total das duas provas de um aluno.
	 */
	double calcularNotaTotal(){
	return notaParte1 + notaParte2;
	}
}
