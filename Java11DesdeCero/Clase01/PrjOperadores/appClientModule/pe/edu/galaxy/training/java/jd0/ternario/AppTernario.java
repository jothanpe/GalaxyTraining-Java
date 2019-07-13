package pe.edu.galaxy.training.java.jd0.ternario;

public class AppTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota=12;
		String condicion="";
		
		// Tradicional
		if (nota>=10.5) {
			condicion="Aprobado";
		} else {
			condicion="Desaprobado";
		}
		System.out.println(condicion);
		
		
		// Operador ternario
		nota=5;
		System.out.println((nota>=10.5)?"Aprobado":"Desaprobado");
		
	}

}
