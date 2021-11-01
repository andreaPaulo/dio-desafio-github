package one.digitalinovation.gof.singleton;
/**
 * Singleton "Apressado"
 * 
 * @author Andréa
 */
public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {}
	
	public static SingletonEager getInstancia() {
		
		return instancia;
	}
	}
	
