package poo;

import java.util.Random;

public class Dados {
	int dado1;
	int dado2;
	int dado3;
	int dado4;
	
	int numLanzamientos = 0;

	private int lanzarDado() {
		numLanzamientos = numLanzamientos + 1;
		Random numAle = new Random();
		return numAle.nextInt(1, 7);
	}

	public void lanzarDados() {
		dado1 = lanzarDado();
		dado2 = lanzarDado();
		dado3 = lanzarDado();
		dado4 = lanzarDado();
	}

	public String getUltimaJugada() {
		return "Han salido " + dado1 + " " + dado2 + " " + dado3 + " " + dado4;
	}

	public int calcularSumaUltimoLanzamiento(int suma) {
		suma = dado1 + dado2 + dado3 + dado4;
		return suma;
	}

	public int comprobarResultadoUltimoLanzamiento() {
		int resultado;

		/// Compruebo si póker
		if ((dado1 == dado2) && (dado2 == dado3) && (dado3 == dado4)) 
		{
			resultado = 4;
			return resultado;
		}

		/// Compruebo si trío	
		if ((dado1==dado2)&&(dado2==dado3)||
			(dado1==dado2)&&(dado2==dado4)||
			(dado2==dado3)&&(dado3==dado4)) 
		{
			resultado=3;
			return resultado;
			
		}
		/// Compruebo si dobles parejas
		if ((dado1 == dado2 && dado3 == dado4) || 
			(dado1 == dado3 && dado2 == dado4) || 
			(dado1 == dado4 && dado2 == dado3)) 
		{
			resultado = 2;
			return resultado;
		}
		
		
		/// Compruebo si pareja		
		if ((dado1==dado2||dado2==dado3||dado3==dado4||dado1==dado4||dado1==dado3||dado2==dado4)) 
		{
			resultado=1;
			return resultado;
		}
		
		/// No tiene nada
		return 0;	
	}
	
	public String  estadisticasTiradas(int numTiradas) {
		
		int i = 0;
		while (i<=numTiradas) {
			lanzarDados();
			return getUltimaJugada();
			numTiradas=numTiradas-1;
			//comprobarResultadoUltimoLanzamiento();
		}
		return "he acabado";
	}

}
