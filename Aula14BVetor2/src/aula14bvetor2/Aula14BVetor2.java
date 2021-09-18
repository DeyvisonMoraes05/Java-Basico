/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14bvetor2;

/**
 *
 * @author Deyvison Moraes
 */
public class Aula14BVetor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int ano = 2021;
        String anobi = ""; 
        String meses[] = {"jan", "Fev", "Mar", "Abr", "Mai", "Jun",
                          "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int dias[] = {31, 28, 31, 30, 31, 30,
                      31, 31, 30, 31, 30, 31};
        
        for (int cont = 0; cont < meses.length; cont++) {
            System.out.println("O mês de " + meses[cont] + " tem " +
                    dias[cont] + " dias ao todo.");
            /*if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
                anobi = Integer.toString(ano);
                dias[1] = 29;
                for (int conta = 0; conta < meses.length; conta++) {
                    System.out.println("O mês de " + meses[conta] + " tem " +
                    dias[conta] + " dias ao todo.");
                }
                continue;
            }*/
        }
        
        /* MEU TESTE, DEU ERRO
        for (int i = 0; i < meses.length; i++) {
            System.out.println("O mês de " + meses[i]);
            for (int j = 0; j < dias.length; j++) {
                System.out.println("Tem " + dias[j] + "dias");
            }
        }*/
        
        
        
    }
    
}
