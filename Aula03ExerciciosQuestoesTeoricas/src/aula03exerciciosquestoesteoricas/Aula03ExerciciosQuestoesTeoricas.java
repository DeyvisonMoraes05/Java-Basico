/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03exerciciosquestoesteoricas;

/**
 *
 * @author Usuario
 */
public class Aula03ExerciciosQuestoesTeoricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* QUESTÃO 1
        Assinale a alternativa que contém uma expressão lógica
        com resultado VERDADE. Considere X = 7 e Y = 4.
        
        a) (X > 5) .E. (.NÂO.(Y < 3)) // RESPOSTA CERTA
        b) (X = 5) .OU. (Y > 3)
        c) (Y > 10) .E. (X = 7)
        d) .NÂO. (X = 7)
        */
        
        /* QUESTÃO 2
        Assinale a alternativa que contenha o valor final da variável X
        após a execução do trecho de programa em Português estruturado
        abaixo. Considere os valores iniciais A = 6, B = 2, C = 4, D = 3
        
        se .não. (A > 6) .e. .não. (B < 3) então
            X <- A / D
        senão
        
            X <- C * A
        fim_se
        
        a) 2
        b) 12
        c) 24 // RESPOSTA CERTA
        d) 48
        
        TESTE DE MESA
        SE .NÃO. (V) .E. .NÃO. (F)
            V E F = F
            X = 6 / 3
            X = 2
        SENÃO
            X = 4 * 6
            X = 24
        */
        
        
        /* QUESTÃO 3
        Marque a alternativa que identifica o tipo de operador 
        lógico utilizado na tabela abaixo.
        
        CONDIÇÃO 1  | CONSIÇÃO 2    | RESULTADO
        Falsa       | Falsa         | Falso
        Verdadeira  | Falsa         | Verdadeiro
        Falsa       | Verdadeira    | Verdadeiro
        Verdadeira  | Verdadeira    | Verdadeiro
        
        a) .e. 
        b) .ou. // RESPOSTA CERTA
        c) .if.
        d) .não.
        
        TESTE DE MESA
        P | Q | P .OU. Q    | P .E. Q
        V | V | V           | V
        V | F | V           | F
        F | V | V           | F
        F | F | F           | F
        
        */
        
        /* QUESTÃO 4
        Considerando os tipos de dados, relacione as colunas e, a
        seguir, assinale a alternativa com a sequência correta.
        
        (1) Inteiros        () 35; 0; -56
        (2) Reais           () .F.; .V.
        (3) Caracteres      () "Rua Brigadeiro Lyra"
        (4) Lógicos         () -0,5; 1,8; -4
        
        a) 3, 1, 4, 2 
        b) 2, 4, 3, 1
        c) 1, 2, 3, 4
        d) 1, 4, 3, 2 // RESPOSTA CERTA
        
        "TESTE DE MESA"
        
        (1) Inteiros        (1) 35; 0; -56
        (2) Reais           (4) .F.; .V.
        (3) Caracteres      (3) "Rua Brigadeiro Lyra"
        (4) Lógicos         (2) -0,5; 1,8; -4
        */
    }
    
}
