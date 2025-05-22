package ar.edu.unlam.pb2.transporte;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {
	private List<Paquete> paquetes;
	private List<Vehiculo> vehiculos;
	private Auto auto;
	private Bicicleta bicicleta;
	private Camion camion;
	
	
	public EmpresaTransporte() {
		this.setPaquetes(new ArrayList<>());
		this.auto = new Auto(1233, "Audi");
		this.bicicleta = new Bicicleta(123, "BMX");
		this.camion = new Camion(666, "Truck");
		this.setVehiculos(new ArrayList<>());
	}


	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}


	public void setVehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}


	public List<Paquete> getPaquetes() {
		return paquetes;
	}


	public void setPaquetes(List<Paquete> paquetes) {
		this.paquetes = paquetes;
	}
	
	public boolean agregarVhiculo(Vehiculo v) {
		for(Vehiculo vehi : vehiculos) {
			if(vehi.getPatente() == v.getPatente()) {
				return false;
			}
		}
		
		this.vehiculos.add(v);
		return true;
	}
	
	
	
}



