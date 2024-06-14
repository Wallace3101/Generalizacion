package com.generalizacion;

public class ControladorEstudiante {
    private int indice;
    private Estudiante[] estudiantes;

    public ControladorEstudiante(int capacidad) {
        this.estudiantes = new Estudiante[capacidad];
        this.indice = 0;
    }

    public void agregarEstudiante(Estudiante e) {
        if (indice < estudiantes.length) {
            estudiantes[indice] = e;
            indice++;
        } else {
            System.out.println("Capacidad máxima alcanzada");
        }
    }

    public String buscar(String codigo) {
        for (int i = 0; i < indice; i++) {
            if (estudiantes[i].getCodigo().equals(codigo)) {
                return "Estudiante encontrado: " + 
                    "\n     NOMBRE Y APELLIDO: " + estudiantes[i].getDni().getPrimerApellido() + " " + 
                    estudiantes[i].getDni().getSegundoApellido() + " " +
                    estudiantes[i].getDni().getNombre() +
                    "\n     CODIGO: " + estudiantes[i].getCodigo() +
                    "\n     PROGRAMA ACADEMICO: " + estudiantes[i].getProgramaAcad();
            }
        }
        return "Estudiante no encontrado";
    }

    public void editar(int index, String codigo, String programaAcad) {
        if (index >= 0 && index < indice) {
            System.out.println("\nEstudiante a actualizar: " + 
                "\n     NOMBRE Y APELLIDO: " + estudiantes[index].getDni().getPrimerApellido() + " " + 
                estudiantes[index].getDni().getSegundoApellido() + " " + 
                estudiantes[index].getDni().getNombre()
            );
            
        } else {
            System.out.println("Índice fuera de rango");
        }

        System.out.println("\nInformacion de estudiante actualizado: " + 
            "\n     NOMBRE Y APELLIDO: " + estudiantes[index].getDni().getPrimerApellido() + " " + 
            estudiantes[index].getDni().getSegundoApellido() + " " + 
            estudiantes[index].getDni().getNombre() + 
            "\n     CODIGO: " + estudiantes[index].getCodigo() + 
            "\n     PROGRAMA ACADEMICO: " + estudiantes[index].getProgramaAcad()
        );
    }

    public void ordenar() {
        for (int i = 0; i < indice - 1; i++) {
            for (int j = 0; j < indice - i - 1; j++) {
                if (estudiantes[j].getDni().getPrimerApellido().compareTo(estudiantes[j + 1].getDni().getPrimerApellido()) > 0) {
                    Estudiante temp = estudiantes[j];
                    estudiantes[j] = estudiantes[j + 1];
                    estudiantes[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < indice; i++) {
            System.out.println(
                "Estudiante " + (i + 1) + ": " + 
                "\n     NOMBRE Y APELLIDO: " + estudiantes[i].getDni().getPrimerApellido() + " " + 
                estudiantes[i].getDni().getSegundoApellido() + " " + 
                estudiantes[i].getDni().getNombre() + 
                "\n     CODIGO: " + estudiantes[i].getCodigo() + 
                "\n     PROGRAMA ACADEMICO: " + estudiantes[i].getProgramaAcad()
            );
        }
    
    }

    public void listarEstudiantes() {
        for (int i = 0; i < indice; i++) {
            System.out.println(
                "Estudiante " + (i + 1) + ": " + 
                "\n     NOMBRE Y APELLIDO: " + estudiantes[i].getDni().getPrimerApellido() + " " + 
                estudiantes[i].getDni().getSegundoApellido() + " " + 
                estudiantes[i].getDni().getNombre() + 
                "\n     CODIGO: " + estudiantes[i].getCodigo() + 
                "\n     PROGRAMA ACADEMICO: " + estudiantes[i].getProgramaAcad()
            );
        }
    }
}
