package aula3;

import java.util.Scanner;

public class ManipulacaoString {
	
	//Contar as vogais
	
	public int contador_vogal(String palavra) {
		
		int contador = 0;
		
		for(var i = 0; i< palavra.length(); i++) {
			char letra = palavra.toLowerCase().charAt(i);
			if(letra == 'a' || letra == 'e'|| letra == 'i'|| letra == 'o'|| letra == 'u') {
				contador++;
			}
		}
		return contador;
	}
	
	//Inverter a palavra
	
	public void Inverter(String palavra) {
		int tamanho_palavra = palavra.length();
		
		for(int i=tamanho_palavra - 1; i>=0 ; i--) {
			System.out.println(palavra.charAt(i));
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		// Escreva um programa que receba uma string e conte o número de vogais
		System.out.println("String: ");
		String input_usuario = scanner.nextLine();
		ManipulacaoString manipular = new ManipulacaoString();
		System.out.println("Quantidade de vogais: " + manipular.contador_vogal(input_usuario));
		manipular.Inverter(input_usuario);
		
	}

}
