package proyectojUnit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LibroTest {
	private List<String> autores;
	private Ubicacion ubicacion;
	private Libro libro;
	private List<Libro> libros;

	@Before
	public void setUp() throws Exception {
		autores = new ArrayList<String>();
		autores.add("Rene Goscinny");
		ubicacion = new Ubicacion(3, 2, 1, 10, 12);
//		El pequeno nicolas,Rene Goscinny,1959-3-29,144,Santillana,Infantil,8420,1,2,1,10,5,DISPONIBLE,Historias contadas por el pequeno nicolas
		libro = new Libro("El pequeno nicolas", autores, LocalDate.of(1959, 3, 29), 144, "Santillana", "Infantil", 8420, ubicacion, Estado.DISPONIBLE, "Historias contadas por el pequeno nicolas");
		libros = new ArrayList<Libro>();
	}
	
	@Test
	public void testRegistrarLibro() {
		libros.add(libro);
		Assert.assertTrue(libros.contains(libro));
	}
	
	@Test
	public void testBuscarLibroPorTitulo() {
		String titulo ="El pequeno nicolas";
		libros.add(libro);
		Boolean existe = null;
		for (int i=0;i<libros.size();i++) {
			if (libros.get(i).getTitulo().equals(titulo)) {
				existe=true;
			}
		}
		Assert.assertTrue(existe.equals(true));
	}
	
	@Test
	public void testBuscarLibroPorAutor() {
		String autor="Rene Goscinny";
		autores = new ArrayList<String>();
		autores.add(autor);
		libros.add(libro);
		Boolean existe = null;
		for (int i=0;i<libros.size();i++) {
			if (libros.get(i).getAutor().contains(autor)) {
				existe=true;
			}
		}
		Assert.assertTrue(existe.equals(true));
	}
	
	@Test
	public void testBuscarLibroPorISBN() {
		int isbn = 8420;
		libros.add(libro);
		Boolean existe = null;
		for (int i=0;i<libros.size();i++) {
			if (libros.get(i).getIsbn()==isbn) {
				existe=true;
			}
		}
		Assert.assertTrue(existe.equals(true));
	}
	
	@Test
	public void testEditarLibro() {
		Libro copiaOriginal = new Libro("El pequeno nicolas", autores, LocalDate.of(1959, 3, 29), 144, "Santillana", "Infantil", 8420, ubicacion, Estado.DISPONIBLE, "Historias contadas por el pequeno nicolas");
		autores.clear();
		autores.add("Antoine de Saint-Exupery");
		
		libros.add(libro);
		libros.get(0).setTitulo("El Principito");
		libros.get(0).setAutor(autores);
		libros.get(0).setFechaEdicion(LocalDate.of(1943, 4, 6));
		libros.get(0).setnPaginas(112);
		libros.get(0).setEditorial("Zig-zag");
		libros.get(0).setIsbn(9789);
		libros.get(0).setDescripcion("Un principito se cuestiona ciertas cosas de la vida");
		Assert.assertNotEquals(libro, copiaOriginal);
	}
	
	@Test
	public void testEliminarLibro() {
		libros.add(libro);
		libros.remove(0);
		Assert.assertFalse(libros.contains(libro));
	}
	
	@Test
	public void testCambiarEstado() {
		Estado nuevoEstado = Estado.EXTRAVIADO;
		libro.setEstado(nuevoEstado);
		Assert.assertTrue(libro.getEstado().equals(nuevoEstado));
	}
}
