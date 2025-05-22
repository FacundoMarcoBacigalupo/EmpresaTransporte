package ar.edu.unlam.pb2.transporte;

import java.util.ArrayList;
import java.util.List;

public class Camion extends Vehiculo {
	private List<String> destinos = new ArrayList<>();
	
	
	public Camion(int patente, String nombre) {
		super(patente, nombre);
	}
	
	
	public Boolean agregar(Paquete paquete, String dest) {
		Boolean compatible = false;
		Boolean seAgrego = false;
		
		if((!this.destinos.contains(dest) && dest != "")) {
			this.destinos.add(dest);			
		}
		
		if((!this.destinos.contains(dest) && dest != "") || (this.destinos.contains(dest))) {
			compatible = true;
		}
		
		if((this.volumenTotal + paquete.getVolumen()) <= 20 && compatible && this.pesoTotal + paquete.getPeso() <= 16000) {
			this.paquetes.add(paquete);
			this.volumenTotal += paquete.getVolumen();
			this.pesoTotal += paquete.getPeso();
			seAgrego = true;
		}
		
		return seAgrego;
	}
	
}



