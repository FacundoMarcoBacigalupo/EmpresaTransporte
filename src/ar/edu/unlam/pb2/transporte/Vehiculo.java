package ar.edu.unlam.pb2.transporte;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {
	protected List<Paquete> paquetes = new ArrayList<>();
	protected Double volumenTotal = 0.0;
	protected Double pesoTotal = 0.0;
	protected int patente = 0;
	private String nombre = "";
	
	
	public Vehiculo(int patente, String nombre) {
		this.patente = patente;
		this.nombre = nombre;
	}
	
	public abstract Boolean agregar(Paquete paquete, String destino);
	
	
	public Integer getCantidadDePaquetes(){
		return this.paquetes.size();
	}

	public String getNombre() {
		return nombre;
	}

	public int getPatente() {
		return patente;
	}
	
}

