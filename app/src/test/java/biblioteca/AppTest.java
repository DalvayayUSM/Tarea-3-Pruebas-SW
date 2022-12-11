/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package biblioteca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

class  bibliotecaTest{
    @Test
    void appHasAGreeting() {
        //pooner parametros
        List<Libro> biblioteca = new ArrayList<Libro>();

        String titulo="Prueba 1 JUnit";
        List<String> autores = new ArrayList<String>();
        LocalDate fechaEdicion = LocalDate.now();
        int nPaginas = 140;
        String editorial="Edebe";
        String genero = "manuales";
        int isbn=9778316;
        int piso=2;
        int pasillo=3;
        int estante=2;
        int posX=30;
        int posY=20;
        Estado estado = Estado.DISPONIBLE;
        String descripcion= "Realizando testing con JUnit";

        Ubicacion ubicacion= new Ubicacion(piso, pasillo, estante, posX, posY);
        Libro libro = new Libro(titulo, autores, fechaEdicion, nPaginas, editorial, genero, isbn, ubicacion, estado, descripcion);
        biblioteca.add(libro);
        assertTrue(biblioteca.contains(libro));
    }
}
