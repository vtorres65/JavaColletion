package co.com.alura;

import co.com.alura.model.Clase;
import co.com.alura.model.Curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo6 {

    public static void main(String[] args) {

        Curso clase1 = new Curso("Java", 30);
        clase1.addClase(new Clase("ArrayList"));
        clase1.addClase(new Clase("List"));
        clase1.addClase(new Clase("LinkedList"));

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(clase1);

        System.out.println(cursos.get(0).getClaseList());
    }
}
