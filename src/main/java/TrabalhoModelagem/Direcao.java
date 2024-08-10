package TrabalhoModelagem;

public class Direcao extends Papel{
    private String papelDirecao;

    public Direcao(String nome, String papelDirecao){
        super(nome, papelDirecao);
    }
    public String getPapelDirecao() {
        return papelDirecao;
    }
    public void setPapelDirecao(String papelDirecao) {
        this.papelDirecao = papelDirecao;
    }
}
