/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11cexerciciosquestoesteoricas;

import java.util.Scanner;

/**
 *
 * @author Deyvison Moraes
 */
public class Aula11CExerciciosQuestoesTeoricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*  QUESTÃO 1
        Analise as seguintes variáveis em JAVA a seguir.
        
        char c = 'c';
        int i = 10;
        double d = 10;
        long l = 1;
        String s = "Hello";
        
        De acordo com as variáveis acima, qual das instruções abaixo compila sem erro?
        (A) c = c + i; // ERRO POR TIPOS INCOMPATÍVEIS
        (B) s += i; //  CERTO, STRING PODE RECEBER INTEIRO, PORQUE O "+" PODE SER ADIÇÃO OU CONCATENAÇÃO
        (C) i += s; ERRO POR TIPOS INCOMPATÍVEIS
        (D) c += s; ERRO POR TIPOS INCOMPATÍVEIS, O TIPO "char" SÓ RECEBE 1 CARACTER
        (E) i += l; // CERTO, INTEIRO PODE RECEBER LONG, DESDE QUE O LONG VALHA 1
        */
        
        /*  QUESTÃO 2
        Qual das afirmações a seguir é VERDADEIRA?
        a) O comando break dentro de um loop while faz com
        que o controle seja passado para a próxima
        interação do loop. // NÃO, ESSE É O COMANDO "continue" O "break" ENCERRA O LOOP
        b) O comando continue dentro de um loop while faz
        com que o controle seja passado para o próximo
        bloco de código após o loop. // NÃO, ESSE É O COMANDO "break" O 
                                        "continue" PASSA PARA A PRÓXIMA INTERAÇÃO DO LOOP
        c) O comando return não pode ser utilizado dentro // ERRADO, O COMANDO "return" 
                                                        PODE SER USADO EM QUALQUER PARTE DO CÓDIGO 
        de loops.
        d) Todas as alternativas acima são verdadeiras.
        e) Todas as alternativas acima são falsas. // RESPOSTA CERTA
        */
        
        
        /*  QUESTÃO 3
        Analise o código em JAVA a seguir.
        
        package prova;
        public class main {
            
            public static void main(String[] args) {
                int i = 1;
                int a = 0;
                while (i < 10) {
                    ++a;
                    i = i + 1;
                    if (a > 6) ++i;
                }
                System.out.println(i);
                System.out.println(a);
            }
        }
        
        Sabendo-se que o código acima foi escrito e executado utilizando
        o IDE NetBeans 6.0.1, assinale a opção correta referente aos va -
        lores impressos de i e de a, respectivamente.
        (A) 11 e 8 RESPOSTA CERTA
        (B) 11 e 7
        (C) 10 e 6
        (D) 10 e 7
        (E) 11 e 7
        
        TESTE DE MESA
        i  | a
        1  | 0
        2  | 1
        3  | 2
        4  | 3
        5  | 4
        6  | 5
        7  | 6
        8  | 7
        9  | 8
        10 |
        11 |
        */
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número par evr seu fatorial!: ");
        int numero = teclado.nextInt();
        int contador = numero;
        int fatorial = 1;
        
        while (contador > 0) {
            //System.out.println("" + contador);
            //System.out.format(if(contador > 0){ " x " } +  else { " = "} );
            fatorial *= contador;
            contador -= 1;
        }
        System.out.println(fatorial);
        
    }
    
}
