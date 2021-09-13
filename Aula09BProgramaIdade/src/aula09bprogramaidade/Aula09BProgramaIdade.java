/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09bprogramaidade;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Aula09BProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       /* CONDIÇÃO COMPOSTA*/
       // CRIAÇÃO DE UM OBJETO "teclado" DA CLASSE "Scanner", PARA MONITORAR O 
       //"(System.in)" QUE É A ENTRADA DE DADOS PELO TECLADO
       Scanner teclado = new Scanner(System.in);
       
       // MENSAGEM AO USUÁRIO SOLICITANDO A DIGITAÇÃO DA "NOTAS"
       // E DECLARAÇÃO DA VARIÁVEIS, QUE SERÃO DIGITADAS PELO TECLADO
       System.out.print("Digite seu ano de nascimento: ");
       int anoNascimento = teclado.nextInt();
       
       // DECLARAÇÃO DA VARIÁVEL PARA CALCULAR A MÉIDA, E CALCULO DA MÉDIA
       int idade = 2021 - anoNascimento;
       
       // MENSAGEM IMPRESSA NA TALA MOSTRANDO A MÉDIA 
       System.out.println("Você tem  " + idade + " anos de idade.");
       
       // CRIAÇÃO DA CONDIÇÃO "COMPOSTA"
       if (idade >=18 ) {
           System.out.println("Você é Maior de idade!");
       }
       else {
           System.out.println("Você é Menor de idade!");
       }
       
    }
    
}
