public class Estudiantes {
    private Integer identificacion;
    private String nombre;
    private String apellido;
    private Integer semestre;

    public Estudiantes() {

    }

    public Estudiantes(Integer identificacion, String nombre, String apellido, Integer semestre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.semestre = semestre;
    }

    public Integer getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Integer identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido(String apellido) {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public String getApellido() {
        return apellido;
    }
}
