package cadastro;

import controle.setarDadosFuncionario;

import modelo.gerente;
import static modelo.gerente.gerentes;
import util.Input;

public class cadastrarGerente {
    protected static void setarDadosGerente(gerente ger){
        setarDadosFuncionario.setarDadosFuncionario(ger);
        System.out.println("Digite seu departamento: ");
        ger.setDepartamento(Input.nextLine());
        System.out.println("Digite seu bonus: ");
        ger.setBonus(Input.nextFloat());
        
    }
    public static gerente cadastroGerente(){
        gerente ger = new gerente();
        setarDadosGerente(ger);
        gerentes.add(ger);
        return ger;
    }
    
    
}
