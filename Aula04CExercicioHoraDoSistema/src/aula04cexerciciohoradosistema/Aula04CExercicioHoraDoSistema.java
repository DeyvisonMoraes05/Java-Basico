package aula04cexerciciohoradosistema;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

// @author Deyvison Moraes

public class Aula04CExercicioHoraDoSistema {

    public static void main(String[] args) {
        /*
        Date data = new Date(); // CRIANDO UM NOVO OBJETO
        System.out.println("A hora do sistema é ");
        System.out.println(data.toString());*/
        
        Calendar ano = GregorianCalendar.getInstance();
        //Calendar ano = GregorianCalendar.getInstance();
        Date horas = new Date();
        //Date horas = new Date();
        System.out.println("Horas: "+horas);
        //System.out.println("Horas: " + horas);
        System.out.println("Ano Atual: "+ano.get(Calendar.YEAR));
        //System.out.println("Ano Atual: " + ano.get(Calendar.YEAR));
    }
    
}
