package br.com.digitalhouse.Exercicio1;

public class Aula {

    private String nomeMateriaAula;

    private String horaInicio;
    private String horaFim;

    public String getnomeMateriaAula() {
        return nomeMateriaAula;
    }

    public void setnomeMateriaAula(String materia) {
        this.nomeMateriaAula = materia;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }
}
