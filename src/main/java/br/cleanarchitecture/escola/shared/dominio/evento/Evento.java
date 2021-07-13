package br.cleanarchitecture.escola.shared.dominio.evento;

import java.time.LocalDateTime;
import java.util.Map;

public interface Evento {

    LocalDateTime getDataHora();
    TipoEvento getTipoEvento();
    Map<String, Object> getInformacoes();
}
