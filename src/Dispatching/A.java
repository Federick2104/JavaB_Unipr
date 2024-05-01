package src.Dispatching;

public class A {
    public int f(B b, C c) {
        return 1;
    }

    public String f(A a, B b) {
        return "7";
    }

    public String f(B a, B b) {
        return "6";
    }
}
