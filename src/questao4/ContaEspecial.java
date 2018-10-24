/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4;

/**
 *
 * @author alunoti
 */
public class ContaEspecial extends ContaBancaria{
    
    private double limite;

    @Override
    public void sacar(double valor) {
        if(valor <= (getSaldo() + limite)){
            setSaldo(getSaldo() - valor);
            System.out.println("Sacado com sucesso!");
        }
        else{
            System.out.println("Não foi possivel sacar!");
        }
    }
}
