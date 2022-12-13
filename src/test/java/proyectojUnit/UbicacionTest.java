package proyectojUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UbicacionTest {
	private Ubicacion ubicacion;

	@Before
	public void setUp() throws Exception {
		ubicacion = new Ubicacion(3, 2, 1, 10, 12);
	}
	
	@Test
	public void testGetPiso() throws Exception {
		//Given
		
		//When
		
		//Then
		Assert.assertTrue(ubicacion.getPiso()==3);
	}
	
	@Test
	public void testGetPasillo() throws Exception {
		//Given
		
		//When
		
		//Then
		Assert.assertTrue(ubicacion.getPasillo()==2);
	}
	
	@Test
	public void testGetEstante() throws Exception {
		//Given
		
		//When
		
		//Then
		Assert.assertTrue(ubicacion.getEstante()==1);
	}
	
	@Test
	public void testGetPosX() throws Exception {
		//Given
		
		//When
		
		//Then
		Assert.assertTrue(ubicacion.getPosX()==10);
	}

	@Test
	public void testGetPosY() throws Exception {
		//Given
		
		//When
		
		//Then
		Assert.assertTrue(ubicacion.getPosY()==12);
	}
}
