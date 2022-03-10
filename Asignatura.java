public class Asignatura {
    private String asignatura;
    private String estudiantes;
    private String profesores;
    private Float nota;

    public Asignatura() {

    }

    public Asignatura(String asignatura, String estudiantes, String profesores, Float nota) {
        this.asignatura = asignatura;
        this.estudiantes = estudiantes;
        this.profesores = profesores;
        this.nota = nota;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(String estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String getProfesores() {
        return profesores;
    }

    public void setProfesores(String profesores) {
        this.profesores = profesores;
    }

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }

    public void calificacion (Float nota) throws Excepciones {
        if(nota < 0){
            throw new Excepciones("La nota no es valida");
        }else if(nota >5){
            throw new Excepciones("La nota no es valida");
        }
    }
}
