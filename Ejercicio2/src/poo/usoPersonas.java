package poo;

public class usoPersonas {

	public static void main(String[] args) {
		
		Personas priPersona=new Personas();
		priPersona.estableceNombre("Rubén");
		System.out.println(priPersona.dimeNombre());
		priPersona.estableceDirecc("Calle San Anton 1");
		System.out.println(priPersona.dimeDirecc());
		priPersona.estableceAltura(185);
		System.out.println("La altura es "+priPersona.dimeAltura()+ "cm");
		priPersona.estableceEdad(21);
		System.out.println("La edad es de "+priPersona.dimeEdad()+" años");
	}

}
