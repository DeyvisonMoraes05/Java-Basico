/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula15btestefuncao2;

/**
 *
 * @author Usuario
 */
public class Operacoes {
    
    public static String contador(int inicio, int fim) {
        String s = "";
        for (int cont = inicio; cont <= fim; cont++) {
            s += cont + " ";
        }
        return s;
    }
}