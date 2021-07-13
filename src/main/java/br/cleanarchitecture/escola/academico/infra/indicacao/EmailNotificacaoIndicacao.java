package br.cleanarchitecture.escola.academico.infra.indicacao;

import br.cleanarchitecture.escola.academico.aplicacao.indicacao.EnvioNotificacaoIndicacao;
import br.cleanarchitecture.escola.academico.dominio.aluno.Aluno;

public class EmailNotificacaoIndicacao implements EnvioNotificacaoIndicacao {

    @Override
    public void envia(Aluno indicado) {
        System.out.println("Enviando notificação via e-mail " + indicado);
    }
}
