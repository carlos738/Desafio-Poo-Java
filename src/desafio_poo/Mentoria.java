package desafio_poo;

import java.time.LocalDate;

import static desafio_poo.Conteudo.conteudo.XP_PADRAO;

public class Mentoria extends Conteudo{
    private LocalDate data;

    @Override
    public double calcularXp(){
        return XP_PADRAO + 20d;
    }

    @Override
    public void setDescricao(String descriçaoCursoJava) {

    }

    @Override
    public void setTitulo(String cursoJava) {

    }

    public Mentoria(){

    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "data=" + data +
                '}';
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
