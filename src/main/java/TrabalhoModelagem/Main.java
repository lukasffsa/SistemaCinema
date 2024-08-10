package TrabalhoModelagem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String args[]){
        Genero genero =  new Genero("Aventura");

        Ator protagonista = new Ator("Maria", "Protagonista", 28, 'F', "Americana");
        Ator coadjuvante = new Ator("Joao", "Coadjuvante", 22, 'M', "Americano");

        Direcao direcao = new Direcao("Carlos", "Diretor");

        Producao roteirista = new Producao("Isabela", "roteirista");
        Producao fotografa = new Producao("Maria", "fotografa");

        List<Papel> papeis = new ArrayList<>();
        papeis.add(protagonista);
        papeis.add(coadjuvante);
        papeis.add(direcao);
        papeis.add(roteirista);
        papeis.add(fotografa);



        Filme filme = new Filme("Forrest Gump", 1994, "Paramount", "EUA", "2h22min", genero, papeis);

        Sala sala = new Sala(1, "Sala de filmes de ação", 120);



        Ingresso ingressoMeia = new Ingresso(90, 100, "Meia-entrada", 15.00F, new Date());
        Ingresso ingressoInteira = new Ingresso(20, 15, "Inteira", 30.00F, new Date());


        List<Ingresso> ingressosVendidos1 = new ArrayList<>();
        ingressosVendidos1.add(ingressoMeia);
        ingressosVendidos1.add(ingressoInteira);

        Sessao sessao = new Sessao(new Date(),"20h00min", "Aberta", sala.getCapacidade(),ingressosVendidos1, filme, sala);

        sessao.exibirSessao();

        sessao.venderIngressos(ingressoMeia);
        sessao.venderIngressos(ingressoInteira);

        sessao.exibirSessao();

        ingressoMeia.imprimirIngresso(ingressoMeia);
        ingressoInteira.imprimirIngresso(ingressoInteira);

    }
}
