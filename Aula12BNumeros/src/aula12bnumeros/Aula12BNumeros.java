/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12bnumeros;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Aula12BNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       int num, soma = 0; // VARIÁVEIS
       String resposta; // OBJETO
       
       // PARA A ENTRADA DE DADOSA PELO TECLADO, CRIA-SE UM OBEJTO DA CLASSE
       // "Scanner", CHAMADO "teclado", O OBEJETO É IDENTIFICADO PELO "new"
       Scanner teclado = new Scanner(System.in);
       
       
       do { // FAÇA TUDO QUE ESTIVER DENTRO DO BLOCO
           System.out.print("Digite um número: "); //   MENSAGEM AO USUÁRIO
           num = teclado.nextInt(); // PEGANDO O NÚMERO QUE É DIGITADO PELO USUÁRIO
           soma += num;  // CALCULO DA SOMA DE TODOS OS NÚMEROS DIGITADOS PELO USUÁRIO
           System.out.println("Quer continuar? [S/N] "); // MENSAGEM AO USUÁRIO
           resposta = teclado.next(); // PEGANDO A RESPOSTA QUE É DIGITADA PELO USUÁRIO
       } while (resposta.equals("S")); // TESTE LÓGICO NO FINAL
       System.out.println("A soma de todos os valores é " + soma); // MENSAGEM AO USUÁRIO
    }   
    
}
