# Tarea-3-Pruebas-SW
Implementación  en Java que permite administrar el catálogo de una biblioteca

## Nombre
Daniel Alvayay

## Descripción
Este programa consiste en una implementación de una biblioteca que permite realizar las siguientes operaciones con su catálogo:
* Agregar un libro al registro.
* Buscar un libro, ya sea por ```título```, ```autor``` o ```isbn``` del libro.
* Editar la información de un libro del registro.
* Eliminar un libro del registro.

## Instalación
Para instalar este programa, basta con descargar los archivos que se encuentran en el [repositorio](https://github.com/DalvayayUSM/Tarea-3-Pruebas-SW), abrirlos en Visual Studio Code (u otro editor de preferencia) y ejecutar desde ahí el programa ```Main.java```.

## Cómo usar
Al iniciar, se desplegará un menú con las siguientes opciones:
1. Registrar libro
2. Buscar libro
3. Editar libro
4. Comparar tamaños
5. Eliminar libro

Debe elegir una de estas opciones, las cuales se detallan a continuación.

### Registrar libro
Se le solicitará ingresar los siguientes datos sobre el libro:
* Título del libro
* Autor del libro. Puede ingresar más de un autor hasta que estén todos. Cuando no haya más autores que agregar, no ingrese nada y presione ```Enter```
* Fecha de edición del libro. Esta fecha debe ser ingresada en formato ```aaaa-mm-dd```, de lo contrario, se producirá un error y el programa terminará.
* Cantidad de páginas del libro.
* Editorial del libro.
* Género del libro.
* ISBN del libro.
* Ubicación del libro en la biblioteca. Esto comprende el piso, pasillo, estante y coordenadas (X,Y) donde se encuentra el libro.
* Estado del libro. Este puede ser ```PRESTADO```, ```DISPONIBLE``` o ```EXTRAVIADO```.
* Una descripción del libro.

Luego de ingresar todos los datos solicitados, el libro se agrega al registro de la biblioteca.

### Buscar libro
Se preguntará si se quiere buscar un libro por:
* Título
* Autor
* ISBN

Debe seleccionar una opción y luego buscar según lo elegido. Se mostrarán en pantalla todas las coincidencias encontradas bajo el criterio dado. En caso de que no haya ninguna coincidencia, se indicará por pantalla.

### Editar libro
Se mostrarán los títulos de los libros que están en el registro y se debe ingresar cual de ellos quiere modificar. Luego, se solicitarán todos los datos del libro (igual que en la opción de ```Registrar libro```) y al completarlos todos se cambiará la información del libro seleccionado en el registro de la biblioteca.

### Eliminar libro
Se mostrarán los títulos de los libros que están en el registro y se debe ingresar cual de ellos quiere eliminar. Luego, el libro se elimina del registro de la biblioteca.

### Salir
Termina el programa