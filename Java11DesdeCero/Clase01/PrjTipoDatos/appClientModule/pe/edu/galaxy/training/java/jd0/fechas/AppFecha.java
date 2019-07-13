package pe.edu.galaxy.training.java.jd0.fechas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AppFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date fecha= new Date();
		System.out.println(fecha);
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(fecha));
		
		sdf= new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(sdf.format(fecha));
	}

}
