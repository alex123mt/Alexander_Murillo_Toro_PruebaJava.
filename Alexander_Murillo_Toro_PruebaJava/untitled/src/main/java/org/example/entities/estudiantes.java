package org.example.entities;

public class estudiantes {
    // private int id_Estudiante;
    private String email_Estudiante;
    private String estado;
    private String nombre;

    public estudiantes(){};

    public estudiantes( String emailEstudiante, String estado, String nombre) {
        // id_Estudiante = idEstudiante;
        email_Estudiante = emailEstudiante;
        this.estado = estado;
        this.nombre = nombre;
    }

   // public int getId_Estudiante() {
     //   return id_Estudiante;
    //}

    //public void setId_Estudiante(int id_Estudiante) {
    // this.id_Estudiante = id_Estudiante;
    // }

    public String getEmail_Estudiante() {
        return email_Estudiante;
    }

    public void setEmail_Estudiante(String email_Estudiante) {
        this.email_Estudiante = email_Estudiante;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "estudiantes :" +
                " Email_Estudiante:'" + email_Estudiante + '\'' +
                ", estado='" + estado + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}