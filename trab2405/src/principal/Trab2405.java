package principal;

import cadastro.cadastrarGerente;
import cadastro.cadastrarVendedor;
import cadastro.cadastroCliente;
import modelo.cliente;
import modelo.gerente;
import modelo.vendedor;
import util.Input;


public class Trab2405 {

    public static void main(String[] args) {
        int num;
        gerente ger = null;
        vendedor vend = null;
        cliente cli = null;
        do {
            System.out.println("1 - Cadastro Gerente");
            System.out.println("2 - Cadastro Vendedor");
            System.out.println("3 - Cadastro Cliente");
            System.out.println("4 - Exibir Informacoes Gerente");
            System.out.println("5 - Exibir Informacoes Vendedor");
            System.out.println("6 - Exibir Informacoes Cliente");
            System.out.println("0 - Sair");
            System.out.println("Resposta: ");
            num = Input.nextInt();

            switch (num) {
                case 1:
                    ger = cadastrarGerente.cadastroGerente();
                    System.out.println("Nome: " + ger.getNome()+" Login: "+ger.getLogin()+" Senha: "+ger.getSenha()+
                    " Email: "+ger.getEmail()+" Cpf: "+ger.getCpf()+" Endereco: "+ger.getEndereco()+
                    " Ctps: "+ ger.getCtps()+" Data Admissao: " +ger.getDataAdmissao()+" Salario: "+ger.getSalario()+
                    " Departamento: "+ger.getDepartamento()+ " Bonus: "+ger.getBonus()+" Salario atual: " + ger.calculaSalario());
                    break;
                case 2:
                    vend = cadastrarVendedor.cadastroVendedor();
                    System.out.println("Nome: " + vend.getNome()+" Login: "+vend.getLogin()+" Senha: "+vend.getSenha()+
                    " Email: "+vend.getEmail()+" Cpf: "+vend.getCpf()+" Endereco: "+vend.getEndereco()+
                    " Ctps: "+ vend.getCtps()+" Data Admissao: " +vend.getDataAdmissao()+" Salario: "+vend.getSalario()+
                    " Salario atual: " + vend.calculaSalario());
                    break;
                case 3:
                    cli = cadastroCliente.cadastroCliente();
                    System.out.println("Nome: " + cli.getNome());
                    break;
                case 4:
                    if (ger != null) {
                        ger.exibirInformacoes();
                    } else {
                        System.out.println("Nenhum gerente cadastrado.");
                    }
                case 5:
                    if (vend != null) {
                        vend.exibirInformacoes();
                    } else {
                        System.out.println("Nenhum vendedor cadastrado.");
                    }
                case 6:
                    if (cli != null) {
                        cli.exibirInformacoes();
                    } else {
                        System.out.println("Nenhum cliente cadastrado.");
                    }

                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (num != 0);

    }

}
