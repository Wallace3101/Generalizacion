package com.generalizacion;
public class Docente extends Persona {
    private String profesion;
    private String especialidad;
    private String nivelAcademico;

    public Docente(Persona persona, String profesion, String especialidad, String nivelAcademico) {
        super(persona.getDni(), persona.getPeso(), persona.getTalla());
        this.profesion = profesion;
        this.especialidad = especialidad;
        this.nivelAcademico = nivelAcademico;
    }

    @Override
    public String toString() {
        return "Docente: "+
            "\n     NOMBRE: "+this.getDni().getPrimerApellido()+" "+
            this.getDni().getSegundoApellido()+" "+
            this.getDni().getNombre()+
            "\n     N° DNI: "+this.getDni().getNumero()+
            "\n     PESO: "+this.getPeso()+
            "\n     TALLA: "+this.getTalla()+
            "\n     CODIGO: "+this.getProfesion()+
            "\n     PROGRAMA ACADEMICO: "+this.getEspecialidad()+ 
            "\n     NIVEL ACADEMICO: "+this.getNivelAcademico();
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
