package one.digitalinnovation.gof.singleton;

/**
 * Singleton "preguiçoso".
 * 
 * @author lucaspaludeto
 */

public class SingletonLazy {
	
	private static SingletonLazy instancia;

	public SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if(instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
	
	

}
