import java.util.ArrayList;
import java.util.Date;

public class Prestamo {
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private ArrayList<LineaPrestamo> lineas;

    public Prestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
        this.lineas = new ArrayList<>();
    }

    public void agregarLineaPrestamo(Ejemplar ejemplar) {
        if (ejemplar != null && ejemplar.estaDisponible()) {
            LineaPrestamo nuevaLinea = new LineaPrestamo();
            nuevaLinea.setEjemplar(ejemplar);
            //Fecha de devolucion estimada a 15 días
            nuevaLinea.setFechaDevolucionEstimada(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24 * 15));
            lineas.add(nuevaLinea);
        } else {
            System.out.println("El ejemplar no está disponible para préstamo.");
        }
    }

    public void mostrarPrestamo(){
        String devolucion = (fechaDevolucion==null) ? "No devuelto" : fechaDevolucion.toString();
        System.out.println("Fecha de prestamo: " + fechaPrestamo + "\nDevolucion: " + devolucion);
        System.out.println("Ejemplares prestados:");
        for (LineaPrestamo linea : lineas) {
            System.out.println("Ejemplar: " + linea.getEjemplar().getCodigo()  + " - " + linea.getEjemplar().getPublicacion().getTitulo() + " - Devolucion estimada " + linea.getFechaDevolucionEstimada());
        }
    }
}
