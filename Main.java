import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main (String [] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        int opcion;
        List<Estudiantes> estudiantes = new ArrayList<Estudiantes>();
        List<Profesores> profesores = new ArrayList<Profesores>();
        List<Asignatura> asignaturas = new ArrayList<Asignatura>();
        do {
            System.out.println("Ingrese una opcion");
            System.out.println("Digite 1 para registrarse como estudiante");
            System.out.println("Digite 2 para mostrar estudiantes registrados");
            System.out.println("Digite 3 para buscar estudiantes");
            System.out.println("========");
            System.out.println("Digite 4 para registrarse como docente");
            System.out.println("Digite 5 para mostrar docentes registrados");
            System.out.println("Digite 6 para buscar docentes");
            System.out.println("========");
            System.out.println("Digite 7 para registrar una asignatura");
            System.out.println("Digite 8 para mostrar las materias registradas");
            System.out.println("Digite 9 para buscar materias");
            System.out.println("========");
            System.out.println("Digite 0 para salir");
            opcion = scan.nextInt();
            switch (opcion){
                case 1:
                    try {
                        System.out.println("Ingrese la id: ");
                        int id = scan.nextInt();
                        System.out.println("Ingrese su nombre: ");
                        String nombre = scan.next();
                        System.out.println("Ingrese su apellido: ");
                        String apellido = scan.next();
                        System.out.println("Ingrese el semestre: ");
                        Integer semestre = scan.nextInt();
                        Estudiantes est = new Estudiantes();
                        est.setIdentificacion(Math.toIntExact(id));
                        est.setNombre(nombre);
                        est.setApellido(apellido);
                        est.setSemestre(semestre);
                        estudiantes.add(est);
                    } catch (Exception e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                        estudiantes.forEach((c) -> System.out.println("Identificacion : " + c.getIdentificacion() + "," +
                                " Nombre: " + c.getNombre() + ", Apellido: " + c.getApellido() + ", Semestre: " + c.getSemestre()));
                        break;
                case 3:
                    System.out.println("Ingrese el nombre a buscar: ");
                    String texto = scan.next();
                    try {
                        List<Estudiantes> est1 = (List<Estudiantes>) estudiantes.stream()
                                .filter(v -> v.getNombre().startsWith(texto))
                                .collect(Collectors.toList());
                        est1.forEach((v) -> System.out.println("Id: " + v.getIdentificacion() + ", Nombre: "
                                + v.getNombre() + ", Apellido: " + v.getApellido() + ", Semestre: " + v.getSemestre()));
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        System.out.println("Ingrese la id: ");
                        int id = scan.nextInt();
                        System.out.println("Ingrese su nombre: ");
                        String nombre = scan.next();
                        System.out.println("Ingrese su apellido: ");
                        String apellido = scan.next();
                        System.out.println("Ingrese el contrato 1 si es tiempo completo o 2 si es catedra: ");
                        Integer contrato = scan.nextInt();
                        Profesores pro = new Profesores();
                        pro.setIdentificacion(Math.toIntExact(id));
                        pro.setNombre(nombre);
                        pro.setApellido(apellido);
                        pro.setContrato(contrato);
                        profesores.add(pro);
                    } catch (Exception e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 5:
                    profesores.forEach((c) -> System.out.println("Identificacion : " + c.getIdentificacion() + "," +
                            " Nombre: " + c.getNombre() + ", Apellido: " + c.getApellido() + ", Contrato: " + c.getContrato()));
                    break;
                case 6:
                    System.out.println("Ingrese el nombre a buscar: ");
                    String texto1 = scan.next();
                    try {
                        List<Profesores> pro1 = (List<Profesores>) profesores.stream()
                                .filter(v -> v.getNombre().startsWith(texto1))
                                .collect(Collectors.toList());
                        pro1.forEach((v) -> System.out.println("Id: " + v.getIdentificacion() + ", Nombre: "
                                + v.getNombre() + ", Apellido: " + v.getApellido() + ", Contrato: " + v.getContrato()));
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 7:
                    try{
                        System.out.println("Digite el nombre de la asignatura");
                        String asignatura = scan.next();
                        System.out.println("Digite el nombre del docente");
                        String docente = scan.next();
                        System.out.println("Digite el nombre del estudiante");
                        String estudiante = scan.next();
                        System.out.println("Digite la nota");
                        float nota = scan.nextFloat();
                        Asignatura asi = new Asignatura();
                        asi.setNota(nota);
                        asi.setAsignatura(asignatura);
                        asi.setProfesores(docente);
                        asi.setEstudiantes(estudiante);
                        asi.calificacion(nota);
                        asignaturas.add(asi);
                    } catch (Exception e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 8:
                    asignaturas.forEach((c) -> System.out.println("Asignatura : " + c.getAsignatura() + "," +
                            " Nombre estudiante: " + c.getEstudiantes() + ", Nombre docente: " + c.getProfesores() + ", Nota: " + c.getNota()));
                    break;
                case 9:
                    System.out.println("Ingrese el nombre de la materia a buscar: ");
                    String texto2 = scan.next();
                    try {
                        List<Asignatura> asi = (List<Asignatura>) asignaturas.stream()
                                .filter(v -> v.getAsignatura().startsWith(texto2))
                                .collect(Collectors.toList());
                        asi.forEach((v) -> System.out.println("Asignatura: " + v.getAsignatura() + ", Nombre del estudiante: "
                                + v.getEstudiantes() + ", Nombre del docente: " + v.getProfesores() + ", Nota: " + v.getNota()));
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
            }
        } while (opcion != 0);
    }
}
