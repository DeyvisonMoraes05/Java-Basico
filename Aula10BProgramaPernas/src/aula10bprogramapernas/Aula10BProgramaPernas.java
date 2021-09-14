/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10bprogramapernas;

import java.util.Scanner;

/**
 *
 * @author Deyvison Moraes
 */
public class Aula10BProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de pernas: ");
        int pernas = teclado.nextInt();
        System.out.print("Isso é um(a) ");
        String tipos ;
        switch(pernas) {
            case 1:
                tipos = "Saci";
                break;
            case 2:
                tipos = "Bípede";
                break;
            case 3:
                tipos = "Trípede";
                break;
            case 4:
                tipos = "Quadrúpede";
                break;
            case 8:
                tipos = "Aranha";
                break;
            default:
                tipos = "Messi";     
        }
        System.out.println(tipos);
    }
    
}
