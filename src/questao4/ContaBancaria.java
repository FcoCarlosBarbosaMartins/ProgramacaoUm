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
public class ContaBancaria {
    private String numeroDaConta;
    private double saldo;
    
    public void depositar(double valor){
        if(valor > 0){
            saldo = saldo + valor;
            System.out.println("Depositado com sucesso!");
        }
        else{
            System.out.println("Não foi possivel depositar!");
        }
    }
    
    public void sacar(double valor){   
        if(valor <= saldo){
            saldo = saldo - valor;
        }
        else{
            System.out.println("Não foi possivel sacar!");
        }
    }
    
    public void consultarSaldo(){    
        System.out.println("Saldo atual:" + saldo); 
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
    
}
