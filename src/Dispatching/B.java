package src.Dispatching;

public class B extends A {

    @Override
    public String f(A a, B b) {
        return "3";
    }

    public int f(C c, Object x) {
        return 2;
    }

    @Override
    public int f(B b, C c) {
        return 3;
    }

    public int f(Object a, B b) {
        return 8;
    }

}