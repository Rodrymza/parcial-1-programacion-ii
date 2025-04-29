import java.util.ArrayList;

public class Libro extends Publicacion {
    private String isbn;
    private ArrayList<Autor> autores;
    private Editorial editorial;

    public Libro(String titulo, int anio, Genero genero, Editorial editorial, ArrayList<Autor> autores) {
        super(titulo, anio, genero);
        this.editorial = editorial;
        this.autores = autores;
    }
}
