package src.Catalogo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Catalogo<E extends  Articolo> {
    private final Set<E> set;

    public Catalogo(Set<E> set) {
        this.set = new HashSet<>();
    }

    public void add(E art){
        this.set.add(art);
    }

    public Set<E> getArticoloSottoPrezzo(double price){
        Set<E> result = new HashSet<>();
        for (E art : set){
            if (art.getPrezzo() < price)
                result.add(art);
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Catalogo<?> catalogo = (Catalogo<?>) o;
        return Objects.equals(set, catalogo.set);
    }

    @Override
    public int hashCode() {
        return Objects.hash(set);
    }
}
