package proyectojUnit;

import java.time.LocalDate;
import java.util.List;

public class Libro {
	private String titulo;
	private List<String> autor;
	private LocalDate fechaEdicion;
	private int nPaginas;
	private String editorial;
	private String genero;
	private int isbn;
	private Ubicacion ubicacion;
	private Estado estado;
	private String descripcion;

	public Libro(String titulo, List<String> autor, LocalDate fechaEdicion, int nPaginas, String editorial,
			String genero, int isbn, Ubicacion ubicacion, Estado estado, String descripcion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.fechaEdicion = fechaEdicion;
		this.nPaginas = nPaginas;
		this.editorial = editorial;
		this.genero = genero;
		this.isbn = isbn;
		this.ubicacion = ubicacion;
		this.estado = estado;
		this.descripcion = descripcion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<String> getAutor() {
		return autor;
	}

	public void setAutor(List<String> autor) {
		this.autor = autor;
	}

	public LocalDate getFechaEdicion() {
		return fechaEdicion;
	}

	public void setFechaEdicion(LocalDate fechaEdicion) {
		this.fechaEdicion = fechaEdicion;
	}

	public int getnPaginas() {
		return nPaginas;
	}

	public void setnPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	void printLibro() {
		System.out.format("\nLibro: %s\n", getTitulo());
		System.out.println("\tAutores: ");
		for (int j = 0; j < getAutor().size(); j++) {
			System.out.print("\t\t-" + getAutor().get(j) + "\n");
		}
		System.out.println("\tFecha de edicion: " + getFechaEdicion());
		System.out.format("\tNumero de paginas: %d\n", getnPaginas());
		System.out.format("\tEditorial: %s\n", getEditorial());
		System.out.format("\tGenero: %s\n", getEditorial());
		System.out.format("\tISBN: %d\n", getIsbn());
		System.out.format("\tDescripcion: %s\n", getDescripcion());
		System.out.format(
				"\tEl libro se encuentra en el piso %d, pasillo %d, estante %d, en las coordenadas (%d, %d)\n",
				getUbicacion().getPiso(), getUbicacion().getPasillo(), getUbicacion().getEstante(),
				getUbicacion().getPosX(), getUbicacion().getPosY());
		System.out.println("El libro se encuentra " + getEstado());
	}
}
