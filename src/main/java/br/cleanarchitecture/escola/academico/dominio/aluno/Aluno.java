package br.cleanarchitecture.escola.academico.dominio.aluno;

import br.cleanarchitecture.escola.shared.dominio.CPF;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private CPF cpf;
    private String nome;
    private Email email;
    private List<Telefone> telefones = new ArrayList<>();
    private String senha;

    public Aluno(CPF cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public static AlunoBuilder builder() {
        return new AlunoBuilder();
    }

    public void adicionaTelefone(String ddd, String numero) {
        if (this.telefones.size() == 2) {
            throw new IllegalArgumentException("Número máximo de telefones atingido");
        }

        this.telefones.add(new Telefone(ddd, numero));
    }

    public String getCpf() {
        return cpf.getNumero();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email.getEndereco();
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "cpf=" + cpf.getNumero() +
                ", nome='" + nome + '\'' +
                ", email=" + email.getEndereco() +
                '}';
    }
}
