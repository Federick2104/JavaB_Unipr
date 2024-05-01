package src.Aereo;

public class Aereo {
    public static int VoliCompletati = 0;
    private final String name;
    private StatoAereo stato;

    public Aereo(String name) {
        this.name = name;
        stato = StatoAereo.ATTERRATO;
    }




    //Creazione degli stati dell'Aereo
    public void Decollo(){
        if (stato == StatoAereo.ATTERRATO){
            stato = StatoAereo.DECOLLO;
            System.out.println(this.name + " in decollo ...");
        } else {
            throw new RuntimeException("Sequenza di chiamata errata!");
        }
    }
    public void Crociera(){
        if (stato == StatoAereo.DECOLLO){
            stato = StatoAereo.CROCIERA;
            System.out.println(this.name + " in crociera ...");
        } else {
            throw new RuntimeException("Sequenza di chiamata errata!");
        }
    }
    public void Atterraggio(){
        if (stato == StatoAereo.CROCIERA){
            stato = StatoAereo.ATTERRAGGIO;
            System.out.println(this.name + " in atterraggio ...");
        } else {
            throw new RuntimeException("Sequenza di chiamata errata!");
        }
    }
    public void Atterrato(){
        if (stato == StatoAereo.ATTERRAGGIO){
            stato = StatoAereo.ATTERRATO;
            System.out.println(this.name + " atterrato ...");
            VoliCompletati++;
        } else {
            throw new RuntimeException("Sequenza di chiamata errata!");
        }
    }
    public static int getVoliCompletati(){
        return VoliCompletati;
    }

    private enum StatoAereo{
        ATTERRATO, DECOLLO, CROCIERA, ATTERRAGGIO
    }
}

