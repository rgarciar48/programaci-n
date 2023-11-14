import java.util.Random;
import java.util.Scanner;
public class clase2709 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r1=new Random();
		int numAle=r1.nextInt(10);
		int numint=0;
		int numEscrito=0;
		boolean salir=false;
		Scanner teclado=new Scanner(System.in);
		int maxInt=3;
		while(salir==false) {
			numint++;
			if (numint>maxInt) {
				System.out.println("Has alcanzado el número de intentos máximo, y el número era el "+ numAle);
				salir=true;
			}
			else {
				boolean lecturaCorrecta=false;
				while(lecturaCorrecta==false) {
					System.out.println("Elige el número, llevas "+ numint+ " intentos:");
					
					if(teclado.hasNextInt()==true) {
						numEscrito=teclado.nextInt();
						lecturaCorrecta=true;
					}
					else {
						teclado.nextLine();
					}
				}
				
				
				if (numEscrito==numAle){
					System.out.println("El número es correcto, lo has logrado en "+ numint);
					salir=true;
				}
				else if(numEscrito>numAle) {
					System.out.println("El número no es correcto, el numero es menor y llevas "+ numint+" intentos");
				}
				else {
					System.out.println("El número no es correcto, el numero es mayor y llevas "+ numint+" intentos");
				}
			}
			
		}	
		//cerramos el objeto de la clase scanner
		teclado.close();		
	}
}
