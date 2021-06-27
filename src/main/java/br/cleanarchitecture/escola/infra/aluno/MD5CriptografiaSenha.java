package br.cleanarchitecture.escola.infra.aluno;

import br.cleanarchitecture.escola.dominio.aluno.CriptografiaSenha;

public class MD5CriptografiaSenha implements CriptografiaSenha {

    @Override
    public String criptografar(String senha) {
        System.out.println("Criptografando senha utilizando MD5");
        return null;
    }

    @Override
    public boolean isSenhaValida(String senhaCriptografada, String senha) {
        System.out.println("Verificando se senha é válida utilizando MD5");
        return false;
    }
}
