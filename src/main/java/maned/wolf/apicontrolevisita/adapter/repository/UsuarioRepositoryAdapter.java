package maned.wolf.apicontrolevisita.adapter.repository;

import lombok.RequiredArgsConstructor;
import maned.wolf.apicontrolevisita.adapter.repository.entity.PessoaEntity;
import maned.wolf.apicontrolevisita.adapter.repository.entity.UsuarioEntity;
import maned.wolf.apicontrolevisita.core.domain.Pessoa;
import maned.wolf.apicontrolevisita.core.domain.Usuario;
import maned.wolf.apicontrolevisita.core.port.UsuarioRepositoryPort;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPort {
    private final UsuarioRepository usuarioRepository;
    private final PessoaRepository pessoaRepository;
    private final ModelMapper modelMapper;

    @Override
    public Usuario create(Usuario usuario) {
        UsuarioEntity usuarioEntity = modelMapper.map(usuario, UsuarioEntity.class);
        usuarioEntity.setPessoaEntity(createPessoa(usuario.getPessoa()));
        return modelMapper
                .map(usuarioRepository
                        .save(usuarioEntity), Usuario.class);
    }

    private PessoaEntity createPessoa(Pessoa pessoa) {
        return pessoaRepository.save(modelMapper.map(pessoa, PessoaEntity.class));
    }
}
