package br.cleanarchitecture.escola.academico.dominio.aluno;

public interface CriptografiaSenha {

    String criptografar(String senha);

    boolean isSenhaValida(String senhaCriptografada, String senha);
}
