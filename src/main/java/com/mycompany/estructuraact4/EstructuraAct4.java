package com.mycompany.estructuraact4;

import java.util.*;
import javax.swing.JOptionPane;

public class EstructuraAct4 {

    public static void main(String[] args) {

        /*  1. crear un diccionario para guardarel número de documento de Cédula
        y muestre el nombre de la persona para la inscripción de un torneo de fútbol*/
        JOptionPane.showMessageDialog(null, "Primer ejemplo clase Dictionary \n"
                + "crear un diccionario para guardarel número de documento de Cédula\n"
                + "y muestre el nombre de la persona para la inscripción de un torneo de fútbol");

        Dictionary<String, String> diccionario = new Hashtable();//Se crea el diccionario
        //Se agregan los jugadores 
        diccionario.put("1043963744", "Juan Lopez");
        diccionario.put("1043763745", "Jose Muñoz");
        diccionario.put("1044963774", "Daniel Diaz");
        diccionario.put("1043965468", "Esteban Hurtado");
        diccionario.put("1043909094", "Brayan Zapata");
        diccionario.put("1043909864", "Carlos Torrez");
        diccionario.put("1043945644", "Sebastian Moreno");
        diccionario.put("1063906094", "Luis Salgado");
        diccionario.put("1043349094", "Diego Martinez");
        diccionario.put("1043429094", "Felipe Saruma");
        diccionario.put("1043909434", "Daniel Rojas");

        JOptionPane.showMessageDialog(null, "-La cantidad de jugadores registrados es de: " + diccionario.size() + "\n "
                + "-El capitan del equipo es: " + diccionario.get("1043963744"));

        /* 2. hacer una tabla hash que almacene los nombres de las empresas que hacen lácteos y devuelva su número de teléfono,
        si el nombre elimina la menos conocida*/
        JOptionPane.showMessageDialog(null, "Segundo ejemplo clase HashTable\n "
                + "Hacer una tabla hash que almacene los nombres de las empresas que hacen lácteos y devuelva su número de teléfono,\n"
                + "elimina a empresa menos conocida");
        Hashtable<String, String> tablaHash = new Hashtable<>();
        tablaHash.put("Colanta", "320898654");
        tablaHash.put("Alpina", "320877796");
        tablaHash.put("Alqueria", "32085456");
        tablaHash.put("La granja del Borrego", "300254432");

        JOptionPane.showMessageDialog(null, "Estas son las empresas que lideran la industria de los lacteos: " + tablaHash.toString() + "\n"
                + "La empresa menos conocida es: " + tablaHash.remove("La granja del Borrego"));//elimina la empresa menos conocida

        System.out.println(tablaHash);

        JOptionPane.showMessageDialog(null, "Tercer ejemplo clase Property");

        Properties propiedad = new Properties();

        JOptionPane.showMessageDialog(null, "Cuarto ejemplo clase Vector \n"
                + "Crear un vector en el cual se puedan guardar tipos de animales,\n"
                + "imprimirlos y mostrar cual está en la primara y cual está en la última posición");

        /* Crear un vector en el cual se puedan guardar tipos de animales,
        imprimirlos y mostrar cual está en la primara y cual está en la última posición. */
        Vector vectorr = new Vector();
        //Se agregan los animales
        vectorr.add("Perro");
        vectorr.add("Tortuga");
        vectorr.add("Iguana");
        vectorr.add("Pollo");
        vectorr.add("Gato");
        vectorr.add("Serpiente");

        JOptionPane.showMessageDialog(null, "Los animales son: " + vectorr.toString() + "\n"
                + "El animal en la primera posicion es: " + vectorr.firstElement() + "\n" //Trae el primer elemento del vector
                + "El animal en la ultima posicion es: " + vectorr.lastElement());//Trae el ultimo elemento del vector

        /* Crear un algoritmo para almacenar en orden los
        colores de la bandera de Colombia, Honduras, Alemania y Canada.*/
        //Clase enum
        JOptionPane.showMessageDialog(null, "Octavo ejemplo clase Arrays \n"
                + " Crear un Array para almacenar las edades de 15 personas, mostrarlas de menor a mayor "
                + "e imprimir la edad de 15 si esta se encuentra.");

        int[] arr = {14, 15, 22, 7, 11, 56, 32, 12, 40, 12, 33, 25, 25, 16, 5};//Se crea el arreglo con las edades

        Arrays.sort(arr);//Se llama al metodo sort de la clase Arrays

        JOptionPane.showMessageDialog(null, "Las edades del arreglo son: " + Arrays.toString(arr) + "\n" //devuelve la cadena del arreglo
                + "El numero 15 esta en la posicion: " + Arrays.binarySearch(arr, 15 + 1)); //devuelve la posicion del numero que se indica

        JOptionPane.showMessageDialog(null, "Decimo ejemplo clase ArrayList\n"
                + "Crea una algoritmo usando la clase ArrayList para guardar\n"
                + "una lista de paises que conforman la OTAN, muestra la cantidad de paises");

        ArrayList<String> listaArreglo = new ArrayList<>();
        listaArreglo.add("BÉLGICA");
        listaArreglo.add("CANADÁ");
        listaArreglo.add("DINAMARCA");
        listaArreglo.add("ESTADOS UNIDOS");
        listaArreglo.add("FRANCIA");
        listaArreglo.add("ISLANDIA ");
        listaArreglo.add("ITALIA");
        listaArreglo.add("LUXEMBURGO");
        listaArreglo.add("NORUEGA");
        listaArreglo.add("PAÍSES BAJOS");
        listaArreglo.add("PORTUGAL");
        listaArreglo.add("REINO UNIDO");
        listaArreglo.add("GRECIA");
        listaArreglo.add("TURQUÍA");
        listaArreglo.add("ALEMANIA");
        listaArreglo.add("España");
        listaArreglo.add("CHEQUIA");
        listaArreglo.add("HUNGRÍA");
        listaArreglo.add("POLONIA");
        
        JOptionPane.showMessageDialog(null, "Los paises son: "+listaArreglo+"\n"
                + "El total de paises que conformaron la OTAN hasta el 2000 fueron: "+listaArreglo.size()+"\n"
                        + "El pais "+listaArreglo.set(0, "COLOMBIA")+" sera reemplazado por "+listaArreglo.getFirst());
        
        
        
        
    }

}
