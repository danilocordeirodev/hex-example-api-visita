package maned.wolf.apicontrolevisita.adapter.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UsuarioEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String email;
    private String senha;
    private Boolean admistrador;
}