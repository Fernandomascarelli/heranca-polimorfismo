package controle;
import modelo.pessoa;
import util.Input;
import static modelo.pessoa.pessoas;


public class setarDadosPessoa {
    public static void setarDadosPessoas(pessoa pessoa){
        System.out.println("Digite seu nome:");
        pessoa.setNome(Input.nextLine());
        System.out.println("Digite seu login: ");
        pessoa.setLogin(Input.nextLine());
        System.out.println("Digite sua senha: ");
        pessoa.setSenha(Input.nextLine());
        System.out.println("Digite seu email: ");
        pessoa.setEmail(Input.nextLine());
        System.out.println("Digite seu cpf: ");
        pessoa.setCpf(Input.nextLine()); 
        System.out.println("Digite seu endereco: ");
        pessoa.setEndereco(Input.nextLine());
    }
    
    public static pessoa cadastroPessoa(){
        pessoa pessoa = new pessoa();
        setarDadosPessoas(pessoa);
        pessoas.add(pessoa);
        return pessoa;
    }
}
