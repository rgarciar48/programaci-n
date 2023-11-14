package New;
import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		int num1;
		int num2;
		int ope=0;
		int result=0;
		float resultDec=0;
		
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Escribe el primer número");
		num1=teclado.nextInt();
		
		System.out.println("Escribe el segundo número");
		num2=teclado.nextInt();
		
		System.out.println("1 Sumar");
		System.out.println("2 Restar");
		System.out.println("3 Multiplicar");
		System.out.println("4 Division entera");
		System.out.println("5 Division decimal");
		System.out.println("6 Resto");
		
		System.out.println("Selecciona una opción");
		ope=teclado.nextInt();
		//Más fácil hacerlo asi con el switch y los case es lo mismo que ir comparando con if
		switch(ope) {
		case 1:
			result=num1+num2;
			System.out.println("El resultado es: "+result);
			break;

		case 2:
			result=num1-num2;
			System.out.println("El resultado es: "+result);
			break;
			
		default:
			System.out.println("La opción elegida no es correcta");
			break;
		}
		
		
		if(ope==1) {
			result=num1+num2;
			System.out.println("El resultado es: "+result);
		}
		else if(ope==2) {
			result=num1-num2;
			System.out.println("El resultado es: "+result);
		}
		else if(ope==3) {
			result=num1*num2;
			System.out.println("El resultado es: "+result);
		}
		else if(ope==4) {
			if(num2!=0) {
				result=num1/num2;
				System.out.println("El resultado es: "+result);
			}
			else {
				System.out.println("No se puede");
			}
		}
		else if(ope==5) {
			if(num2!=0) {
				resultDec=((float)num1)/num2;
				System.out.println("El resultado es: "+resultDec);
			}
		
			else {
			System.out.println("No se puede");
			}
		}	
		else if(ope==6) {
			if(num2!=0) {
				result=num1%num2;
				System.out.println("El resultado es: "+result);
			}
			else {
				System.out.println("No se puede");
			}
			
		}
		else {
			System.out.println("La opción elegida no es correcta");
		}
		
		
		
		
		
		
		
		
		
		teclado.close();

	}

}
