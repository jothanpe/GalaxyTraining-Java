package pe.edu.galaxy.training.java.jd0.cadenas;


public class AppRendimiento {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		long inicio;
		long fin;
		final long CAN = 1000000; // Constante;

		String s = new String("");
		inicio = System.currentTimeMillis();
		for (int i = 0; i < CAN; i++) {
			s.concat("x");
		}
		fin = System.currentTimeMillis();
		System.out.println("String :"+(fin - inicio));
		
		
		StringBuffer sb = new StringBuffer("");
		inicio = System.currentTimeMillis();
		for (int i = 0; i < CAN; i++) {
			sb.append("x");
		}
		fin = System.currentTimeMillis();
		System.out.println("StringBuffer :"+(fin - inicio));
		
		StringBuilder sbi = new StringBuilder("");
		inicio = System.currentTimeMillis();
		for (int i = 0; i < CAN; i++) {
			sbi.append("x");
		}
		fin = System.currentTimeMillis();
		System.out.println("StringBuilder :"+(fin - inicio));

	

	}

}
