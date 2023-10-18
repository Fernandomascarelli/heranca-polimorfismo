package modelo;
import java.util.ArrayList;

import java.time.LocalDate;

public class funcionario extends pessoa{
    protected String ctps;
    protected LocalDate dataAdmissao;
    protected float salario;
    public static ArrayList<funcionario> funcionarios = new ArrayList<>();

    public funcionario() {
    }

    public funcionario(String ctps, LocalDate dataAdmissao, float salario) {
        this.ctps = ctps;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public funcionario(String nome, String login, String senha, String email, String cpf, String endereco) {
        super(nome, login, senha, email, cpf, endereco);
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "funcionario{" + "ctps=" + ctps + ", dataAdmissao=" + dataAdmissao + ", salario=" + salario + '}';
    }

    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Ctps" + ctps + " Data de admissao: "+ dataAdmissao + " Salario: "+ salario);
    }
    
}
