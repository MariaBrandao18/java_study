package entities;

import java.util.Scanner;

public class MatrizExercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("M:");
		int m = sc.nextInt();
		System.out.println("N:");
		int n = sc.nextInt();
		
		int mat[][] = new int[m][n];
		
		for(int i = 0; i < m ; i++) {
			for(int j = 0; j < n ; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Choose a number: ");
		int numEscolhido = sc.nextInt();
		boolean found = false;
		
			for(int i = 0 ; i<m ; i++) {
				for(int j = 0 ; j<n ; j++) {
					if(numEscolhido == mat[i][j]) {
						System.out.println("Position: " + i + ", " + j);
						if(j > 0) {
							System.out.println("Left: " + mat[i][j-1]);
						}
						if(j < n-1) {
							System.out.println("Right: " + mat[i][j+1]);
						}
						if(i > 0) {
							System.out.println("Left: " + mat[i-1][j]);
						}
						if(i < m-1) {
							System.out.println("Left: " + mat[i+1][j]);
						}
						found = true;
						System.out.println(" ");
					}
				}
			}
			
			if(!found) {
				System.out.println("The number was not found!");
			}
		
		sc.close();
	}

}
