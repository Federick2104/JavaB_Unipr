package src;

import java.util.Scanner;

public class FirstSin {
    public static void main(String[] args) {
        System.out.println("Isnerire tre numeri interi: ");
        Scanner sc = new Scanner(System.in);

        int i, j, k;

        i = sc.nextInt();
        j = sc.nextInt();
        k = sc.nextInt();

        float m = ((float)(i+j+k)/3); // could be also (i+j+k)/3.0f

        System.out.println("La media dei 3 numeri: " + m);
        sc.close();
    }
}
