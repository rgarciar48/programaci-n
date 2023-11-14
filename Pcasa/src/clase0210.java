import java.util.Scanner;
public class clase0210 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		float num1=0;
		float num2=0;
		int ope=0;
		float result=0;
		
		System.out.println("Dime el primer número");
		num1=teclado.nextFloat();
		System.out.println("Dime el segundo número");
		num2=teclado.nextFloat();

		System.out.println("Si quiers sumar(1) si quieres restar(2) si quieres multiplicar(3) división entera(4) división decimal(5) resto(6)");
		ope=teclado.nextInt();
		if (ope==1) {
			result=num1+num2;
			System.out.println("La suma es "+ ((int)result) );
		}
		if (ope==2) {
			result=num1-num2;
			System.out.println("La resta es "+ ((int)result));
		}
		if (ope==3) {
			result=num1*num2;
			System.out.println("La multiplicación es "+ ((int)result));
		}
		if (ope==4) {
			result= num1 / num2;
			result=((int)result);
			System.out.println("La división entera es "+ ((int)result));
		}
		
		if (ope==5) {
			result=  num1/ num2;
			System.out.println("La división decimal es "+ result);
		}
		if  (ope==6) {
			result=num1%num2;
			System.out.println("El resto es "+ ((int)result));
			
		}
		if (ope>=7) {
			System.out.println("No has elegido un número válido");
		}
		teclado.close();


	}

}
