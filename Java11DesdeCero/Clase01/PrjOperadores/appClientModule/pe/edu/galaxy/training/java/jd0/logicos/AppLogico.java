package pe.edu.galaxy.training.java.jd0.logicos;

public class AppLogico {

	public static void main(String[] args) {

		/*
		 *  (&&, &) or, (||, |) or,!(negación) 
		 */
		char sexo='F';
		short edad=15;
		
		if (sexo=='F' && edad>=15) {
			System.out.println("Dama");
		}else{
			System.out.println("Niña");
		}
		sexo='M';
		if (sexo=='F' & edad>=15) {
			System.out.println("Dama");
		}else{
			System.out.println("Niña");
		}
		
		if (sexo=='M' || edad>=18) {
			System.out.println("Caballero");
		}else{
			System.out.println("Niño");
		}
		if (sexo=='M' | edad>=18) {
			System.out.println("Caballero");
		}else{
			System.out.println("Niño");
		}
		
		System.out.println(true);
		System.out.println(!true);
		
		int nota=21;
		
		if (!(nota>=0 && nota<=20)) {
			System.out.println("Nota no válida");
		}
		
		if (nota<0 || nota>20) {
			System.out.println("Nota no válida");
		}
				
	}

}
