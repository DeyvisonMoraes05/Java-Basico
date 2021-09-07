package aula04eexercicioresolucaoteladesafio;

import java.awt.Dimension;
import java.awt.Toolkit;

// @author Deyvison Moraes

public class Aula04EExercicioResolucaoTelaDesafio {

    public static void main(String[] args) {
        Toolkit tela = Toolkit.getDefaultToolkit();
        Dimension d = tela.getScreenSize();
        System.out.println("Resolução do Tela: " +d.width+" x " +d.height);
    }
    
}
