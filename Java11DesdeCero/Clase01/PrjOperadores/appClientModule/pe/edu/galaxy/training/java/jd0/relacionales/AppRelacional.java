package pe.edu.galaxy.training.java.jd0.relacionales;

public class AppRelacional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * >,>=,<,<=,!=,==
		 */

		float nota=10.5f;
		
		if (nota>10.5) {
			System.out.println("Aprobado");
		}else{
			System.out.println("Desaprobado");
		}
		
		if (nota>=10.5) {
			System.out.println("Aprobado");
		}else{
			System.out.println("Desaprobado");
		}
		nota=5;
		
		if (nota<5) {
			System.out.println("Pésimo");
		}else{
			System.out.println("Subsanable");
		}
		
		if (nota<=5) {
			System.out.println("Pésimo");
		}else{
			System.out.println("Subsanable");
		}
		
		if (nota!=10) { 
			System.out.println("Diferente de 10");
		}
		nota=20;
		if (nota==20) {
			System.out.println("Excelente");
		}
		
	}

}
