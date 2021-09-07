package aula04dexercicioidiomasistemadesafio;

import java.util.Locale;

// @author Deyvison Moraes

public class Aula04DExercicioIdiomaSistemaDesafio {

    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.println("O Idioma do Sistema é : " 
                + idioma.getDisplayLanguage() 
                + " " + idioma.getLanguage());
    }
    
}
