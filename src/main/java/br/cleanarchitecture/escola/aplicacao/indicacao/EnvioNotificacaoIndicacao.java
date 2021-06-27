package br.cleanarchitecture.escola.aplicacao.indicacao;

import br.cleanarchitecture.escola.dominio.aluno.Aluno;

public interface EnvioNotificacaoIndicacao {

    void envia(Aluno indicado);
}
