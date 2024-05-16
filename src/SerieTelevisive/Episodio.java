package src.SerieTelevisive;



public class Episodio {
    protected final String titolo;
    private final String trama;
    protected final Episodio nextEpisodio;

    public Episodio(String titolo, String trama, Episodio nextEpisodio){
        this.titolo = titolo;
        this.trama = trama;
        this.nextEpisodio = nextEpisodio;
    }


    @Override
    public String toString() {
        return "Titolo: " + titolo + "\nTrama: " + trama +
                "\nProssimo Episodio: " + (nextEpisodio != null ? nextEpisodio.titolo : "Nessuno");
    }

    @Override
    public boolean equals(Object obj) {
        if (null == obj) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Episodio other) ) {
            return false;
        }
        return titolo.equalsIgnoreCase(other.titolo) && nextEpisodio.equals(other.nextEpisodio);
    }


    }
