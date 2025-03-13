//Implementação classe Retangulo com dois construtores que calcule perimetro e area

public class Retangulo {

	double altura;
	double base;
	
	public Retangulo(double h, double b) {
		altura = h;
		base = b;
	}
	public Retangulo(double x1, double y1, double x2, double y2) {
		base = x1 - x2;
		altura = y1 - y2;
	}
	
	public void perimetro() {
		double perimetro = (base + altura)*2;
		System.out.println("O perimetro é : " + perimetro);
	}
	
	public void area() {
		double area = base * altura;
		System.out.println("A area é : " + area);
	}

	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo(3,2);
		retangulo.perimetro();
		retangulo.area();
	}

}
