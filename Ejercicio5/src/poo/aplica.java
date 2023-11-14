package poo;

import java.util.Scanner;

public class aplica {

	public static void main(String[] args) {
		juegoDados miJuego=new juegoDados();
		boolean salir=false;
		Scanner teclado=new Scanner(System.in);
		
		while (salir==false) {
			
			System.out.println("Tu saldo actual es "+ miJuego.getSaldo());
			System.out.println("Que quieres hacer ");
			System.out.println("1.Recargar saldo ");
			System.out.println("2.Hacer apuesta ");
			System.out.println("3.salir ");
			int opcion=teclado.nextInt();
			if (opcion==1) {
				System.out.println("cuanto quieres recargar");
				int cantidad=teclado.nextInt();
				miJuego.incrementarSaldo(cantidad);
				}
			else if(opcion==2) {
				System.out.println("cuanto quieres apostar");
				int cantidad=teclado.nextInt();
				miJuego.hacerApuesta(cantidad);
				
				if ((miJuego.hacerApuesta(cantidad)==-1)){
					System.out.println("no saldo");
				}
			if(opcion==3) {
				salir=true;
			}
			
			}
			
			
			
			
		}
		teclado.close();
		
	}

}
