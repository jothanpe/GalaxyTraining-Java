package pe.edu.galaxy.training.java.ejemplo;

public class App04 {
	public static void main(String[] abc) {
		
		try {
			System.out.println(abc[0]);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.err.println("POr favor ingrese un valor");
		}

	}
}
