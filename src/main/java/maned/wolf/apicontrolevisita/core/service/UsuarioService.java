package maned.wolf.apicontrolevisita.core.service;

import maned.wolf.apicontrolevisita.core.domain.Usuario;
import maned.wolf.apicontrolevisita.core.port.UsuarioServicePort;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements UsuarioServicePort {
    @Override
    public Usuario createUsuario(Usuario usuario) {
        return usuario;
    }
}
