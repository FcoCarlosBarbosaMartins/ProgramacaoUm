/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4;

import java.util.Calendar;

/**
 *
 * @author alunoti
 */
public class ContaPoupanca extends ContaBancaria{
    
    private int diaRendimento;
    
    public void calcularRendimento(double taxaRendimento){
        
        Calendar diaAtual = Calendar.getInstance();
        
        if (diaRendimento == diaAtual.get(Calendar.DAY_OF_MONTH)){
            setSaldo(getSaldo() + (getSaldo() * taxaRendimento));
        }
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
     
}
