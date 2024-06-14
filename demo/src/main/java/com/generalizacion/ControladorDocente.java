package com.generalizacion;


public class ControladorDocente {
    private int indice;
    private Docente[] docentes;

    public ControladorDocente(int capacidad) {
        this.docentes = new Docente[capacidad];
        this.indice = 0;
    }

    public void agregarDocente(Docente d) {
        if (indice < docentes.length) {
            docentes[indice] = d;
            indice++;
        } else {
            System.out.println("Capacidad máxima alcanzada");
        }
    }

    public String buscar(String profesion) {
        for (int i = 0; i < indice; i++) {
            if (docentes[i].getProfesion().equals(profesion)) {
                return "Docente encontrado: " + 
                    "\n     NOMBRE Y APELLIDO: " + docentes[i].getDni().getPrimerApellido() + " " + 
                    docentes[i].getDni().getSegundoApellido() + " " +
                    docentes[i].getDni().getNombre() +
                    "\n     PROFESION: " + docentes[i].getProfesion() +
                    "\n     ESPECIALIDAD: " + docentes[i].getEspecialidad() + 
                    "\n     NIVEL ACADEMICO: " + docentes[i].getNivelAcademico();
            }
        }
        return "Docente no encontrado";
    }

    public void editar(int index, String profesion, String especialidad, String nivelAcademico) {
        if (index >= 0 && index < indice) {
            System.out.println("\nDocente a editar: " + 
                "\n     NOMBRE Y APELLIDO: " + docentes[index].getDni().getPrimerApellido() + " " + 
                docentes[index].getDni().getSegundoApellido() + " " + 
                docentes[index].getDni().getNombre()
            );
        } else {
            System.out.println("Índice fuera de rango");
        }

        System.out.println("\nDocente editado: " + 
            "\n     NOMBRE Y APELLIDO: " + docentes[index].getDni().getPrimerApellido() + " " + 
            docentes[index].getDni().getSegundoApellido() + " " + 
            docentes[index].getDni().getNombre() + 
            "\n     PROFESION: " + docentes[index].getProfesion() + 
            "\n     ESPECIALIDAD: " + docentes[index].getEspecialidad() + 
            "\n     NIVEL ACADEMICO: " + docentes[index].getNivelAcademico()
        );
    }

    public void ordenar() {
        for (int i = 0; i < indice - 1; i++) {
            for (int j = 0; j < indice - i - 1; j++) {
                if (docentes[j].getDni().getPrimerApellido().compareTo(docentes[j + 1].getDni().getPrimerApellido()) > 0) {
                    Docente temp = docentes[j];
                    docentes[j] = docentes[j + 1];
                    docentes[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < indice; i++) {
            System.out.println(
                "\nDocente "+ (i+1) +": " + 
                "\n     NOMBRE Y APELLIDO: " + docentes[i].getDni().getPrimerApellido() + " " + 
                docentes[i].getDni().getSegundoApellido() + " " + 
                docentes[i].getDni().getNombre() + 
                "\n     PROFESION: " + docentes[i].getProfesion() + 
                "\n     ESPECIALIDAD: " + docentes[i].getEspecialidad() + 
                "\n     NIVEL ACADEMICO: " + docentes[i].getNivelAcademico()
            );
        }
    }

    public void listarDocentes() {
        for (int i = 0; i < indice; i++) {
            System.out.println(
                "Docente "+ (i+1) +": " + 
                "\n     NOMBRE Y APELLIDO: " + docentes[i].getDni().getPrimerApellido() + " " + 
                docentes[i].getDni().getSegundoApellido() + " " + 
                docentes[i].getDni().getNombre() + 
                "\n     PROFESION: " + docentes[i].getProfesion() + 
                "\n     ESPECIALIDAD: " + docentes[i].getEspecialidad() + 
                "\n     NIVEL ACADEMICO: " + docentes[i].getNivelAcademico()
            );
        }
    }
}
