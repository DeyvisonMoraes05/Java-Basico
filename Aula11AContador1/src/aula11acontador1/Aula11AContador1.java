/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11acontador1;

/**
 *
 * @author Usuario
 */
public class Aula11AContador1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // ESTRUTURA DE REPETIÇÃO COM TESTE NO INÍCIO
        /*int cc = 0;
        while (cc < 5) {
            System.out.println("Cambalhota " + cc);
            cc++;
        }*/
        
        //  MUDANDO O FLUXO DE UM LAÇO DE REPETIÇÃO
        /*int cc = 0;
        while (cc < 10) {
            cc++;
            if (cc == 5 || cc == 7 || cc == 9){ // SEMPRE O O CONTADOR DE CAMBALHOTA "cc" FOR 5 OU 7 
                continue; // ELE NÃO VAI MOSTRAR A MENSAGEM NA TELA, ELE VOLTA PA O ENQUANTO "WHILE"
                // O "continue" INTERROMPE O FLUXO NORMAL DO LAÇO E VOLTA AO ENQUANTO "WHILE"
            }
            System.out.println("Cambalhota " + cc);
        }*/
        
        //  MUDANDO O FLUXO DE UM LAÇO DE REPETIÇÃO
        /*int cc = 0;
        while (cc < 10) {
            cc++;
            if (cc == 2 || cc == 3 || cc == 4){ // SEMPRE O O CONTADOR DE CAMBALHOTA "cc" FOR 5 OU 7 
                continue; // ELE NÃO VAI MOSTRAR A MENSAGEM NA TELA, ELE VOLTA PA O ENQUANTO "WHILE"
                // O "continue" INTERROMPE O FLUXO NORMAL DO LAÇO E VOLTA AO ENQUANTO "WHILE"
            }
            if (cc == 7) { // SEMPRE O O CONTADOR DE CAMBALHOTA "cc" FOR 7 
                break; // IMTERROMPE O LAÇO E FINALIZA O PROGRAMA
            }
            System.out.println("Cambalhota " + cc);
        }*/
    }
    
}
