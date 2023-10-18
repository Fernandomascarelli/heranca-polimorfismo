package modelo;
import java.util.ArrayList;

import java.time.LocalDate;
import util.DateUtils;

public class gerente extends funcionario{

    
    protected String departamento;
    protected float bonus;
    public static ArrayList<gerente> gerentes = new ArrayList<>();

    public gerente() {
    }

    public gerente(String departamento, float bonus) {
        this.departamento = departamento;
        this.bonus = bonus;
    }

    public gerente(String departamento, float bonus, String ctps, LocalDate dataAdmissao, float salario) {
        super(ctps, dataAdmissao, salario);
        this.departamento = departamento;
        this.bonus = bonus;
    }

    public gerente(String departamento, float bonus, String nome, String login, String senha, String email, String cpf, String endereco) {
        super(nome, login, senha, email, cpf, endereco);
        this.departamento = departamento;
        this.bonus = bonus;
    }

    
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Departamento: "+ departamento + "Bonus: "+ bonus);
    }
    
    public float calculaSalario(){
        LocalDate dataLocalDate = DateUtils.obterLocalDateAtualSistema();
        long anosTrab = DateUtils.calcularTempo(dataAdmissao, dataLocalDate);
        float novoSalario = salario + (salario * (anosTrab * 0.01f)) + bonus;
        return novoSalario;
    }
  
}
