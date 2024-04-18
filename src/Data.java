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

    /*Si scriva una funzione che prende in input un intero n e calcola l’n-esimo numero
     della sequenza di Fibonacci. Successivamente, si scriva la versione ricorsiva della funzione. */

    //Fibonacci in modo normale
    public static int Fib(int n){
        if(n <= 1) return 1;
        int n1 = 0;
        int n2 = 1;
        int res = 0;
        for (int i = 2; i <= n; i++) {
            res = n1 + n2;
            n1 = n2;
            n2 = res;
        }
        return res;
    }
    //In modo ricorsivo
    public static int FibRec(int n){
        if (n <= 1) return n;
         else
            return FibRec(n - 1) + FibRec(n - 2);
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
        System.out.println(Fib(10));
        System.out.println(FibRec(10));


    }
}
