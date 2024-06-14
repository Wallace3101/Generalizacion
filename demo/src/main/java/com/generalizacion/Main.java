package com.generalizacion;

public class Main {
    public static void main(String[] args) {
        Dni dni01 = new Dni("Mendoza","Villanueva", "Mayra", "375934");
        Dni dni02 = new Dni("Soria","Blas", "Diana", "375934");

        Persona persona01 = new Persona(dni01, 50.0, 1.60);
        Persona persona02 = new Persona(dni02, 51.0, 1.60);

    // ESTUDIANTES: 
        Estudiante estudiante01 = new Estudiante(persona01, "2022110545", "Ing. de Sistemas e Informatica");
        System.out.println(estudiante01);
        

        Estudiante estudiante02 = new Estudiante(persona02, "2022110549", "Ing. de Sistemas e Informatica");
        System.out.println(estudiante02);

        ControladorEstudiante controlador = new ControladorEstudiante(10);

        // Agregar estudiantes
        controlador.agregarEstudiante(estudiante01);
        controlador.agregarEstudiante(estudiante02);

        // Listar lista de estudiantes
        System.out.println("\nLista de estudiantes:");
        controlador.listarEstudiantes();

        // Buscar un estudiante
        System.out.println("\nBuscar estudiante por su codigo:");
        System.out.println(controlador.buscar("2022110545"));

        // Editar un estudiante
        controlador.editar(0, "2022110540", "Educacion");

        // Ordenar estudiantes
        System.out.println("\nLista de estudiantes ordenados:");
        controlador.ordenar();


    // DOCENTES:
        /*Dni dni03 = new Dni("Rivera", "Dueñas", "Lizbardo", "60609764");
        Dni dni04 = new Dni("Baldeon", "Canchaya", "Walter", "60559769");

        Docente docente01 = new Docente(
            dni03, 
            70.0, 
            1.75, 
            "Ing. de Sistemas e Informática", 
            "Calculo III", 
            "Ingeniero"
        );
        System.out.println(
            "Docente: "+
            "\n" + docente01.getDni().getPrimerApellido() + " " +
            docente01.getDni().getSegundoApellido() + " " +
            docente01.getDni().getNombre() +
            "\nN° DNI: " + docente01.getDni().getNumero() +
            "\nPESO: " + docente01.getPeso() +
            "\nTALLA: " + docente01.getTalla()+
            "\nPROFESION: " + docente01.getProfesion() +
            "\nESPECIALIDAD: " + docente01.getEspecialidad() +
            "\nNIVEL ACADEMICO: " + docente01.getNivelAcademico()
            
        );

        Docente docente02 = new Docente(dni04, 
            60.0, 
            1.65, 
            "Ingeniero elctronico", 
            "Redes y telecomunicaciones", 
            "Doctorado"
        );
        System.out.println(
            "\nDocente: "+
            "\n" + docente02.getDni().getPrimerApellido() + " " +
            docente02.getDni().getSegundoApellido() + " " +
            docente02.getDni().getNombre() +
            "\nN° DNI: " + docente02.getDni().getNumero() +
            "\nPESO: " + docente02.getPeso() +
            "\nTALLA: " + docente02.getTalla() +
            "\nPROFESION: " + docente02.getProfesion() +
            "\nESPECIALIDAD: " + docente02.getEspecialidad() +
            "\nNIVEL ACADEMICO: " + docente02.getNivelAcademico()
        );

        ControladorDocente controlador = new ControladorDocente(10);

        // Agregar docentes
        controlador.agregarDocente(docente01);
        controlador.agregarDocente(docente02);

        // Listar docentes
        System.out.println("\nLista de Docentes:");
        controlador.listarDocentes();

        // Buscar un docente
        System.out.println("\nBuscar Docente:");
        System.out.println(controlador.buscar("Ingeniero elctronico"));

        // Editar un docente
        controlador.editar(0, "Física", "Termodinámica", "Doctorado");

        // Ordenar docentes
        controlador.ordenar();*/
    }
}