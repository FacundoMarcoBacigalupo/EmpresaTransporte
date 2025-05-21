package ar.edu.unlam.pb2.transporte;

import java.util.ArrayList;
import java.util.List;

public class Auto extends Vehiculo {
	private List<String> destinos = new ArrayList<>();
	
	
	public Auto(int patente, String nombre) {
		super(patente, nombre);
	}
	

	public Boolean agregar(Paquete paquete, String destino) {
		Boolean resultado = false;
		Boolean compatible = false;
		
		if ((!this.destinos.contains(destino) && this.destinos.size() < 3) || (this.destinos.contains(destino))) {
			compatible = true;
		}
		
		if (paquete.getVolumen() + this.volumenTotal <= 2.0 && compatible && paquete.getPeso() + this.pesoTotal <= 500) {
			this.paquetes.add(paquete);
			this.volumenTotal += paquete.getVolumen();
			this.pesoTotal  += paquete.getPeso();
			if (!this.destinos.contains(destino)) {
				this.destinos.add(destino);
			}
			resultado = true;
		}

		return resultado;
	}
	

}




