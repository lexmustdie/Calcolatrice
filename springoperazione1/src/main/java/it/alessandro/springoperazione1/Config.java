package it.alessandro.springoperazione1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import it.alessandro.prog.Valori;

import it.alessandro.prog.Risultato;


@Configuration
@ComponentScan(basePackageClasses = Risultato.class)


public class Config {
    @Bean
    public Valori getValori() {
    	Valori valori = new Valori();
    	valori.setValori();
    	return valori;
    	
    }
}