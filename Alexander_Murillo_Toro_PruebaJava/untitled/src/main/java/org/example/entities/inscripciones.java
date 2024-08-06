package org.example.entities;

public class inscripciones {
    private int id_incripcion;
    private int id_estudiante_fk;
    private int id_curso_fk;


    public inscripciones(){}

    public inscripciones(int idIncripcion, int idEstudianteFk, int idCursoFk){
        id_incripcion = idIncripcion;
        id_estudiante_fk = idEstudianteFk;
        id_curso_fk = idCursoFk;
    }


    public int getId_incripcion() {
        return id_incripcion;
    }

    public void setId_incripcion(int id_incripcion) {
        this.id_incripcion = id_incripcion;
    }

    public int getId_estudiante_fk() {
        return id_estudiante_fk;
    }

    public void setId_estudiante_fk(int id_estudiante_fk) {
        this.id_estudiante_fk = id_estudiante_fk;
    }

    public int getId_curso_fk() {
        return id_curso_fk;
    }

    public void setId_curso_fk(int id_curso_fk) {
        this.id_curso_fk = id_curso_fk;
    }

    @Override
    public String toString() {
        return "inscripciones{" +
                "id_incripcion=" + id_incripcion +
                ", id_estudiante_fk=" + id_estudiante_fk +
                ", id_curso_fk=" + id_curso_fk +
                '}';
    }
}
