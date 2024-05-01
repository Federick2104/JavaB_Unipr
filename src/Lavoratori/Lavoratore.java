package src.Lavoratori;

import java.util.Objects;

public class Lavoratore {
    protected String nome;
    protected LivelloSpecializzazione spec;
    protected double StipendioMensile;
    private static final double salarioMinimo = 1000.0;

    public enum LivelloSpecializzazione {
        BASE, MEDIO, AVANZATO
    }
    public Lavoratore(String nome, double stipendioMensile) {
        this.nome = nome;
        this.StipendioMensile = stipendioMensile;
        this.spec = LivelloSpecializzazione.BASE;
        if (StipendioMensile >= salarioMinimo) {
            this.StipendioMensile = stipendioMensile;
        } else throw new RuntimeException("Il salario minimo di legge è 1000.0!");

        if(StipendioMensile > 2000.0 && StipendioMensile < 3000.0)
            this.spec = LivelloSpecializzazione.MEDIO;
        else if (StipendioMensile > 3000) {
            this.spec = LivelloSpecializzazione.AVANZATO;
        }
    }

    public double getStipendio() {
        return StipendioMensile*12;
    }

    @Override
    public String toString() {
        return "Lavoratore: " + nome + ", Stipendio: " + getStipendio() + "€" + ", Specializzazione: " + spec;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lavoratore that)) return false;
        return Double.compare(StipendioMensile, that.StipendioMensile) == 0 && Objects.equals(nome, that.nome) && spec == that.spec;
    }

}
