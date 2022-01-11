package Llamadas.llamadas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class SistemaDeLLamadasTest {
	
	private Llamada call1,call2;
	private Cliente cli1 , cli2;
	private numero num1,num2;
	private Factura fact1,fact2;
	private servicioLlamada serv;
	
	
	@BeforeEach
	void setUp() throws Exception {
		this.call1= new llamadaLocal (LocalDate.of(2021, 6, 8),LocalDate.of(2021, 2, 2),22,224343,232323);
		this.call2= new llamadaInterurbana (LocalDate.of(2021, 6, 8),LocalDate.of(2021, 2, 2),22,224343,232323,50);
		this.cli1= new clienteOne("damian", "calle 123", 23213232,434343);
		this.cli2= new clienteJuridico("damian", "calle 123", 23213232,23232 , "Empresa");
	}
	
    
	@Test
	public void testDarDeAltaClienteOne() {
		serv.darDeAltaUnCliente("jaja", "jojo", 213231);
		assertEquals(1, this.serv.getCLi().size());
	
	}
	
	
	@Test
	public void testAgregarNumero() {
		serv.agregarNumero(222232);
		assertEquals(1, this.serv.getNumeros().size());
	
	}
	
	

	@Test
	public void testRegistrarLLamadaLocal() {
		this.call1= new llamadaLocal (LocalDate.of(2021, 6, 8),LocalDate.of(2021, 2, 2),22,224343,232323);
		serv.registrarLlamadaLocal(LocalDate.of(2021, 6, 8),LocalDate.of(2021, 2, 2),22,224343,232323);
		assertEquals(1, this.serv.getNumeros().size());
	
	}
}
