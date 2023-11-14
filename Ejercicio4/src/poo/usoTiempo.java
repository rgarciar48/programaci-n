package poo;


public class usoTiempo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tiempo miTiempo=new tiempo();
		for(int i=0; i<10000; i++) {
			System.out.println("Hola");
		}
		miTiempo.tomarMedida();
		System.out.println("Han pasado en milisegundos: "+miTiempo.devolverUltimaMedida());
		System.out.println("Han pasado en segundos: "+miTiempo.devolverUltimaMedidaSegundos());
	}
}
