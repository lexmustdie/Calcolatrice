package it.alessandro.prog;
import org.springframework.stereotype.Component;

import it.alessandro.prog.Valori;

import java.util.Scanner;
import lombok.Data;
import lombok.ToString;
@Component
@Data
@ToString
public class Risultato {

	private Valori valori;
	
	public Risultato(Valori valori) {
	 this.valori=valori;
	}
	
	
	public double Calcolo() {
		double operazione=0;
		
	if(valori.getScelta().equals("1")) {
    	operazione=valori.getValore1()+valori.getValore2();
    }
    if(valori.getScelta().equals("2")) {
    	operazione=valori.getValore1()-valori.getValore2();
    }
   
    if(valori.getScelta().equals("3")) {
    	operazione=valori.getValore1()*valori.getValore2();
    }
    if(valori.getScelta().equals("4")) {
    	operazione=valori.getValore1()/valori.getValore2();
    }
    
   if(!(valori.getScelta().equals("1")) && !(valori.getScelta().equals("2")) && !(valori.getScelta().equals("3")) && !(valori.getScelta().equals("4")))
   {
	   
      	System.out.println("Scelta non valida");
       
   }
   return operazione;
	}
	
	
}
