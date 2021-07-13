package br.cleanarchitecture.escola;

import br.cleanarchitecture.escola.gameficacao.aplicacao.GeraSeloAlunoNovatoListener;
import br.cleanarchitecture.escola.gameficacao.infra.selo.EmMemoriaSeloRepository;
import br.cleanarchitecture.escola.shared.dominio.evento.EventoPublisher;
import br.cleanarchitecture.escola.academico.dominio.aluno.AlunoMatriculadoListener;
import br.cleanarchitecture.escola.academico.infra.aluno.EmMemoriaAlunoRepository;
import br.cleanarchitecture.escola.academico.aplicacao.aluno.MatriculaAluno;
import br.cleanarchitecture.escola.academico.aplicacao.aluno.MatriculaAlunoDTO;

public class MatriculaAlunoCommandLine {

    public static void main(String[] args) {
        EventoPublisher eventoPublisher = new EventoPublisher();
        eventoPublisher.adiciona(new AlunoMatriculadoListener());
        eventoPublisher.adiciona(new GeraSeloAlunoNovatoListener(new EmMemoriaSeloRepository()));

        MatriculaAluno matriculaAluno = new MatriculaAluno(new EmMemoriaAlunoRepository(), eventoPublisher);
        matriculaAluno.matricula(new MatriculaAlunoDTO("287.443.960-66", "Aluno", "aluno@gmail.com"));
    }
}
