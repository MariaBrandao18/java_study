package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.PensionatoRegistro;

public class Pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		PensionatoRegistro[] quartos = new PensionatoRegistro[10];
		
		for(int i=0; i<n ; i++) {
			System.out.println("#"+(i+1));
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.println("Room: ");
			int room = sc.nextInt();
			
			quartos[room] = new PensionatoRegistro(name, email, room);
		}
		
		System.out.println("\nBusy rooms: ");
		for(int i=0 ; i<quartos.length ; i++) {
			if(quartos[i] != null) {
				System.out.println(quartos[i].getRoom() + ": " + quartos[i].getName() + ", " + quartos[i].getEmail()); // sysout crtl+espaço
			}
		}
		
		sc.close();
	}

}
