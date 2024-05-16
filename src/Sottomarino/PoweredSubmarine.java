package src.Sottomarino;

import java.util.Objects;
import java.util.Collection;

public class PoweredSubmarine extends Submarine{
    private boolean on;
    private final double immersionRate;

    public PoweredSubmarine(String nome, double maxDepth, double currentDepth, boolean on, double immersionRate) {
        super(nome, maxDepth, currentDepth);
        this.on = false;
        this.immersionRate = immersionRate;
    }

    public boolean isOn() {
        return on;
    }

    public double getImmersionRate() {
        return immersionRate;
    }

    public void on(){this.on = true;}
    public void off(){this.on = false;}

    public boolean step(){
        if(on) return Immersion(immersionRate);
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PoweredSubmarine that = (PoweredSubmarine) o;
        return on == that.on && Double.compare(immersionRate, that.immersionRate) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), on, immersionRate);
    }

    public static void rescueSubmarine (Collection<Submarine> subs){
        for (Submarine sub : subs){
            if(sub.getCurrentDepth() >= sub.getMaxDepth()){
                PoweredSubmarine rescueSub = new PoweredSubmarine("Sottomarino1", sub.getMaxDepth(), sub.getCurrentDepth(), false, 0);
                System.out.println("Rescue operation for "+ sub);
            }
        }
    }

    @Override
    public String toString() {
        return "PoweredSubmarine{" +
                "on=" + on +
                ", immersionRate=" + immersionRate +
                '}';
    }
}
