/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulacomparacaostring;

/**
 *
 * @author Usuario
 */
public class AulaComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* COMPARANDO STRINGS */
        // String, COMO S MAIÚSCULO, String É UMA CLASSE, ENTÃO AUTOMATICAMENTE
        // CRIA-SE UM OBJETO, E NÃO UMA VARIÁVEL
        /*String nome1 = "Deyvison";
        String nome2 = "Deyvison";
        String nome3 = new String("Deyvison"); // new É PARA INSTANCIAR UM OBJETO 
        String resultado;
        resultado = (nome1 == nome2) ? "igual":"diferente";
        System.out.println(resultado);
        // RESULTADO == "IGUAL"*/

        /*
        String nome1 = "Deyvison";
        String nome2 = "Deyvison";
        String nome3 = new String("Deyvison"); // new É PARA INSTANCIAR UM OBJETO 
        String resultado;
        resultado = (nome1.equals(nome3)) ? "igual":"diferente"; /* PARA OBJET
        ETOS, DEVEMOS USAR O ".equals" NO LUGAR DO OPERADOR "==", E SERVE PARA 
        QUALQUER UMA DAS CLASSES INVÓLUCRAS DO JAVA
        System.out.println(resultado);*/
        
        
        /* OPERADORES LÓGICOS
        && | .E.   | TRUE && TRUE  | FALSE
        || | .OU.  | FLASE || TRUE | TRUE
        ^  | .XOU. | TRUE ^ TRUE   | FALSE
        !  | .NAO. | ! FALSE       | TRUE
        */
        
        
        /* TABELA VERDADE && .E.
        P | Q | P && Q | 
        V | V |    V   |
        V | F |    F   |
        F | V |    F   |
        F | F |    F   |
         
        TABELA VERDADE || .OU.
        P | Q | P && Q | 
        V | V |    V   |
        V | F |    V   |
        F | V |    V   |
        F | F |    F   |
        
        TABELA VERDADE ^ .XOU. "OU EXCLUSIVO"
        P | Q | P && Q | "QUERO QUE A PAULA SEJA FELIZ, OU EXCLUSIVAMENTE A QUEZIA"
        V | V |    F   | "PODE SER A P OU A Q, MAS NÃO AS DUAS, ENTÃO É F"
        V | F |    V   |
        F | V |    V   |
        F | F |    F   |
        
        TABELA VERDADE ! .NAO.
        P | !P | 
        V | F  |
        F | V  |
        */
        
    }
    
}
