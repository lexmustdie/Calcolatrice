package it.alessandro.prog;
import java.util.Scanner;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Valori {
    private int valore1;
    private int valore2;
    
    private String scelta;
    
   public Valori() {
    	
    }

    public void setValori() {
    	
       
        Scanner input = new Scanner(System.in);
    	System.out.println("Inserire primo valore");
        this.valore1=Integer.parseInt(input.nextLine());
        System.out.println("Inserire secondo valore");
        this.valore2=Integer.parseInt(input.nextLine());
        
        do {
        	
	        System.out.println("Scegliere operazione da effettuare");
	        System.out.println("1-Addizione");
	        System.out.println("2-Sottrazione");
	        System.out.println("3-Moltiplicazione");
	        System.out.println("4-Divisione");
	        this.scelta=input.nextLine();
        
        
       } while(!(scelta.equals("1")) && !(scelta.equals("2")) && !(scelta.equals("3")) && !(scelta.equals("4")));
        
        
    }


	
   
}
