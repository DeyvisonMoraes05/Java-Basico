/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13bexerciciosquestoesteoricas;

/**
 *
 * @author Usuario
 */
public class Aula13BExerciciosQuestoesTeoricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    // ESTRUTURAS DE REPETIÇÕES COM VARIÁVEIS DE CONTROLE
    /* QUESTÃO 1
    Considerando o trecho de Fluxograma representado e
    mantendo a mesma estrutura de lógica de
    programação, qual seria a sua transcrição válida
    para Linguagem Java?
    
    a)  for(int c=0; c<=10; c+=2) {
            s+=c; // RESPOSTA CERTA
        }
    
    b)  for(int c=0; c<10; c+=2) {
            s+=c;
        }
    
    c)  for(int c=0; c<=10; c++) {
            s+=c;
        }
    
    d)  for(int c=0; c>=10; c++) {
            s+=c;
        }
    */
    
    
    /* QUESTÃO 2
    Qual dos códigos abaixo vai efetuar uma iteração
    com exatamente 10 laços utilizando uma estrutura de
    repetição com variável de controle?
    
    a) for(int c=1; c<10; c++)
    b) for(int c=33; c>13; c-=2) // RESPOSTA CERTA, POIS NÃO CONTA O VALOR INICIAL
    c) for(int c=1; c<=10; c--) // LOOP INFINITO
    d) for(int c=13; c<=33; c+=2) // FAZ 11 ITERAÇÕES POIS CONTA O VALOR INICIAL
    */
    
    /* QUESTÃO 2
    Qual será o resultado impresso pelo trecho de
    código escrito em Linguagem Java?
    
    for(int i=0; i<=15; i+=2) {
        if(i%3==0) continue;
        System.out.print(i)
    }
    
    a) 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
    b) 0 2 4 6 8 10 12 14
    c) 0 2 4 8 10 14
    d) 2 4 8 10 14 // RESPOSTA CERTA*/
    
    
    int total = 0;
int c[] = new int[13];
for (int i = 0; i<c.length; i++) {
	c[i] = i + i;
}
for (int i = 0; i<c.length; i++) {
	total += c[i];
}
System.out.println(total);

    }
    
    


} 
