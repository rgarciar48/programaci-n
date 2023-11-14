package poo;

public class Personas {
	String nombre;
	String direccion;
	int altura;
	int edad;
	
	public Personas (){
		nombre="desconocido";
		direccion="Calle sin nombre.nº1";
		altura=175;
		edad=35;
	}
	public void estableceNombre(String rNombre) {
		nombre=rNombre;
	}
	public String dimeNombre() {
		return "El nombre es "+nombre;
	}
	public void estableceDirecc(String rDireccion) {
		direccion=rDireccion;
	}
	public String dimeDirecc() {
		return "La dirección es "+direccion;
	}
	public void estableceAltura(int rAltura) {
		altura=rAltura;
	}
	public int dimeAltura() {
		return altura;
	}
	public void estableceEdad(int rEdad) {
		edad=rEdad;
	}
	public int dimeEdad() {
		return edad;
	}
}
