package src.Conto;

public class ContoCorrente {
    private static int next_nConto = 1001;
    private final String nome;
    private final String cognome;
    private final int nConto;
    private double saldo;

    public ContoCorrente(String nome, String cognome, double saldo) {
        this.nome = nome;
        this.cognome = cognome;
        this.saldo = saldo;
        this.nConto = next_nConto;
        next_nConto++;
    }
    public ContoCorrente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.saldo = 0;
        this.nConto = next_nConto;
        next_nConto++;
    }

    public void Deposita(double i){
        if (i > 0) {
            this.saldo += i;
            System.out.println("Deposito di " + i + "€" + " effettuato su: "+ "id: " + this.nConto);
        }else throw new RuntimeException("Qualcosa è andato storto!");
    }

    public void Preleva(double i){
        if (i < this.saldo){
            this.saldo -= i;
            System.out.println("Prelievo di " + i + "€" + " effettuato da: " + "id: " + this.nConto);
        } else throw new RuntimeException("Qualcosa è andato storto (saldo insufficiente)! ");
    }


    @Override
    public String toString() {
        return "ContoCorrente { " +
                "nome = '" + nome + '\'' +
                ", cognome = '" + cognome + '\'' +
                ", nConto = " + nConto +
                ", saldo = " + saldo +
                " }";
    }
}
