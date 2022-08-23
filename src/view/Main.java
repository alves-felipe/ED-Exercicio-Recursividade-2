package view;

import controller.MethodsClass;

public class Main {

	
	public static void main(String[] args) {
		MethodsClass m = new MethodsClass();
		initCalcNaturais(m);
		initCalcBinario(m);
		initCalc(m);
		initCountNumber(m);
		initFibonacci(m);
		initSerie(m);
	}
	
	public static void initCalcNaturais(MethodsClass m) {
		int[] vetor = {5, -2, -8, 5, 5, -5};
		System.out.println(m.calcNaturais(vetor, vetor.length));
	}
	
	public static void initCalcBinario(MethodsClass m) {
		int numero = 45;
		System.out.println(m.calcBinario(numero));
	}
	
	public static void initCalc(MethodsClass m) {
		int numero = 4;
		System.out.println(m.calc(numero));
	}
	
	public static void initCountNumber(MethodsClass m) {
		int numero = 505050505;
		int find = 5;
		
		if(numero >= 10 || numero <= 999999) {
			System.out.println(m.countNumber(numero, find));
		} else {
			System.out.println("Amigão, tá tiltado????????");
		}
	}
	
	public static void initFibonacci(MethodsClass m) {
		int numero = 10;
		System.out.println(m.fibonacci(numero));
	}
	
	public static void initSerie(MethodsClass m) {
		int numero = 5;
		System.out.println(m.serie(numero));
	}
}
