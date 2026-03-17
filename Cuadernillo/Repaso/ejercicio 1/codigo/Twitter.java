package RepasoEjercicio1;

import java.util.ArrayList;
import java.util.List;

public class Twitter {

    private List<Usuario> usuarios;

    public Twitter() {
        this.usuarios = new ArrayList<>();
    }

    private Usuario buscarUsuario(String userName) {
        return this.usuarios.stream()
                .filter(u -> u.getUserName().equals(userName))
                .findFirst()
                .orElse(null);
    }

    public boolean existeUsuario(String userName) {
        return (this.buscarUsuario(userName) != null);
    }

    public void agregarUsuario(String userName) {
        if (this.existeUsuario(userName))
            throw new IllegalArgumentException("El usuario " + userName + " ya existe");
        this.usuarios.add(new Usuario(userName));
    }

    public void eliminarUsuario(String userName) { // 3 pasos de eliminacion.
        Usuario usuario = this.buscarUsuario(userName);
        if (usuario == null)
            throw new IllegalArgumentException("El usuario " + userName + " no existe");
        usuario.eliminarPublicaciones();
        this.usuarios.remove(usuario); //3
    }


}

