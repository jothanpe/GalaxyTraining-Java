package pe.edu.galaxy.training.java.ejemplo;

public class App02 {
	public static void main(String[] args) {
		operar(5, 10);
		
		int ret = operarRetorno(5, 6);
		System.out.println(ret);
	}

	private static void operar(int a, int b) {
		System.out.println(a + b);
	}
	
	private static int operarRetorno(int a, int b) {
		return a + b;
	}
}
