package br.cleanarchitecture.escola.academico.aplicacao.indicacao;

import br.cleanarchitecture.escola.academico.dominio.aluno.Aluno;

public interface EnvioNotificacaoIndicacao {

    void envia(Aluno indicado);
}
