package br.cleanarchitecture.escola.academico.dominio.aluno;

public class AlunoNaoEncontradoException extends RuntimeException {

    public AlunoNaoEncontradoException(String cpf) {
        super("Aluno não encontrado com CPF " + cpf);
    }
}
