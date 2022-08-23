package utils;

public class Index {
	
	public static double fatorial (double numero) {
		if (numero <= 1) {
			return 1;
		}
		
		return numero * fatorial(numero -1);
	}

}
