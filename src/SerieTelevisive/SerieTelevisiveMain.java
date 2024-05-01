package src.SerieTelevisive;

public class SerieTelevisiveMain {

    public static void main(String[] args) {
        Episodio episodio3 = new Episodio("Episodio 3: Andrea Munaro", "Graph Theory at all cost!", null);
        Episodio episodio2 = new Episodio("Episodio 2: Munaro","Avoid Andrea at all cost!!!", episodio3 );
        Episodio episodio1 = new Episodio("Episodio 1: Andrea","Avoid Andrea at all cost", episodio2);


        Serie serie1 = new Serie("Serie1: Andrea Munaro Divide et Impera", episodio1);

        System.out.println("\nSerie 1:");
        System.out.println(serie1);


        //Test per i metodi equals
        Episodio episodio5 = new Episodio("Episodio 2: Munaro","Avoid Andrea at all cost!!!", episodio3 );
        Episodio episodio4 =  new Episodio("Episodio 1: Andrea","Avoid Andrea at all cost", episodio2);

        System.out.println("\nVerifica equals:");
        System.out.println("episodio1.equals(episodio4): " + episodio1.equals(episodio4)); // True
        System.out.println("episodio1.equals(episodio2): " + episodio1.equals(episodio2)); // False
        System.out.println("episodio2.equals(episodio5): " + episodio2.equals(episodio5)); // True

    }

}
