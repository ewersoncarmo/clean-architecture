package br.cleanarchitecture.escola.infra.indicacao;

import br.cleanarchitecture.escola.aplicacao.indicacao.EnvioNotificacaoIndicacao;
import br.cleanarchitecture.escola.dominio.aluno.Aluno;

public class EmailNotificacaoIndicacao implements EnvioNotificacaoIndicacao {

    @Override
    public void envia(Aluno indicado) {
        System.out.println("Enviando notificação via e-mail " + indicado);
    }
}
