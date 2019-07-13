package pe.edu.galaxy.training.java.jd0.especiales;

import java.math.BigDecimal;
import java.math.BigInteger;

public class AppEspeciales {

	public static void main(String[] args) {
		boolean sw = false;
		Boolean sw1 = true;
		System.out.println(sw);
		System.out.println(!sw1);

		BigInteger be = new BigInteger("4554785222112");
		System.out.println(be);

		BigDecimal bd = new BigDecimal("4554785222112.145552522");
		System.out.println(bd);
	}
}
