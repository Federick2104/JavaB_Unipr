package src.Aereo;

public class Main {
    public static void main(String[] args) {
        Aereo f22 = new Aereo("f22");
        Aereo f35 = new Aereo("f35");

        f22.Decollo();
        f22.Crociera();
        f35.Decollo();
        f22.Atterraggio();
        f35.Crociera();
        f35.Atterraggio();
        f22.Atterrato();
        f35.Atterrato();

        System.out.println("Numero di voli completati: " + Aereo.getVoliCompletati());


    }
}
