package pe.edu.galaxy.training.java.jd0.cadenas;

public class AppStringBuilder {

	public static void main(String[] args) {
		
		StringBuilder sb= new StringBuilder ("Java");
		System.out.println(sb);
		sb.append(" 11");
		System.out.println(sb);
		sb.replace(5,7, "12");
		System.out.println(sb);
		sb.insert(4," Core");
		System.out.println(sb);

		sb.delete(10, 12);
		System.out.println(sb);
		
		
		System.out.println("Final");
		System.out.println(sb);

	}

}
