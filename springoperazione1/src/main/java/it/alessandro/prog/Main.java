package it.alessandro.prog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.alessandro.springoperazione1.Config;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Risultato risultato = context.getBean("risultato", Risultato.class);
		System.out.println(risultato.Calcolo());
	}

}