/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula15cexerciciosquestoesteoricas;

/**
 *
 * @author Usuario
 */
public class Aula15CExerciciosQuestoesTeoricas {
            static int f1 (int n) {
                return n % 2;
            }
            static int f2 (int n) {
                return n * 2;
            }
            static int f3 (int a, int b) {
                return a + b;
            }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(f3(f1(3), f2(5)));
        
        /* QUESTÃO 1
        Em relação ao uso do modificador static antes do
        cabeçalho de um método Java, podemos afirmar que:
        
        a) Static serve para indicar que os valores dos
        parâmetros são estáticos, isso é, não se modificam. 
        
        b) Static serve para dizer que o método pertence à
        classe em que foi declarada, não a uma instância dela. // RESPOSTA CERTA
        
        c) O uso da palavra static é obrigatório, já que
        sem ela, não criamos método.
        
        d) Não é permitido definir um método como static.
        */
        
        /* QUESTÃO 2 
        Execute o trecho Java a seguir e marque a opção que
        contém o valor que será exibido na tela:*/

            /*static int f1 (int n) {
                return n % 2;
            }
            static int f2 (int n) {
                return n * 2;
            }
            static int f3 (int a, int b) {
                return a + b;
            }*/
            //public static void main (String[] args) {
                //System.out.println(f3(f1(3), f2(5)));
                                // F3 (F1(1),F2(10)
                                // F3 (1 + 10)
                                // F3 = 11
            }
        /*a) 16
        b) 11.5
        c) 8
        d)11 // RESPOSTA CERTA
        */
        
    }
    

