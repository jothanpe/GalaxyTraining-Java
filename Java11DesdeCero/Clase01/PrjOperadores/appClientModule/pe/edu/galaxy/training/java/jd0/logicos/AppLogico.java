package pe.edu.galaxy.training.java.jd0.logicos;

public class AppLogico {

	public static void main(String[] args) {

		/*
		 *  (&&, &) or, (||, |) or,!(negaci�n) 
		 */
		char sexo='F';
		short edad=15;
		
		if (sexo=='F' && edad>=15) {
			System.out.println("Dama");
		}else{
			System.out.println("Ni�a");
		}
		sexo='M';
		if (sexo=='F' & edad>=15) {
			System.out.println("Dama");
		}else{
			System.out.println("Ni�a");
		}
		
		if (sexo=='M' || edad>=18) {
			System.out.println("Caballero");
		}else{
			System.out.println("Ni�o");
		}
		if (sexo=='M' | edad>=18) {
			System.out.println("Caballero");
		}else{
			System.out.println("Ni�o");
		}
		
		System.out.println(true);
		System.out.println(!true);
		
		int nota=21;
		
		if (!(nota>=0 && nota<=20)) {
			System.out.println("Nota no v�lida");
		}
		
		if (nota<0 || nota>20) {
			System.out.println("Nota no v�lida");
		}
				
	}

}
