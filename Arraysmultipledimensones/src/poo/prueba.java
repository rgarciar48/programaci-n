package poo;

import java.util.Arrays;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] tabla= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int[]res=sumaFilas(tabla);
		System.out.println(Arrays.toString(res));
	}
	
	public static int[] sumaFilas(int[][]tabla) {
		
		int[]resultado=new int[tabla.length];
		
		for (int i=0; i<tabla.length;i++) {
			for(int j=0;j<tabla[i].length;j++) {
				resultado[i]+=tabla[i][j];
			}	
		}
		return resultado;
	}

}
