package questao2;

/*
 * @author alunoti
 */
public class Vendedor extends Funcionario {
    
    private int quantidadeDeVendas;
   
    @Override
    public double calcularSalarioLiquido() {
        int bonus = 0;
        
        if(quantidadeDeVendas >= 100){
            bonus = 10;
        }
        else if(quantidadeDeVendas >= 500){
            bonus = 20;
        }
        else if (quantidadeDeVendas >= 1000){
            bonus = 30;
        }   
        
        double salarioLiquido = super.calcularSalarioLiquido()
        + (getSalarioBruto() * bonus / 100);
       
        return salarioLiquido;
    }

    public int getQuantidadeDeVendas() {
        return quantidadeDeVendas;
    }

    public void setQuantidadeDeVendas(int quantidadeDeVendas) {
        this.quantidadeDeVendas = quantidadeDeVendas;
    }
    
    
}
