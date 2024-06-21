package maned.wolf.apicontrolevisita.core.service;

import maned.wolf.apicontrolevisita.core.domain.Usuario;
import maned.wolf.apicontrolevisita.core.port.UsuarioRepositoryPort;
import maned.wolf.apicontrolevisita.core.port.UsuarioServicePort;

public class UsuarioService implements UsuarioServicePort {

    private final UsuarioRepositoryPort usuarioRepositoryPort;

    public UsuarioService(UsuarioRepositoryPort usuarioRepositoryPort) {
        this.usuarioRepositoryPort = usuarioRepositoryPort;
    }


    @Override
    public Usuario createUsuario(Usuario usuario) {
        return usuarioRepositoryPort.create(usuario);
    }
}
