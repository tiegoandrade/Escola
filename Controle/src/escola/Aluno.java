package escola;

public class Aluno {
	
	// Atributos de Aluno
	Prova prova1;
	Prova prova2;
	
	// M�todo que calcula a m�dia de um aluno baseado em 2 provas.
	double calcularMedia(){
		double media = prova1.calcularNotaTotal() + prova2.calcularNotaTotal();
		return media/2;
	}
}


