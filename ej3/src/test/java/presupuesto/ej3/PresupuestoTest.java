package presupuesto.ej3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PresupuestoTest {

	private presupuesto presupuesto;

	@BeforeEach
	public void setUp() {
		presupuesto = new presupuesto().cliente("Pedro");
	}

	@Test
	public void testCalcularTotal() {
		assertEquals(0, presupuesto.calcularTotal());
		item item = new item().detalle("Leche").costoUnitario(100).cantidad(1);
		presupuesto.agregarItem(item);
		assertEquals(100, presupuesto.calcularTotal());

		item = new item().detalle("Chocolate").costoUnitario(150).cantidad(1);
		presupuesto.agregarItem(item);

		assertEquals(250, presupuesto.calcularTotal());
	}

	@Test
	public void testInitialize() {
		assertEquals(0, presupuesto.calcularTotal());
	}

}
