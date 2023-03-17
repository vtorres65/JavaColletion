package co.com.alura;

import co.com.alura.model.Curso;

import java.util.*;
import java.util.stream.Collectors;

public class Ejemplo10 {

    public static final  List<List<Integer>> listas = new ArrayList<List<Integer>>(){
        {
            add(new LinkedList<>());
            add(new ArrayList<>());
        }
    };

    public static void main(String[] args) {

        Curso Clase1 = new Curso("Geometria", 30);
        Curso Clase2 = new Curso("Fisica", 10);
        Curso Clase3 = new Curso("Quimica", 20);
        Curso Clase4 = new Curso("Historia", 50);
        Curso Clase5 = new Curso("Algebra",60) ;
        Curso Clase6 = new Curso("Aritmetica",80) ;
        Curso Clase7 = new Curso("Quimica",70) ;
        Curso Clase8 = new Curso("Fisica",30) ;

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(Clase1);
        cursos.add(Clase2);
        cursos.add(Clase3);
        cursos.add(Clase4);
        cursos.add(Clase5);
        cursos.add(Clase6);
        cursos.add(Clase7);
        cursos.add(Clase8);

        List<Curso> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());

        System.out.println(cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Historia")).mapToInt(Curso::getTiempo).sum());

        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).average().getAsDouble());

        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());

        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).min().getAsInt());

        Map<String, List<Curso>> groupCurso = cursos.stream().collect(Collectors.groupingBy(Curso::getNombre));

        groupCurso.forEach((key , value) -> System.out.println(key + " - " + value.size()));

        System.out.println(cursos.parallelStream().mapToInt(Curso::getTiempo).sum());
    }
}
