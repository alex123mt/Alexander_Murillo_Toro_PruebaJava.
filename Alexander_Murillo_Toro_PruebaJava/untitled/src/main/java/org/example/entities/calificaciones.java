package org.example.entities;

public class calificaciones {
    private int id_Calificacion;
    private String descripcion;
    private int calificacion;
    private int id_Estudiante_Fk;
    private int id_curso_Fk;

    public calificaciones(){}

    public calificaciones(int idCalificacion, String descripcion, int calificacion, int idEstudianteFk, int idCursoFk) {
        id_Calificacion = idCalificacion;
        this.descripcion = descripcion;
        this.calificacion = calificacion;
        id_Estudiante_Fk = idEstudianteFk;
        id_curso_Fk = idCursoFk;
    }

    public int getId_Calificacion() {
        return id_Calificacion;
    }

    public void setId_Calificacion(int id_Calificacion) {
        this.id_Calificacion = id_Calificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getId_Estudiante_Fk() {
        return id_Estudiante_Fk;
    }

    public void setId_Estudiante_Fk(int id_Estudiante_Fk) {
        this.id_Estudiante_Fk = id_Estudiante_Fk;
    }

    public int getId_curso_Fk() {
        return id_curso_Fk;
    }

    public void setId_curso_Fk(int id_curso_Fk) {
        this.id_curso_Fk = id_curso_Fk;
    }

    @Override
    public String toString() {
        return "calificaciones{" +
                "id_Calificacion=" + id_Calificacion +
                ", descripcion='" + descripcion + '\'' +
                ", calificacion=" + calificacion +
                ", id_Estudiante_Fk=" + id_Estudiante_Fk +
                ", id_curso_Fk=" + id_curso_Fk +
                '}';
    }
}
