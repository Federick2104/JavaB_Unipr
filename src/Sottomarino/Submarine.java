package src.Sottomarino;

import java.util.Objects;

public class Submarine {
    private final String nome;
    private final double maxDepth;
    private double currentDepth;

    public Submarine(String nome, double maxDepth, double currentDepth) {
        this.nome = nome;
        this.maxDepth = maxDepth;
        this.currentDepth = currentDepth;
    }

    public String getNome() {
        return nome;
    }

    public double getMaxDepth() {
        return maxDepth;
    }

    public double getCurrentDepth() {
        return currentDepth;
    }

    public boolean Immersion(double depth){
        if(currentDepth + depth <= maxDepth){
            currentDepth += depth;
            return true;
        } else return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Submarine submarine = (Submarine) o;
        return Double.compare(maxDepth, submarine.maxDepth) == 0 && Double.compare(currentDepth, submarine.currentDepth) == 0 && Objects.equals(nome, submarine.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, maxDepth, currentDepth);
    }

    @Override
    public String toString() {
        return "Submarine{" +
                "nome='" + nome + '\'' +
                ", maxDepth=" + maxDepth +
                ", currentDepth=" + currentDepth +
                '}';
    }
}
