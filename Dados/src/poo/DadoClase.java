package poo;
import java.util.Arrays;

public class DadoClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		api miJuego=new api();
		//int [] eso=miJuego.dadosClase(40);
		//System.out.println(Arrays.toString(eso));
		int [] arDatos= {1,2,3,4,5};
		System.out.println(miJuego.ordenado(arDatos));
	}

}
