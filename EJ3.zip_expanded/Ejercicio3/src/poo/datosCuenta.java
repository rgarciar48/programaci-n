package poo;

public class datosCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta miCuenta=new Cuenta(12345);
		Cuenta miCuenta2=new Cuenta(12222);
		miCuenta.estableceDni("45136856T");
		miCuenta2.estableceDni("451366T");
		
		miCuenta.estableceNombre("Ruben Garcia Recio");
		miCuenta2.estableceNombre("Fernando Hierro");
		
		System.out.println(miCuenta.dimeDni()+" / "+ miCuenta.dimeNombre());
		miCuenta.hacerIngreso(40);
		miCuenta.hacerReintegro(0);
		System.out.println("Código de reintegro "+miCuenta.dimeReintegro());
		//miCuenta.hacerTransferencia(miCuenta2, 25);
		System.out.println("Codigo de transferencia "+miCuenta.hacerTransferencia(miCuenta2,25));
		//System.out.println("El saldo es "+miCuenta.obtenerSaldo()+" euros");
		System.out.println(miCuenta.mostrarDatosCuenta());
		System.out.println(miCuenta2.mostrarDatosCuenta());
	}

}
