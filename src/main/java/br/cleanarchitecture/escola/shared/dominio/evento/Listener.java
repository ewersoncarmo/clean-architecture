package br.cleanarchitecture.escola.shared.dominio.evento;

public abstract class Listener {

    public void executa(Evento evento) {
        if (deveProcessar(evento)) {
            processa(evento);
        }
    }

    protected abstract boolean deveProcessar(Evento evento);
    protected abstract void processa(Evento evento);
}
