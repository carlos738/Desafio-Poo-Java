package desafio_poo;

import static desafio_poo.Conteudo.conteudo.XP_PADRAO;

public class Curso extends Conteudo {
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public void setDescricao(String descriçaoCursoJava) {

    }

    @Override
    public void setTitulo(String cursoJava) {

    }

    public Curso(){

    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
