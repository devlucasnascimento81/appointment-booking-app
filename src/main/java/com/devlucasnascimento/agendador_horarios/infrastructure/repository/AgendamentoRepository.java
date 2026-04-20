package com.devlucasnascimento.agendador_horarios.infrastructure.repository;

import com.devlucasnascimento.agendador_horarios.infrastructure.repository.entity.AgendamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<AgendamentoEntity, Long> {
}
