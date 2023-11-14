package conectaCuatro;

import java.util.Scanner;

public class Juego {
	
	final private int numFilas=6;
	final private int numColumnas=7;
	int numCasillasVacias;
	private int turno=1;
	
	private char [][]tablero;
	
	
	Juego(){
		tablero=new char[numFilas][numColumnas];
	}
	
	void vaciarTablero() {
		for (int i=0; i<numFilas;i++) {
			for(int j=0;j<numColumnas;j++) {
				tablero[i][j]=' ';
				turno=1;
			}
		}
		numCasillasVacias=numFilas*numColumnas;
	}
	
	void pintarTablero() {
		for (int i=0; i<numFilas;i++) {
			for(int j=0;j<numColumnas;j++) {
				System.out.print("|"+tablero[i][j]+"|");
			}
		System.out.println("");//salto de línea cuando acaba una fila
		}	
	}
	boolean introFichas() {
		if (numCasillasVacias==0) {
			return false;
		}
		Scanner teclado=new Scanner(System.in);
		
		boolean opcion=false;
		while(opcion==false) {
			System.out.print("Introduce la columna: ");
			int columna=teclado.nextInt();
			if (columna>=0 && columna<numColumnas) {
				for(int i=numFilas-1;i>=0;i--) {
					if (tablero[i][columna]==' ') {
						opcion=true;
						if(turno==1) {
							tablero[i][columna]='x';
						}
						else tablero[i][columna]='o';
						break;
					}
				}
				
			}

		}
		
		return true;
	}
	
	void partida() {
		vaciarTablero();
		pintarTablero();
		
		while(introFichas()==true) {
			//cheackeamos si hay ganador
			
			//cada vez que metamos una ficha hay que pintar el tablero de nuevo
			
			//cambiamos turno si no hay ganador
			if(turno==1)
				turno=2;
			else turno=1;
			
			pintarTablero();
		}
	}
}
