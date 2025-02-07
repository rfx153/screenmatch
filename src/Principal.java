import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {

       Filme meuFilme = new Filme();
       meuFilme.setNome("O poderoso chefão");
       meuFilme.setAnoDeLancamento(1970);
       meuFilme.setDuracaoEmMinutos(180);
       System.out.println("a duracao" + meuFilme.getDuracaoEmMinutos());

       meuFilme.exibeFichaTecnica();
       meuFilme.avalia(8);
       meuFilme.avalia(5);
       meuFilme.avalia(10);
       System.out.println("Total de avaliações: " +meuFilme.getTotalDeAvaliacoes());
       System.out.println(meuFilme.pegaMedia());
        //System.out.println(meuFilme.somaDasAvaliacoes);
        //System.out.println(meuFilme.totalDeAvaliacoes);
        //System.out.println(meuFilme.pegaMedia());
       Serie lost = new Serie();
       lost.setNome("Lost");
       lost.setAnoDeLancamento(2000);
       lost.exibeFichaTecnica();
       lost.setTemporadas(10);
       lost.setEpisodiosPorTemporada(10);
       lost.setMinutosPorEpisodio(50);
       System.out.println("Duração para maratornar lost " + lost.getDuracaoEmMinutos());

       Filme OutroFilme = new Filme();
       OutroFilme.setNome("Avatar");
       OutroFilme.setAnoDeLancamento(2023);
       OutroFilme.setDuracaoEmMinutos(200);

       CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
       calculadora.inclui(meuFilme);
       calculadora.inclui(OutroFilme);
       calculadora.inclui(lost);
       System.out.println(calculadora.getTempTotal());

       FiltroRecomendacao filtro = new FiltroRecomendacao();
       filtro.filtra(meuFilme);

       Episodio episodio = new Episodio();
       episodio.setNumero(1);
       episodio.setSerie(lost);
       episodio.setTotalVisualizacoes(300);
       filtro.filtra(episodio);
    }
}