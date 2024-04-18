package src;

import java.util.Scanner;


public class iso_cmd {
    public static void iso_print(){

        System.out.println("Inserire un valore intero > 0: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n <= 0) throw new RuntimeException("Valore negativo, deve essere positivo");

        for (int riga = 0; riga < 2*n-1; riga++) {
            for (int cln = 0; cln < n; cln++) {
                if (riga < n-1){
                    if (cln <= riga)
                        System.out.print(" * ");
                    else
                        System.out.print("   ");
                }else{
                    if(cln < n - (riga - n + 1))
                        System.out.print(" * ");
                    else
                        System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        iso_print();
    }
}
