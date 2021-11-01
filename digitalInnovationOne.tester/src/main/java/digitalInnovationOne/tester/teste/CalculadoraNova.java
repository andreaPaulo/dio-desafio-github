package digitalInnovationOne.tester.teste;

public class CalculadoraNova {
	
	public int soma(int ... valores) {
		int soma = 0;
		for (int valor : valores) {
			soma+= valor;
			
		}
		return soma;
	}

}
