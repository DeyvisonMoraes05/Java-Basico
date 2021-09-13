/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09aprogramamedia;

import java.util.Scanner;

/**
 *
 * @author Deyvison Moraes
 */
public class Aula09AProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       // CONDIÇÃO SIMPLES
       // CRIAÇÃO DE UM OBJETO "teclado" DA CLASSE "Scanner", PARA MONITORAR O 
       //"(System.in)" QUE É A ENTRADA DE DADOS PELO TECLADO
       Scanner teclado = new Scanner(System.in);
       
       // MENSAGEM AO USUÁRIO SOLICITANDO A DIGITAÇÃO DA "NOTAS"
       // E DECLARAÇÃO DA VARIÁVEIS, QUE SERÃO DIGITADAS PELO TECLADO
       System.out.print("Digite a primeira nota: ");
       float n1 = teclado.nextFloat();
       System.out.print("Digite a segunda nota: ");
       float n2 = teclado.nextFloat();
       
       // DECLARAÇÃO DA VARIÁVEL PARA CALCULAR A MÉIDA, E CALCULO DA MÉDIA
       float media = (n1 + n2) / 2;
       
       // MENSAGEM IMPRESSA NA TALA MOSTRANDO A MÉDIA 
       System.out.println("Sua média foi " + media);
       
       // CRIAÇÃO DA CONDIÇÃO "SIMPLES"
       if (media > 9) {
           System.out.println("Parabéns, pequeno gafanhoto!");
       }
       
       
    }
    
}
