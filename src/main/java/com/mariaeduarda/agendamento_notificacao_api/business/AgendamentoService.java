package com.mariaeduarda.agendamento_notificacao_api.business;

import org.springframework.stereotype.Service;

import com.mariaeduarda.agendamento_notificacao_api.business.mapper.IAgendamentoMapper;
import com.mariaeduarda.agendamento_notificacao_api.controller.dto.in.AgendamentoRecord;
import com.mariaeduarda.agendamento_notificacao_api.controller.dto.out.AgendamentoRecordOut;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AgendamentoService {

    private final AgendamentoRepository repository;

    private final IAgendamentoMapper agendamentoMapper;

    public AgendamentoRecordOut gravarAgendamento (AgendamentoRecord agendamento){
        return agendamentoMapper.paraOut(repository.save(agendamentoMapper.paraEntity(agendamento)));
    }
}
