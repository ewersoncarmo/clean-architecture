package br.cleanarchitecture.escola.shared.dominio.evento;

import java.util.ArrayList;
import java.util.List;

public class EventoPublisher {

    private List<Listener> listeners = new ArrayList<>();

    public void adiciona(Listener listener) {
        listeners.add(listener);
    }

    public void publica(Evento evento) {
        listeners.forEach(e -> e.executa(evento));
    }
}
