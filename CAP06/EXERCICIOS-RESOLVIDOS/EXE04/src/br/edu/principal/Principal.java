package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[8];
		int[] pos = new int[8];
		int[] neg = new int[8];
		int cont_n = 1, cont_p = 1;
		for(int i = 1 ; i < 8; i++ ) {
			System.out.println("digite o valor do número: ");
			num[i] = sc.nextInt();
			if(num[i]>= 0) {
				pos[cont_p] = num[i];
				cont_p +=1;
				
			}
			else {
				neg[cont_n] = num[i];
				cont_n +=1;				
			}
			
		}
		if(cont_n == 1) {
			System.out.println("vetores negativos vazios: ");
			
		}
		else {
			for(int i = 1; i < cont_n - 1; i++) {
				System.out.println("Vetor de negativos vazio");
				System.out.println(neg[i]);	
			}
		}
		if(cont_p == 1) {
			System.out.println("Vetor de positivos vazio");
		}
		else {
			for(int i =1; i <cont_p; i++) {
				System.out.println(pos[i]);
				
			}
		}
	}

}
