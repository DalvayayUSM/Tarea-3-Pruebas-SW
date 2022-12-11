package biblioteca;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) throws ParseException {
        List<Libro> libros = new ArrayList<Libro>();
        Scanner tituloScanner = new Scanner(System.in);
        Scanner autorScanner = new Scanner(System.in);
        Scanner fechaScanner = new Scanner(System.in);
        Scanner nPaginasScanner = new Scanner(System.in);
        Scanner editorialScanner = new Scanner(System.in);
        Scanner generoScanner = new Scanner(System.in);
        Scanner isbnScanner = new Scanner(System.in);
        Scanner pisoScanner = new Scanner(System.in);
        Scanner pasilloScanner = new Scanner(System.in);
        Scanner estanteScanner = new Scanner(System.in);
        Scanner posXScanner = new Scanner(System.in);
        Scanner posYScanner = new Scanner(System.in);
        Scanner estadoScanner = new Scanner(System.in);
        Scanner descripcionScanner = new Scanner(System.in);
        String titulo, autor, editorial, genero, descripcion;
        List<String> autores = new ArrayList<String>();
        String[] fecha;
        LocalDate fechaEdicion;
        int nPaginas, isbn, piso, pasillo, estante, posX, posY, estado;
        Ubicacion ubicacion;
        Estado estadoLibro=Estado.PRESTADO;
        Libro libro;
        System.out.println("Sistema de registro de biblioteca");
        System.out.println("\nOpción seleccionada: Registro de libro");
        
        System.out.println("\nInformacion del libro");
        System.out.print("\nIngrese el titulo del libro: ");
        titulo=tituloScanner.nextLine();

        do {
            System.out.print("Ingrese los autores del libro. Si no hay mas, presione Enter: ");
            autor=autorScanner.nextLine();
            autores.add(autor);
        } while (autor.length()>0);
        
        System.out.print("Ingrese la fecha de edición del libro (en el formato aaaa-mm-dd): ");
        fecha=fechaScanner.nextLine().split("-");
        fechaEdicion=LocalDate.of(Integer.parseInt(fecha[0]), Month.of(Integer.parseInt(fecha[1])), Integer.parseInt(fecha[2]));
        System.out.print("Ingrese el numero de paginas del libro: ");
        nPaginas = nPaginasScanner.nextInt();
        System.out.print("Ingrese la editorial del libro: ");
        editorial = editorialScanner.nextLine();
        System.out.print("Ingrese el genero del libro: ");
        genero = generoScanner.nextLine();
        System.out.print("Ingrese el ISBN del libro: ");
        isbn = isbnScanner.nextInt();
        // ubicacion
        System.out.println("\nUbicacion del libro");
        System.out.print("\nIngrese el piso donde se encuentra el libro: ");
        piso = pisoScanner.nextInt();
        System.out.print("Ingrese el pasillo donde se encuentra el libro: ");
        pasillo = pasilloScanner.nextInt();
        System.out.print("Ingrese el estante donde se encuentra el libro: ");
        estante = estanteScanner.nextInt();
        System.out.print("Ingrese el estante donde se encuentra el libro: ");
        estante = estanteScanner.nextInt();
        System.out.print("Ingrese la coordenada X donde se encuentra el libro: ");
        posX = posXScanner.nextInt();
        System.out.print("Ingrese la coordenada Y donde se encuentra el libro: ");
        posY = posYScanner.nextInt();
        ubicacion=new Ubicacion(piso, pasillo, estante, posX, posY);
        // descripcion
        System.out.print("Ingrese una descripcion del libro: ");
        descripcion = descripcionScanner.nextLine();
        // estado libro
        System.out.println("\nEstado del libro. El estado puede ser:");
        System.out.println("\n1.- Prestado\n2.- Disponible\n3.- Extraviado");
        System.out.print("\nIngrese el numero del estado del libro: ");
        estado = estadoScanner.nextInt();
        switch (estado) {
            case 1:
                estadoLibro=Estado.PRESTADO;
                break;
            case 2:
                estadoLibro = Estado.DISPONIBLE;
                break;
            case 3:
                estadoLibro = Estado.EXTRAVIADO;
                break;
            default:
                do {
                    System.out.print("El numero de estado del libro no es valida. Ingrese nuevamente: ");
                    estado = estadoScanner.nextInt();
                } while (estado<1 || estado>3);
                break;
        }
        libro=new Libro(titulo, autores, fechaEdicion, nPaginas, editorial, genero, isbn, ubicacion, estadoLibro, descripcion);
        libros.add(libro);
        System.out.println("Libro agregado");

        tituloScanner.close();
        autorScanner.close();
        fechaScanner.close();
        nPaginasScanner.close();
        editorialScanner.close();
        generoScanner.close();
        isbnScanner.close();
        pisoScanner.close();
        pasilloScanner.close();
        estanteScanner.close();
        posXScanner.close();
        posYScanner.close();
        estadoScanner.close();
        descripcionScanner.close();
    }    
}