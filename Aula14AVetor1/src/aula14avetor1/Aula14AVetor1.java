/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14avetor1;

/**
 *
 * @author Usuario
 */
public class Aula14AVetor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vetor000 = new int[5]; // VETOR É UM OBJETO
        vetor000[0] = 3;
        vetor000[1] = 5;
        vetor000[2] = 8;
        vetor000[3] = 2;
        vetor000[4] = 7;
        
        int vetor001[] = new int[5]; // VETOR É UM OBJETO
        int vetor002[] = {1, 3, 5, 7, 9}; // VETOR É UM OBJETO
        int[] vetor003 = {2, 4, 6, 8, 10}; // VETOR É UM OBJETO
        // TODO OBJETO TEM: CARACTERÍSTICAS; PROPRIEDADES; ATRIBUTOS; E MÉTODOS; FUNÇÕES. 
        // ELE TEM POSSIBILIDADES QUE SÃO COISAS QUE ELE TEM E COISAS QUE ELE FAZ
        // TODO VETOR TEM UM TAMANHO
        
        System.out.println("Total de casas de Vetor002: " + vetor002.length + "\n");
        // "length" É UMA CARACTERÍSCA, É UM ATRIBUTO QUE O VATOR TEM. MOSTRA O TAMANHO DO VETOR
        
        /*
        for (int cont = 0; cont <= 5; cont++) {
            // System.out.print(cont); MOSTRA OS INDICES DO VETOR
            // System.out.println(vetor003[cont]); MOSTRA OS VALORES DOS INDICES DO VETOR
            // System.out.print(vetor003[cont] + " "); // DÁ UM ESPAÇO DEPOIS DA IMPRESSAÕ DE CADA VALOR
            System.out.println("Na posição "+ cont + " temos o valor " + vetor003[cont]); // MOSTRA EM 
            // QUAL POSIÇÃO SERÁ IMPRESSO CADA VALOR
        }*/
       
        for (int contador = 0; contador <= vetor000.length - 1; contador++){
            System.out.println("Na posição " + contador + " temos o valor " + vetor000[contador]);
            // ESTRUTURA DE REPTIÇÃO GENERICA, QUE FUNCIONA PARA QUALQUER VETOR, DE QUALQUER TAMANHO
        }
        
        
    }
    
}
