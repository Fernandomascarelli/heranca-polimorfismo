package modelo;
import java.util.ArrayList;


public class cliente extends pessoa{
    protected float limiteCredito;
    public static ArrayList<cliente> clientes = new ArrayList<>();

    public cliente() {
    }

    public cliente(float limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public cliente(float limiteCredito, String nome, String login, String senha, String email, String cpf, String endereco) {
        super(nome, login, senha, email, cpf, endereco);
        this.limiteCredito = limiteCredito;
    }

    public float getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(float limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    public String toString() {
        return "cliente{" + "limiteCredito=" + limiteCredito + '}';
    }
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Limite de credito: "+ limiteCredito);
    }
    
}
