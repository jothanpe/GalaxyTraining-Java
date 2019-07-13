package pe.edu.galaxy.training.java.jd0.cadenas;

public class AppStringBuffer {

	public static void main(String[] args) {
		
		StringBuffer sb= new StringBuffer ("Java");
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
