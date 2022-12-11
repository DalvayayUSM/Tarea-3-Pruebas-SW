package biblioteca;

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

    public Libro(String titulo, List<String> autor, LocalDate fechaEdicion, int nPaginas, String editorial, String genero, int isbn, Ubicacion ubicacion, Estado estado, String descripcion) {
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
}