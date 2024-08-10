package TrabalhoModelagem;

public class Ator extends Papel{
    private int idade;
    private char sexo;
    private String nacionalidade;
    public Ator(String nome, String papel, int idade, char sexo, String nacionalidade){
        super(nome, papel);
        this.idade = idade;
        this.sexo = sexo;
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}
