package maned.wolf.apicontrolevisita.adapter.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UsuarioResponse {
    private Long id;
    private String nome;
    private String email;
    private Boolean admistrador;
}
