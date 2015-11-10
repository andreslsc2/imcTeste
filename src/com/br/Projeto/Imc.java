package com.br.Projeto;
import java.util.Scanner;


public class Imc {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		double peso;
		double altura;
		double imc;
		System.out.println("escreva seu peso");
		peso = dados.nextDouble();
		System.out.println("escreva sua altura");
		altura = dados.nextDouble();
		
		imc = peso / (altura * altura);
		
		System.out.println("O imc eh " + imc);
		
		
		
		
		
		
		
		
			

	}

}
