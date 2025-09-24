package com.mariaeduarda.agendamento_notificacao_api.business.mapper;

import org.mapstruct.Mapper;

import com.mariaeduarda.agendamento_notificacao_api.controller.dto.in.AgendamentoRecord;
import com.mariaeduarda.agendamento_notificacao_api.infrastructure.entities.Agendamento;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

import com.mariaeduarda.agendamento_notificacao_api.controller.dto.out.AgendamentoRecordOut;

@Mapper(componentModel = SPRING)
public interface IAgendamentoMapper {

    Agendamento paraEntity(AgendamentoRecord agendamento);

    AgendamentoRecordOut paraOut(Agendamento agendamento);


}
