package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main (String[] args){
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme OutroFilme = new Filme("Avatar", 2023);
        OutroFilme.avalia(8);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        Filme fl = filmeDoPaulo;

        List<Titulo> lista = new LinkedList<>()
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(OutroFilme);
        lista.add(lost);
        for (Titulo item: lista){
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao()> 2){

                System.out.println("Classificação " + filme.getClassificacao());
            }
        }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
            buscaPorArtista.add("Adam Sanlder");
            buscaPorArtista.add("Paulo");
            buscaPorArtista.add("Jacqueline");
            System.out.println(buscaPorArtista);

            Collections.sort(buscaPorArtista);
            System.out.println("Depois da ordenação");
            System.out.println(buscaPorArtista);
            System.out.println("lista de títulos ordenados");


            Collections.sort(lista);
            System.out.println(lista);
            lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
            System.out.println("Ordenando por ano");
            System.out.println(lista);





    }
}
