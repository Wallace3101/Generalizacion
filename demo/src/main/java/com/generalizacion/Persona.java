package com.generalizacion;

public class Persona {
    protected Dni dni;
    protected Double peso;
    protected Double talla;

    /*public Persona() {

    }*/

    public Persona(Dni dni, Double peso, Double talla) {
        this.dni = dni;
        this.peso = peso;
        this.talla = talla;
    }

    protected Dni getDni() {
        return dni;
    }

    protected void setDni(Dni dni) {
        this.dni = dni;
    }

    protected Double getPeso() {
        return peso;
    }

    protected void setPeso(Double peso) {
        this.peso = peso;
    }

    protected Double getTalla() {
        return talla;
    }

    protected void setTalla(Double talla) {
        this.talla = talla;
    }
}
