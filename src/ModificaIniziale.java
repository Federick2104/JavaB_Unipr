package src;
import java.util.Scanner;

public class ModificaIniziale {
    
    public static void main (String[] args) {
        String s;
        
        System.out.println("Inserire stringa: ");       
        Scanner sc = new Scanner(System.in);       
        s = sc.nextLine();          
        System.out.println("\nStringa: " + s);
        
        String r;
        char C = Character.toUpperCase(s.charAt(0));
        r = C + s.substring(1);
        System.out.println("\nStringa con maiuscola: " + r);


        return;
    }   
}



