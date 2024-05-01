package src.SerieTelevisive;
public class Serie {
    private final String titolo;
    private final Episodio firstEpisodio;


    public Serie(String titolo, Episodio firstEpisodio) {
        this.titolo = titolo;
        this.firstEpisodio = firstEpisodio;
    }

    @Override
    public String toString() {
        String episodesStr = "";
        Episodio currentEpisode = firstEpisodio;
        while (currentEpisode != null) {
            episodesStr += currentEpisode + "\n";
            currentEpisode = currentEpisode.nextEpisodio;
        }
        return "Titolo: " + titolo + "\nEpisodi {\n" + episodesStr;
    }


    public Episodio getFirstEpisodio(){
        return firstEpisodio;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Serie other)) {
            return false;
        }
        return titolo.equalsIgnoreCase(other.titolo) && firstEpisodio.equals(other.firstEpisodio);
    }
}
