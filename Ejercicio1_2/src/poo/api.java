package poo;

public class api {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dados miJuego= new Dados();
		miJuego.lanzarDados();
		//System.out.println( miJuego.getUltimaJugada());
		//System.out.println( miJuego.comprobarResultadoUltimoLanzamiento());
		System.out.println( miJuego.estadisticasTiradas(3));

	}

}
