package arr;

import java.util.Arrays;

public class api {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arn;
		//arn=new int [6];
/*		int[] arNumeros= {1,2,34,67,8};
		System.out.println(Arrays.toString(arNumeros));
		Arrays.sort(arNumeros);//Ordena los números de menor a mayor
		System.out.println(Arrays.toString(arNumeros));
		int [] resultado=contarParesImpares(arNumeros);
		System.out.println("Los numero pares son "+ resultado[0]);
		System.out.println("Los numero impares son "+ resultado[1]);
*/		
/*	
		int [] arNumeros= {1,4,3,7};
		int [] eso=copiarArray(arNumeros);
		System.out.println(Arrays.toString(eso));
*/

		int [] arNumeros= {1,5,3,67,7};
//		int [] eso=vueltaArr(arNumeros);
//		System.out.println(Arrays.toString(eso));
		Arrays.sort(arNumeros);
		System.out.println(Arrays.toString(arNumeros));
		System.out.println(Arrays.toString(vueltaArr(arNumeros)));
		
	}
	
	public static int[] vueltaArr(int []arDatos) {
		int [] resultado=new int [arDatos.length];
		for (int i=0; i<arDatos.length; i++) {
			resultado[(arDatos.length-1)-i]=arDatos[i];
		}
		return resultado;
	}
	
	public static int [] copiarArray(int[]arNum) {
		int [] resultado=new int [arNum.length];
		for (int i=0; i<arNum.length; i++) {
			resultado[i]=arNum[i];
		}
		return resultado;
	}

	public static int[] contarParesImpares(int[]arNum) {
		int nump=0;
		int numi=0;
		for(int i=0;i<arNum.length;i++) {
			int valor=i;
			if(valor%2==0) {
				nump++;
			}
			else numi++;
		}
		int[] resultado= {nump,numi};
		return resultado;
	}
	
}