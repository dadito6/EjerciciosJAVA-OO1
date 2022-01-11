package presupuesto.ej3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ItemTest {

	private item item;

	@BeforeEach
	public void setUp() {
		item = new item().detalle("azucar").cantidad(2).costoUnitario(60);
	}
	//.detalle("azucar").costoUnitario(60).cantidad(2)

	@Test
	public void testCosto() {
		assertEquals(120, item.costo());
	}

	@Test
	public void testCostoUnitario() {
		assertEquals(60, item.getCostoUnitario());
	}
}
