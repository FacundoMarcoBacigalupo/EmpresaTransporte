package ar.edu.unlam.pb2.transporte;

import java.util.ArrayList;
import java.util.List;

public class Bicicleta extends Vehiculo {
	private String destino;

	
	public Bicicleta(int id, String nombre) {
		super(id, nombre);
	}
	
	
	public Boolean agregar(Paquete paquete, String destino) {
		Boolean resultado = false;

		if (this.destino == null) {
			this.destino = destino;
		}
		
		if (paquete.getVolumen() + this.volumenTotal <= 0.125 && this.paquetes.size() < 2 && this.destino.equals(destino) && paquete.getPeso() + this.pesoTotal <= 15) {
			this.paquetes.add(paquete);
			this.volumenTotal += paquete.getVolumen();
			this.pesoTotal += paquete.getPeso();
			resultado = true;
		}
		
		return resultado;
	}


}



