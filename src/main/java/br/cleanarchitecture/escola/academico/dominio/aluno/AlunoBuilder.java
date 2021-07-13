package br.cleanarchitecture.escola.academico.dominio.aluno;

import br.cleanarchitecture.escola.shared.dominio.CPF;

public class AlunoBuilder {

    private Aluno aluno;

    public AlunoBuilder comCpfNomeEmail(String cpf, String nome, String email) {
        aluno = new Aluno(new CPF(cpf), nome, new Email(email));
        return this;
    }

    public AlunoBuilder comTelefone(String ddd, String numero) {
        aluno.adicionaTelefone(ddd, numero);
        return this;
    }

    public Aluno build() {
        return aluno;
    }
}
