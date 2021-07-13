package br.cleanarchitecture.escola.gameficacao.aplicacao;

import br.cleanarchitecture.escola.gameficacao.dominio.selo.Selo;
import br.cleanarchitecture.escola.gameficacao.dominio.selo.SeloRepository;
import br.cleanarchitecture.escola.shared.dominio.CPF;
import br.cleanarchitecture.escola.shared.dominio.evento.Evento;
import br.cleanarchitecture.escola.shared.dominio.evento.Listener;
import br.cleanarchitecture.escola.shared.dominio.evento.TipoEvento;

public class GeraSeloAlunoNovatoListener extends Listener {

    private SeloRepository seloRepository;

    public GeraSeloAlunoNovatoListener(SeloRepository seloRepository) {
        this.seloRepository = seloRepository;
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento.getTipoEvento().equals(TipoEvento.ALUNO_MATRICULADO);
    }

    @Override
    protected void processa(Evento evento) {
        CPF cpf = (CPF) evento.getInformacoes().get("cpf");
        Selo selo = new Selo(cpf, "Aluno");

        seloRepository.adiciona(selo);
    }
}
