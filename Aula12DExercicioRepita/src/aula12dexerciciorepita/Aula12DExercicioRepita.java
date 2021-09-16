/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12dexerciciorepita;

import javax.swing.JOptionPane; // PAINÉIS JA PRONTOS, TELAS PRONTAS

/**
 *
 * @author Usuario
 */
public class Aula12DExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // PARA MOSTRAR MENSAGENS
        //JOptionPane.showMessageDialog(null, "Olá, Mundo!", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE);
        
        //JOptionPane.showInputDialog(null, "Informe um número");
        
        
        //int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número"));
        //JOptionPane.showMessageDialog(null, "Você digitou o valor " + n);
        
        /*
        int numero;
        //int numeros = 0;
        int soma = 0;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número: <br><em>(O valor 0, interrompe)</em></html>"));
            //numeros++;
            soma += numero;
        } while (numero != 0);
        // MEU CÓDIGO
        /*JOptionPane.showMessageDialog(null, "<html><up>Você digitou " +  numeros + " números</up></html>");
        JOptionPane.showMessageDialog(null, "<html>A soma desses numeros é: " + soma);
        JOptionPane.showMessageDialog(null, "<html>Resultado final <hr>" + "<br>Somatório vale " + soma + "</html>"); */
        
        int numero = 0;
        int numeros = 0;
        int soma = 0;
        int par = 0;
        int impar = 0;
        int acima100 = 0;
        int media = 0;
        do {
            if (numero % 2 == 0) {
                par++;
            }
            else {
                impar++;
            }
            if (numero > 100) {
                acima100++;
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número: <br><em>(O valor 0, interrompe)</em></html>"));
            soma += numero;
            numeros++;
            media = soma / numeros;
        } while (numero != 0 );
        JOptionPane.showMessageDialog(null, "<html>Resultado final <hr>" + 
                "Total de Valores: " + numeros + 
                "<br>Soma dos números: " + soma + 
                "<br>Total de Pares: " + par +
                "<br>Total de Ímpares: " + impar + 
                "<br>Acima de 100: " + acima100 + 
                "<br>Média dos valores: " + media +"</html>");    
    }
    
}
