/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08eexerciciosquestoesteoricas;

/**
 *
 * @author Usuario
 */
public class Aula08EExerciciosQuestoesTeoricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* QUESTÃO 1
        DADAS AS LINHAS A SEGUIR:
        int x = 8, y = 3;
        int w = x / y; // W = 8 / 3; W == 2
        String z = (w % 2 == 0)? "frase1":"frase2"; // z = (2 % 2 == 0) sim
        System.out.println(z); // IMPRESSO "FRASE1"
        
         O QUE ACONTECERÁ SE ESSE CÓDIGO FOR EXECUTADO?
        A) UM ERRO DE TIPO NA VARIÁVEL W
        B) UM ERRO DE ATIRBUIÇÃO NA VARIÁVEL Z
        C) SERÁ IMPRESSO "FRASE1" // REPOPSTA CERTA
        D) SERÁ IMPRESSO "FRASE"
        */
        
        /* QUESTÃO 2
        ANALISE O CÓDIGO A SEGUIR E INDIQUE O QUE SERÁ IMPRESSO NA TELA:
        String parte1 = "Curso"; 
        String parte2 = "Video";
        String parte3 = parte1 + parte2; // PARTE3 == "CURSOVIDEO"
        String parte4 = "CursoVideo";
        System.out.println(parte3 == parte4); // TRUE; ERREI, É FALSE
        //System.out.println(parte3 == parte4); NESSE CASP, ESTÁ TESTANDO SE DOIS OBEJTOS
        // PARTE3 == "CURSOVIDEO" É IGUAL A PARTE4 == "CURSOVIDEO", ELES SÃO DIFERENTES
        // O CONTEÚDO É O MESMO, MAS OS OBJETOS SÃO DIFERENTES
        System.out.println(parte3.equals(parte4)); // TRUE, NESSE CASO, ESTÁ VERIFICANDO SE
        // O CONTEÚDO DOS OBJETOS PARTE3 E PARTE4 SÃO IGUAIS, E ELES SÃO IGUAIS
        
        /*
        A) CURSOVIDEO
        B) FALSE TRUE // RESPOSTA CERTA
        C) TRUE TRUE // RESPOSTA CERTA; ERREI
        D) TRUE FALSE
        */
        
        
        /* QUESTÃO 3
        ANALISE O CÓDIGO A SEGUIR E INDIQUE O QUE SERÁ IMPRESSO NA TELA:/
        boolean val1 = (4 >= 5), val2 = (4 < 4), val3 = (val1 == val2);
        // VAL1 = FALSE; VAL2 =  FALSE; 
        //VAL3 = TRUE(POIS ESTÁ VERIFICANDO SE O CONTEÚDO DAS VARIÁVEIS SÃO IGUAIS 
        boolean val4 = val1 ^ val3;
        // VAL4 = TRUE
        boolean val5 = !val2 && val4;
        // VAL5 = TRUE
        System.out.println(val4 + " " + val5); // TRUE TRUE
        
        
        /*
        A) TRUE TRUE RESPOSTA CERTA; ACERTEI
        B) FALSE TRUE
        C) FALSE FALSE
        D) TRUE FALSE
        */
        
        
        
    }
    
}
