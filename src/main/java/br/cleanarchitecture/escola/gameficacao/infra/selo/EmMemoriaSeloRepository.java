package br.cleanarchitecture.escola.gameficacao.infra.selo;

import br.cleanarchitecture.escola.gameficacao.dominio.selo.Selo;
import br.cleanarchitecture.escola.gameficacao.dominio.selo.SeloRepository;
import br.cleanarchitecture.escola.shared.dominio.CPF;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmMemoriaSeloRepository implements SeloRepository {

    private List<Selo> selos = new ArrayList<>();

    @Override
    public void adiciona(Selo selo) {
        System.out.println(String.format("Gerando selo para aluno com CPF %s em memória ", selo.getCpf().getNumero()));
        selos.add(selo);
    }

    @Override
    public List<Selo> buscaPorCpf(CPF cpf) {
        return selos.stream()
                .filter(s -> s.getCpf().getNumero().equals(cpf.getNumero()))
                .collect(Collectors.toList());
    }
}
