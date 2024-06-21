package maned.wolf.apicontrolevisita.adapter.repository;

import lombok.RequiredArgsConstructor;
import maned.wolf.apicontrolevisita.adapter.repository.entity.UsuarioEntity;
import maned.wolf.apicontrolevisita.core.domain.Usuario;
import maned.wolf.apicontrolevisita.core.port.UsuarioRepositoryPort;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPort {
    private final UsuarioRepository usuarioRepository;
    private final ModelMapper modelMapper;

    @Override
    public Usuario create(Usuario usuario) {
        return modelMapper
                .map(usuarioRepository
                        .save(modelMapper.map(usuario, UsuarioEntity.class)), Usuario.class);
    }
}
