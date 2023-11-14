
package poo;


public class tiempo {
	long puntoReferencia;
	long ultimaMedida;
	double ultimaMedidaSegundos;
	
	public tiempo() {
		ultimaMedida=0;
		puntoReferencia=System.currentTimeMillis();
		
	}
	public void setPuntoReferencia(){
		puntoReferencia=System.currentTimeMillis();
	}
	public long tomarMedida() {
		long temp;
		temp=System.currentTimeMillis()-puntoReferencia;
		ultimaMedida=temp;
		//seria lo mismo almacenar en ultima medida la diferencia de tiempos
		return temp;
	}
	public long devolverUltimaMedida() {
		return ultimaMedida;
	}
	public double devolverUltimaMedidaSegundos() {
		ultimaMedidaSegundos=ultimaMedida/1000.0;
		return ultimaMedidaSegundos;
	}
	

}
