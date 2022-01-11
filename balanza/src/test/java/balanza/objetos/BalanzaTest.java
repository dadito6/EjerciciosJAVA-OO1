package balanza.objetos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import balanza.producto;
import balanza.ticket;


public class BalanzaTest {
 
  private balanza.balanza balanza;
  
  private balanza.producto queso;
  
  private balanza.producto jamon;
  
  @BeforeEach
  void setUp() throws Exception {
    balanza = new balanza.balanza();
    queso = new producto();
    queso.setPeso(0.1);
    queso.setPrecioPorKilo(90);
    queso.setDescripcion("Queso");

    jamon = new producto();
    jamon.setDescripcion("Jamón");
    jamon.setPeso(0.1);
    jamon.setPrecioPorKilo(90);
  }

  @Test
  void testAgregarProducto() {

    balanza.agregarProducto(queso);
    assertEquals(0, balanza.getPesoTotal());
    assertEquals(9, balanza.calcularTotal());
    assertEquals(9, balanza.calcularTotal());
    balanza.agregarProducto(jamon);
    assertEquals(0, balanza.getPesoTotal());
    assertEquals(18, balanza.calcularTotal());
    assertEquals(18, balanza.calcularTotal());
  }

  @Test
  void testCantidadDeProductos() {
    assertEquals(0, balanza.getProductos().size());
    balanza.agregarProducto(queso);
    assertEquals(1, balanza.getProductos().size());
    balanza.agregarProducto(jamon);
    assertEquals(2, balanza.getProductos().size());
  }  
  
  @Test
  void testEmitirTicket() {
    balanza.agregarProducto(queso);
    balanza.agregarProducto(jamon);
    ticket ticket = balanza.emitirTicket();
    assertEquals(0, ticket.getpesoTotal());
    assertEquals(0, ticket.calcularTotal());
    assertEquals(0, ticket.getProductos().size());
    assertEquals( 0, ticket.impuesto());
    assertEquals(LocalDate.now(), ticket.getfecha());
  }

  @Test
  void testConstructor() {
    assertEquals(0, balanza.getPesoTotal());
    assertEquals(0, balanza.calcularTotal());
    assertEquals(0, balanza.calcularTotal());
  }

  @Test
  void testPesoTotal() {
    assertEquals(0, balanza.getPesoTotal());
    balanza.agregarProducto(queso);
    assertEquals(0, balanza.getPesoTotal());
    balanza.agregarProducto(jamon);
    assertEquals(0, balanza.getPesoTotal());
  }  

  @Test
  void testPonerEnCero() {
    balanza.agregarProducto(queso);
    balanza.ponerEnCero();
    assertEquals(0, balanza.getPesoTotal());
    assertEquals(0, balanza.calcularTotal());
    assertEquals(0, balanza.getProductos().size());
  }  

  @Test
  void testPrecioTotal() {
    assertEquals(0, balanza.calcularTotal());
    balanza.agregarProducto(queso);
    assertEquals(9, balanza.calcularTotal());
    balanza.agregarProducto(jamon);
    assertEquals(18, balanza.calcularTotal());
  }  
}
