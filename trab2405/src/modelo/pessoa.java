package modelo;

import java.util.ArrayList;

public class pessoa {
    protected String nome;
    protected String login;
    protected String senha;
    protected String email;
    protected String cpf;
    protected String endereco;
    public static ArrayList<pessoa> pessoas = new ArrayList<>();

    public pessoa() {
        
    }

    public pessoa(String nome, String login, String senha, String email, String cpf, String endereco) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    

    public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "pessoa{" + "nome=" + nome + ", login=" + login + ", senha=" + senha + ", email=" + email + ", cpf=" + cpf + ", endereco=" + endereco + '}';
    }
    
    public void exibirInformacoes(){
        System.out.println(nome+ " - "+ cpf + " email: "+email+" login: "+login+" senha: "+senha+"\n Endereco: "+endereco
        );
    }
    
    
}




