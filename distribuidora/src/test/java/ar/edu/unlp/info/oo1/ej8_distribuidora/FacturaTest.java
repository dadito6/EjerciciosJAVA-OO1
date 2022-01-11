package ar.edu.unlp.info.oo1.ej8_distribuidora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ej8.distribuidora.Factura;
import ej8.distribuidora.Usuario;

public class FacturaTest {

	private Usuario usuario;
	private Factura factura;
	
	
	@BeforeEach
	public void setUp() {
		usuario = new Usuario("Mercedes", "Calle Sosa 99, San Miguel de Tucuman");
		factura = new Factura( 2000,usuario,10);
		
	}
	
	@Test
	public void testInicializar() {
		assertEquals(10, factura.getDescuento());
		assertEquals(2000, factura.getMontoEnergiaActiva());
		assertEquals(factura.getFecha(), LocalDate.now());
		assertEquals(usuario, factura.getUser());
	}
	
	@Test
	public void testMontoTotal() {
		assertEquals(1800, factura.montoTotal(2000));
	}
	

}
