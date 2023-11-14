package NEW;

public class Rectangulo {
	//Atributos de la clase
	public double lado1;
	public double lado2;
	
	
	//Métodos de la clase
	
	//Constructor, dos formas de hacerlo
	public Rectangulo() {
		lado1=7;
		lado2=3;
	}
	public Rectangulo(double l1, double l2) {
		lado1=l1;
		lado2=l2;
	}
	
	public double calcularArea() {
		double result=lado1*lado2;
		return result;
	}
	
	public double calcularPerimetro() {
		return (2*lado1)+(2*lado2);
	}

}
