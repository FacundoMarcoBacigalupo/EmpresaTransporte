package ar.edu.unlam.pb2.transporte;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {
	private List<Paquete> paquetes;
	private Auto auto;
	private Bicicleta bicicleta;
	private Camion camion;
	
	
	public EmpresaTransporte() {
		this.paquetes = new ArrayList<>();
		this.auto = new Auto();
		this.bicicleta = new Bicicleta();
		this.camion = new Camion();
	}
	
	
	
	
	
}



