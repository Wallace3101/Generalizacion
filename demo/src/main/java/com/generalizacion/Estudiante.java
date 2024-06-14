package com.generalizacion;

public class Estudiante extends Persona{

    private String codigo;
    private String programaAcad;

    public Estudiante(Dni dni, Double peso, Double talla) {
        super(dni, peso, talla);
    }

    public Estudiante(Dni dni, Double peso, Double talla, String codigo, String programaAcad) {
        super(dni, peso, talla);
        this.codigo = codigo;
        this.programaAcad = programaAcad;
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
