package pe.edu.galaxy.training.java.jd0.cadenas;

public class AppString {

	public static void main(String[] args) {
		
		String s="Galaxy Training "; // Tradicional
		
		String s1= new String ("Java");
		
		System.out.println(s);
		System.out.println(s.toUpperCase());
		
		System.out.println(s.length());
		System.out.println(s.trim().length());
		
		if (s=="Java ") { // Mala practica
			System.out.println("Igual");
		}
		
		if (s1=="Java") {// Mala practica
			System.out.println("Igual");
		}
		
		if (s1.equals("Java")) { // Buena practica
			System.out.println("equals Igual");
		}
		
		System.out.println(s1.compareTo("Java"));
		
		if (s1.compareTo("Java")==0) {
			System.out.println("compareTo Igual");
		}
		
		if (s1.compareToIgnoreCase("java")==0) {
			System.out.println("compareToIgnoreCase Igual");
		}
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		System.out.println(s.indexOf("a"));
		System.out.println(s.lastIndexOf("a"));
		
		System.out.println(s.substring(0, 2));
		
		System.out.println(s.charAt(1));
		
		System.out.println(s.concat(" 11"));
		System.out.println(s+" 11");

		System.out.println(s); // imnutable(no cambia)
	}

}
