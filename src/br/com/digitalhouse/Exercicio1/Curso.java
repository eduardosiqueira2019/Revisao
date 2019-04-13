package br.com.digitalhouse.Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Curso extends Aula{

    private String nome;

    private int conjuntoAulas;
    private List<Aluno> listaAlunos = new ArrayList<>();
    private String professorResponsavel;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getConjuntoAulas() {
        return conjuntoAulas;
    }

    public void setConjuntoAulas(int conjuntoAulas) {
        this.conjuntoAulas = conjuntoAulas;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public String getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(String professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }
}
