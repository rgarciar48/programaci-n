package poo;

public class Cuenta {
	int idCuenta;
	String nombreTitular;
	String dniTitular;
	int saldo;
	
	int ingresoTotal;
	int reintegroTotal;
	int codigoError;
	int codigoTrans;
	
	int CuentaAjena;
	int CantidadEnviar;
	
	public Cuenta (int id) {
		idCuenta=id;
		saldo=0;
	}
	public void estableceNombre(String nombre) {
		nombreTitular=nombre;
	}
	public String dimeNombre() {
		return "El nombre del titular es "+nombreTitular;
	}
	public void estableceDni(String dni) {
		dniTitular=dni;
	}
	public String dimeDni() {
		return "El dni del titular es "+dniTitular;
	}
	public void hacerIngreso(int ingreso ) {
		ingresoTotal=ingreso;
		saldo=ingresoTotal+saldo;
	}
	public void hacerReintegro(int reintegro) {
		reintegroTotal=reintegro;
	}
	public int dimeReintegro() {
		if (reintegroTotal>saldo) {
			codigoError=-1;
			return codigoError ;
		}
		else {
			saldo=saldo-reintegroTotal;
			codigoError=1;
			return codigoError ;
		}
	}
	//public void hacerTransferencia( int cantidadEnviar) {
		
		//CantidadEnviar=cantidadEnviar;
		//}
	public int hacerTransferencia(Cuenta cuentaAjena,int cantidadEnviar) {
		if (saldo<CantidadEnviar) {
			codigoTrans=0;
			return codigoTrans;
		}
		else {
			saldo=saldo - CantidadEnviar;
			cuentaAjena.hacerIngreso(CantidadEnviar);
			codigoTrans=1;
			return codigoTrans;
		}
	}
	public int obtenerSaldo() {
		return saldo;
		}
	public String mostrarDatosCuenta() {
		return "El id de la cuenta es "+ idCuenta+ "/ El nombre del titular es "+ nombreTitular+ "/ El dni del titular es "+dniTitular+ " y el saldo es "+saldo;
	}
	
	
	
}
