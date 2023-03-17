package co.com.alura;

import co.com.alura.model.Clase;
import co.com.alura.model.Curso;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo7 {

    public static void main(String[] args) {

        Curso clase1 = new Curso("Java", 30);
        clase1.addClase(new Clase("ArrayList"));
        clase1.addClase(new Clase("List"));
        clase1.addClase(new Clase("LinkedList"));

        List<Clase> aulaList = clase1.getClaseList();

        // aulaList.add(new Clase("Inmutable"));

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(clase1);

        System.out.println(cursos.get(0).getClaseList());
    }
}
