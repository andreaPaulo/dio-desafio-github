package digitalInnovationOne.tester.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CalculadoraNovaTeste {
	
	@Test
	public void somaValores() {
		int a = 1;
		int b = 2;
		
		CalculadoraNova calcNova = new CalculadoraNova();
		int soma = calcNova.soma(a, b);
		
		assertEquals(3, soma);
		
	}
	
	@Test
	public void somaTresValores() {
		int a = 1;
		int b = 2;
		int c = 3;
		
		CalculadoraNova calcNova = new CalculadoraNova();
		int soma = calcNova.soma(a, b,c);
		
		assertEquals(6, soma);
		
	}

}
