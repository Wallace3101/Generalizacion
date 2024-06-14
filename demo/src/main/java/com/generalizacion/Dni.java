package com.generalizacion;

public class Dni {
    private String primerApellido;
    private String segundoApellido;
    private String nombre;
    private String numero;

    public Dni() {

    }

    public Dni(String primerApellido, String segundoApellido, String nombre, String numero) {
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}

