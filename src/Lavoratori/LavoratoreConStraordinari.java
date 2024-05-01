package src.Lavoratori;

import java.util.Objects;

public class LavoratoreConStraordinari extends Lavoratore {
    private double oreStraordinario; // h in 1 anno
    private static final double retribuzioneOraria = 10.5; // corrispondente alla retribuzione oraria di un’ora di straordinario
    public LavoratoreConStraordinari(String nome, double stipendioMensile, int oreStraordinario) {
        super(nome, stipendioMensile);
        this.oreStraordinario = oreStraordinario;
    }

    @Override
    public double getStipendio() {
        double stipendioStraordinari = oreStraordinario * retribuzioneOraria;
        return super.getStipendio() + stipendioStraordinari;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LavoratoreConStraordinari that)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(oreStraordinario, that.oreStraordinario) == 0;
    }

    @Override
    public String toString() {
        String straordinariStr = oreStraordinario > 0 ? " (Straordinari: " + oreStraordinario + " ore)" : "";
        return "LavoratoreConStraordinari: " + nome + ", Stipendio: " + getStipendio() + "€" + straordinariStr + ", Specializzazione: " + spec;
    }
}
