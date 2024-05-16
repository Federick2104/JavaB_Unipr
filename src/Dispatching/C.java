package src.Dispatching;

public class C extends B {

    public String f(C c1, C c2) {
        return "5";
    }

    @Override
    public String f(A a, B b) {
        return "6";
    }

}
