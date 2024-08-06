package org.example.entities;

public class cursos {
    private int id_Curso;
    private String  nombre_Curso;

    public cursos(){}

    public cursos(int idCurso, String nombreCurso) {
        id_Curso = idCurso;
        nombre_Curso = nombreCurso;
    }

    public int getId_Curso() {
        return id_Curso;
    }

    public void setId_Curso(int id_Curso) {
        this.id_Curso = id_Curso;
    }

    public String getNombre_Curso() {
        return nombre_Curso;
    }

    public void setNombre_Curso(String nombre_Curso) {
        this.nombre_Curso = nombre_Curso;
    }


    @Override
    public String toString() {
        return "cursos{" +
                "id_Estudiante=" + this.id_Curso +
                ", nombre_Curso='" + this.nombre_Curso + '\'' +
                '}';
    }
}
