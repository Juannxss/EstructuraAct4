

package com.mycompany.estructuraact4;
import java.util.*;
import javax.swing.JOptionPane;



public class EstructuraAct4 {

    public static void main(String[] args) {
        
        /*  1. crear un diccionario para guardarel número de documento de Cédula
        y muestre el nombre de la persona para la inscripción de un torneo de fútbol*/
        
        JOptionPane.showMessageDialog(null, "Primer ejemplo clase Dictionary");
        
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
        
        JOptionPane.showMessageDialog(null, "La cantidad de jugadores registrados es de: "+diccionario.size()+"\n "
                + "El capitan del equipo es: "+diccionario.get("1043963744"));
        
        
        /* 2. hacer una tabla hash que almacene los nombres de las empresas que hacen lácteos y devuelva su número de teléfono,
        si el nombre elimina la menos conocida*/
        
        JOptionPane.showMessageDialog(null, "Segundo ejemplo clase HashTable");
        Hashtable<String, String> tablaHash = new Hashtable<>();
        tablaHash.put("Colanta", "320898654");
        tablaHash.put("Alpina", "320877796");
        tablaHash.put("Alqueria", "32085456");
        tablaHash.put("La granja del Borrego", "300254432");
        
        JOptionPane.showMessageDialog(null, "Estas son las empresas que lideran la industria de los lacteos: "+tablaHash.toString());
        tablaHash.remove("La granja del Borrego");//elimina la empresa que es la menos reconocida
        System.out.println(tablaHash);
        
        JOptionPane.showMessageDialog(null, "Tercer ejemplo clase Property");
        
        Properties propiedad = new Properties();
        
        
        
        
        
        
    }
}
