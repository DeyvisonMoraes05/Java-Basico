/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14cvetor3;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Aula14CVetor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // FOREACH: ESPECÍFICO PARA VETORES
        double vetor[] = {3.5, 2.75, 9, -4.5};
        Arrays.sort(vetor); // COLOCANDO OP VETOR EM ORDEM ANTES DE IMPRIMIR
        for (double valor: vetor) {
            System.out.print(valor + " ");
        }
    }
    
}
