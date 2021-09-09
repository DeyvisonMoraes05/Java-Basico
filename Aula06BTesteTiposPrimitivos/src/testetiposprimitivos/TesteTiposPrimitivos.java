/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetiposprimitivos;

/**
 *
 * @author Usuario
 */
public class TesteTiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* CONVERSÃO DE UMA VARIÉVEL INT EM STRING
        int idade = 30; // VARIÁVEL "IDADE" DO TIPO "INT" RECEBENDO "30" 
        String valor = Integer.toString(idade); // MÉTODO PARA CONVERTER UMA VARIÁVEL DO TIPO "INT" EM "STRING"
        System.out.println(valor); // IMPRESSÃO DA VARIÁVEL INT QUE FOI TRANSFORMADA EM STRING */
        
        /* CONVERSÃO DE UMA VARIÁVEL STRING EM INT
        String valor = "26";
        int idade = Integer.parseInt(valor);
        System.out.println(idade);*/
        
        /* CONVERSÃO DE UMA VARIÁVEL STRING EM FLOAT*/
        String valor = "26.5";
        float idade = Float.parseFloat(valor);
        System.out.printf("%.2f", idade);
        
        
    }
    
}
