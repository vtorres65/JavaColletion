package co.com.alura;

import co.com.alura.model.Curso;

import java.util.ArrayList;

public class Ejemplo4 {

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

        System.out.println(cursos);

    }
}
