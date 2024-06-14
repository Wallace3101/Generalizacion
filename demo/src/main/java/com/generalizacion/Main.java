package com.generalizacion;

public class Main {
    public static void main(String[] args) {
        Dni dni01 = new Dni("Mendoza","Villanueva", "Mayra", "375934");
        Dni dni02 = new Dni("Soria","Blas", "Diana", "375934");

        Persona persona01 = new Persona(dni01, 50.0, 1.60);
        Persona persona02 = new Persona(dni02, 51.0, 1.60);

    // ESTUDIANTES: 
        /*Estudiante estudiante01 = new Estudiante(persona01, "2022110545", "Ing. de Sistemas e Informatica");
        System.out.println(estudiante01);
        Estudiante estudiante02 = new Estudiante(persona02, "2022110549", "Ing. de Sistemas e Informatica");
        System.out.println(estudiante02);

        ControladorEstudiante controladorEstudiante = new ControladorEstudiante(10);

        // Agregar estudiantes
        controladorEstudiante.agregarEstudiante(estudiante01);
        controladorEstudiante.agregarEstudiante(estudiante02);

        // Listar lista de estudiantes
        System.out.println("\nLista de estudiantes:");
        controladorEstudiante.listarEstudiantes();

        // Buscar un estudiante
        System.out.println("\nBuscar estudiante por su codigo:");
        System.out.println(controladorEstudiante.buscar("2022110545"));

        // Editar un estudiante
        controladorEstudiante.editar(0, "2022110540", "Educacion");

        // Ordenar estudiantes
        System.out.println("\nLista de estudiantes ordenados:");
        controladorEstudiante.ordenar();*/


    // DOCENTES:
        Dni dni03 = new Dni("Rivera", "Dueñas", "Lizbardo", "60609764");
        Dni dni04 = new Dni("Baldeon", "Canchaya", "Walter", "60559769");

        Persona persona03 = new Persona(dni03, 50.0, 1.60);
        Persona persona04 = new Persona(dni04, 51.0, 1.60);

        Docente docente01 = new Docente(persona03, "Ingeniero de Sistemas", "Desarrollo de Software", "Maestria");
        System.out.println(docente01);
        Docente docente02 = new Docente(persona04, "Ingeniero Electronico", "Automatizacion", "Doctorado");
        System.out.println(docente02);

        ControladorDocente controladorDocente = new ControladorDocente(10);

        // Agregar docentes
        controladorDocente.agregarDocente(docente01);
        controladorDocente.agregarDocente(docente02);

        // Listar docentes
        System.out.println("\nLista de Docentes:");
        controladorDocente.listarDocentes();

        // Buscar un docente
        System.out.println("\nBuscar Docente:");
        System.out.println(controladorDocente.buscar("Ingeniero Electronico"));

        // Editar un docente
        controladorDocente.editar(0, "Física", "Termodinámica", "Doctorado");

        // Ordenar docentes
        System.out.println("\nLista de docentes ordenados:");
        controladorDocente.ordenar();
    }
}