package com.generalizacion;

public class Main {
    public static void main(String[] args) {
        Dni dni01 = new Dni("Mendoza","Villanueva", "Mayra", "375934");
        Dni dni02 = new Dni("Soria","Blas", "Diana", "375934");

        //Persona persona = new Persona(dni, 50.0, 1.60);
        //Persona persona2 = new Persona(dni2, 51.0, 1.60);
        
        // ESTUDIANTES: 
        Estudiante estudiante01 = new Estudiante(dni01, 50.0, 1.55, "2022110545", "Ing. de Sistemas e Informatica");
        System.out.println(
            "Estudiante: "+
            "\n"+estudiante01.getDni().getPrimerApellido()+" "+
            estudiante01.getDni().getSegundoApellido()+" "+
            estudiante01.getDni().getNombre()+
            "\nN° DNI: "+estudiante01.getDni().getNumero()+
            "\nPESO: "+estudiante01.getPeso()+
            "\nTALLA: "+estudiante01.getTalla()+
            "\nCODIGO: "+estudiante01.getCodigo()+
            "\nPROGRAMA ACADEMICO: "+estudiante01.getProgramaAcad()
        );

        Estudiante estudiante02 = new Estudiante(dni02, 51.0, 1.60, "2022110549", "Ing. de Sistemas e Informatica");
        System.out.println("\nEstudiante: "+
            "\n"+estudiante02.getDni().getPrimerApellido()+" "+
            estudiante02.getDni().getSegundoApellido()+" "+
            estudiante02.getDni().getNombre()+
            "\nN° DNI: "+estudiante02.getDni().getNumero()+
            "\nPESO: "+estudiante02.getPeso()+
            "\nTALLA: "+estudiante02.getTalla()+
            "\nCODIGO: "+estudiante02.getCodigo()+
            "\nPROGRAMA ACADEMICO: "+estudiante02.getProgramaAcad()
        );
        ControladorEstudiante controlador = new ControladorEstudiante(10);

        // Agregar docentes
        controlador.agregarEstudiante(estudiante01);
        controlador.agregarEstudiante(estudiante01);

        // Listar docentes
        System.out.println("\nLista de estudiantes:");
        controlador.listarEstudiantes();

        // Buscar un docente
        System.out.println("\nBuscar estudiante:");
        System.out.println(controlador.buscar("2022110545"));

        // Editar un docente
        controlador.editar(0, "2022110540", "Educacion");

        // Ordenar docentes
        System.out.println("\nLista de estudiantes ordenados:");
        controlador.ordenar();


        /*// DOCENTES:
        Dni dni03 = new Dni("Rivera", "Dueñas", "Lizbardo", "60609764");
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