package cadastro;

import controle.setarDadosFuncionario;
import modelo.vendedor;


public class cadastrarVendedor extends vendedor{
    protected static void setarDadosVendedor(vendedor vend){
        setarDadosFuncionario.setarDadosFuncionario(vend);
    }
    
    public static vendedor cadastroVendedor(){
        vendedor vend = new vendedor();
        setarDadosVendedor(vend);
        vendedores.add(vend);
        return vend;
    }
}
