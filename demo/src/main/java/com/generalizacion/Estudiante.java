package com.generalizacion;

public class Estudiante extends Persona{

    private String codigo;
    private String programaAcad;

    public Estudiante(Persona persona, String codigo, String programaAcad) {
        super(persona.getDni(), persona.getPeso(), persona.getTalla());
        this.codigo = codigo;
        this.programaAcad = programaAcad;
    }
    @Override
    public String toString() {
        return "Estudiante: "+
            "\n     NOMBRE: "+this.getDni().getPrimerApellido()+" "+
            this.getDni().getSegundoApellido()+" "+
            this.getDni().getNombre()+
            "\n     N° DNI: "+this.getDni().getNumero()+
            "\n     PESO: "+this.getPeso()+
            "\n     TALLA: "+this.getTalla()+
            "\n     CODIGO: "+this.getCodigo()+
            "\n     PROGRAMA ACADEMICO: "+this.getProgramaAcad();
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProgramaAcad() {
        return programaAcad;
    }

    public void setProgramaAcad(String programaAcad) {
        this.programaAcad = programaAcad;
    }
}
