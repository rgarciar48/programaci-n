package poo;

public class datosCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta miCuenta=new Cuenta();
		miCuenta.estableceDni("45136856T");
		miCuenta.estableceNombre("Ruben Garcia Recio");
		System.out.println(miCuenta.dimeDni()+" / "+ miCuenta.dimeNombre());
		miCuenta.hacerIngreso(40);
		miCuenta.hacerReintegro(20);
		System.out.println("Código de reintegro "+miCuenta.dimeReintegro());
		miCuenta.hacerTransferencia(122332, 25);
		System.out.println("Codigo de transferencia "+miCuenta.dimeTransf());
		//System.out.println("El saldo es "+miCuenta.obtenerSaldo()+" euros");
		System.out.println(miCuenta.mostrarDatosCuenta());
	}

}
