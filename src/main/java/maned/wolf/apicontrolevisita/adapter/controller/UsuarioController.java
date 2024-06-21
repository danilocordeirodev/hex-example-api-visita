package maned.wolf.apicontrolevisita.adapter.controller;

import lombok.RequiredArgsConstructor;
import maned.wolf.apicontrolevisita.adapter.converter.UsuarioConverter;
import maned.wolf.apicontrolevisita.adapter.dto.UsuarioRequest;
import maned.wolf.apicontrolevisita.adapter.dto.UsuarioResponse;
import maned.wolf.apicontrolevisita.core.port.UsuarioServicePort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioServicePort usuarioServicePort;
    private final UsuarioConverter usuarioConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioResponse create(@RequestBody UsuarioRequest usuarioRequest) {
        return usuarioConverter.toResponse(usuarioServicePort.createUsuario(usuarioConverter.toDomain(usuarioRequest)));
    }
}
