/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8operadoreslogicos;

/**
 *
 * @author Usuario
 */
public class Aula8OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean resultado;
        resultado = (x < y && y < z)?true:false;
        System.out.println(resultado);
        
        int x1, y1, z1;
        x1 = 4;
        y1 = 7;
        z1 = 12;
        boolean resultado1;
        resultado1 = (x1 < y1 && y1 == z1)?true:false;
        System.out.println(resultado1);
        
        int x2, y2, z2;
        x2 = 4;
        y2 = 7;
        z2 = 12;
        boolean resultado2;
        resultado2 = (x2 < y2 || y2 == z2)?true:false;
        System.out.println(resultado2);
        
        int x3, y3, z3;
        x3 = 4;
        y3 = 7;
        z3 = 12;
        boolean resultado3;
        resultado3 = (x3 < y3 ^ y3 == z3)?true:false;
        System.out.println(resultado3);
        
        int x4, y4, z4;
        x4 = 4;
        y4 = 7;
        z4 = 12;
        boolean resultado4;
        resultado4 = (x4 < y4 ^ y4 < z4)?true:false;
        System.out.println(resultado4);
    }
    
}
