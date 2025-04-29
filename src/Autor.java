import java.util.Date;

public class Autor {
    private String nombre;
    private String nacionalidad;
    private Date fechaNacimiento;

    public Autor(String nombre, String nacionalidad, Date fechaNacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }
}
