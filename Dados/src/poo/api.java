package poo;
import java.util.Random;


public class api {
	 
	public int[] dadosClase(int lanza) {
		int num1=0;
		int num2=0;
		int num3=0;
		int num4=0;
		int num5=0;
		int num6=0;
		
		
		for(int i=0; i<lanza; i++) {
			Random numAle=new Random();
			int dado1=numAle.nextInt(1,7);
			//resultado[dado1-1]++;Creas array y sumas directamente y luego devuelvo resultado igual
			
			if (dado1==1) {
				num1++;
			}
			if (dado1==2) {
				num2++;
			}
			if (dado1==3) {
				num3++;
			}
			if (dado1==4) {
				num4++;
			}
			if (dado1==5) {
				num5++;
			}
			if (dado1==6) {
				num6++;
			}
		}
		int resultado[]= {num1,num2,num3,num4,num5,num6};
		return resultado;
	}
	public boolean ordenado(int[] arNum) {
		
		for (int i=1; i<arNum.length; i++) {
			if (arNum[i]<arNum[i-1]) {
				return false;
			}
		}
		return true;
	}
	
}
