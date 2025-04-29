import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Publicacion> publicaciones;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.publicaciones = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void agregarPublicacion(Publicacion publicacion) {
        publicaciones.add(publicacion);
    }

}
