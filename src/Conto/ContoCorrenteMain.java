package src.Conto;

public class ContoCorrenteMain {
    public static void main(String[] args) {
        ContoCorrente C1 = new ContoCorrente("Andrea", "Munaro", 100 );
        ContoCorrente C2 = new ContoCorrente("Vincenzo", "Arceri" , 100);

        System.out.println(C1);
        System.out.println(C2);

        C1.Preleva(10);
        C2.Deposita(10);

        System.out.println(C1);
        System.out.println(C2);
    }
}
