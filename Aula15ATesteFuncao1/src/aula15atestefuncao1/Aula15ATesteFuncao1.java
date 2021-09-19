/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula15atestefuncao1;

/**
 *
 * @author Usuario
 */
public class Aula15ATesteFuncao1 {

    /**
     * @param args the command line arguments
     */
    
    
    static void soma1(int a1, int b1){ // PROCEDIMENTO "soma1"
        int soma1 = a1 + b1;
        System.out.println("A soma é " + soma1);
    }
    
    static int soma2(int a2, int b2) { // MÉTODO "soma2"
        int s = a2 + b2;
        return s;
    }
   
    public static void main(String[] args) { // MÉTODO PRINCIPAL "main"
        // TODO code application logic here
        System.out.println("Começou o Programa");
        soma1(5, 2); // CHAMANDO O PROCEDIMENTO SOMA
        int sm = soma2(5,2);
        System.out.println("A soma vale " + sm);
    }
    
}
