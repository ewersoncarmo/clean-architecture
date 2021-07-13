package br.cleanarchitecture.escola.gameficacao.dominio.selo;

import br.cleanarchitecture.escola.shared.dominio.CPF;

import java.util.List;

public interface SeloRepository {

    void adiciona(Selo selo);

    List<Selo> buscaPorCpf(CPF cpf);
}
