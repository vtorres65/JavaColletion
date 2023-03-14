package co.com.alura;

import java.text.CollationElementIterator;
import java.util.*;
import java.util.stream.Collectors;

public class Ejemplo3 {

    public static void main(String[] args) {
        String Clase1 = "Geometria";
        String Clase2 = "Fisica";
        String Clase3 = "Quimica";
        String Clase4 = "Historia";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(Clase1);
        cursos.add(Clase2);
        cursos.add(Clase3);
        cursos.add(Clase4);

        System.out.println(cursos);

        //Listar de forma desendente en el orden que esta original
        Collections.reverse(cursos);
        System.out.println(cursos);

        //Listar de forma asendente
        Collections.sort(cursos);
        System.out.println(cursos);

        //Listar de forma desendente ordenado
        Collections.sort(cursos, Collections.reverseOrder());
        System.out.println(cursos);
        cursos.sort(Comparator.naturalOrder());

        List<String> cursosList = cursos.stream().sorted().collect(Collectors.toList());

    }
}
