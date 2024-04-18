package src;

import java.util.Random;
import java.lang.Math;

//Body che rappresenta un corpo puntiforme dotato di massa,
// che cade soggetto solo alla forza di gravità terrestre
public class Body {

     private double m; //kg
    private double h; //m
    private double speed; //speed

    public Body(float m, float h) {
        this.m = m;
        this.h = h;

    }
    static final double g = 9.807;
    public void Progress(){
        Random r = new Random();
        double timer = 0.1 + r.nextDouble() * (50 - 0.1);
        this.speed = h/timer;

    }
    public static  String getString(Body m){
        String s = "Altezza dal suolo: " + m.h + "Velocità del corpo: " + m.speed + ", Velocità del corpo quando raggiugne il suolo: " + (float)Math.sqrt(2*g*m.h) + "m/s";
        return s;
    }


    public static void main(String[] args) {
        Body m = new Body(3, 20);
        Body m1 = new Body(3, 20);
        m.Progress();
        m1.Progress();
        String r = getString(m);
        String r1 = getString(m1);
        System.out.println(r);
        System.out.println(r1);
    }
}

