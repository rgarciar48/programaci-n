package MisClases;

public class BoletinEjercicios {
	
	
	
	
	boolean esPalindromoV2(String cadena) {
		return cadena.equals(invertirCadena(cadena));
	}
	
	
	
	boolean esPalindromo(String cadena) {
		
		int posIzquierda=0;
		int posDerecha=cadena.length()-1;
		
		boolean resultado=true;
		
		while(posIzquierda<posDerecha && resultado==true)
		{
			if(cadena.charAt(posIzquierda) != cadena.charAt(posDerecha) )
				resultado=false;
			
			posIzquierda++;
			posDerecha--;			
		}
		
		return resultado;
	
	}
	
	
	
	String invertirCadena(String cadena) {
		
		String resultado="";
		
		for(int i= cadena.length()- 1   ;i>= 0; i--)	{
			resultado+=cadena.charAt(i);
		}
		
		return resultado;
		
	}
	
	
	int contarVocales(String cadena){
		
		// Recorremos la cadena de izquierda a derecha
		int numVocales=0;
		
		// Convertimos la cadena que nos pasen a minúscula para tener que hacer menos comprobaciones
		cadena=cadena.toLowerCase();

		for(int i=0;i<cadena.length();i++)	{
			char caracter=cadena.charAt(i);
			if(caracter=='a' || caracter=='á'  || caracter=='à'  || caracter=='â' || 
			   caracter=='e' || caracter=='é'  || caracter=='è'  || caracter=='ê' ||
			   caracter=='i' || caracter=='í'  || caracter=='ì'  || caracter=='î' ||			   
			   caracter=='o' || caracter=='ó'  || caracter=='ò'  || caracter=='ô' ||			   
			   caracter=='u' || caracter=='ú'  || caracter=='ù'  || caracter=='û' || caracter=='ü' ) 			   
				numVocales++;
		}
		return numVocales;
 	}
	
	
	String invertirMayusculasMinusculas(String cadena){
		
		String resultado="";
		
		String cadenaMinuscula=cadena.toLowerCase();
		String cadenaMayuscula=cadena.toUpperCase();		

		for(int i=0;i<cadena.length();i++)	{
			
			char caracterOriginal=cadena.charAt(i);
			char caracterMinuscula=cadenaMinuscula.charAt(i);
			if(caracterOriginal == caracterMinuscula)
			{
				// Está en minúscula
				resultado=resultado + cadenaMayuscula.charAt(i);
			}
			else 
			{
				// Está en mayúscula
				resultado=resultado + cadenaMinuscula.charAt(i);				
			}
		}
	
		return resultado;
 	}
	
	String quitarEspacios(String cadena) {
		String resultado="";
		for (int i=0; i<cadena.length(); i++) {
			char caracterLeido=cadena.charAt(i);
			if (caracterLeido!=' ') {
				resultado=resultado+ caracterLeido;
			}	
		}
		return resultado;
	}
	
	String devolverIniciales(String cadena) {
		String resultado="";
		for (int i=0; i<cadena.length(); i++) {
			char caracterLeido=cadena.charAt(i);
			if(caracterLeido!=' ') {
				if (i==0 || cadena.charAt(i-1)==' ') {
					resultado=resultado+ caracterLeido+'.';
				}
			}	
		}
		return resultado;
	}
	
	int contarCaracter(String cadena, char caracter) {
		int resultado=0;
		cadena=cadena.toLowerCase();
		for (int i=0; i<cadena.length(); i++) {
			char caracterLeido=cadena.charAt(i);
			if (caracterLeido==caracter) {
				resultado=resultado + 1;
			}
		}
		return resultado;
	}

	
	int contarPalabras(String cadena) {
		int resultado=0;

		
		for (int i=0; i<cadena.length(); i++) {
		
			char caracterLeido=cadena.charAt(i);
			
			if (caracterLeido!=' ') {
				if (caracterLeido==0) {
					resultado=resultado+1;
				}
				else if (caracterLeido!=0) {
					if(cadena.charAt(i-1)==' '||cadena.charAt(i-1)=='.'||cadena.charAt(i-1)==';') {
						resultado=resultado+ 1;
					}
				}

			}	
		}
		return resultado;
	}
	
	int contarCeroUno(String cadena) {
		
		int uno=0;
		int maximo=0;
		
		for (int i=0; i<cadena.length(); i++) {
			char caracterLeido=cadena.charAt(i);
			
			if(caracterLeido=='1') {
				uno=uno+1;
				if (uno>maximo) {
					maximo=uno;
				}
			}

			if (caracterLeido=='0') {
				uno=0;
			}
			if (caracterLeido!='0' && caracterLeido!='1') {
				return -1;
			}
			
		}
		
		return maximo;
	}
	String cambiarOrden(String cadena) {
		String orden="";
		for (int i=cadena.length(); i==0; i--) {
			char caracterLeido=cadena.charAt(i);
			orden= orden + caracterLeido;
		}
		return orden;
	}
	


	
	

}
