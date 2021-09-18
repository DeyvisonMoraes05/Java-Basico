/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14evetor5;

import java.util.Arrays;

/**
 *
 * @author Deyvison Moraes
 */
public class Aula14EVetor5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v[] = new int[20];
        Arrays.fill(v, 7); // PREENCHIMENTO AUTOMÁTICO DO VETOR COM UM NÚMERO QUALQUER
        for (int valor: v) {
            System.out.print(valor + " ");
        }
    }
    
}
