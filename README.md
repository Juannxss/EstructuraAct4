#ACTIVIDAD 4 DE ESTRUCTURA DE DATOS(stream y lambda)

##DESARROLLO DE ULTIMO PUNTO

1-Recorrer un objeto de tipo List usando una función flecha o función lambda

        System.out.println("---LinkedList con lambda---");
        listaEnlazada2.stream().forEach((carr) -> {
            System.out.println(carr.getModelo() + " " + carr.getPlaca() + " " + carr.getColor());

        });


2-Recorrer un objeto de tipo Set usando una función flecha o función lambda

        System.out.println("---HashSet con lambda---");
        tablaSett2.forEach((carr) -> {
            System.out.println(carr.getModelo() + " " + carr.getPlaca() + " " + carr.getColor());
        });

3-Recorrer un objeto de tipo Map usando una función flecha o función lambda

        System.out.println("---HashMap con lambda---");
        hashMapp.forEach((clave, valor) -> {
            System.out.println(valor.getModelo() + " " + valor.getPlaca() + " " + valor.getColor());
        });


4-Convertir un array en un objeto List

        System.out.println("Convertir un array en un objeto List");
        //Se crea un arreglo de tipo Integer
        Integer[] arrr = {1, 4, 5, 88, 33, 0, 14};

        //Se recorre el arreglo con el metodo stream y se almacenan los datos en la lista creada con el metodo collect
        List<Integer> listArr = Arrays.stream(arrr).collect(
                Collectors.toList());
        System.out.println(listArr);


5-Convertir un objeto List a un array

         System.out.println("Convertir un objeto List a un array");
        //Se recorre la lista con el metodo stream, mapea cada uno de 
        //los elemnetos y devuelve el mismo elemento y lo alamcena el en arreglo
        int[] arr2 = listArr.stream().mapToInt(l -> l).toArray();
        for (int ii : arr2) {
            System.out.print(ii + " ");
        }


  6-Dos formas de unir unas dos listas en una sola

        System.out.println("Listas unidas ejemplo 1");
        ArrayList<Integer> listaArr2 = new ArrayList<>();
        listaArr2.add(77);
        listaArr2.add(777);
        listaArr2.add(778);
        listaArr2.add(111);

        //Se crea una nueva lista y se usa el metodo concat de stream para 
        //unir las listas y el metodo collect para guardarlos en la lista uno tras otro
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
        //Este es el mismo procedimiento anterior con la diferencia 
        //que en el metodo collect se crea un ArrayList y los datos se almacenan en esa coleccion
        List<Integer> lista3 = Stream.of(listArr, listaArr2)
                .flatMap(li -> li.stream())
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(lista3);


7-Desordenar una Lista

          System.out.println("Lista desordenada");
        //Se llama al metodo shuffle de Collections que intercambia los elementos dentro de la coleccion
        Collections.shuffle(lista3);
        System.out.println(lista3);

8-Cómo ordenar colecciones de objetos usando los métodos de Stream, por
ejemplo: Ordenar dementemente por apellido una colección de objetos
alumnos, cuyas propiedades son, código, nombre, apellido, género y
semestre usando los métodos de Stream

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



9-Colo obtener una sublista de alumnos de una colección de objetos de tipo
alumnos, pero solo aquellos que se encuentren en III semestre usando los
métodos de Stream

          System.out.println("Sublista de estudantes que aparecen en 3er semestre");
        //Se llama al metodo filter de stream para verificar si el semestre del estudiante es 3 y 
        //Se alamcenan los estudiantes de 3er semestre en un nuevo ArrayList
        List<Estudiante> semestre3 = estudiantes.stream().filter(ol -> ol.getSemestre() == 3)
                .collect(Collectors.toCollection(ArrayList::new));

        //Se imprime la lista 
        semestre3.stream().forEach((Estudiante) -> {
            System.out.println(Estudiante.getApellido() + " - " + Estudiante.getNombre()
                    + " - " + Estudiante.getCodigo() + " - " + Estudiante.getGenero() + " - " + Estudiante.getSemestre());
        });


10-Cómo agrupar la colección de alumnos por género y semestre usando los
métodos de Stream

          System.out.println("Estudiantes agrupados por genero y semestre");
        //Se llama al metodo sorted para ordenar los elementos teniendo en cuenta el comparador que hace en el semestre
        //Luego se llama al metodo theComparing para comparar el genero y se imprime mediante el for-each
        estudiantes.stream().sorted(Comparator.comparing(Estudiante::getSemestre)
                .thenComparing(Comparator.comparing(Estudiante::getGenero)))
                .forEach((Estudiante) -> {
                    System.out.println(Estudiante.getApellido() + " - " + Estudiante.getNombre()
                            + " - " + Estudiante.getCodigo() + " - " + Estudiante.getGenero() + " - " + Estudiante.getSemestre());
                });



11-Como obtener de la colección de alumnos el primer alumno que se encuentre
en III semestre, usando los métodos de Stream

           System.out.println("Primer estudiante en tercer semestre");
        //Se sigue la misma logica de los anteriores algoritmos pero a 
        //diferencia que aqui se llama al metodo limit para que se imprima el primer elemento 
        estudiantes.stream().filter(ol -> ol.getSemestre() == 3).limit(1)
                .forEach((Estudiante) -> {
                    System.out.println(Estudiante.getApellido() + " - " + Estudiante.getNombre()
                            + " - " + Estudiante.getCodigo() + " - " + Estudiante.getGenero() + " - " + Estudiante.getSemestre());
                });



12-Como obtener de la colección de alumnos el aquello nombre contiene la
palabra John, usando los métodos de Stream

            System.out.println("Estudiante con la palabra John en su nombre");
        //Siguiendo la misma logica anterior se obtiene el estudiante con el nombre de john mediante el metodo equals
        estudiantes.stream().filter(ol -> ol.getNombre().equals("John")).limit(1)
                .forEach((Estudiante) -> {
                    System.out.println(Estudiante.getApellido() + " - " + Estudiante.getNombre()
                            + " - " + Estudiante.getCodigo() + " - " + Estudiante.getGenero() + " - " + Estudiante.getSemestre());
                });



13-Como obtener de la colección de alumnos aquellos que se encuentren
cursando de III a VI semestre, usando los métodos de Stream

          System.out.println("Estudiantes de 3er a 6to semestre ");

        //Se sigue la misma logica anterior pero en este caso se usan los 
        //comparadores mayor o igual y menor o igual como rango de busqueda
        estudiantes.stream().sorted(Comparator.comparing(Estudiante::getSemestre))
                .filter(ol -> ol.getSemestre() >= 3 && ol.getSemestre() <= 6)
                .forEach((Estudiante) -> {
                    System.out.println(Estudiante.getApellido() + " - " + Estudiante.getNombre()
                            + " - " + Estudiante.getCodigo() + " - " + Estudiante.getGenero() + " - " + Estudiante.getSemestre());
                });



        
          
