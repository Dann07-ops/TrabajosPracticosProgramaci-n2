
package trabajopractico6coleccionescasopractico3;


public class TrabajoPractico6ColeccionesCasoPractico3 {

   
    public static void main(String[] args) {
        // 1. Crear profesores
        Profesor p1 = new Profesor("P001", "Ana Torres", "Matemática");
        Profesor p2 = new Profesor("P002", "Luis Gómez", "Programación");
        Profesor p3 = new Profesor("P003", "María López", "Física");

        // 2. Crear cursos
        Curso c1 = new Curso("C101", "Álgebra");
        Curso c2 = new Curso("C102", "Programación I");
        Curso c3 = new Curso("C103", "Física I");
        Curso c4 = new Curso("C104", "Estadística");
        Curso c5 = new Curso("C105", "Programación II");

        // 3. Crear universidad y agregar profesores y cursos
        Universidad universidad = new Universidad("UTN Berazategui");
        universidad.agregarProfesor(p1);
        universidad.agregarProfesor(p2);
        universidad.agregarProfesor(p3);

        universidad.agregarCurso(c1);
        universidad.agregarCurso(c2);
        universidad.agregarCurso(c3);
        universidad.agregarCurso(c4);
        universidad.agregarCurso(c5);

        // 4. Asignar profesores a cursos
        universidad.asignarProfesorACurso("C101", "P001"); // Álgebra → Ana
        universidad.asignarProfesorACurso("C102", "P002"); // Programación I → Luis
        universidad.asignarProfesorACurso("C103", "P003"); // Física I → María
        universidad.asignarProfesorACurso("C104", "P001"); // Estadística → Ana
        universidad.asignarProfesorACurso("C105", "P002"); // Programación II → Luis

        // 5. Listar cursos con su profesor
        System.out.println("Cursos con sus profesores:");
        universidad.listarCursos();

        // 6. Listar profesores con sus cursos
        System.out.println("Profesores con sus cursos:");
        universidad.listarProfesores();

        // 7. Cambiar el profesor de un curso
        System.out.println("Reasignando 'Programación II' a María...");
        universidad.asignarProfesorACurso("C105", "P003"); // antes era Luis
        universidad.listarCursos();
        universidad.listarProfesores();

        // 8. Eliminar un curso y verificar que se quita del profesor
        System.out.println("Eliminando curso 'C104' (Estadística)...");
        universidad.eliminarCurso("C104");
        universidad.listarProfesores();

        // 9. Eliminar un profesor y dejar sus cursos sin responsable
        System.out.println("Eliminando profesor Luis Gómez...");
        universidad.eliminarProfesor("P002");
        universidad.listarCursos();

        // 10. Mostrar reporte de cantidad de cursos por profesor
        System.out.println("Reporte de cursos por profesor:");
        universidad.mostrarReporteCursosPorProfesor();
    }
    
}
