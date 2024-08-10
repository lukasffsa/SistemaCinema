package TrabalhoModelagem;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
public class Sessao {
    private Date dataSessao;
    private String horaSessao;
    private String estadoSessao;
    private int ingressosSessao;
    private List<Ingresso> ingressosVendidos;
    private Filme filme;
    private Sala sala;

    public Sessao(Date dataSessao, String horaSessao, String estadoSessao, int ingressosSessao, List<Ingresso> ingressosVendidos, Filme filme, Sala sala){
        this.dataSessao = dataSessao;
        this.horaSessao = horaSessao;
        this.estadoSessao = estadoSessao;
        this.ingressosSessao = ingressosSessao;
        this.ingressosVendidos = new ArrayList<>();
        this.filme = filme;
        this.sala = sala;
    }

    public Date getDataSessao() {
        return dataSessao;
    }

    public void setDataSessao(Date dataSessao) {
        this.dataSessao = dataSessao;
    }

    public String getHoraSessao() {
        return horaSessao;
    }

    public void setHoraSessao(String horaSessao) {
        this.horaSessao = horaSessao;
    }

    public String getEstadoSessao() {
        return estadoSessao;
    }

    public void setEstadoSessao(String estadoSessao) {
        if(estadoSessao == "Aberta" || estadoSessao == "Em andamento" || estadoSessao == "Encerrada"){
            this.estadoSessao = estadoSessao;
        } else{
            System.out.println("Estado invalido!");
        }
    }

    public int getIngressosSessao() {
        return ingressosSessao;
    }

    public void setIngressosSessao(int ingressosSessao) {
        this.ingressosSessao = ingressosSessao;
    }

    public List<Ingresso> getIngressosVendidos() {
        return ingressosVendidos;
    }

    public void setIngressosVendidos(List<Ingresso> ingressosVendidos) {
        this.ingressosVendidos = ingressosVendidos;
    }
    public int getIngressosComprados(){
        return ingressosVendidos.size();
    }
    public int getIngressosRestantes(){
        return ingressosSessao - ingressosVendidos.size();
    }
    public void venderIngressos(Ingresso ingresso){
        if(getIngressosRestantes() > 0){
            ingressosVendidos.add(ingresso);
            System.out.println("Ingresso vendido!");
        } else {
            System.out.println("Nao ha mais ingressos disponiveis!");
        }
    }
    public void exibirSessao(){
        System.out.println("Filme: " + filme.getTitulo());
        System.out.println("Sala: " + sala.getNomeSala());
        System.out.println("Data: " + getDataSessao());
        System.out.println("Hora: " + getHoraSessao());
        System.out.println("Estado: " + getEstadoSessao());
        System.out.println("Ingressos Vendidos: " + getIngressosVendidos());
        System.out.println("Ingressos Restantes: " + getIngressosRestantes());
    }
}
