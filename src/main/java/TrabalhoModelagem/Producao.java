package TrabalhoModelagem;

public class Producao extends Papel{
    private String papelProducao;
    public Producao(String nome, String papelProducao){
        super(nome, papelProducao);
    }
    public String getPapelProducao() {
        return papelProducao;
    }

    public void setPapelProducao(String papelProducao) {
        this.papelProducao = papelProducao;
    }

}
