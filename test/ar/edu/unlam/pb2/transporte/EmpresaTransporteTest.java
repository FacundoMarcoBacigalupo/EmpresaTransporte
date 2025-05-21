package ar.edu.unlam.pb2.transporte;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class EmpresaTransporteTest {
	private EmpresaTransporte empresaTransporte;
	
	@Before
	public void init() {
		this.empresaTransporte = new EmpresaTransporte();
	}
	
	
	@Test
	public void queNoSePuedaCargarMasDeTresDestinos() {
		Auto auto = new Auto(1233, "Audi");
		Integer cantidadEsperada = 3;
		Paquete p1 = new Paquete(0.1, 0.1, 0.1, 1.0);
		Paquete p2 = new Paquete(0.1, 0.1, 0.1, 1.0);
		Paquete p3 = new Paquete(0.1, 0.1, 0.1, 1.0);
		Paquete p4 = new Paquete(0.1, 0.1, 0.1, 1.0);
		assertTrue(auto.agregar(p1, "Ramos"));
		assertTrue(auto.agregar(p2, "San Justo"));
		assertTrue(auto.agregar(p3, "Haedo"));
		assertFalse(auto.agregar(p4, "El Palomar"));
		assertEquals(cantidadEsperada, auto.getCantidadDePaquetes());
	}
	
	
	@Test
	public void queNoSePuedaCargarMasDeTresDestinosDistintos() {
		Auto auto = new Auto(1233, "Audi");
		Paquete p1 = new Paquete(0.1, 0.1, 0.1, 1.0);
		Paquete p2 = new Paquete(0.1, 0.1, 0.1, 1.0);
		Paquete p3 = new Paquete(0.1, 0.1, 0.1, 1.0);
		Paquete p4 = new Paquete(0.1, 0.1, 0.1, 1.0);
		Paquete p5 = new Paquete(0.1, 0.1, 0.1, 1.0);
		Paquete p6 = new Paquete(0.1, 0.1, 0.1, 1.0);
		assertTrue(auto.agregar(p1, "Ramos"));
		assertTrue(auto.agregar(p2, "San Justo"));
		assertTrue(auto.agregar(p3, "Haedo"));
		assertFalse(auto.agregar(p4, "El Palomar"));
		assertTrue(auto.agregar(p5, "Haedo"));
		assertFalse(auto.agregar(p6, "Lujan"));
	}
	
	
	@Test
	public void queNoSePuedaCargarConPesoExcedidoEnVariosPaquetes() {
		Auto auto = new Auto(1233, "Audi");
		Paquete p1 = new Paquete(0.5, 0.5, 0.5, 500.0);
		Paquete p2 = new Paquete(0.5, 0.5, 0.5, 0.01);
		assertTrue(auto.agregar(p1, "Hurlingham"));	
		assertFalse(auto.agregar(p2, "Hurlingham"));		
	}
	
	
	
	@Test
	public void queNoSePuedaSuperarLaCantidadDePaquetesAuto() {
		Auto auto = new Auto(1233, "Audi");
		Paquete p1 = new Paquete(0.5, 0.5, 0.5, 500.0);
		Paquete p2 = new Paquete(0.5, 0.5, 0.5, 1.0);
		
		assertTrue(auto.agregar(p1, "RamosMejia"));
		assertFalse(auto.agregar(p2, "Palermo"));
	}
	
	
	
	
	@Test
	public void queNoSePuedaCargarVolumenExcedidio() {
		Bicicleta bici = new Bicicleta(123, "BMX");
		Paquete p1 = new Paquete(0.51, 0.5, 0.5, 1.0);
		assertFalse(bici.agregar(p1, "Ramos"));
	}
	

	@Test
	public void queNoSePuedaSuperarLaCantidadDePaquetesBici() {
		Bicicleta bici = new Bicicleta(123, "BMX");
		Integer valorEsperado = 2;
		Paquete p1 = new Paquete(0.1, 0.1, 0.1, 1.0);
		Paquete p2 = new Paquete(0.1, 0.1, 0.1, 1.0);
		Paquete p3 = new Paquete(0.1, 0.1, 0.1, 1.0);
		assertTrue(bici.agregar(p1, "Ramos"));
		assertTrue(bici.agregar(p2, "Ramos"));
		assertFalse(bici.agregar(p3, "Ramos"));
		assertEquals(valorEsperado, bici.getCantidadDePaquetes());
	}

	
	@Test
	public void queNoSePuedaCargarDestinosDistintos() {
		Bicicleta bici = new Bicicleta(123, "BMX");
		Paquete p1 = new Paquete(0.1, 0.1, 0.1, 1.0);
		Paquete p2 = new Paquete(0.1, 0.1, 0.1, 1.0);
		assertTrue(bici.agregar(p1, "Ramos"));
		assertFalse(bici.agregar(p2, "San Justo"));
	}
	

	@Test
	public void queNoSePuedaCargarConPesoExcedido() {
		Bicicleta bici = new Bicicleta(123, "BMX");
		Paquete p1 = new Paquete(0.5, 0.5, 0.5, 15.1);
		assertFalse(bici.agregar(p1, "Ramos"));
	}
	
	
	
	@Test
	public void queNoSePuedaSuperarLaCantidadDePaquetesCamion() {
		Camion camion = new Camion(666, "Truck");
		Paquete p1 = new Paquete(0.5, 0.5, 0.5, 15000.0);
		Paquete p2 = new Paquete(0.5, 0.5, 0.5, 2000.0);
		
		assertTrue(camion.agregar(p1, "Cañuelas"));
		assertFalse(camion.agregar(p2, "Palermo"));
	}
	
	
	
	@Test
	public void enviarPaquetesConElCamionADistintosDestinosConDistintoPeso() {
		Camion camion = new Camion(666, "Truck");
		Paquete p1 = new Paquete(0.5, 0.5, 0.5, 10000.0);
		Paquete p2 = new Paquete(0.5, 0.5, 0.5, 2000.0);
		Paquete p3 = new Paquete(0.5, 0.5, 0.5, 1000.0);
		Paquete p4 = new Paquete(0.5, 0.5, 0.5, 2500.0);
		
		
		assertTrue(camion.agregar(p1, "Cañuelas"));
		assertTrue(camion.agregar(p2, "Palermo"));
		assertTrue(camion.agregar(p3, "SanJusto"));
		assertTrue(camion.agregar(p4, "RamosMejia"));
	}
		
	
	
	
	@Test
	public void queNoSePuedaAregarElMismoAuo() {
		Auto auto = new Auto(1233, "Audi");
		Auto auto2 = new Auto(1233, "Audi");
		
		boolean sePudo = empresaTransporte.agregarVhiculo(auto);
		boolean sePudo2 = empresaTransporte.agregarVhiculo(auto2);
		
		assertTrue(sePudo);
		assertFalse(sePudo2);
	}
	
	@Test
	public void queNoSePuedaAregarLaMismaBici() {
		Bicicleta bici = new Bicicleta(123, "BMX");
		Bicicleta bici2 = new Bicicleta(123, "BMX");
		
		boolean sePudo = empresaTransporte.agregarVhiculo(bici);
		boolean sePudo2 = empresaTransporte.agregarVhiculo(bici2);
		
		assertTrue(sePudo);
		assertFalse(sePudo2);
	}
	
}







