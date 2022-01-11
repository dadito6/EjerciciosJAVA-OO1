package ej9.cuenta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class CuentaTest {
	
	private Cuenta cuenta;
	private CajaDeAhorro caja ;
	private CuentaCorriente cuentaC;
	
	@BeforeEach
	public void setUp() {
		this.caja = new CajaDeAhorro();
		this.cuentaC = new CuentaCorriente () ;
		caja.depositar(2000);
		cuentaC.depositar(2000);
		
	
	
	}

	
	
	@Test
	public void testSaldos() {
		assertEquals(1960, caja.getSaldo());
		assertEquals(2000, cuentaC.getSaldo());
	}
	@Test 
	public void testCuentaCorriente() {
		this.cuentaC.setLimiteDescubierto(-2000);
		assertEquals(-2000, this.cuentaC.getLimiteDescubierto() );
		assertTrue(this.cuentaC.extraerL(200));
		assertFalse(this.caja.extraer(4000));
		assertTrue(this.caja.extraer(1000));
	}
	
	
	
	@Test
	public void testCajaDeAhorro() {
		assertTrue(this.caja.extraer(200));
		assertFalse(this.caja.extraer(3000));
		assertFalse(this.caja.extraer(20000));
		assertTrue(this.caja.extraer(200));
		this.caja.depositar(400);
		assertFalse(this.caja.transeferirA(2000, caja));
		assertTrue(this.caja.transeferirA(200, caja));
	}
	
	@Test
	public void testTransferir() {
		this.cuentaC.depositar(2000);
		assertTrue(this.cuentaC.transferirACuenta(222, caja));
		this.caja.depositar(2000);
		assertTrue(this.caja.transeferirA(222, cuentaC));
		
	}
	}
	

	

