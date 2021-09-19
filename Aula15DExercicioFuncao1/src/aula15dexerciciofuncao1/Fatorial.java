/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula15dexerciciofuncao1;

/**
 *
 * @author Usuario
 */
public class Fatorial {
    
    // ATRIBUTOS
    private int num = 0; 
    private int fat = 1; 
    private String formula = ""; 
    
    // MÉTODOS
    public void setValor(int n) {
        num = n;
        int f = 1;
        String s = "";
        for (int cont = n; cont > 1; cont--) {
            f *= cont;
            s += cont + " x ";
        }
        s += "1 = ";
        fat = f;
        formula = s;    
    }
    
    public int getFatorial() {
        return fat;
    }
    
    public String getFormula() {
        return formula;
    }
    
    
    
}
