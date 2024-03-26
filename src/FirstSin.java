package src;

import java.util.Scanner;

public class FirstSin {
    public static void main(String[] args) {
        System.out.println("Numero elementi: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n <= 0)
            throw new RuntimeException("Valore negativo, must be positivo"); //exeption are obj

      int s = 0;
      for (int i = 0; i < n; i++){
          System.out.println("Inserires un valore: ");
          s += sc.nextInt();

      }

        float m = ((float)(s)/n); // could be also (i+j+k)/3.0f

        System.out.println("La media dei " + n + " numeri: " + m);
        sc.close();
    }
}
