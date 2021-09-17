/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13arepeticaofor;

/**
 *
 * @author Deyvison Moraes
 */
public class Aula13ARepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // ESTRUTURA DE REPETIÇÃO COM VARIÁVEL DE CONTROLE, O FAMOSO FOR
        /*
        for(int cc = 0; cc < 4; cc += 1 ) { // cc = cc + 1 ou cc++
            System.out.println("Cambalhota FOR ( ) { } " + cc);
        }
        
        int cc = 0;
        while (cc < 4) {
            System.out.println("Cambalhota WHILE ( ) { } " + cc);
            cc++;
        }
        
        int cont = 0;
        do {
            System.out.println("Cambalhota DO { } WHILE ( ) " + cont);
            cont++;
        } while (cont < 4);*/
        
        /*
        for(int cc = 5; cc <= 15; cc++ ) { // cc = cc + 1 ou cc++
            System.out.println("Cambalhota" + cc);
        }
        
        for(int cc = 5; cc <= 15; cc +=2 ) { // cc = cc + 1 ou cc++
            System.out.println("Cambalhota" + cc);
        }
        
        for(int cc = 15; cc >= 5; cc -=2 ) { // cc = cc + 1 ou cc++
            System.out.println("Cambalhota" + cc);
        }
        
        for(int cc = 15; cc >= 5; cc-- ) { // cc = cc + 1 ou cc++
            System.out.println("Cambalhota" + cc);
        }*/
        
        //for (int cont = 0; cont <= 100; cont += 10) {
        //    System.out.println("Cont" + cont);
        //}
        
        // ESTRUTURA DE REPETIÇÃO ANINHADA, LAÇOS ANINHADOS
        
        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j <= 2; j += 2) {
                System.out.println("I = " + i + " LAÇO I");
                System.out.println("J = " + j + " LAÇO J");
                System.out.println("-------------");
            }
            
            // TESTE DE MESA
            /*
            I = 1 // LAÇO I
            J = 0
            -------------
            I = 1
            J = 2 // LAÇO J
            -------------
            I = 2 //LAÇO I
            J = 0
            -------------
            I = 2
            J = 2 //LAÇO J
            -------------
            I = 3 // LAÇO I
            J = 0
            -------------
            I = 3
            J = 2 // LAÇO J
            -------------*/
        }
        
    }
    
}
