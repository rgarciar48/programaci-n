package simondiceclase;
import java.util.Random;

public class Juego {
	
	public void coloresMostrar() {
		Random numAle=new Random();
		int simon=numAle.nextInt(1,5);
		System.out.print(simon);
		boolean ope=false;
		while(ope==false) {
			try {
				Thread.sleep(1000);
				} catch (InterruptedException e) {
				e.printStackTrace();
				}
			System.out.print('\b');
			ope=true;
		}
/*
		String resultado="";
		resultado=resultado+simon;
		System.out.println(resultado);
*/		
		
	}

}
