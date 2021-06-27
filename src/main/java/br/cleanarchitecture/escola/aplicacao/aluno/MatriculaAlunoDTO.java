package br.cleanarchitecture.escola.aplicacao.aluno;

import br.cleanarchitecture.escola.dominio.aluno.Aluno;

public class MatriculaAlunoDTO {

    private String cpf;
    private String nome;
    private String email;

    public MatriculaAlunoDTO(String cpf, String nome, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public Aluno toObject() {
        return Aluno.builder()
                .comCpfNomeEmail(cpf, nome, email)
                .build();
    }
}
