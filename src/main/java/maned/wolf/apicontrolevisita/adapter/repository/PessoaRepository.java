package maned.wolf.apicontrolevisita.adapter.repository;

import maned.wolf.apicontrolevisita.adapter.repository.entity.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {
}
