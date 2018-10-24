/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

/**
 Até 900,00 => desconto de ZERO
 Até 1500,00 => desconto de 15%Até 1500,00 =>
 * Acima de 1500,00 => desconto 20% Acima de 1500,00 =>
 * A única exceção a essa regra são os estagiários
 */
public class Funcionario {
    private String nome;
    private double salarioBruto;
    
    public double calcularSalarioLiquido(){
        double descontoImpostoRenda = 0;
        
        if(salarioBruto <= 1500){
           descontoImpostoRenda = 15;
        }
        else if(salarioBruto > 1500){
           descontoImpostoRenda = 20;
        }
        
        double salarioLiquido =
        salarioBruto - (salarioBruto 
        * descontoImpostoRenda / 100);
        
        return salarioLiquido;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
              
}
