package com.mycompany.estructuraact4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class EstructuraAct4 {

    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "---Primer ejemplo clase Dictionary--- \n"
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

        JOptionPane.showMessageDialog(null, "---Segundo ejemplo clase HashTable---\n "
                + "Hacer una tabla hash que almacene los nombres de las empresas que hacen lácteos y devuelva su número de teléfono,\n"
                + "elimina a empresa menos conocida");
        Hashtable<String, String> tablaHash = new Hashtable<>();
        tablaHash.put("Colanta", "320898654");
        tablaHash.put("Alpina", "320877796");
        tablaHash.put("Alqueria", "32085456");
        tablaHash.put("La granja del Borrego", "300254432");

        JOptionPane.showMessageDialog(null, "Estas son las empresas que lideran la industria de los lacteos: " + tablaHash.toString() + "\n"
                + "La empresa menos conocida es: " + tablaHash.remove("La granja del Borrego"));//elimina la empresa menos conocida

        JOptionPane.showMessageDialog(null, "---Cuarto ejemplo clase Vector--- \n"
                + "Crear un vector en el cual se puedan guardar tipos de animales,\n"
                + "imprimirlos y mostrar cual está en la primara y cual está en la última posición");

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

        JOptionPane.showMessageDialog(null, "---Octavo ejemplo clase Arrays--- \n"
                + " Crear un Array para almacenar las edades de 15 personas, mostrarlas de menor a mayor "
                + "e imprimir la edad de 15 si esta se encuentra.");

        int[] arr = {14, 15, 22, 7, 11, 56, 32, 12, 40, 12, 33, 25, 25, 16, 5};//Se crea el arreglo con las edades

        Arrays.sort(arr);//Se llama al metodo sort de la clase Arrays

        JOptionPane.showMessageDialog(null, "Las edades del arreglo son: " + Arrays.toString(arr) + "\n" //devuelve la cadena del arreglo
                + "El numero 15 esta en la posicion: " + Arrays.binarySearch(arr, 15 + 1)); //devuelve la posicion del numero que se indica

        JOptionPane.showMessageDialog(null, "---Decimo ejemplo clase ArrayList---\n"
                + "Crea una algoritmo usando la clase ArrayList para guardar\n"
                + "una lista de paises que conforman la OTAN, muestra la cantidad de paises y reemplaza el primero por COLOMBIA");

        ArrayList<String> listaArreglo = new ArrayList<>();//Se crea el ArrayList con los paises
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

        JOptionPane.showMessageDialog(null, "Los paises son: " + listaArreglo + "\n" //Se imprime la lista
                + "El total de paises que conformaron la OTAN hasta el 2000 fueron: " + listaArreglo.size() + "\n"//Se muestra el tamaño
                + "El pais " + listaArreglo.set(0, "COLOMBIA") + " sera reemplazado por " + listaArreglo.get(0));//Se reemplaza y se trae el primer elemento

        JOptionPane.showMessageDialog(null, "---Onceavo ejemplo Clase LinkedList---\n"
                + "Crea una lista para almacenar los ultimos 7 ganadores del balon de oro\n "
                + "muestra en que posicion esta la pulga y en que posicion se encuentra el bicho");

        LinkedList<String> listaEnlazada = new LinkedList<>();//Se crea la lista con los futbolistas
        listaEnlazada.add("RONALDINHO");
        listaEnlazada.add("FABIO CANNAVARO");
        listaEnlazada.add("KAKÁ ");
        listaEnlazada.add("CRISTIANO RONALDO");
        listaEnlazada.add("LIONEL MESSI");
        listaEnlazada.add("LUKA MODRIC ");
        listaEnlazada.add("KARIM BENZEMA");

        JOptionPane.showMessageDialog(null, "Los ultimos 7 ganadores del balon de oro fueron: " + listaEnlazada + "\n"//Se muestra la lista
                + "La posicion en la que se encuentra MESSI es: " + listaEnlazada.indexOf("LIONEL MESSI") + "\n"//Se muestra el indice del elemento
                + "La posicion en la que se encuentra CR7 es: " + listaEnlazada.indexOf("CRISTIANO RONALDO"));//Se muestra el indice del elemento

        JOptionPane.showMessageDialog(null, "---Ejemplo catorceavo Clase HashSet---\n"
                + "Crea un algoritmo para guardar las vocales y agregar dos letras por cada vocal abierta "
                + "y una letra por cada vocal cerrada e imprimir el resultado");

        HashSet<Character> tablaSett = new HashSet<>();//Se crea la tabla con datos no repetidos
        tablaSett.add('A');
        tablaSett.add('E');
        tablaSett.add('I');
        tablaSett.add('O');
        tablaSett.add('U');
        tablaSett.add('J');
        tablaSett.add('N');
        tablaSett.add('D');
        tablaSett.add('G');
        tablaSett.add('L');
        tablaSett.add('P');
        tablaSett.add('Z');
        tablaSett.add('C');

        JOptionPane.showMessageDialog(null, "Los elementos son: " + tablaSett.toString());//Devuelve la tabla en representacion de cadena

        JOptionPane.showMessageDialog(null, "---Quinceavo ejemplo Clase TreeSet---\n"
                + "Crea una colección en la cual se puedan almacenar los nombres de las 5 empresas más grandes del mundo, agrégale los elementos de la colección del punto 4\n"
                + "y muestra que elemento está en la primera posición y cual está en la última.");

        TreeSet<String> arbolSett = new TreeSet<>();
        arbolSett.add("Microsoft");
        arbolSett.add("Apple");
        arbolSett.add("Aramco");
        arbolSett.add("Alphabet");
        arbolSett.add("Nvidia");
        arbolSett.addAll(vectorr);

        JOptionPane.showMessageDialog(null, "Los elementos de la coleccion son: " + arbolSett + "\n"
                + "El elemento en la primera posicion es: " + arbolSett.first() + "\n"
                + "El elemento en la ultima posicion es: " + arbolSett.last());

        JOptionPane.showMessageDialog(null, "---Decimoséptimo ejemplo Clase HashMap---\n"
                + " Crear un algoritmo para guardar el calibre el arma y devuelva el nombre de esta\n "
                + "muestre todos los nombres de las armas almacenadas y sus calibres. ");

        HashMap<Integer, String> tablaHashh = new HashMap<>();//Se crea el HashMap con las claves y su valor

        tablaHashh.put(22, "TAURUS 95");
        tablaHashh.put(45, "COLT M1911 TACTICAL");
        tablaHashh.put(19, "GLOCK 19X");
        tablaHashh.put(44, "DESERT EAGLE");
        tablaHashh.put(25, "PPSZ-41");
        tablaHashh.put(25, "PPSZ-41");
        tablaHashh.put(39, "KALASHNIKOV CLASSIC");
        tablaHashh.put(54, "SWD");
        tablaHashh.put(51, "M14 TACTICAL");
        tablaHashh.put(57, "MOSSBERG 590A1");

        JOptionPane.showMessageDialog(null, "Los calibres en mm de las armas son " + tablaHashh.keySet() + " \n"//devuelve un set con las claves
                + "Todas las armas y sus calibres " + tablaHashh);//Devuelve las claves con sus valores

        JOptionPane.showMessageDialog(null, "---Decimoctavo ejemplo Clase TreeMap---\n"
                + "Crear una colección a partir de los elementos de la colección anterior \n"
                + "y agregarle más elementos del mismo contexto, pero de videojuegos.\n"
                + "Muestra un sub conjunto de estos desde el calibre 40 hasta el mas alto");

        TreeMap<Integer, String> mapaArbol = new TreeMap<>(tablaHashh);//se crea el TreeMap
        mapaArbol.put(43, "GROZA");//Se agregan las armas de los videojuegos
        mapaArbol.put(41, "AK47");
        mapaArbol.put(102, "AWS");
        mapaArbol.put(78, "AUG");

        JOptionPane.showMessageDialog(null, "El subconjunto es " + mapaArbol.tailMap(40));//Devuleve un arreglo desde la llave 40 hasta la mas alta

        JOptionPane.showMessageDialog(null, "---Decimonoveno ejemplo Clase LinkedHashMap---\n"
                + "Crea un algoritmo que muestre una lista de carros deportivos, los muestre, elimine al carro mas antiguo\n"
                + "muestre cual es el mas nuevo y muestre una tofo de este");
        LinkedHashMap<Integer, String> mapaHashEnlazado = new LinkedHashMap<>();

        mapaHashEnlazado.put(1962, "Ferrari 250 GTO");
        mapaHashEnlazado.put(1964, "Ford Mustang GT");
        mapaHashEnlazado.put(1970, "Dodge Challenger");
        mapaHashEnlazado.put(1963, "Porsche 911");
        mapaHashEnlazado.put(1978, "Toyota Supra");
        mapaHashEnlazado.put(2020, "Chevrolet Corvette");
        mapaHashEnlazado.put(2022, "Toyota GR86");
        mapaHashEnlazado.put(2018, "McLaren Senna");
        mapaHashEnlazado.put(2006, "Audi R8");
            
               //Se crea una imagen como icono y se le da la direccion de la imagen
            ImageIcon imagen = new ImageIcon("C:\\Users\\David\\Documents\\NetBeansProjects\\EstructuraAct4\\src\\main\\DSC03037.jpeg");
            JOptionPane optionnPane = new JOptionPane();//Se crea un objeto JOptionPane
            optionnPane.setIcon(imagen);//Se le asigna la imagen al objeto para que se imprima

            JOptionPane.showMessageDialog(null, "Los carros deportivos son: " + mapaHashEnlazado.values() + "\n"//Muestra los carros deportivos
                    + "El carro mas antiguo es el " + mapaHashEnlazado.remove(1962)//elimina el valor asociado a la clave
                    + "\nEl carro deportivo mas nuevo es el " + mapaHashEnlazado.get(2022));//Trae el valor asociado a la clave
            //Muestra una imagen del carro mas nuevo junto con el titulo del carro
            JOptionPane.showMessageDialog(null, optionnPane, mapaHashEnlazado.get(2022), 0);
        
        
         

        JOptionPane.showMessageDialog(null, "A partir de aqui las operaciones seran mostradas por consola");
         
        Carro Mazda = new Carro("Mazda 1", "AGB-982", "Blanco");
        Carro Corvette = new Carro("Corvette C5", "LKH-026", "Rojo");
        Carro Camaro = new Carro("Camaro z28", "MPZ-003", "Verde");
        Carro Porsche = new Carro("Porsche 911 GT3 rs", "RRQ-887", "Gris");
        Carro Tahoez = new Carro("Tahoe z71", "ONE-123", "Negro");

        System.out.println("---LinkedList---");
        //Se crea una lista enlazada de la interface List
        List<Carro> listaEnlazada2 = new LinkedList<>();
        //Se agregan elementos
        listaEnlazada2.add(Mazda);
        listaEnlazada2.add(Camaro);
        listaEnlazada2.add(Porsche);
        listaEnlazada2.add(Tahoez);
        listaEnlazada2.add(Corvette);
        //Se recorre e imprime la lista (for-each)
        

        System.out.println("for-each");
        for (Carro i : listaEnlazada2) {
            System.out.println(i.getModelo() + ", " + i.getPlaca() + ", " + i.getColor());
        }
        System.out.println();

        System.out.println("for tradicional");
        //Se recorre la lista (for tradicional)
        for (byte i = 0; i < listaEnlazada2.size(); i++) {
            Carro j = listaEnlazada2.get(i);

            System.out.println(j.getModelo() + ", " + j.getPlaca() + ", " + j.getColor());
        }
        System.out.println();
        System.out.println("While");
        byte i = 0;
        while (i != listaEnlazada2.size()) {
            Carro j = listaEnlazada2.get(i);
            i++;
            System.out.println(j.getModelo() + ", " + j.getPlaca() + ", " + j.getColor());

        }
        System.out.println();
        System.out.println("do-while");
        byte k = 0;

        do {

            Carro j = listaEnlazada2.get(k);
            k++;
            System.out.println(j.getModelo() + ", " + j.getPlaca() + ", " + j.getColor());

        } while (k != listaEnlazada2.size());

        System.out.println();
        //Buscar una manera de imprimir la lista
        System.out.println("El carro en la primera posicion es: " + listaEnlazada2.get(0).getModelo());//Se busca en elemento en la primera posicion
        System.out.println("Se eliminara el Porsche");
        listaEnlazada2.remove(Porsche);//Se elimina el objeto
        System.out.println("Existe el carro Porsche en la lista?: " + listaEnlazada2.contains(Porsche));//Se vreifica si el Objeto esta en la lista

        System.out.println();
        System.out.println("---HashSet---");
        //Se crea un HashSet de la interface Set
        HashSet<Carro> tablaSett2 = new HashSet<>();
        //Se agregan los elementos
        tablaSett2.add(Tahoez);
        tablaSett2.add(Camaro);
        tablaSett2.add(Corvette);
        tablaSett2.add(Mazda);
        tablaSett2.add(Porsche);

        //for-each
        System.out.println();
        System.out.println("for-each");
        for (Carro iter : tablaSett2) {
            System.out.println(iter.getModelo() + ", " + iter.getPlaca() + ", " + iter.getColor());
        }

        System.out.println();
        System.out.println("for tradicional");
        i = 0;
        for (Iterator<Carro> re = tablaSett2.iterator(); re.hasNext(); i++) {

            Carro j = re.next();
            System.out.println(j.getModelo() + ", " + j.getPlaca() + ", " + j.getColor());

        }

        System.out.println();
        System.out.println("while");
        Iterator<Carro> it = tablaSett2.iterator();
        while (it.hasNext()) {
            Carro next = it.next();
            System.out.println(next.getModelo() + ", " + next.getPlaca() + ", " + next.getColor());
        }

        System.out.println();
        System.out.println("do-while");
        Iterator<Carro> iterr = tablaSett2.iterator();
        do {

            Carro next = iterr.next();
            System.out.println(next.getModelo() + ", " + next.getPlaca() + ", " + next.getColor());
        } while (iterr.hasNext());

        System.out.println();
        System.out.println("---HashMap---");
        //Se crea un HashMap de la interface Map
        HashMap<String, Carro> hashMapp = new HashMap<>();
        hashMapp.put("ONE-123", Tahoez);
        hashMapp.put("RRQ-887", Porsche);
        hashMapp.put("AGB-982", Mazda);
        hashMapp.put("MPZ-003", Camaro);
        hashMapp.put("LKH-026", Corvette);

        System.out.println("for-each");

        for (Map.Entry<String, Carro> entry : hashMapp.entrySet()) {
            String key = entry.getKey();
            Carro value = entry.getValue();

            System.out.println(key + " " + value.getModelo());
        }

        System.out.println();
        System.out.println("while");

        Iterator<Map.Entry<String, Carro>> itt = hashMapp.entrySet().iterator();
        while (itt.hasNext()) {
            Map.Entry<String, Carro> iter = itt.next();

            String key = iter.getKey();
            Carro valor = iter.getValue();
            System.out.println(key + " " + valor.getModelo());

        }

        System.out.println();
        System.out.println("do-while");
        Iterator<Map.Entry<String, Carro>> iterar = hashMapp.entrySet().iterator();
        do {
            Map.Entry<String, Carro> itera = iterar.next();
            String key = itera.getKey();
            Carro valor = itera.getValue();
            System.out.println(key + " " + valor.getModelo());
        } while (iterar.hasNext());

        //Recorrer un objeto de tipo List usando stream
        //Se recorre la lista enlazada con el metodo Stream
        System.out.println("");
        System.out.println("---LinkedList con lambda---");
        listaEnlazada2.stream().forEach((carr) -> {
            System.out.println(carr.getModelo() + " " + carr.getPlaca() + " " + carr.getColor());

        });

        System.out.println("");
        System.out.println("---HashSet con lambda---");
        tablaSett2.forEach((carr) -> {
            System.out.println(carr.getModelo() + " " + carr.getPlaca() + " " + carr.getColor());
        });

        System.out.println("");
        System.out.println("---HashMap con lambda---");
        hashMapp.forEach((clave, valor) -> {
            System.out.println(valor.getModelo() + " " + valor.getPlaca() + " " + valor.getColor());
        });

        System.out.println();
         
        System.out.println("Convertir un array en un objeto List");
        //Se crea un arreglo de tipo Integer
        Integer[] arrr = {1, 4, 5, 88, 33, 0, 14};

        //Se recorre el arreglo con el metodo stream y se almacenan los datos en la lista creada con el metodo collect
        List<Integer> listArr = Arrays.stream(arrr).collect(
                Collectors.toList());
        System.out.println(listArr);
        System.out.println();

        System.out.println("Convertir un objeto List a un array");
        //Se recorre la lista con el metodo stream, mapea cada uno de los elemnetos y devuelve el mismo elemento y lo alamcena el en arreglo
        int[] arr2 = listArr.stream().mapToInt(l -> l).toArray();
        for (int ii : arr2) {
            System.out.print(ii + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Listas unidas ejemplo 1");
        ArrayList<Integer> listaArr2 = new ArrayList<>();
        listaArr2.add(77);
        listaArr2.add(777);
        listaArr2.add(778);
        listaArr2.add(111);

        //Se crea una nueva lista y se usa el metodo concat de stream para unir las listas y el metodo collect para guardarlos en la lista uno tras otro
        List<Integer> listasUnidas = Stream.concat(listArr.stream(), listaArr2.stream())
                .collect(Collectors.toList());
        System.out.println(listasUnidas);

        System.out.println();
        System.out.println("Listas unidas ejemplo 2");
        //Se crea un stream con las 2 listas de tipo entero
        Stream<List<Integer>> listaStream = Stream.of(listArr, listaArr2);
        //Se crea un stream con el stream anterior que devuelve cada elemento que recorre 
        Stream<Integer> combinarListas = listaStream.flatMap(list -> list.stream());
        //Se crea la lista para alamcenar los elementos con collect devueltos en el stream anterior
        List<Integer> listasUnidas2 = combinarListas.collect(Collectors.toList());

        System.out.println(listasUnidas2);
        System.out.println();
        System.out.println("Otro ejemplo mas abreviado");
        //Este es el mismo procedimiento anterior con la diferencia que en el metodo collect se crea un ArrayList y los datos se almacenan en esa coleccion
        List<Integer> lista3 = Stream.of(listArr, listaArr2)
                .flatMap(li -> li.stream())
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(lista3);

        
        System.out.println();
        System.out.println("Lista desordenada");
        //Se llama al metodo shuffle de Collections que intercambia los elementos dentro de la coleccion
        Collections.shuffle(lista3);
        System.out.println(lista3);
        System.out.println();
        System.out.println();

        System.out.println("------Operaciones con la clase Estudiante------");
        System.out.println();
        System.out.println("LISTADO DE ESTUDIANTES");
        
        //Se crean los estudiantes
        Estudiante pedro = new Estudiante("20021", "Pedro", "Diaz", 'M', 4);
        Estudiante Daniel = new Estudiante("20022", "Daniel", "Paez", 'M', 1);
        Estudiante Luisa = new Estudiante("20023", "Luisa", "Marrugo", 'F', 3);
        Estudiante Pablo = new Estudiante("20024", "Pablo", "Escobar", 'M', 7);
        Estudiante Julieta = new Estudiante("20025", "Julieta", "Lopez", 'F', 1);
        Estudiante Romana = new Estudiante("20026", "Romana", "Ronaldo", 'F', 3);
        Estudiante Paul = new Estudiante("20027", "Paul", "Walker", 'M', 5);
        Estudiante John = new Estudiante("1999a.c", "John", "Arrieta", 'M', 10);
        
        List<Estudiante> estudiantes = new LinkedList<>();//Se crea la lista para almacenar los estudantes
 //Se agregan los estudiantes a la lista
        estudiantes.add(pedro);
        estudiantes.add(Daniel);
        estudiantes.add(Luisa);
        estudiantes.add(Pablo);
        estudiantes.add(Julieta);
        estudiantes.add(Paul);
        estudiantes.add(Romana);
        estudiantes.add(John);

        System.out.println("Apellido - Nombre - Codigo - Genero - Semestre");
        //Se llama a la interface stream con sus metodos
        //Sorted ordena la lista dependiendo de la comoparacion que devuelve el metodo comparator y se imprime con el forEach
        estudiantes.stream().sorted(Comparator.comparing(ol -> ol.getApellido())).forEach((Estudiante) -> {
            System.out.println(Estudiante.getApellido() + " - " + Estudiante.getNombre()
                    + " - " + Estudiante.getCodigo() + " - " + Estudiante.getGenero() + " - " + Estudiante.getSemestre());
        });
        System.out.println();

        System.out.println("Sublista de estudantes que aparecen en 3er semestre");
       //Se llama al metodo filter de stream para verificar si el semestre del estudiante es 3 y 
        //Se alamcenan los estudiantes de 3er semestre en un nuevo ArrayList
        List<Estudiante>semestre3 =estudiantes.stream().filter(ol -> ol.getSemestre()==3)
                .collect(Collectors.toCollection(ArrayList::new));
        
        //Se imprime la lista 
        semestre3.stream().forEach((Estudiante)->{System.out.println(Estudiante.getApellido() + " - " + Estudiante.getNombre()
                    + " - " + Estudiante.getCodigo() + " - " + Estudiante.getGenero() + " - " + Estudiante.getSemestre());});
        
        System.out.println();
        System.out.println("Estudiantes agrupados por genero y semestre");
        //Se llama al metodo sorted para ordenar los elementos teniendo en cuenta el comparador que hace en el semestre
        //Luego se llama al metodo theComparing para comparar el genero y se imprime mediante el for-each
         estudiantes.stream().sorted(Comparator.comparing(Estudiante::getSemestre)
        .thenComparing(Comparator.comparing(Estudiante::getGenero)))
        .forEach((Estudiante)->{System.out.println(Estudiante.getApellido() + " - " + Estudiante.getNombre()
        + " - " + Estudiante.getCodigo() + " - " + Estudiante.getGenero() + " - " + Estudiante.getSemestre());});
        
        
         System.out.println();
        
        System.out.println("Primer estudiante en tercer semestre");
        //Se sigue la misma logica de los anteriores algoritmos pero a diferencia que aqui se llama al metodo limit para que se imprima el primer elemento 
         estudiantes.stream().filter(ol -> ol.getSemestre() ==3).limit(1)
                 .forEach((Estudiante)->{System.out.println(Estudiante.getApellido() + " - " + Estudiante.getNombre()
        + " - " + Estudiante.getCodigo() + " - " + Estudiante.getGenero() + " - " + Estudiante.getSemestre());});
         
        
         System.out.println();
         System.out.println("Estudiante con la palabra John en su nombre");
         //Siguiendo la misma logica anterior se obtiene el estudiante con el nombre de john mediante el metodo equals
         estudiantes.stream().filter( ol -> ol.getNombre().equals("John")).limit(1)
                 .forEach( (Estudiante)->{System.out.println(Estudiante.getApellido() + " - " + Estudiante.getNombre()
        + " - " + Estudiante.getCodigo() + " - " + Estudiante.getGenero() + " - " + Estudiante.getSemestre());});
         
         System.out.println();
      
         
         
         System.out.println("Estudiantes de 3er a 6to semestre ");
         
         //Se sigue la misma logica anterior pero en este caso se usan los comparadores mayor o igual y menor o igual como rango de busqueda
         estudiantes.stream().sorted(Comparator.comparing(Estudiante::getSemestre))
                 .filter(ol -> ol.getSemestre()>=3 && ol.getSemestre()<=6 )
                 .forEach((Estudiante)->{System.out.println(Estudiante.getApellido() + " - " + Estudiante.getNombre()
        + " - " + Estudiante.getCodigo() + " - " + Estudiante.getGenero() + " - " + Estudiante.getSemestre());});
         
         
         //PDT: Profe si llega a ver esto es porque no tuve tiempo para mejorar los ejemplos y omiti algunos, usted disculpe
         
    }
}
