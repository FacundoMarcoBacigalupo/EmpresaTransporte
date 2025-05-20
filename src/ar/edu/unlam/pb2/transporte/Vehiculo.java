package ar.edu.unlam.pb2.transporte;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {
	protected List<Paquete> paquetes = new ArrayList<>();
	protected Double volumenTotal = 0.0;
	protected Double pesoTotal = 0.0;
	
	
	public abstract Boolean agregar(Paquete paquete, String destino);
	
	
	public Integer getCantidadDePaquetes(){
		return this.paquetes.size();
	}
	
}



