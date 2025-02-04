package br.com.alura.screenmatch.calculo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }
    public void inclui(Titulo titulo) {
        System.out.println("adicionando a duração em minutos: " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();


    }

}

