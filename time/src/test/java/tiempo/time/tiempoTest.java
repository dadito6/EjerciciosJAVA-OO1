package tiempo.time;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class tiempoTest {

	timeLaps time;
	timeLaps dos;
	
	@BeforeEach
	void setUp() throws Exception {
		time= new timeLaps(null, null);
		LocalDate cumple = LocalDate.parse("1999-11-30");
		time.setFrom(cumple);
		time.setTo(LocalDate.now());
		dos = new timeLaps(cumple, cumple);
		LocalDate go = LocalDate.parse("2000-09-01");
		dos.setFrom(go);
		dos.setTo(LocalDate.now());
	}
	
    @Test
    public void sizeInDays() {
    	assertEquals(7721,time.sizeInDays() );
        assertEquals(7718,dos.sizeInDays() );
    }
    
    @Test
    public void includesDate () {
    	LocalDate a = LocalDate.parse("2020-11-30");
    	assertTrue(time.includesDate(a));
    	time.setFrom(LocalDate.now());
    	assertFalse(time.includesDate(a));
    }
}
