package biblioteca;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        List<Libro> libros = new ArrayList<Libro>();
        Scanner opcionScanner = new Scanner(System.in);
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
        LocalDate fechaEdicion=LocalDate.now();
        int opcionMenu, nPaginas, isbn, piso, pasillo, estante, posX, posY, estado, opcionMenu2;
        List<Integer> opcionesLibros = new ArrayList<Integer>();
        Ubicacion ubicacion;
        Estado estadoLibro=Estado.PRESTADO;
        Libro libro;
        Boolean flag=true;
        Boolean existe=false;
        System.out.println("Sistema de registro de biblioteca");
        while(flag){
            titulo=new String();
            autor = new String();
            editorial = new String();
            genero = new String();
            descripcion = new String();
            existe=false;
            System.out.format("\n\n\t-----MENU-----\n1.-Registrar libro\t2.-Buscar libro\n3.-Editar libro\t\t4.-Eliminar libro\n5.-Salir\n");
            System.out.print("Ingrese una opcion: ");
            opcionMenu = opcionScanner.nextInt();
            switch (opcionMenu) {
                case 1:
                    System.out.println("\nOpción seleccionada: Registrar libro");
                    System.out.print("\nIngrese el titulo del libro: ");
                    titulo=tituloScanner.nextLine();
                    do {
                        System.out.print("Ingrese los autores del libro. Si no hay mas, presione Enter: ");
                        autor=autorScanner.nextLine();
                        if (autor.length()>0){
                            autores.add(autor);
                        }
                    } while (autor.length()>0);
                    // informacion
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
                    System.out.print("Ingrese la coordenada X donde se encuentra el libro: ");
                    posX = posXScanner.nextInt();
                    System.out.print("Ingrese la coordenada Y donde se encuentra el libro: ");
                    posY = posYScanner.nextInt();
                    ubicacion=new Ubicacion(piso, pasillo, estante, posX, posY);
                    // descripcion
                    System.out.print("\nIngrese una descripcion del libro: ");
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
                    break;
                case 2:
                    System.out.println("\nOpción seleccionada: Buscar libro");
                    System.out.println("\nBuscar libro por:\n1.-Titulo\t2.-Autor\t3.-ISBN");
                    System.out.print("Ingrese una opcion: ");
                    opcionMenu2=opcionScanner.nextInt();
                    switch (opcionMenu2) {
                        case 1:
                            System.out.print("Ingrese el titulo del libro que quiere buscar: ");
                            titulo=tituloScanner.nextLine();
                            for (int i = 0; i < libros.size(); i++){
                                if (libros.get(i).getTitulo().contains(titulo)) {
                                    libros.get(i).printLibro();
                                    existe=true;
                                }
                            }
                            if (existe == false) {
                                System.out.println("El libro solicitado no esta en el catalogo");
                            }
                            break;
                        case 2:
                            System.out.print("Ingrese el autor del libro que quiere buscar: ");
                            autor = autorScanner.nextLine();
                            for (int i = 0; i < libros.size(); i++) {
                                if (libros.get(i).getAutor().contains(autor)) {
                                    libros.get(i).printLibro();
                                    existe = true;
                                }
                            }
                            if (existe == false) {
                                System.out.println("El libro solicitado no esta en el catalogo");
                            }
                            break;
                        case 3:
                            System.out.print("Ingrese el ISBN del libro que quiere buscar: ");
                            isbn = isbnScanner.nextInt();
                            for (int i = 0; i < libros.size(); i++) {
                                if (isbn == libros.get(i).getIsbn()) {
                                    libros.get(i).printLibro();
                                    existe = true;
                                }
                            }
                            if (existe == false) {
                                System.out.println("El libro solicitado no esta en el catalogo");
                            }
                            break;
                        default:
                            System.out.println("La opcion ingresada no es valida");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("\nOpción seleccionada: Editar libro");
                    System.out.println("Los libros en el catalogo son:");
                    for (int i = 0; i < libros.size(); i++){
                        System.out.format("\t%d.- %s\n", i+1, libros.get(i).getTitulo());
                        opcionesLibros.add(i);
                    }
                    System.out.print("Ingrese una opcion: ");
                    opcionMenu2=opcionScanner.nextInt()-1;
                    if(opcionesLibros.contains(opcionMenu2)){
                        System.out.print("\nIngrese el titulo del libro: ");
                        titulo = tituloScanner.nextLine();
                        do {
                            System.out.print("Ingrese los autores del libro. Si no hay mas, presione Enter: ");
                            autor = autorScanner.nextLine();
                            autores.add(autor);
                        } while (autor.length() > 0);
                        // informacion
                        System.out.print("Ingrese la fecha de edición del libro (en el formato aaaa-mm-dd): ");
                        fecha = fechaScanner.nextLine().split("-");
                        fechaEdicion = LocalDate.of(Integer.parseInt(fecha[0]), Month.of(Integer.parseInt(fecha[1])),
                                Integer.parseInt(fecha[2]));
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
                        System.out.print("Ingrese la coordenada X donde se encuentra el libro: ");
                        posX = posXScanner.nextInt();
                        System.out.print("Ingrese la coordenada Y donde se encuentra el libro: ");
                        posY = posYScanner.nextInt();
                        ubicacion = new Ubicacion(piso, pasillo, estante, posX, posY);
                        // descripcion
                        System.out.print("\nIngrese una descripcion del libro: ");
                        descripcion = descripcionScanner.nextLine();
                        // estado libro
                        System.out.println("\nEstado del libro. El estado puede ser:");
                        System.out.println("\n1.- Prestado\n2.- Disponible\n3.- Extraviado");
                        System.out.print("\nIngrese el numero del estado del libro: ");
                        estado = estadoScanner.nextInt();
                        switch (estado) {
                            case 1:
                                estadoLibro = Estado.PRESTADO;
                                break;
                            case 2:
                                estadoLibro = Estado.DISPONIBLE;
                                break;
                            case 3:
                                estadoLibro = Estado.EXTRAVIADO;
                                break;
                            default:
                                do {
                                    System.out
                                            .print("El numero de estado del libro no es valida. Ingrese nuevamente: ");
                                    estado = estadoScanner.nextInt();
                                } while (estado < 1 || estado > 3);
                                break;
                        }
                        ubicacion.setPiso(piso);
                        ubicacion.setPasillo(pasillo);
                        ubicacion.setEstante(estante);
                        ubicacion.setPosX(posX);
                        ubicacion.setPosY(posY);                        
                        libros.get(opcionMenu2).setTitulo(titulo);
                        libros.get(opcionMenu2).setAutor(autores);
                        libros.get(opcionMenu2).setFechaEdicion(fechaEdicion);
                        libros.get(opcionMenu2).setnPaginas(nPaginas);
                        libros.get(opcionMenu2).setEditorial(editorial);
                        libros.get(opcionMenu2).setGenero(genero);
                        libros.get(opcionMenu2).setIsbn(isbn);
                        libros.get(opcionMenu2).setDescripcion(descripcion);
                        libros.get(opcionMenu2).setUbicacion(ubicacion);
                        libros.get(opcionMenu2).setEstado(estadoLibro);
                        System.out.println("El libro ha sido editado");
                    } else{
                        System.out.println("La opcion ingresada no es valida");
                    }
                    opcionesLibros.clear();
                    break;
                case 4:
                    System.out.println("\nOpción seleccionada: Eliminar libro");
                    System.out.println("Los libros en el catalogo son:");
                    for (int i = 0; i < libros.size(); i++) {
                        System.out.format("\t%d.- %s\n", i+1, libros.get(i).getTitulo());
                        opcionesLibros.add(i);
                    }
                    System.out.print("Ingrese una opcion: ");
                    opcionMenu2 = opcionScanner.nextInt()-1;
                    if(opcionesLibros.contains(opcionMenu2)){
                        libros.remove(libros.get(opcionMenu2));
                        System.out.println("El libro ha sido eliminado");
                    } else {
                        System.out.println("La opcion ingresada no es valida");
                    }
                    opcionesLibros.clear();
                    break;
                case 5:
                    flag=false;
                    System.out.println("\nFin del programa");
                    break;
                default:
                        System.out.print("La opcion ingresada no es valida, ingrese otra: ");
                        opcionMenu = opcionScanner.nextInt();
                    break;
            }
        }
        opcionScanner.close();
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