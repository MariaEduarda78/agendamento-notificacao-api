package com.mariaeduarda.agendamento_notificacao_api.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariaeduarda.agendamento_notificacao_api.infrastructure.entities.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {

}
