package controle;
import util.Input;
import modelo.funcionario;
import static modelo.funcionario.funcionarios;

public class setarDadosFuncionario {
    public static void setarDadosFuncionario(funcionario func){
        setarDadosPessoa.setarDadosPessoas(func);
        System.out.println("Digite seu ctps: ");
        func.setCtps(Input.nextLine());
        System.out.println("Digite sua data de admissao: ");
        func.setDataAdmissao(Input.nextLocalDate());
        System.out.println("Digite seu salario: ");
        func.setSalario(Input.nextFloat());
    }
    
    public static funcionario cadastroFuncionario(){
        funcionario func = new funcionario();
        setarDadosFuncionario(func);
        funcionarios.add(func);
        return func;
    } 
}
