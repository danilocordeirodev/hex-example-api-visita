package maned.wolf.apicontrolevisita.infra;

import maned.wolf.apicontrolevisita.core.port.UsuarioRepositoryPort;
import maned.wolf.apicontrolevisita.core.port.UsuarioServicePort;
import maned.wolf.apicontrolevisita.core.service.UsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public UsuarioServicePort usuarioServiceImpl(UsuarioRepositoryPort usuarioRepositoryPort) {
        return new UsuarioService(usuarioRepositoryPort);
    }
}
