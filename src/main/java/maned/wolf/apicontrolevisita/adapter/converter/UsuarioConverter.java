package maned.wolf.apicontrolevisita.adapter.converter;

import maned.wolf.apicontrolevisita.adapter.dto.UsuarioRequest;
import maned.wolf.apicontrolevisita.adapter.dto.UsuarioResponse;
import maned.wolf.apicontrolevisita.core.domain.Pessoa;
import maned.wolf.apicontrolevisita.core.domain.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioConverter {
    public Usuario toDomain(UsuarioRequest usuarioRequest) {
        return new Usuario(usuarioRequest.getId(),
                usuarioRequest.getEmail(),
                usuarioRequest.getSenha(),
                usuarioRequest.getAdmistrador(),
                new Pessoa(null, usuarioRequest.getNome()));
    }

    public UsuarioResponse toResponse(Usuario usuario) {
        return new UsuarioResponse(usuario.getId(),
                usuario.getPessoa().getNome(),
                usuario.getEmail(),
                usuario.getAdmistrador());
    }
}
