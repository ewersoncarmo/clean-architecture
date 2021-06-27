package br.cleanarchitecture.escola.dominio.aluno;

public interface CriptografiaSenha {

    String criptografar(String senha);

    boolean isSenhaValida(String senhaCriptografada, String senha);
}
