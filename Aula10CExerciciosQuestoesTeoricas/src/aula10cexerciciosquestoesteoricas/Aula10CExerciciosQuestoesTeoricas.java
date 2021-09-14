/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10cexerciciosquestoesteoricas;

/**
 *
 * @author Deyvison Moraes
 */
public class Aula10CExerciciosQuestoesTeoricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    /* QUESTÃO 1
    3. Observe o trecho de programa:
    public class Exemplo {
        public static void main(String[] args) {
            System.out.println(“Marinha do Brasil”);
        }
    }
    Com base na classe Java acima, assinale a opção
    correta.
    a) O método main necessita receber o array como
    parâmetro para ser executado.
    b) Os modificadores public e class são
    desnecessários para executar o código.
    c) Sua execução dependerá da versão da JVM em uso.
    d) Essa classe não será executada pela JVM.
    e) O método main é o primeiro a ser chamado e
    executado pela JVM. // RESPOSTA CERTA
    */
    
    /* QUESTÃO 2
    Observe o código Java abaixo:
    public class Teste {
    public static void main(String[] args) {
        String nome = “João”; // VARIÁVEL LOCAL
        imprimeNome(“Empty”); // MÉTODO "imprimeNome", PASSANDO O PARÂMETRO ("Empty")
    }
    public static void imprimeNome(String nome) { // PASSANDO "Empty" COMO PARÂMETRO
        if(!nome.isEmpty()){ // ".isEmpty" ESTÁ VERIFICANDO SE A VARIÁVEL "nome" ESTÁ VAZIA
                             // NÃO ESTÁ VAZIA, ESTÁ COM A PALAVRA "Empty"
                             // POIS AQUI É VERDADEIRO
            System.out.println(“Tudo bem ” + nome + “?”); // EXECUTA ESSA INSTRUÇÃO
        } else {
            System.out.println(“O nome é ” + nome + “?”); // EXECUTARI ESSA
                                                          // SE A DE FOSSE FALSA
        }
    }
    }
    
    Qual será a saída do programa acima?
    a) Tudo bem Empty? RESPOSTA CERTA
    b) Tudo bem João?
    c) O nome é Empty?
    d) O nome é João?
    e) Tudo bem Empty? O nome é João?
    */
    
    
    /* QUESTÃO 3
    35. O que será impresso quando o seguinte programa escrito
    na linguagem JAVA for compilado e executado?
    class Teste {
    public static void main(String args[]) {
        char ch;
        String test2 = "abcde"; // OBJETO NÃO INSTANCIADO
        String test = new String("abcde"); // OBJETO INSTANCIADO
        if(test.equals(test2)) { // VERDADAEIRO
            ch = (test == test2)? test.charAt(0) : test.charAt(1); // FALSO
        } else {
            ch = (test == test2)? test.charAt(2) : test.charAt(3);
        }
        System.out.println(ch);
    }
    }
    a) a
    b) b RESPOSTA CERTA
    c) c
    d) d
    e) e
    */
}
