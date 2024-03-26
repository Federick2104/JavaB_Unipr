package src;

public class Data {

    private  int giorno;
    private  int mese;
    private  int anno;

    //final non può essere più modificato,
    // quindi devono essere inizializzati nel costruttore

    private boolean valid(int giorno, int mese, int anno){
        return giorno >= 0 && giorno <= 31 && mese >= 1 && mese <= 12 && anno >= 0;
    }

    private void print(){
        System.out.println("{ " + this.giorno + ", " + this.mese + ", " +  this.anno + " }");
    }
    public Data(int giorno, int mese, int anno) {
        if (!valid(giorno, mese, anno))
            throw new RuntimeException("Data non valida");

        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }



    public void setGiorno(int giorno) {
        this.giorno = giorno;
    }

    public void setMese(int mese) {
        this.mese = mese;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getGiorno() {
        return giorno;
    }

    public int getMese() {
        return mese;
    }

    public int getAnno() {
        return anno;
    }

    public static void main(String[] args) {
        Data d1 = new Data(12,2,2000); //d1 è una reference
        //Data d2 = d1; //shallow copy, assegnamento fra reference
        d1.print();



    }
}
