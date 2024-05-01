package src.Lavoratori;

public class MainLavoratori {
    public static void main(String[] args) {
        Lavoratore l1 = new Lavoratore("Cell", 1000);
        Lavoratore l = new Lavoratore("Goku", 2500);
        Lavoratore l2 = new Lavoratore("Goku", 2500);

        LavoratoreConStraordinari l3 = new LavoratoreConStraordinari("Vegeta", 5000,100);
        LavoratoreConStraordinari l4 = new LavoratoreConStraordinari("Gohan", 1500,40);

        System.out.println(l1);
        System.out.println(l3);

        System.out.println(l2.equals(l)); // true
        System.out.println(l2.equals(l1)); // false
        System.out.println(l3.equals(l4)); // false
    }
}
