package questao2;
/**
 * @author alunoti
 */
public class Estagiario extends Funcionario {

    @Override
    public double calcularSalarioLiquido() {
       
        return getSalarioBruto();
    }  
}
