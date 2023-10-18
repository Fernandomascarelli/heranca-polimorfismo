package cadastro;
import controle.setarDadosPessoa;
import modelo.cliente;
import util.Input;



public class cadastroCliente extends cliente{
    protected static void setarDadosCliente(cliente cli){
        setarDadosPessoa.setarDadosPessoas(cli);
        System.out.println("Qual seu limite de credito: ");
        cli.setLimiteCredito(Input.nextFloat());
    }
    public static cliente cadastroCliente(){
        cliente cli = new cliente();
        setarDadosCliente(cli);
        clientes.add(cli);
        return cli;
    }
    
}
