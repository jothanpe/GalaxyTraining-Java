package pe.edu.galaxy.training.java.ejemplo;

public class App01 {
	
	static int x = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c, d;
		
		//System.out.println(a); Variables en m�todos no se autoinicializan
		System.out.println(x); //Variables de clase s� 	
		
		a = 10;
		b= 5;
		c = a + b;
		d = c * -1;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		System.out.println(x);
	}

}
