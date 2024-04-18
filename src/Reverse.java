package src;
import java.util.Scanner;
public class Reverse {

    public static String reverse(String s){
        String r = "";

        char[] sArr = s.toCharArray();
        for (int i = s.length()-1; i >= 0 ; i--)
            r += sArr[i];

        return r;
    }
    public static void main(String[] args) {

        String r = reverse("oiD ocroP");
        System.out.print(r);


    }
}
