package com.generalizacion;
public class Docente extends Persona {
    private String profesion;
    private String especialidad;
    private String nivelAcademico;

    public Docente(Dni dni, Double peso, Double talla, String profesion, String especialidad, String nivelAcademico) {
        super(dni, peso, talla);
        this.profesion = profesion;
        this.especialidad = especialidad;
        this.nivelAcademico = nivelAcademico;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }
}
