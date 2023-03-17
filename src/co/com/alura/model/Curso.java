package co.com.alura.model;

import java.util.*;

public class Curso{

    private String nombre;
    private int tiempo;
    private List<Clase> claseList = new ArrayList<>();
    private Collection<Alumno> alumno = new HashSet<>();
    //private Collection<Alumno> alumno = new LinkedHashSet<>();
    private Map<String, Alumno> alumnoMap = new HashMap<>();

    public Curso(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public Curso(String nombre, int tiempo, List<Clase> claseList) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.claseList = claseList;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTiempo() {
        return tiempo;
    }
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    public List<Clase> getClaseList() {
        return Collections.unmodifiableList(claseList);
    }
    public void setClaseList(List<Clase> claseList) {
        this.claseList = claseList;
    }
    public void addClase(Clase clase){
        this.claseList.add(clase);
    }
    public int compareTo(Curso o) {
        return this.nombre.compareTo(o.getNombre());
    }
    public void addAlura(Alumno alumno) {
        this.alumno.add(alumno);
    }
    public void addAlumno(Alumno alumno1) {
        this.alumno.add((Alumno) alumno); this.alumnoMap.put(alumno.getCodigo(), alumno);
    }
    public Collection<Alumno> getAlumno() {
        return alumno;
    }
    public boolean verificaAlumno(Alumno alumno) {
        return this.alumno.contains(alumno);
    }

    @Override
    public String toString(){
        return  this.nombre;
    }

    public <E> List getAlumnoMap() {
        return null;
    }

    public Optional<Object> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Optional<Object> alumnos) {
        this.alumnos = alumnos;
    }
}
