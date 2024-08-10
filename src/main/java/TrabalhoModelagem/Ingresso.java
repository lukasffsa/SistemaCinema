package TrabalhoModelagem;
import java.util.Date;
public class Ingresso {
    private int numeroIngresso;
    private int assentoIngresso;
    private String tipoIngresso;
    private float valorIngresso;
    private Date dataHoraCompra;


    public Ingresso(int numeroIngresso, int assentoIngresso, String tipoIngresso, float valorIngresso, Date dataHoraCompra){
        this.numeroIngresso = numeroIngresso;
        this.assentoIngresso = assentoIngresso;
        this.tipoIngresso = tipoIngresso;
        this.valorIngresso = valorIngresso;
        this.dataHoraCompra = dataHoraCompra;
    }
    public void imprimirIngresso(Ingresso ingresso){
        System.out.println("Ingresso numero: " + getNumeroIngresso());
        System.out.println("Assento: " + getAssentoIngresso());
        System.out.println("Tipo do ingresso: " + getTipoIngresso());
        System.out.println("Valor: R$" + getValorIngresso());
        System.out.println("Data da compra: " + getDataHoraCompra());
    }

    public int getNumeroIngresso() {
        return numeroIngresso;
    }

    public void setNumeroIngresso(int numeroIngresso) {
        this.numeroIngresso = numeroIngresso;
    }

    public int getAssentoIngresso() {
        return assentoIngresso;
    }

    public void setAssentoIngresso(int assentoIngresso) {
        this.assentoIngresso = assentoIngresso;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        if (tipoIngresso.equals("inteira") || tipoIngresso.equals("Meia-entrada")) {
            this.tipoIngresso = tipoIngresso;
        }
        else{
            System.out.println("Valor invalido de Ingresso");
        }
    }
    public float getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(float valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public Date getDataHoraCompra() {
        return dataHoraCompra;
    }

    public void setDataHoraCompra(Date dataHoraCompra) {
        this.dataHoraCompra = dataHoraCompra;
    }
}
