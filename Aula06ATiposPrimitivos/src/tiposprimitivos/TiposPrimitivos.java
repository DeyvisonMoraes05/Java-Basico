/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // SAÍDAS DE DADOS
        //float nota = (float) 8.5; // FORMA DE DECLARAR UMA VARIÁVEL DO TIPO FLOAT 
        //float nota = 8.5f; // FORMA DE DECLARAR UMA VARIÁVEL DO TIPO FLOAT
        //System.out.println("A nota é " + nota); // PULANDO LINHA NO FINAL
        //System.out.print("A nota é " + nota); // NÃO PULANDO LINHA NO FINAL
        //String nome = "Deyvison";
        //float nota = 8.5f;
        //System.out.printf("A nota é %f", nota); // QUANTAS CASAS DECIMAIS O SISTEMA DEFINIR
        //System.out.printf("A nota é %.2f", nota); // COM 2 CASAS DECIMAIS O SISTEMA DEFINIR
        //System.out.printf("A nota é %.2f \n", nota); // COM 2 CASAS DECIMAIS O SISTEMA DEFINIR, PULANDO LINHA NO FINAL
        //System.out.printf("A nota de %s é %.4f \n", nome, nota); // ESCRITAS DIFERENTES, MESMOS RESULTADDOS
        //System.out.format("A nota de %s é %.2f \n", nome, nota); // ESCRITAS DIFERENTES, MESMOS RESULTADDOS
        
        // ENTRADA DE DADOS PELO TECLADO
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do Aluno: "); // MENSAGEM PARA O USUÁRIO DIGITAR O QUE SE PEDE
        String nome = teclado.nextLine(); // NEXTlINE(); É O MÉTODO DO OBJETO TECLADO PARA ENTRAR COM STRING
        System.out.print("Digite a nota do Aluno: "); // MENSAGEM PARA O USUÁRIO DIGITAR O QUE SE PEDE
        float nota = teclado.nextFloat(); // NEXTFLOAT(); É O MÉTODO DO OBJETO TECLADO PARA ENTRAR COM FLOAT
        //float nota = teclado.nextInt(); // NEXTFLOAT(); É O MÉTODO DO OBJETO TECLADO PARA ENTRAR COM INT
        System.out.format("A nota de %s é %.2f \n", nome, nota); // SAÍDA DE DADOS INFORMADOS PELO USUÁRIO VIA TECLADO
        
    }
    
}
