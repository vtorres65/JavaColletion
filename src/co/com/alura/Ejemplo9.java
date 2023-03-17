package co.com.alura;

import co.com.alura.model.Curso;

import java.util.*;
import java.util.stream.Collectors;

public class Ejemplo9 {

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

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(Clase1);
        cursos.add(Clase2);
        cursos.add(Clase3);
        cursos.add(Clase4);

        //System.out.println(cursos);

        Collections.sort(cursos,Comparator.comparing(Curso::getNombre).reversed());

        int tiempo = 0;
        for (Curso curso: cursos){
            tiempo += curso.getTiempo();
        }

        System.out.println(tiempo);

        List<Curso> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Geometria")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());

        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());
    }
}
