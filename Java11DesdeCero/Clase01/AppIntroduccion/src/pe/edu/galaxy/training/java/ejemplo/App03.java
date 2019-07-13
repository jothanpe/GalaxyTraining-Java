package pe.edu.galaxy.training.java.ejemplo;

public class App03 {
	public static void main(String[] abc) {
		
		System.out.println(abc.length);
		
		if (abc.length > 0) {
			System.out.println(abc[0]);
		} else {
			System.err.println("Por favor ingrese un valor");
		}
	}
}
