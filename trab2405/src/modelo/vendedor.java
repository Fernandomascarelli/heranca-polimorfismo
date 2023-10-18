package modelo;
import java.util.ArrayList;
import util.DateUtils;
import java.time.LocalDate;

public class vendedor extends funcionario{
    public static ArrayList<vendedor> vendedores = new ArrayList<>();

    public vendedor() {
    }

    public vendedor(String ctps, LocalDate dataAdmissao, float salario) {
        super(ctps, dataAdmissao, salario);
    }

    public vendedor(String nome, String login, String senha, String email, String cpf, String endereco) {
        super(nome, login, senha, email, cpf, endereco);
    }

    @Override
    public String toString() {
        return "vendedor{" + '}';
    }
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        
    }
       
    public float calculaSalario(){
        LocalDate dataLocalDate = DateUtils.obterLocalDateAtualSistema();
        long anosTrab = DateUtils.calcularTempo(dataAdmissao, dataLocalDate);
        float novoSalario = salario + (salario * (anosTrab * 0.01f));
        return novoSalario;
    }
    
    
}
