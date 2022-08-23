package controller;

import utils.Index;


public class MethodsClass {

	
	public MethodsClass() {
		// TODO Auto-generated method stub
		super();
	}
	
	public int calcNaturais(int[] vetor, int index) {
		if(index == 0) {
			return 	0;
		}

		if(vetor[index - 1] < 0) {
			return calcNaturais(vetor, index - 1);
		}
		
		return vetor[index - 1] + calcNaturais(vetor, index - 1);
	}
	
	public String calcBinario(int numero) {
		if (numero / 2 == 0) {
			return String.valueOf(numero%2);
		}
		
		return String.valueOf(numero%2) + calcBinario(numero / 2);
	}
	
	public double calc(double numero) {
		if(numero == 1) {
			return 1;
		}
		
		return (1 / numero) + calc(numero-1);
	}
	
	public int countNumber(int numero, int find) {
		if(numero == 0) {
			return 0;
		}

		if(numero%10 == find) {
			return 1 + countNumber(numero/10, find);
		}
		
		return countNumber(numero/10, find);
	}
	
	public int fibonacci(int numero) {
		if(numero <= 1) {
			return numero;
		}
		
		return fibonacci(numero-2) + fibonacci(numero-1);
	}
	
	public double serie(double numero) {
		if (numero == 1) {
			return 1;
		}
		
		
		return 1 / Index.fatorial(numero) + serie(numero - 1);
	}
}
