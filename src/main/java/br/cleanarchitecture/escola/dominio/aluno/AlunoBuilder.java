package br.cleanarchitecture.escola.dominio.aluno;

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
