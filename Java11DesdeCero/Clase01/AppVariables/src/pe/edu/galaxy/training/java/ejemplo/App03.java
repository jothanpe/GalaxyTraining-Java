package pe.edu.galaxy.training.java.ejemplo;

public class App03 {
	public static void main(String[] args) {
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		operar(a, b);
		
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
