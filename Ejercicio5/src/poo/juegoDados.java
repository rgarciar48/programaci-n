package poo;
import java.util.Random;


public class juegoDados {
	
	int saldo;
	int dado1;
	int dado2;
	int dado3;
	
	public void incrementarSaldo(int cantidad) {
		if (cantidad>0 ) {
			saldo=saldo+cantidad;
		}
	}
	public int getSaldo() {
		return saldo;
	}
	public void lanzarDados() {
		Random numAle=new Random();
		dado1=numAle.nextInt(1,7);
		dado2=numAle.nextInt(1,7);
		dado3=numAle.nextInt(1,7);	
	}
	public int comprobarResultado() {
		int resultado;
		if ((dado1==dado2) && (dado2==dado3)) {
			resultado=10;	
		}
		else if ((dado1==dado2) || (dado2==dado3) || (dado1==dado3)) {
			resultado=2;
		}
		else resultado=0;
		return resultado;
	}
	public int hacerApuesta(int cantidad) {
		int retorno=1;
		if (saldo>=cantidad) {
			lanzarDados();
			saldo=saldo-cantidad;
			System.out.println("han Salido los valores "+dado1+" "+dado2+" "+dado3);
			
			int resultado=comprobarResultado();
			if(resultado==0) {
				System.out.println("pierdes");
			}
			else if(resultado==2) {
				saldo=saldo+(resultado*cantidad);
				System.out.println("has ganado"+resultado*cantidad);
			}
			else {
				saldo=saldo+(resultado*cantidad);
				System.out.println("has ganado"+resultado*cantidad);
			}
			
		}
		else {
			retorno=-1;
		}
		return retorno;
	}
	
	
	
	
	

}
