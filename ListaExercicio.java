package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

class Funcionario{
	protected int id;
	private String name;
	private double salary;
	
	public Funcionario() {
	}
	
	public Funcionario(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	
	void salaryIncrease(double percent) {
		salary = salary + ((percent/100) * salary);
	}

	public String toString() {
		return id + ", " + name + ", " + salary;
	}

}

public class ListaExercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Funcionario> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i=0 ; i < n ; i++) {
			
			System.out.println("Employer #" + (i+1));
			
			System.out.println("Id: ");
			int id = sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			System.out.println("");
			
			Funcionario f1 = new Funcionario(id, name, salary);
			list.add(f1);
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		sc.nextLine();
		int eId = sc.nextInt();

		Funcionario foundEmployee = null;
		for(Funcionario emp : list) {
			if(emp.getId() == eId) {
				foundEmployee = emp;
				break;
			}
		}
		
		if(foundEmployee == null) {
			System.out.println("\nThis id does not exists!\n");
			
			System.out.println("List of employees: ");
			for(Funcionario x : list) {
				System.out.println(x);
			}
		} else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			foundEmployee.salaryIncrease(percent);
			
			System.out.println("\nList of employees: ");
			for(Funcionario x : list) {
				System.out.println(x);
			}			
		}
		
		sc.close();
	}

}
