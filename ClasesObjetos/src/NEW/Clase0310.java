package NEW;

public class Clase0310 {

	public static void main(String[] args) {
		//Constructor dos hay que asignarles las variables dentro
		Rectangulo r1=new Rectangulo(2,4);
		
		double area=r1.calcularArea();
		System.out.println("El area es "+area);
		System.out.println("El perimetro es "+r1.calcularPerimetro());
		
		
		

	}

}
