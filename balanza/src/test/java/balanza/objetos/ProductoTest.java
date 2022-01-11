package balanza.objetos;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import balanza.producto;


public class ProductoTest{

  private producto queso;
  
  @BeforeEach
  void setUp() throws Exception {
    queso = new producto();
  }

  @Test
  void testDescripcion() {
    queso.setDescripcion("Queso crema");
    assertEquals("Queso crema", queso.getDescripcion());
  }
  
  @Test
  void testPeso() {
    queso.setPeso(100);
    assertEquals(100, queso.getPeso());
  }

  @Test
  void testPrecioPorKilo() {
    queso.setPrecioPorKilo(100);
    assertEquals(100, queso.getPrecioPorKilo());
  }

  @Test
  void testPrecio() {
    queso.setPeso(0.1);
    queso.setPrecioPorKilo(140);
    assertEquals(14, queso.precio());
  }
}
