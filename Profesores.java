public class Profesores {
    private Integer identificacion;
    private String nombre;
    private String apellido;
    private Integer contrato;

    public Profesores() {

    }

    public Profesores(Integer identificacion, String nombre, String apellido, Integer contrato) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrato = contrato;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getContrato() {
        return contrato;
    }

    public void setContrato(Integer contrato) {
        this.contrato = contrato;
    }
    public void tipoContrato(Integer contrato){
        if(contrato == 1) {
            System.out.println("Es contrato de tiempo completo");
        }else if(contrato == 2){
            System.out.println("Es contrato de catedra");
        }
        else{
            System.out.println("Error");
        }
    }

    public void setNota(int nota) {
    }
}
