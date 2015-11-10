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
		
		if(imc < 18.5){
			System.out.println("*Voce está abaixo do peso ideal");
		}
		if(imc >=18.5 && imc <=24.9){
					System.out.println("Parabens - voce esta normal nao ");
				}
		if(imc >=25 && imc <= 29.9){
			System.out.println("Voce ta meio gorda")
		}
			}
		}
		
		System.out.println("O imc eh " + imc);
		
		
		
		
		
		
		
		
			

	}

}
